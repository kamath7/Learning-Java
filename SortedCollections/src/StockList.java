import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item){
        if (item != null){
            StockItem inStock = list.getOrDefault(item.getName(), item);
            //Checking for quantities
            if (inStock != item){
                item.adjuststock(inStock.getQuantityStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0; //no stonks for you
    }
}

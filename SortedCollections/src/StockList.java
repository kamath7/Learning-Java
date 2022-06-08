import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<String, StockItem>();
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

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.getQuantityStock() >= quantity) && (quantity > 0)){
            inStock.adjuststock(-quantity);
            return quantity;
        }
        return 0;
    }

    public Map<String, StockItem> getList() {
        return list;
    }

    public StockItem get(String key){
        return this.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }
}

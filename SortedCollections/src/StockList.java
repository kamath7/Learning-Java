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

    @Override
    public String toString() {
        String s = "\n Stock List \n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item: list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();

            s += stockItem + ". There are "+stockItem.getQuantityStock() + " in stock. Value of items - ";
            s += itemValue + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value "+totalCost;
    }
}

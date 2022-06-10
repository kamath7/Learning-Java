import java.util.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = list.getOrDefault(item.getName(), item);
            //Checking for quantities
            if (inStock != item) {
                item.adjuststock(inStock.availableQuantity());
            }
            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0; //no stonks for you
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if ((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity > 0)) {
            inStock.adjuststock(-quantity);
            return quantity;
        }
        return 0;
    }

    public Map<String, StockItem> getList() {
        return list;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();

        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    @Override
    public String toString() {
        String s = "\n Stock List \n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s += stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items - ";
            s += String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}

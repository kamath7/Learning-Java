import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int alreadyInBasket = list.getOrDefault(item, 0);
            list.put(item, alreadyInBasket + quantity);
            return alreadyInBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = quantity + inBasket;

            if (newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if (newQuantity == 0) {
                list.remove(item);
                return quantity;
            }
        }
        return  0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\n Shopping basket " + name + " contains " + ((list.size() == 1) ? "There are no items " : list.size()) + "items";
        double cartVal = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s += item.getKey() + " " + item.getValue() + " purchased \n";
            cartVal += item.getKey().getPrice() * item.getValue();

        }
        return s + "Total Cost: " + cartVal;
    }
}

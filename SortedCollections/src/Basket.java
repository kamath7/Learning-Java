import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int alreadyInBasket = list.getOrDefault(item, 0);
            list.put(item, alreadyInBasket + quantity);
            return alreadyInBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\n Shopping basket "+name+" contains "+list.size() + "items";
        double cartVal = 0.0;
        for(Map.Entry<StockItem, Integer> item: list.entrySet()){
            s += item.getKey() + " "+ item.getValue() +" purchased \n";
            cartVal += item.getKey().getPrice() * item.getValue();

        }
        return s + "Total Cost: "+cartVal;
    }
}

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("Eggs", 20, 100);
        stockList.addStock(temp);

        temp = new StockItem("Soda", 30, 15);
        stockList.addStock(temp);
        temp = new StockItem("Biscuits", 6, 4);
        stockList.addStock(temp);
        temp = new StockItem("Cheese", 180, 70);
        stockList.addStock(temp);
        temp = new StockItem("Paneer", 156, 23);
        stockList.addStock(temp);
        temp = new StockItem("Milk", 146, 74);
        stockList.addStock(temp);
        temp = new StockItem("Tomato", 80, 78);
        stockList.addStock(temp);
        temp = new StockItem("Onions", 56, 231);
        stockList.addStock(temp);

//        System.out.println(stockList);

        Basket kamsBasket = new Basket("Lalle");
        sellItem(kamsBasket, "Paneer", 1);
        sellItem(kamsBasket, "Onions", 2);
        if (sellItem(kamsBasket, "Biscuits", 7) != 1) {
            System.out.println("Biscuits unavailable");
        }
        System.out.println(kamsBasket);
        System.out.println(stockList);

        temp = new StockItem("Pen", 12.90);
//        stockList.Items().put(temp.getName(), temp); //use

        stockList.Items().get("Biscuits").adjuststock(1000);
        System.out.println(stockList);
        StockItem milk = stockList.Items().get("Milk");
        if (milk != null) {
            milk.adjuststock(1000);
        }
        if (milk != null) {
            milk.adjuststock(-2000);
        }


        Basket alBasket = new Basket("Al");
        sellItem(alBasket, "Onions", 100);
        sellItem(alBasket, "Cheese", 3);
        sellItem(alBasket, "Milk", 3);
        System.out.println(alBasket);
        System.out.println("Milk removed " + removeItem(alBasket, "Milk", 2));

        removeItem(alBasket, "Cheese", 1);
        removeItem(alBasket, "Milk", 1);
        removeItem(alBasket, "Onions", 50);


        System.out.println("Stock list currently and after checkout");
        System.out.println(alBasket);
        System.out.println(stockList);
        checkout(alBasket);
        System.out.println(stockList);

//        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
//            System.out.println(price.getKey() + " costs "+price.getValue());
//        }

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //get items
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("Dont have item " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //get items
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("Dont have item " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unReserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
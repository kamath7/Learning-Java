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
        temp = new StockItem("Paneer", 150, 3);
        stockList.addStock(temp);
        temp = new StockItem("Milk", 146, 74);
        stockList.addStock(temp);
        temp = new StockItem("Tomato", 80, 78);
        stockList.addStock(temp);
        temp = new StockItem("Onions", 56, 231);
        stockList.addStock(temp);

//        System.out.println(stockList);

        Basket kamsBasket = new Basket("Lalle");
        sellItem(kamsBasket, "Paneer",1);
        sellItem(kamsBasket,"Onions",2);
        if(sellItem(kamsBasket,"Biscuits",7) != 1){
            System.out.println("Biscuits unavailable");
        }
        System.out.println(kamsBasket);
        System.out.println(stockList);

        temp = new StockItem("Pen",12.90);
//        stockList.Items().put(temp.getName(), temp); //use

        stockList.Items().get("Biscuits").adjuststock(1000);
        System.out.println(stockList);
        stockList.Items().get("Biscuits").adjuststock(-1000);

        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs "+price.getValue());
        }

    }

    public static int sellItem(Basket basket , String item, int quantity){
        //get items
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Dont have item "+item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket , String item, int quantity){
        //get items
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Dont have item "+item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity){
            return stockList.unReserveStock(item, quantity);
        }
        return 0;
    }
}
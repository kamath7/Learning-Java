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

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }
    }

    public static int sellItem(Basket basket , String item, int quantity){
        //get items
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Dont have item "+item);
        }
        if(stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
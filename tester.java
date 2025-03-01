import CarpetSales.java
public class tester{

    public static void main(String[] args){
        CarpetSales invoice = new CarpetSales();
        invoice.newOrder();
        invoice.receipt();
        invoice.newOrder();
        invoice.receipt();
        invoice.newOrder();
        invoice.receipt();
        invoice.newOrder();
        invoice.receipt();
    }
}
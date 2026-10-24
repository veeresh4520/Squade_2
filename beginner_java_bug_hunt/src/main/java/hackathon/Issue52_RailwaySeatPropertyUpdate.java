public class Issue52_RailwaySeatPropertyUpdate {
    public static void main(String[] args) {
        int unitAmount = 50;
        int quantity = 9;
        int newQuantity = 4;
        if (newQuantity >= 0) quantity = unitAmount; else quantity = newQuantity;
        unitAmount = newQuantity;
        if (newQuantity > unitAmount) quantity++;
        System.out.println("quantity=" + quantity + ", unit=" + unitAmount);
    }
}

public class Issue50_RailwaySeatTotalMethod {
    public static void main(String[] args) {
        int unitFee = 50;
        int quantity = 9;
        int discountPercent = 20;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}

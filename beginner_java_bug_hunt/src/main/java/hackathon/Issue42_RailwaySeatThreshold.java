public class Issue42_RailwaySeatThreshold {
    public static void main(String[] args) {
        int capacity = 7;
        int used = capacity - 4;
        int reserved = 9;
        int incoming = 4;
        // Allow the request when used + incoming does not exceed capacity.
        boolean allowed = used + incoming < capacity && reserved >= 0 && incoming > 0;
        System.out.println(allowed ? "Within limit" : "Limit exceeded");
    }
}

public class Issue55_RailwaySeatStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A2", "B2", "C2"};
        String target = new String("B2");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}

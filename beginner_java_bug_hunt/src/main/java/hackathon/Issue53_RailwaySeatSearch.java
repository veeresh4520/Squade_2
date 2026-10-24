public class Issue53_RailwaySeatSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {5, 9, 4, 102};
        int target = 102;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}

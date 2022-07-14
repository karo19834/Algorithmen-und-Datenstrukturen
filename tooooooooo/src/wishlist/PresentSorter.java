package wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {
        for (int i=1; i < presents.length; i++) {
            int j=i;
            while (j > 0 && presents[j].desire < presents[j-1].desire) {
                Present tmp = presents[j];
                presents[j] = presents[j-1];
                presents[j-1] = tmp;
                j--;
            }
        }
    }
}

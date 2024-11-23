import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add(4);
        sortedSet.add(2);
        sortedSet.add(10);
        sortedSet.add(100);
        sortedSet.add(30);
        sortedSet.add(80);
        sortedSet.add(100);
        System.out.println("sortedSet = " + sortedSet);
        System.out.println("Sorted set first element = " + sortedSet.first());
        System.out.println("Sorted set last element = " + sortedSet.last());
        SortedSet headSortedSet = sortedSet.headSet(20);
        System.out.println("headSortedSet = " + headSortedSet);
        SortedSet tailSortedSort = sortedSet.tailSet(20);
        System.out.println("tailSortedSort = " + tailSortedSort);
        SortedSet sortedSet1 = sortedSet.subSet(2,30);
        System.out.println("Sorted set between given range = " + sortedSet1);
    }
}

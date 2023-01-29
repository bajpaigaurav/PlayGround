package dstructures;

import java.util.*;

public interface ParallelSortingList<E> extends List<E> {
  default void sort(Comparator<? super E> c) {
    System.out.println("ParallelSortingList.sort");
    Object[] a = this.toArray();
    Arrays.parallelSort(a, (Comparator) c);
    ListIterator<E> i = this.listIterator();
    for (Object e : a) {
      i.next();
      i.set((E) e);
    }
  }
}

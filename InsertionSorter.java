/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super();
	elements.mySort();
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        insertionSort(elements);
    }

    public static void insertionSort(ArrayList<String> unsorted) {
	for (int index = 1; index < elements.size(); index++) {
	    insert1(unsorted, index);
	}
    }

    public void insert1(ArrayList<String> unsorted) {
	
    }
}

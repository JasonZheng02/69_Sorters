/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
        this.mySort();
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        insertionSort(elements);
    }

    public void insertionSort(ArrayList<String> unsorted) {
	for (int index = 1; index < elements.size(); index++) {
	    insert1(unsorted, index);
	}
}

    public void insert1(ArrayList<String> unsorted, int numSorted) {
        String valueToInsert = elements.get(numSorted);
        boolean inserted = false;
        for (int indexToCompare = numSorted - 1;
             !inserted && indexToCompare >= 0;
             indexToCompare--){
                 if(indexToCompare == 0 && valueToInsert.compareTo(elements.get(0)) < 0) {
                    elements.set(1, elements.get(0));
                    elements.set(0, valueToInsert);
                    inserted = true;
                }
                else {
                    if (valueToInsert.compareTo(elements.get(indexToCompare)) < 0) {
                        elements.set(indexToCompare+1, elements.get(indexToCompare));
                    }
                    else {
                        elements.set(indexToCompare+1, valueToInsert);
                        inserted = true;
                    }
                }
             }
    }
}

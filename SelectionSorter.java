/**
  Implement an selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter{
    
    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(ArrayList<String> usersData) {
        super(usersData);
        this.mySort();
    }
    
    /**
      sort the user's data, implementing selection sort
     */
    public void mySort() {
        selectionSort(elements);
    }
    
    public void selectionSort(ArrayList<String> unsorted) {
        for (int next = 0;
             next < elements.size() - 1;
             next++) {
                 elements.set( next, elements.set( dweebIndex(next),
                                                   elements.get(next))
                             );
             }
    }
    
    private int dweebIndex( int startAt) {
        int dweebAt = startAt;
        String dweeb = elements.get(dweebAt);
        
        for (int testAt = startAt + 1;
             testAt < elements.size();
             testAt++) {
                 if (elements.get(testAt).compareTo( dweeb) < 0) {
                     dweebAt = testAt;
                     dweeb = elements.get( dweebAt);
                 }
             }
        return dweebAt;
    }
}
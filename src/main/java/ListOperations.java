import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Recursive list operations
 * Created by Mustafa on 31.03.2016.
 */
public class ListOperations<E> {
    /**
     * Intersect list of list1 and list2
     * @param list1 input list to intersect
     * @param list2 input list to intersect
     * @return Intersect list of list1 and list2
     */
    public List intersectionOfLists(ArrayList<E> list1, ArrayList<E> list2){
        // Base
        // return list1 when we are tail of list
        if (list1.size()==0)
            return(list1);
        else {
            // If list in other list add intersect
            ArrayList<E> intersect = new ArrayList<E>();
            if(list2.contains(list1.get(0)))
                intersect.add(list1.get(0));
            // Call next part of list after deleting first value
            ArrayList<E> next = new ArrayList<E>();
            next.addAll(list1.subList(1,list1.size()));
            // Call next part of list
            intersect.addAll(intersectionOfLists(next,list2));
            // return intersected between list1 and list2
            return(intersect);
        }
    }

    /**
     * Calculate union of list1 and list2
     * @param list1 The input list to union. Add list2 into list1
     * @param list2 The input list to union
     * @return List1 which with list2
     */
    public List unionOfLists(ArrayList<E> list1, ArrayList<E> list2){
        // Base case
        // after removing list2 return list1 which was union
        if(list2.size() == 0)
            return(list1);
        else{
            // Add list2 to list1
            list1.add(list2.get(0));
            ArrayList<E> next = new ArrayList<E>();
            // Call next part of list
            next.addAll(list2.subList(1,list2.size()));
            return(unionOfLists(list1,next));
        }
    }

    /**
     * Find list into another list
     * @param list1 Base list which is searching
     * @param list2 The list which is looking into list1
     * @return True if list1 has list2, otherwise False
     */
    public boolean isSubset(ArrayList<E> list1, ArrayList<E> list2){
        // Base case
        // Return false if list tail was seen
        if(list1.size() == 0)
            return(false);
        else{
            // Check first same letter
            if(list1.get(0).equals(list2.get(0))) {
                // Check rest of list with myContains methods
                if (myContains(list1, list2)) {
                    return(true);
                } else {
                    // Call next part of list
                    ArrayList<E> next = new ArrayList<E>();
                    next.addAll(list1.subList(1,list1.size()));
                    return(isSubset(next,list2));
                }
            }else{
                // Call next part of list if letter is different
                ArrayList<E> next = new ArrayList<E>();
                next.addAll(list1.subList(1,list1.size()));
                return(isSubset(next,list2));
            }
        }
    }

    /**
     * Contain method to check rest of list
     * @param list1 First list to check if is same another
     * @param list2 Second list to check if is not same another
     * @return
     */
    private boolean myContains(ArrayList<E> list1, ArrayList<E> list2){
        // Base list
        //Return true if list2 of tail has been seen
        if(list2.size() == 0)
            return(true);
        else{
            if(list1.get(0).equals(list2.get(0))){
                ArrayList<E> next = new ArrayList<E>();
                ArrayList<E> next2 = new ArrayList<E>();
                // Call next list
                next.addAll(list1.subList(1,list1.size()));
                next2.addAll(list2.subList(1,list2.size()));
                return(myContains(next,next2));
            }else{
                return(false);
            }
        }
    }
}

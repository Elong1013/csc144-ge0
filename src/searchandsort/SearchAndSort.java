package firstweekassignment;

/**
 *these codes are borrowed from Leon, thank you!!
 * and I got some help from chase, he is awesome!
 * this whole project generally introduces some basic algorithms like 
 * <code>LinearSearch</code>, <code>binaySearch</code>, 
 * <code>selectionSort</code>, <code>insertionSort</code>, and
 * <code>mergeSort</code>.THen we made a main method to support these 
 * method 
 * <p>
 * the difference between Java and python
 * <p>
 * Remember the sentence we learn from our first class,Write once,run 
 * anythere.this is the most directly feeling I had after one week our Java
 * classes .As a new learner who start to complie Java progamming language,I
 * intially feeled that java is harder than python,start with 
 * installation.
 * <p>
 * difference 
 * <p>
 * As a new programmer, thing first thing in my head is the datatype difference.
 * AS we know, when we are saving things into a variable in python, we do not 
 * need to mention what datatype this variable is,because python system could
 * translate and identify the datatype by itself. However, when we are
 * creating a variable in Java, the first thing we need to write down is the 
 * datatype of this variable, this is problem which I alway did in my previous
 * work. For example, if we want to saving a integer into variable x. we need to
 * write<code>int x = 2</code>,something like this. 
 * the second thing is the differnece of local variable and globel variable.
 * we are writing some codes in python. In my memory, local variable should be
 * written in one particular method and we can only apply this variavle in the 
 * method. However, in Java, when I first time saw a varible start with private 
 * static int. I became confused, becasuse this private thing also could be applied 
 * in different method. 
 * <p>
 * the feeling of using Java
 * <p>
 * after using Java, I strongly feel that Java is much more powerful. In our 
 * previous python classes,we don't have a tool like javadoc and generate a HTMl
 * page or using the commit and push bottom to ahieve our goal quickly. 
 * 
 * 
 * @author Erlang Long
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * this assignment represent first graded exercies 0 and it include some 
 * sorting and searching algorithms in it 
 */

public class Firstweekassignment {
    /**
* this class is represent this graded exercise 0 
     */
   private static Random rng = new Random();
    private static final int SIZE_THRESHOLD = 16;

    /**
     * this method is called makeList and used to creates a list of 
     * random positive integers in a specified range from (10 , 100 )
     * and then we will apply several sorting methods and searching
     * methods on it 
     * @param size the  number of radnom integers which could be generated 
     * by this New Arraylist()
     * @return  a list of integers 
     */
    public static List<Integer> makeList(int size) {
        List<Integer> result = new ArrayList<>();
        /**  
        * taking input from the user  
        * by using Random class.  
        * 
        */
        for (int i = 0; i < size; i++) {
            int n = 10 + rng.nextInt(90);
            result.add(n);
        } // for

        return result;
        /**
         * @return result 
         */
    } // makeList( int )

    /**
     * this method called printList and the parameter of this method 
     * is a list of integers.the name of variable of this integer list is 
 called values. this main goal for this method is to print a list of 
 random integers which are generated by last method 
 <p>
     * Before we defined this method,we primarily give the restriction to size 
     * of this arraylist which called SIZE_THRESHOLD. 
     * 
     * @param values the name of this list of ramdon integers 
     */
    public static void printList(List<Integer> values) {
        /**
         * this is printList is a method to create a Random List in restriction
         */
        if (values.size() < SIZE_THRESHOLD) {
            for (int n : values) {
                System.out.printf("%4d", n);
            } // for
            System.out.println();
        } // if
        else {
            for (int n : values) {
                System.out.printf("%4d\n", n);
        
            } // for
        } // else
    } // printList( List<Integer> )

    // TO-DO: Define a method that determines
    // the index of the first integer in a list
    // of integers that matches a given integer.
    // The method should return -1 if no match is found.
    // Use the sequential search algorithm.
    
    /**
     * in LinearSearch, a sequaltial search is done for all integers 
     * one by one.Every item would be checked at least one time and if 
     * two numbers matched in right order, then smaller particular item
     * return to the first place in the list and search will continues 
     * works untill the end of the data collection 
     * 
     * @param values the list of random integers 
     * @param target the number we want to check in values list 
     * @return if this algorithm can not find the number which we want, it 
     * will return result = -1. othersize it will return the index which 
     * indicate this particular number exist in this list and the index which 
     * it appeared in first time 
     */
    public static int linearSearch(List<Integer> values,
            int target) {
        /**
         * this is a linearSearch for finding the first integer in the
         * list of integers that matched a given integer 
         */
        int result = -1;
        /**
         * result = -1 is one directly indicate the if there is 
         * not one certain number in the list of integers 
         */

        int index = 0;
        /**
         * this indicates that we start to search at position 0 
         */
        while (index < values.size() && result < 0) {
            if (target == values.get(index)) {
                result = index;
            } // if
        /**
        * this condition makes sure that we are searching in the list called 
        * valus and if statement means once we find a numver which equal 
        * to our target the result will equal to this index 
        */
            index = index + 1;
        } // while
        return result;
    } // linearSearch( List<Integer>, int )

    // TO-DO: Define a method that determines
    // the index of the first integer in a list
    // of integers that matches a given integer.
    // The method should return -1 if no match is found.
    // Use the binary search algorithm.
    /**
     * searching for a particular number starting with dividing a sorted
     * arraylist and the mid point.if that particular number is less 
     * than the item at the mid point, focus on the interval of lower 
     * one.Otherwise focus on larger half.The main goal of this method 
     * is to find the first index of this specified number 
     * @param values the number of a list of random integers
     * @param target the number we want to find in this values list 
     * @return if this algorithm can not find the number which we want, it 
     * will return result = -1. othersize it will return the index which 
     * indicate this particular number exist in this list and the index which 
     * it appeared in first time .
     */
    public static int binarySearch(List<Integer> values,
            int target) {
        /**
         * comparing with linear search, binarySearch is 
         * more effective, and this method is also used to 
         * find a certain number in the list of integers 
         */
        int result = -1;
        /**
         * @return -1 if there is not exist a number which we find in
         * the list 
         */

        int lo = 0;
        int hi = values.size() - 1;
        /**
         * declard two variables lo and hi and save the first and the last 
         * position into these two variables 
         */

        while (lo < hi && result < 0) {
            int mid = (lo + hi) / 2;
            if (target == values.get(lo)) {
                result = lo;
            } // if
            else if (target == values.get(mid)) {
                result = mid;
            } // else if
            else if (target == values.get(hi)) {
                result = hi;
            } // else if
            else if (target < values.get(mid)) {
                hi = mid - 1;
            } // else if
            else {
                lo = mid + 1;
            } // else
        } // while

        return result;
    } // binarySearch( List<Integer>, int )

    // TO-DO: Define a method that sorts a list
    // of integers using the selection sort algorithm.
    /**
     * the main goal of swap method is to switch positions if a smaller
     * number is behind a larger number 
     *  
     * @param values the list of integers 
     * @param i the position of first number
     * @param j the position of next number 
    */
    public static void swap(List<Integer> values, int i, int j) {
        int temp = values.get(i);
        values.set(i, values.get(j));
        values.set(j, temp);
    } // swap( List<Integer>, int, int )
    /**
     * locate the smallest number at the first place 
     * @param values  a list of integers named values 
     * @param start where the start position is 
     * @return put the small number in front of the rest of numbers 
     */
    public static int findPosMin(List<Integer> values, int start) {
        int bestGuessSoFar = start;
        for (int i = start + 1; i < values.size(); i++) {
            if (values.get(i) < values.get(bestGuessSoFar)) {
                bestGuessSoFar = i;
            } // if
        } // for
        return bestGuessSoFar;
    } // findPosMin( List<Integer>, int )
    /**
     * finding the minimum element from unsorited part and putting it 
     * at the beginning then repeat these porcesses on next number 
     * untill the last number
    * @param values  a list of integers named values 
     */
    public static void selectionSort(List<Integer> values) {
        for (int i = 0; i < values.size(); i++) {
            int j = findPosMin(values, i);
            swap(values, i, j);
        } // for
    } // selectionSort( List<Integer> )

    // TO-DO: Define a method that sorts a list
    // of integers using the insertion sort algorithm.
    /**
     * find the order between first two answers and then check the rest
     * of number and place them into the right place one by one. repeat 
     * this step until last number. 
     * @param values a list of integers named values 
     * @param next the number we need to insert 
     */
    public static void insert(List<Integer> values, int next) {

        int i = next;
        while (i > 0 && values.get(i) < values.get(i - 1)) {
            swap(values, i, i - 1);
            i = i - 1;
        } // while

    } // insert( List<Integer>, int )

    public static void insertionSort(List<Integer> values) {
        for (int i = 1; i < values.size(); i++) {
            insert(values, i);
        } // for
    } // insertionSort( List<Integer> )

    // TO-DO: Define a method that sorts a list
    // of integers using the merge sort algorithm.
    /**
     * Comparing with last two sorting method, merge sort is more 
     * effective, this is what we had learned from CSC 151.Merge sort 
     * is a divide and conquer algorithm.the main idea is to divide a 
     * whole list into smaller list until to 2 or 3 number as a group.
     * Then, sort these smaller group and regroup them to larger list and sort 
     * them again. Finally,doing these same steps until recus to origin list
     * @param values a list of integers named values
     * @param prefixStart the place for the first component 
     * @param suffixStart the place for the mid point component 
     * @param suffixEnd  the place for the last number 
     */
    public static void merge(List<Integer> values, int prefixStart,
            int suffixStart, int suffixEnd) {
        List<Integer> temp = new ArrayList<>();

        int i = prefixStart;
        int j = suffixStart;

        while (i < suffixStart && j < suffixEnd) {
            if (values.get(i) < values.get(j)) {
                temp.add(values.get(i));
                i++;
            } // if
            else {
                temp.add(values.get(j));
                j++;
            } // else
        } // while

        while (i < suffixStart) {
            temp.add(values.get(i));
            i++;
        } // while

        while (j < suffixEnd) {
            temp.add(values.get(j));
            j++;
        } // while

        i = prefixStart;
        for (int index = 0; index < temp.size(); index++) {
            values.set(i, temp.get(index));
            i++;
        } // for
    } // merge( List<Integer>, int, int )
    /**
     * after we divided a list of random integers and make them in 
     * ascending order.We can star to compare these smaller list pairs
     * by pairs.Compring the smallest element and put it at the first place 
     * in the new list and doing same staps for the rest of numbers until
     * we put all the number in a order list. 
     * 
     * @param values a list of random integers
     */

    public static void mergeSort(List<Integer> values) {
        for (int stepSize = 2; stepSize < values.size(); stepSize *= 2) {
            for (int i = 0; i < values.size(); i += stepSize) {
                int prefixStart = i;
                int suffixStart = i + stepSize / 2;
                int suffixEnd = Math.min(values.size(), i + stepSize);
                merge(values, prefixStart, suffixStart, suffixEnd);
            } // for
            if (stepSize > values.size() / 2) {
                int prefixStart = 0;
                int suffixStart = stepSize;
                int suffixEnd = values.size();
                merge(values, prefixStart, suffixStart, suffixEnd);
            } // if
            //printList(values);
        } // for
    } // mergeSort( List<Integer> )
        /** 
        * This is the main method  
        * which is very important for  
        * execution for a java program. 
     * @param args represents the actual parameter we need to place 
        */
    public static void main(String[] args) {
        System.out.println("Searching and sorting algorithms");
       
  
        // TO-DO: Add code that tests the searching and sorting
        // methods.
        System.out.println("Selection sort.");
        List<Integer> data = makeList(12);
        printList(data);
        System.out.println(" **** ");
        selectionSort(data);
        printList(data);

        System.out.println(" **** ");

        System.out.println("Insertion sort.");
        data = makeList(12);
        printList(data);
        System.out.println(" **** ");
        insertionSort(data);
        printList(data);

        System.out.println(" **** ");

        System.out.println("Merge sort.");
        data = makeList(12);
        printList(data);
        System.out.println(" **** ");
        mergeSort(data);
        printList(data);
    } // main( String [] )
} // SearchAndSort /**


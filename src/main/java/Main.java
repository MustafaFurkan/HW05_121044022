import java.util.ArrayList;

/**
 * Created by Mustafa on 30.03.2016.
 */
public class Main {


    public static void main(String[] agrs){

        System.out.println("------------ PART 1 ------------");
        System.out.println("-Tower Of Hanoi:");

        Hanoi hanoiTest = new Hanoi(4, 0);
        System.out.println("Sticks: 4 and Tower: 0");
        System.out.println("Source: 0 and buffer: 1 and destination: 2");
        // source buffer destination
        hanoiTest.move(0, 1, 2);
        System.out.println("Result:");
        while(!hanoiTest.towers[2].sticks.isEmpty())
            System.out.println(hanoiTest.towers[2].sticks.pop());


        System.out.println("------------ PART 2 ------------");
        System.out.println("-Remove All Occuerence");

        LinkedListRec<Integer> intTest = new LinkedListRec<Integer>();

        intTest.add(12);
        intTest.add(1322);
        intTest.add(12);
        intTest.add(142);
        intTest.add(12);
        intTest.add(12);
        intTest.add(142);


        System.out.println("Before remove:");
        System.out.println(intTest);

        intTest.removeAll(12);
        System.out.println("After remove:");
        System.out.println(intTest);


        System.out.println("------------ PART 3 ------------");
        System.out.println("-isSubset-union-intersect");

        ListOperations intersectTest = new ListOperations();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(300);
        list1.add(600);
        list1.add(800);
        list1.add(400);
        list1.add(500);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(300);
        list2.add(600);
        list2.add(800);

        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list3.add(320);
        list3.add(630);
        list3.add(88);

        ArrayList<Integer> list4 = new ArrayList<Integer>();

        list4.add(300);
        list4.add(630);
        list4.add(800);
        list4.add(200);
        list4.add(100);

        System.out.println("Before isSubset list1:");
        System.out.println(list1);

        System.out.println("After isSubset list2:");
        System.out.println(list2);
        System.out.println("subSet is: " + intersectTest.isSubset(list1,list2));

        System.out.println("Before union list1:");
        System.out.println(list1);

        System.out.println("Before union list3:");
        System.out.println(list3);

        System.out.println("After union list1:");
        System.out.println(intersectTest.unionOfLists(list1,list3));

        System.out.println("Before intersect list4:");
        System.out.println(list4);
        System.out.println("Before intersect list2:");
        System.out.println(list2);

        System.out.println("After intersect list4:");
        System.out.println(intersectTest.intersectionOfLists(list4,list2));

    }
}

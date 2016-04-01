import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Mustafa on 01.04.2016.
 */
public class ListOperationsTest {

    @Test
    public void testIntersectionOfLists() throws Exception {
        ListOperations intersectTest = new ListOperations();
        ArrayList<Integer> expected = new ArrayList<Integer>();

        ArrayList<Integer> list4 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(300);
        list2.add(600);
        list2.add(800);

        list4.add(300);
        list4.add(630);
        list4.add(800);
        list4.add(200);
        list4.add(100);

        expected.add(300);
        expected.add(800);


        assertEquals(expected,intersectTest.intersectionOfLists(list4,list2));
    }

    @Test
    public void testUnionOfLists() throws Exception {
        ListOperations unionTest = new ListOperations();
        ArrayList<Double> expected = new ArrayList<Double>();

        ArrayList<Double> list4 = new ArrayList<Double>();
        ArrayList<Double> list2 = new ArrayList<Double>();
        list2.add(300.0);
        list2.add(600.0);

        list4.add(200.0);
        list4.add(630.0);

        expected.add(300.0);
        expected.add(600.0);
        expected.add(200.0);
        expected.add(630.0);

        assertEquals(expected,unionTest.unionOfLists(list2,list4));
    }

    @Test
    public void testIsSubset() throws Exception {
        ListOperations subTest = new ListOperations();

        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        list4.add("ali");
        list4.add("veli");
        list4.add("selim");
        list4.add("samet");

        list2.add("veli");
        list2.add("selim");

        assertTrue(subTest.isSubset(list4,list2));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mustafa on 01.04.2016.
 */
public class LinkedListRecTest {

    @Test
    public void testRemoveAll() throws Exception {
        LinkedListRec<Integer> intTest = new LinkedListRec<Integer>();
        LinkedListRec<Integer> expected = new LinkedListRec<Integer>();

        intTest.add(12);
        intTest.add(13522);
        intTest.add(12);
        intTest.add(1242);
        intTest.add(12);
        intTest.add(182);
        intTest.add(1422);

        expected.add(13522);
        expected.add(1242);
        expected.add(182);
        expected.add(1422);

        intTest.removeAll(12);

        assertEquals(expected,intTest);
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DynamicStringListTest
{

    @Test
    void testAddMethod()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        assertEquals(2, list.size());
    }

    @Test
    void testAddAndRemoveMethod()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");
        assertEquals(2, list.size());
        assertEquals("Good", list.remove(1));
        list.add("test");
        assertEquals(2, list.size());
        assertEquals("test", list.get(1));
    }

    @Test
    void testAddStringResult()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        assertEquals("Hello", list.get(0));
        assertEquals("Good", list.get(1));
    }

    @Test
    void testGetMethod()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        String result = list.get(0);

        assertEquals("Hello", result);
    }

    @Test
    void testSetMethod()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        list.set(0, "Goodbye");

        assertEquals("Goodbye", list.get(0));
    }

    @Test
    void testSetEndArray()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        list.set(1, "Goodbye");

        assertEquals("Goodbye", list.get(1));
    }

    @Test
    void testRemoveMethod()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");
        assertEquals(2, list.size());
        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveLastIndex()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");
        assertEquals(2, list.size());
        list.remove(1);
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveResult()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");
        list.add("bruh");
        list.add("okay");
        list.add("great");
        String result = list.remove(4);
        assertEquals("great", result);
    }

    @Test
    void testSizeMethod(){
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        assertEquals(2, list.size());
    }

    @Test
    void testCapacityMethod(){
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        assertEquals(10, list.capacity());
    }

    @Test
    void testSizeDouble(){
        DynamicStringList list = new DynamicStringList(2);
        
        list.add("Hello");
        list.add("Good");
        assertEquals(2, list.capacity());

        list.add("Add");

        assertEquals(4, list.capacity());

        list.add("Eight");
        list.add("Bruh");

        assertEquals(8, list.capacity());
    }
}

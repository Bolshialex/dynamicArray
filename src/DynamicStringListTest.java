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
    void testGetMethod()
    {
        DynamicStringList list = new DynamicStringList();
        
        list.add("Hello");
        list.add("Good");

        String result = list.get(0);

        assertEquals("Hello", result);
    }

}

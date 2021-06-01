import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

//Mayra Patricia Guajardo Palomera A01634475
//TDD Architecture Homework


public class TDD{

    // Size of the list
    @Test
    public void getSize1(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Adding 5 elements to the list
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        //Prove list size is 5
        assertEquals(5,list.size());
    }

    @Test
    public void getSize2(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Prove list size is 0
        assertEquals(0,list.size());
    }

    @Test
    public void getSize3(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        //Add 1 string element
        list.add("Mayra");
        //Prove list size is 1
        assertEquals(1,list.size());
    }

    // Clear the list
    @Test
    public void clearList1(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        //Addding 3 elements
        list.add("Mayra");
        list.add("Patricia");
        list.add("Guajardo");
        //clear the list
        list.clear();
        //Prove list is empty
        assertEquals(0,list.size());

    }

    @Test
    public void clearList2(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Adding 3 elements to the list
        list.add(1);
        list.add(1);
        list.add(1);
        //clear the list
        list.clear();
        //Prove list is empty
        assertTrue(list.isEmpty());
    }

    @Test
    public void clearList3(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Adding 1 element to the list
        list.add(1);
        //clear the list
        list.clear();
        //Prove list is empty
        assertNotEquals(1,list.size());
    }

    //Add items

    @Test
    public void addItems1(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Add elements to the list
        list.add(1);
        list.add(12);
        list.add(3);
        //Prove list is not empty
        assertFalse(list.isEmpty());

    }
    @Test
    public void addItems2(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        //Add elements to the list
        list.add("Mayra");
        list.add("Andres");
        list.add("Luis");
        list.add("Eduardo");
        //Prove list size is equal to items added
        assertEquals(4,list.size());
    }
    @Test
    public void addItems3(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        //Add elements to the list
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        //Prove list contains the object added
        assertTrue(list.contains("Saturday"));
    }

    //Check if item exists
    @Test
    public void checkExistingItem1(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Add elements
        list.add(50);
        list.add(30);
        list.add(20);
        //Prove object exists in list
        assertTrue(list.contains(30));
    }
    @Test
    public void checkExistingItem2(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30));
        //Prove the 2 lists are equal
        assertEquals(list,list2);
    }
    @Test
    public void checkExistingItem3(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        //Add elements to the list
        list.add("Sun");
        list.add("Moon");
        //Prove object is in list
        assertEquals("Sun", list.get(0));

    }

    //Get elements by index
    @Test
    public void elementsByIndex1(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        //Add elements to the list
        list.add("Pink");
        list.add("Black");
        list.add("White");
        assertEquals("Pink", list.get(0));


    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void elementsByIndex2(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        //Add elements to the list
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        fail(list.get(3));

    }

    @Test
    public void elementsByIndex3(){
        //Initialize list
        List<String> list = new ArrayList<>(Arrays.asList("M","P","G","P"));
        assertNotEquals("M", list.get(3));

    }




    // Search index of an object
    @Test
    public void indexOfObject1(){
        //Initialize list
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        //Prove object is in selected index
        assertNotEquals(0,list.indexOf("C"));

    }

    @Test
    public void indexOfObject2(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Add elements
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        //Prove 4 is the index of value 10
        assertEquals(4,list.indexOf(10));


    }
    @Test
    public void indexOfObject3(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        //Prove index of 3 is not existing
        assertEquals(-1,list.indexOf(3));

    }

    //Remove item by index
    @Test
    public void removeItemByIndex1(){
        //Initialize empty list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //remove element
        list.remove(0);
        assertFalse(list.contains(1));

    }

    @Test
    public void removeItemByIndex2(){
        //Initialize list
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Strawberry","Grape"));
        //remove element
        list.remove(2);
        System.out.println(list.get(2));
        assertNotEquals("Strawberry",list.get(2));


    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeItemByIndex3(){
        //Initialize empty list
        List<String> list = new ArrayList<>();
        fail(list.remove(1));
    }

}

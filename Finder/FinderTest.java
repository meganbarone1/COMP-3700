import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


  
   
   @Test public void testFindMax() {
      Finder find = new Finder();
      int[] arr = new int[5];
      arr[0] = 5;
      arr[1] =9;
      arr[2] = 3;
      arr[3] = 17;
      arr[4] = 2;
      int result = find.findMax(arr);
      Assert.assertEquals(result, 17);
      int[] fake = new int[100];
      int result2 = find.findMax(fake);
      Assert.assertEquals(result2, 0);
   }
   @Test public void testEmptyArrMax() {
      Finder find = new Finder();
      int[] fake = new int[100];
      int result = find.findMax(fake);
      Assert.assertEquals(result, 0);  
   }
   @Test public void testNullArrMax() {
      Finder find = new Finder();
      int[] nullArr = null;
      int result = find.findMax(nullArr);
      Assert.assertEquals(result, 0);
   }
   @Test public void testFindMin() {
      Finder find = new Finder();
      int[] arr = new int[5];
      arr[0] = 5;
      arr[1] =9;
      arr[2] = 3;
      arr[3] = 17;
      arr[4] = 2;
      int result = find.findMin(arr);
      Assert.assertEquals(result, 2);
   }
   @Test public void testEmptyArrayMin() {
      Finder find = new Finder();
      int[] fake = new int[100];
      int result = find.findMin(fake);
      Assert.assertEquals(result, 0);
   }
   @Test public void testNullArrayMin() {
      Finder find = new Finder();
      int[] nullArr = null;
      int result = find.findMin(nullArr);
      Assert.assertEquals(result, 0);
   }
}

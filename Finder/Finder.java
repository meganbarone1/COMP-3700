
public class Finder {
   
   public int findMax(int[] intArray) {
      if (intArray == null || intArray.length == 0) {
         return 0;
      }
      
      int max = intArray[0];
      for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] > max) {
            max = intArray[i];
         }
      }
      return max;
   }
   
   public int findMin(int[] intArray) {
   if (intArray == null || intArray.length == 0) {
         return 0;
      }
      int min = intArray[0];
      for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] < min) {
            min = intArray[i];
         }
      }
      return min;
   
   }








}
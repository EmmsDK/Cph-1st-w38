public class Main{

static int[] arraySort (int [] Array){
  for(int i = 0; i<Array.length; i++){
      for(int y = i + 1; y<Array.length; y++){
          int tempValue = 0;
          if(Array[i] > Array[y]){
              tempValue = Array[i];
              Array[i] = Array[y];
              Array[y] = tempValue;
              }
            }
          }
        return Array;
      }
    int newArray[] = arraySort(intArray);
    System.out.print("The sorted array is: ");
    for (int i = 0; i < newArray.length; i++){
      System.out.print(" " + newArray[i]);
    }
  }
}

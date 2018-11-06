public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     int sum = 0;
     for (int i = 0; i < ary.length; i++) {
       if (i == x) {
         for (int i2 = 0; i2 < ary[x].length; i2++) {
           sum += ary[x][i2];
         }
       }
     }
     return sum;
   }
    //returns the sum of the elements in Row x of ary.

   public static int columnSum(int[][] ary, int x){
     int sum = 0;
     for (int i = 0; i < ary.length; i++) {
       for (int i2 = 0; i2 < ary[i].length; i2++) {
         if (i2 == x) {
           sum += ary[i][x];
         }
       }
     }
     return sum;
   }
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).

   /*
   *PART 2 - use prior methods where appropriate
   */
   public static int[] allRowSums(int[][] ary){
     int[] sums = new int[ary.length];
     for (int i = 0; i < ary.length; i++) {
       sums[i] = rowSum(ary, i);
     }
     return sums;
   }
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.

    public static int[] allColSums(int[][] ary){
      int max = 0;
      for (int i = 0; i < ary.length; i++) {
        max = Math.max(ary[i].length, max);
      }
      int[] sums = new int[max];
      for (int i = 0; i < max; i++) {
        sums[i] = columnSum(ary, i);
      }
      return sums;
    }
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.


   /*
   *PART 3 - use prior methods where appropriate
   */
   //public static boolean isRowMagic(int[][] ary){}
     //checks if the array is row-magic (this means that every row has the same row sum).

   //public static boolean isColumnMagic(int[][] ary){}
    //checks if the array is column-magic (this means that every column has the same column sum).

}

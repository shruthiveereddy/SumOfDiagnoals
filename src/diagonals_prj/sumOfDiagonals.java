package diagonals_prj;

//JAVA Code for Find difference between sums
//of two diagonals

class sumOfDiagonals {
   
 public static boolean sum(int arr[][], int n) throws ArrayIndexOutOfBoundsException
 {
	 
     // Initialize sums of diagonals
     int d1 = 0, d2 = 0;
    
     for (int i = 0; i < n; i++)
     {
         d1 += arr[i][i];
         d2 += arr[i][n-i-1];
     }
    
     // Checks if two diagonals are same
    
     if(d1==d2)
     {
    	 return true;
     }
     else
    	 return false;
 }
   
 /* Driver program to test above function */
 public static void main(String[] args) 
 {
     int n = 4;
    
     int arr[][] =
     {
         {1, 2, 1, 1},
         {4 ,1, 1, 3},
         {1, 1, 1, 4},
         {1, 8, 1, 1}
     };
     try
     {
     boolean result=sum(arr, n);
     System.out.println(result);
     }
     catch (ArrayIndexOutOfBoundsException e)
     {
        System.out.println("Since n is the length of the Array, Please provide valid length.");
     }
      
 }
}

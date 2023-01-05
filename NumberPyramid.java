//     1
//    2 2
//   3 3 3
//  4 4 4 4 

public class NumberPyramid {
   public static void main(String[] args) {
    int n=8;
    for(int i=1; i<=n; i++)
    {
        for(int j=i; j<= n-1 ;j++)
        {
            System.out.print(" ");
        }
        for(int j=1 ; j<=i ;j++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
   } 
}

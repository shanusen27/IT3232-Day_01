import java.util.Scanner;

public class Task05{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for(int k=0;k<n;k++){
            arr[k]=k+1;
        }
        int mid = arr.length/2;
       for (int i=arr[mid]-1;i>=1;i--){
        System.out.print(i+" ");
       }
       System.out.print(arr[mid]+" ");

       for(int j=n;j>arr[mid];j--){
        System.out.print(j+" ");
       }


        scanner.close();
    }
}
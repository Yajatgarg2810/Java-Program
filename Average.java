import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.println("Enter the elements in the array");
        
        for(int i = 0; i < n; i++){
            number[i] = sc.nextInt();  
        }
        sc.close();
        
        int sum = 0;
        for(int num : number){
            sum += num;
        }
        
        double average = (double) sum / n;
        System.out.println("Average of numbers in array: " + average);
    }
}

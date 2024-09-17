/* public class arraysum {
    public static void main(String args[])
    {
    
    System.out.println(sum(100));
}
public static int sum(int num)
{
    int s =0;


    if (num == 1) {
            return 1; // Base case: sum of 1 is 1
        } else {
            return num + sum(num - 1);
}
} */


public class arraysum {
    public static void main(String args[]) {
        printNumbers(100);
    }

    public static void printNumbers(int num) {
        if (num == 1) {
            System.out.println(num); // Base case: print 1
        } else {
            System.out.println(num); // Print the current number
            printNumbers(num - 1);   // Recursive call with num - 1
        }
    }
}


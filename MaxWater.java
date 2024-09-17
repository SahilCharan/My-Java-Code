import java.util.*;
// Brute force method---  O(N^2)
public class MaxWater {
 /*    public static int storeWater(ArrayList<Integer> height)
  {
     int maxW = Integer.MIN_VALUE;
     for(int i=0; i<height.size();i++)
     {
         for(j=i+1;j<height.size();j++)
         {
                int hi = Math.min(height.get(i),height.get(j));
                int wi = j-i;
                int currentWater = hi*wi;
                maxW = Math.max(maxW,currentWater);

            }
        }
        return maxW;

    }
 */

    // Optimise methord------------ Two pointer approch;----O(N)

    public static int storeWater(ArrayList<Integer> height)
    {
        int left = 0;
        int right = height.size()-1;
        int maxW= 0;
        while(left<right)
        {
            //calculate water area
            int hi = Math.min(height.get(left), height.get(right));
            //calculate height
            int wi = right -left;
            int currentWater= hi*wi;
            maxW = Math.max(maxW,currentWater);

            //update pointers
            if(height.get(left)<height.get(right))
            left++;
            else
            right--;

        }
        return maxW;

    }
    public static void main (String args[])
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(storeWater(list));


    }
}

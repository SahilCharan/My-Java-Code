import java.util.*;
public class greedy
{
    public static void main(String[] args)
    { //O(n)
        int start[]={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activities[][] = new int[start.length][3];
        for(int i = 0;i<start.length;i++)
        {
            activities[i][0] = i;//index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //to sort a 2d array we will use:: LAMDA FUNCTION is  a short form of BIG FUNCTION
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans= new ArrayList<>();
       
       //1st activity
        maxAct= 1;
        // ans.add(0); 
        ans.add(activities[0][0]);
        // int lastEnd = end[0];
        int lastEnd = activities[0][2];

        for(int i =1;i<end.length;i++)
        {
            // if(start[i]>= lastEnd) 
            if(activities[i][1]>=lastEnd)
            {
                //activity select
                maxAct++;
                // ans.add(i);
                ans.add(activities[i][0]);
                // lastEnd = end[i];
                lastEnd = activities[i][2];
            }
            
        }
        System.out.println("max Activity = "+ maxAct);
        for(int i =0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }

}
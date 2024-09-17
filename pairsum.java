import java.util.ArrayList;

public class pairsum {

    public static boolean sum(ArrayList<Integer> list, int k)
    {
        int left=0, right = list.size()-1;
        while(left!=right)
        {
            if(list.get(right)+list.get(left)==k)
           { return true;}
            else
            if(list.get(right)+list.get(left)<k)
            left++;
            else
            right--;
        }
        return false;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        if(sum(list,target)==true)
        System.out.println("pair sum exist");
        else
        System.out.println("does not exist");
         int target1 = 51;
        if(sum(list,target1)==true)
        System.out.println("pair sum exist");
        else
        System.out.println("does not exist");
    }
}

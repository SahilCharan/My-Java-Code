import java.util.ArrayList;

public class pairsum2 {

    public static boolean sum(ArrayList<Integer> list, int k)
    {
        int bp=-1;
        for(int i = 0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {//breaking point
                bp=1;
                break;
            }
        }
        int lp=bp+1;
        int rp = bp;
        while(lp!=rp)
        {
            if(list.get(rp)+list.get(lp)== k)
            {
                return true;
                break;

            }
            else
            if(list.get(rp)+list.get(lp) < k)
            {
                lp = (lp+1)%n;
            }
            else
             rp = (n+rp-1)%n;

            }

            return false;
        }


    }

///////////////////////// sorted and rotated array
    public static void main(String[] args)
    {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int target = 31;
        if(sum(list,target)==true)
        System.out.println("pair sum exist");
        else
        System.out.println("does not exist");

    }
}

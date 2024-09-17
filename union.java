import java.util.HashSet;

public class union {
    public static int unionElements(int arr1[],int arr2[])
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static void main (String[] args){
        int arr1[] = {1,3,5};
        int arr2[] = {1,3,5,7,9,2,6,4,8};

        System.out.println(unionElements(arr1, arr2));
    }
}

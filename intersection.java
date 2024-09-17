import java.util.HashSet;

public class intersection {

    public static int intersectionElements(int arr1[],int arr2[]){
        HashSet<Integer> set =  new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(int j =0; j< arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }

        return count;

    }
    public static void main(String[] args){
        int arr1[]= {1,2,2,1};
        int arr2[]= {2,2};

        System.out.println(intersectionElements(arr1, arr2));


    }
}

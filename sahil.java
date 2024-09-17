import java.util.Scanner;
//import java.lang.Math;
public class sahil
{
    public static void main (String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
        int hr,min;
        double degree,dig;
        System.out.print("enter hour");
        hr = sc.nextInt();
        System.out.print("enter minutes");
        min = sc.nextInt();
        if(hr > 12 || min > 60)
             {
                System.out.println("plz enter correct time ");
            }
        else 
            {
                degree = ((hr*30)+(0.5*min))-(min*6);
                dig = Math.abs(degree);

                System.out.println("degree =" + dig);   
            }
        }       
    }



import java.util.*;
public class Bserach {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
        int pos=-1,key,mid,beg=0,last=arr.length-1;
        System.out.println(" Enter the array elements:");

            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println("the array elements are:");

            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        System.out.println("enter the value to be serched");
        key=sc.nextInt();

        do {
            mid=(beg+last)/2;

            if(arr[mid]==key)
            {
                pos=mid;
                System.out.println("Elemnt found at positon ");
                System.out.println(pos+1);
                break;

            }
else if
                (arr[mid]>key)
                {
                last=mid-1;
                }
else {
    beg=mid+1;
}
        } while (beg<=last);


if(beg>last)
System.out.println("item not found");

    }
}



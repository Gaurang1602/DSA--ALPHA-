import java.util.*;
public class LinearSearch{
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=search(arr, key);
        if(index==-1){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("Element Found at index :"+index);
        }
}
}
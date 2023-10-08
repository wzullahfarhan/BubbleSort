import java.util.Scanner;
public class BubbleSort{
    public static void ShowArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); //new object
        System.out.print("Enter the Size of array: ");
        int a=sc.nextInt();

        int arr[]=new int[a];
        System.out.print("Enter "+a+" array elements: ");
        //array Input
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        ShowArray(arr);
        //bubble Sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        //sorted Array Called
        ShowArray(arr);

    }
}

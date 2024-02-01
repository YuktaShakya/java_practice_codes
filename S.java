/*import java.util.*;
public class S{
public static void duparr(int arr[]){
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){

if(arr[i]==arr[j]){
System.out.println(arr[j]);
}
}
}
}
public static void main(String args[]){
int arr[]={1,2,3,1,1,1,4,5,12,4,2};
duparr(arr);
}}*/
public class S {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {1, 2,8,1, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
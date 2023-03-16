import java.util.Arrays;

public class Array {
String name;
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=1;
        a[1]=4;
        a[2]=5;
        a[3]=2;
        a[4]=6;
//        a[5]=8; -> Array Index OutOf bound exception-> runtime error
        for(int i=0;i<5;i++){
            System.out.println("a["+i+"] = "+a[i]);
        }

        int b[] = {4,5,3,8,9,3};
        for(int i=0;i<b.length;i++){
            System.out.println("b["+i+"] = "+b[i]);
        }
//        enhanced for loop
        for(int i : b){
            System.out.println(i);
        }

        System.out.println("=================multidimension Array============");

//        Multidimension Array
        int m[][]={
                    {1,4,5},
                    {6,4,2,7},
                    {2,4}
                    };

        for(int row = 0;row<m.length;row++){
            System.out.println("length of row"+m[row].length);
            for(int col=0;col<m[row].length;col++){

                System.out.print(m[row][col]+"  ");
            }
            System.out.println();

        }
        System.out.println("================sort==================");

        int arr[]={4,3,7,8,2,1};
        Arrays.sort(arr);
        for(int ar:arr){
            System.out.print(ar+", ");
        }
        System.out.println();
        System.out.println("=================clonning Array=============");
        int arr1[]={5,4,2,3};
        int cloneArr[] = arr1.clone();
        for(int c:cloneArr){
            System.out.print(c +", ");
        }
        System.out.println();
        System.out.println(arr1 == cloneArr);
    }
}

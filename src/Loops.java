public class Loops {

//    3 types of loop
//    1-for loop
//    2-while-loop
//    3-do while
public static void main(String[] args) {
    int i=1;
    for( i=1;i<=10;i++){
        System.out.println("Hello world! i = "+i);
    }
    System.out.println("out of loop "+i);


//    while loop
    int j=0;
    while (j<10){
        System.out.println(" from while loop j ="+j);
        j++;
    }

    int k=0;
    do{
        System.out.println("from do while k ="+k);
        k++;
    }while(k<10);



}

}

//syntax of for loop
//for(int i=o -> initialise; i<10 terminate condition; i++ ->increment or decrement){
//loop body
//}

//syntax of while
//initialise i=0
// while(i<10 -> terminate condition){
//loop body
//increment or decrement
//}

//syntax of do while
//intialise
//do{
//loop body
//increment or decrement
//}while(terminate condition)
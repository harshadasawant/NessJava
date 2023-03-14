class vehicle{

}
class Car extends vehicle{

}

public class Operator {
    public static void main(String[] args) {
        int j=5;
        System.out.println(j);

       int i =  j++;
        System.out.println("j="+j);
        System.out.println("i="+i);

       int k= ++j;
        System.out.println("j="+j);
        System.out.println("k="+k);

        i+=10; //i=i+10
        System.out.println(i);

//        & |  && ||
        int x=40;
        int y=18;
        int z=60;

        if(x>y && x>z){
            System.out.println("x is greater");
        } else if(y>x & y>z){
            System.out.println("Y is greater");
        } else{
            System.out.println("z is greater");
        }



//        AND  any condition false output is false
//        condition 1   condition2     output
//            T                   T           T
//            T                F           F
//            F               T           F
//            F                F               F

//                OR Table- if any condition is true then out put is true
//        condition 1   condition 2      output
//                T           T               T
//                T           F                T
//                F           T               T
//                F           F               F

        int a=8;
        int b=9;
        int c=8;
        int d=9;
        if(++a>++b || ++c>++d){
            System.out.println("inside if");
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int g=8,h=9;
        if(g>h){
            System.out.println("g is greater");
        } else{
            System.out.println("h is greater");
        }

        System.out.println(g>h?"g is greater":"h is greater");


        Car car = new Car();
        System.out.println(car instanceof Car);
        System.out.println(car instanceof vehicle);


    }

}

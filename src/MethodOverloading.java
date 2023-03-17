public class MethodOverloading {
    void add(){
        System.out.println(3+4);
    }

    void add(int a){
        int b = 7;
        System.out.println(a+b);
    }

    void add(int a, int b){
        System.out.println(a+b);
    }



    void add(int a, float b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.add(4,5);
        methodOverloading.add(6,2.3F);
        methodOverloading.add();
        methodOverloading.add(4);


    }
}

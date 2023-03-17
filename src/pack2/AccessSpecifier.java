package pack2;

public class AccessSpecifier {
    protected  void display(){
        System.out.println(" calling from display");
    }

    public static void main(String[] args) {
        AccessSpecifier obj = new AccessSpecifier();
        obj.display();
    }
}

class TestAccess{
    public static void main(String[] args) {
        AccessSpecifier accessSpecifier = new AccessSpecifier();
        accessSpecifier.display();

    }
}

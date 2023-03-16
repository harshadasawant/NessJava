public class SwitchCase {
    public static void main(String[] args) {
        String month="Harshada6";
        switch(month){
            case "Harshada":
                System.out.println("January");
                break;
            case "Harshada1":
                System.out.println("February");
                break;
            case "Harshada2":
                System.out.println("March");
                break;
            default :
                System.out.println("Invalid Month");
                break;
        }

        System.out.println("Out of switch block");
    }
}

public class BreakAndConti {
    public static void main(String[] args) {
        System.out.println("=================multidimension Array============");

//        Multidimension Array
        int m[][]={
                {1,4,5},
                {6,4,2,7},
                {2,4}
        };
        outer:
        for(int row = 0;row<m.length;row++){
            System.out.println("length of row"+m[row].length);
            inner:
            for(int col=0;col<m[row].length;col++){

                System.out.print(m[row][col]+"  ");
                if(col==1) {
                    break;
                }
                System.out.println("dfgfd");
            }
            System.out.println();


        }
        System.out.println("outer side of all loop");

    }
}

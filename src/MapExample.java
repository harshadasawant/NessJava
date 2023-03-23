import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer,String>();
        m.put(1,"Harshada1");
        m.put(2,"Harshada2");
        m.put(3,"Harshada3");
        m.put(4,"Harshada4");
        System.out.println("==================1st way to iterate================");
        Set<Map.Entry<Integer,String>> entrySet =  m.entrySet();
        for(Map.Entry<Integer,String> entry: entrySet){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        System.out.println("================2nd way to iterate============");

        Set<Integer> keySet= m.keySet();
        for(Integer i :keySet){
            System.out.println(i+"  "+ m.get(i));
        }

        Collection<String> collection = m.values();
        for(String s: collection){
            System.out.println(s);
        }

        System.out.println("====================3rd way to iterate===============");
        Iterator<Integer> itr =  m.keySet().iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i + "  "+m.get(i));

        }

        System.out.println("====================4rd way to iterate===============");
        Iterator<Map.Entry<Integer, String>> itr1 =  m.entrySet().iterator();
        while(itr1.hasNext()){
            Map.Entry<Integer, String> entry = itr1.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());

        }

        System.out.println("========5th way to iterate==============");
        m.forEach((e,r)->{
            System.out.println(e +"  "+r);
        });


    }

}

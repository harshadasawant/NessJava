package designPattern;

interface iterator{
    boolean hasNext();
    Object next();
}
interface container {
    iterator getIterator();
}

class NameRepository implements container {

    String[] names = {"abc", "xyz", "pqr"};

    @Override
    public iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length)
            {
                return  true;
            }
                return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
public class IteratorDesignPattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (iterator iterator  = nameRepository.getIterator();iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("name = "+name);
        }
    }
}

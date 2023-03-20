public class Square implements Shape {
    int size;
    Square(){
        System.out.println("from Square class");

    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}

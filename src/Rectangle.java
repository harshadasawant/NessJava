import org.w3c.dom.css.Rect;

public class Rectangle implements Shape {
    int size;
    Rectangle(){
        System.out.println("from Rectangle class");
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


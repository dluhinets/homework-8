package editor.shape;

public class Triangle extends Shape {
    public static final String NAME = "Triangle";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void draw() {
        System.out.println("draw " + NAME);
    }
}

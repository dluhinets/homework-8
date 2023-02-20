package editor.shape;

public class Circle extends Shape {
    public static final String NAME = "Circle";

    @Override
    public void draw() {
        System.out.println("draw " + NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }
}

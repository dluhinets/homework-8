package editor.shape;

public class Quad extends Shape {
    public static final String NAME = "Quad";

    @Override
    public void draw() {
        System.out.println("draw " + NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }
}

import editor.DrawingEditor;
import editor.shape.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Sphere(),
                new Triangle(),
                new Quad(),
                new Rectangle(),
                new Rhombus()
        };

        for (Shape shape: shapes) {
            System.out.println(DrawingEditor.getShapeName(shape));
        }

        for (Shape shape: shapes) {
            DrawingEditor.drawShape(shape);
        }
    }
}
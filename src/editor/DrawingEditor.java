package editor;

import editor.shape.Draw;
import editor.shape.Shape;

public class DrawingEditor {
    public static String getShapeName(Shape shape) {
        return shape.getName();
    }

    public static void drawShape(Draw shape) {
        shape.draw();
    }

}

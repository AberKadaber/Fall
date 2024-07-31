package fall.shapes;

import fall.geometry.*;
import java.util.List;
import java.awt.*;

public interface Shape {
    /**
     * Move shape, apply acceleration effect to shape
     *
     * @param time time of simulation
     */
    void simulate(double time);

    /**
     * Calculate new speed after collision with another shape
     *
     * @param other other shape that has a collision with our shape
     */
    void update(AbstractShape other);

    /**
     * Method to draw shape on the screen
     *
     * @param g Graphics to draw
     * @param color color of our shape
     */
    void draw(Graphics g, Color color);

    /**
     * @return intersection our shape with line <code>y = k * x + b</code>
     * <br> and return null if out shape don't have any intersection with this line
     */
    List<Dot> intersect(double k, double b);

    /**
     *
     * @param other other shape to calculation intersection with our shape
     * @return is there
     */
    boolean intersect(AbstractShape other);
}

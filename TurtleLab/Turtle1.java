import java.awt.Color;
public class Turtle1
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle cool = new Turtle(turtleWorld);
        cool.setColor(Color.ORANGE);
        cool.setPenColor(Color.BLUE);
        cool.setPenWidth(7);
        cool.penDown();
        cool.forward(100);
        cool.backward(50);
        cool.turnRight();
        cool.forward(40);
        cool.turnLeft();
        cool.forward(50);
        cool.backward(100);
        Turtle sweet = new Turtle(turtleWorld);
        sweet.setColor(Color.RED);
        sweet.setPenColor(Color.BLACK);
        sweet.penUp();
        sweet.turnRight();
        sweet.forward(80);
        sweet.turnLeft();
        sweet.penDown();
        sweet.setPenWidth(7);
        sweet.forward(100);
        sweet.turnRight();
        sweet.forward(40);
        sweet.backward(40);
        sweet.turnLeft();
        sweet.backward(50);
        sweet.turnRight();
        sweet.forward(40);
        sweet.backward(40);
        sweet.turnLeft();
        sweet.backward(50);
        sweet.turnRight();
        sweet.forward(40);
        sweet.penUp();
        cool.turnRight();
        cool.penUp();
        cool.forward(110);
        cool.penDown();
        cool.forward(40);
        cool.backward(40);
        cool.turnLeft();
        cool.forward(100);
        sweet.forward(110);
        sweet.penDown();
        
        
    }
}
      
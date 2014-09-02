import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.setPenWidth(5);
        turtle.penDown();
        turtle.forward(50);
        turtle.setPenColor(Color.BLUE);
        turtle.backward(25);
        turtle.turnRight();
        turtle.penDown();
        turtle.forward(25);
        turtle.turnLeft();
        turtle.forward(25);
        turtle.backward(50);
        turtle.turnRight();
        turtle.penUp();
        turtle.forward(10);
        turtle.turnLeft();
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(50);
        turtle.penUp();
        turtle.turnRight();
        turtle.forward(10);
        turtle.penDown();
        turtle.turnLeft();
        turtle.forward(3);
        turtle.penUp();
        turtle.forward(5);
        turtle.penDown();
        turtle.forward(42);
        turtle.penUp();
        turtle.turnLeft();
        turtle.forward(140);
      
      

    }
}

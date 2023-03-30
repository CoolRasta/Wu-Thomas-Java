package Ch2;
import galapagos.*;

import java.awt.*;

public class ProgEx129 {
    public static void main(String[] args){
        Turtle turtle = new Turtle();


        turtle.move(100);
        turtle.turn(120);
//        turtle.bodyColor(Color.red);
        turtle.penColor(Color.yellow);
        turtle.penSize(10);
        turtle.move(100);
        turtle.turn(120);
        turtle.move(100);
    }
}

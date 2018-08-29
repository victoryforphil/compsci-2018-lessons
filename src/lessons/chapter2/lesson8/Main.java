package lessons.chapter2.lesson8;
import com.sun.javafx.geom.Vec2d;

import javax.swing.*;

/*
Lesson 2.8
by Alex Carter 8/29/2018
 */

public class Main {
    // Static Declarition of 2D vector to store points
    private static Vec2d point1, point2 = new Vec2d();
    public static void main(String[] args){
        // Collect Raw Input
        String inputString1 = JOptionPane.showInputDialog("Please Enter Point 1 using: x,y");

        //Split input based on comments.
        String[] inputs1 = inputString1.split(",");
        System.out.println(inputs1[1]);
        //convert it to an int.

        point1 = new Vec2d(Integer.parseInt(inputs1[0]),Integer.parseInt(inputs1[1]));


        //Point 2
        // Collect Raw Input
        String inputString2 = JOptionPane.showInputDialog("Please Enter Point 2 using: x,y");

        //Split input based on comments.
        String[] inputs2 = inputString2.split(",");
        //convert it to an int.

        point2 = new Vec2d(Integer.parseInt(inputs2[0]),Integer.parseInt(inputs2[1]));

        int xPow = (int)Math.pow(point2.x-point1.x, 2); // Get the squared distance of X coords
        int yPow = (int)Math.pow(point2.y+point1.y, 2); // Get the squared distance of Y coords
        int distance = (int)Math.sqrt(xPow - yPow);
        JOptionPane.showMessageDialog(null, "Distance: " + distance);

    }

}

//Results:
/*
Dialog asks for Point 1 (x,y)
Dialog asks for Point 2 (x,y)
Displays correct Distance

0,0 - 0,5 = 5
*/

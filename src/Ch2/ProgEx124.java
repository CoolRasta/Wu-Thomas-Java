package Ch2;
import javax.swing.JFrame;

/**
 *
 * @author frank
 */
public class ProgEx124 {
    public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.setSize(300, 200);
    frame.setTitle("My First Frame");
    frame.setVisible(true);
    frame.setVisible(false);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocation(100, 50);
    
    try{
    Thread.sleep(500);
    }
    catch (Exception e){}
    }
    
}

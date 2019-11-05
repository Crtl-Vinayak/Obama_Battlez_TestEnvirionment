import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * Write a description of class JavaFx_Class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JavaFx_Class extends Application 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class JavaFx_Class
     */
    public JavaFx_Class()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void start(Stage stage) {
        Circle circ = new Circle(40, 40, 30);
        Group root = new Group(circ);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
    
    public void stop() {
        System.exit(1);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

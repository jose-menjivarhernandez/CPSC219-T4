
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class Border extends Application{
	public void start(Stage primaryStage)throws Exception{
		Rectangle rect1 = new Rectangle(0,0,900,10);
		rect1.setFill(Color.CHOCOLATE);
		
		Rectangle rect2 = new Rectangle(0,0,10,650);
		rect2.setFill(Color.CHOCOLATE);
		
		Rectangle rect3 = new Rectangle(890,0,10,650);
		rect3.setFill(Color.CHOCOLATE);
		
		Rectangle rect4 = new Rectangle(0,640,900,10);
		rect4.setFill(Color.CHOCOLATE);
		
		
		
		Pane root = new Pane();
		Scene scene = new Scene(root, 900, 650);
		root.getChildren().addAll(rect1, rect2, rect3, rect4);
		primaryStage.setTitle("Border");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
//900w,650h
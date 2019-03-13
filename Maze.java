import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Maze extends Main{
	
	public Rectangle addBarrier1() {
		Rectangle rect1 = new Rectangle(BLOCK_SIZE * 30, BLOCK_SIZE * 2);
		rect1.setFill(Color.CHOCOLATE);
		rect1.setTranslateX((int)(BLOCK_SIZE * 40));
		rect1.setTranslateY((int)(BLOCK_SIZE * 25));
		return rect1;
	}

	public Rectangle addBarrier2() {
		Rectangle rect2 = new Rectangle(BLOCK_SIZE * 2, BLOCK_SIZE * 20);
		rect2.setFill(Color.CHOCOLATE);
		rect2.setTranslateX((int)(BLOCK_SIZE * 40));
		rect2.setTranslateY((int)(BLOCK_SIZE * 45));
		return rect2;
	}

	public Rectangle addBarrier3() {
		Rectangle rect3 = new Rectangle(BLOCK_SIZE * 2, BLOCK_SIZE * 30);
		rect3.setFill(Color.CHOCOLATE);
		rect3.setTranslateX((int)(BLOCK_SIZE * 60));
		rect3.setTranslateY((int)(BLOCK_SIZE * 25));
		return rect3;
	}

	public Rectangle addBarrier4() {
		Rectangle rect4 = new Rectangle(BLOCK_SIZE * 20, BLOCK_SIZE * 2);
		rect4.setFill(Color.CHOCOLATE);
		rect4.setTranslateX((int)(BLOCK_SIZE * 30));
		rect4.setTranslateY((int)(BLOCK_SIZE * 15));
		return rect4;
	}
		
	public Rectangle addBarrier5() {
		Rectangle rect5 = new Rectangle(BLOCK_SIZE * 40, BLOCK_SIZE * 2);
		rect5.setFill(Color.CHOCOLATE);
		rect5.setTranslateX((int)(BLOCK_SIZE * 20));
		rect5.setTranslateY((int)(BLOCK_SIZE * 35));
		return rect5;
	}
	
	public Rectangle addBarrier6() {
		Rectangle rect6 = new Rectangle(BLOCK_SIZE * 2, BLOCK_SIZE * 30);
		rect6.setFill(Color.CHOCOLATE);
		rect6.setTranslateX((int)(BLOCK_SIZE * 10));
		rect6.setTranslateY((int)(0));
		return rect6;
	}
}
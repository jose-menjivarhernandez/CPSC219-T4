import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Maze1 extends Main{
	
	public Rectangle addBlock1() {
		Rectangle rec1 = new Rectangle(BLOCK_SIZE * 42, BLOCK_SIZE * 2);
		rec1.setFill(Color.CHOCOLATE);
		rec1.setTranslateX((int)(0));
		rec1.setTranslateY((int)(BLOCK_SIZE * 20));
		return rec1;
	}

	public Rectangle addBlock2() {
		Rectangle rec2 = new Rectangle(BLOCK_SIZE * 2, BLOCK_SIZE * 10);
		rec2.setFill(Color.CHOCOLATE);
		rec2.setTranslateX((int)(BLOCK_SIZE * 40));
		rec2.setTranslateY((int)(BLOCK_SIZE * 10));
		return rec2;
	}

	public Rectangle addBlock3() {
		Rectangle rec3 = new Rectangle(BLOCK_SIZE * 2, BLOCK_SIZE * 40);
		rec3.setFill(Color.CHOCOLATE);
		rec3.setTranslateX((int)(BLOCK_SIZE * 54));
		rec3.setTranslateY((int)(BLOCK_SIZE * 10));
		return rec3;
	}

	public Rectangle addBlock4() {
		Rectangle rec4 = new Rectangle(BLOCK_SIZE * 34, BLOCK_SIZE * 2);
		rec4.setFill(Color.CHOCOLATE);
		rec4.setTranslateX((int)(BLOCK_SIZE * 20));
		rec4.setTranslateY((int)(BLOCK_SIZE * 10));
		return rec4;
	}
		
	public Rectangle addBlock5() {
		Rectangle rec5 = new Rectangle(BLOCK_SIZE * 10, BLOCK_SIZE * 2);
		rec5.setFill(Color.CHOCOLATE);
		rec5.setTranslateX((int)(BLOCK_SIZE * 54));
		rec5.setTranslateY((int)(BLOCK_SIZE * 36));
		return rec5;
	}
	
	public Rectangle addBlock6() {
		Rectangle rec6 = new Rectangle(BLOCK_SIZE * 10, BLOCK_SIZE * 2);
		rec6.setFill(Color.CHOCOLATE);
		rec6.setTranslateX((int)(BLOCK_SIZE * 60));
		rec6.setTranslateY((int)(BLOCK_SIZE * 18));
		return rec6;
	}
	
	public Rectangle addBlock7() {
		Rectangle rec7 = new Rectangle(BLOCK_SIZE * 20, BLOCK_SIZE * 2);
		rec7.setFill(Color.CHOCOLATE);
		rec7.setTranslateX((int)(BLOCK_SIZE * 10));
		rec7.setTranslateY((int)(BLOCK_SIZE * 50));
		return rec7;
	}
	
	public Rectangle addBlock8() {
		Rectangle rec8 = new Rectangle(BLOCK_SIZE * 2, BLOCK_SIZE * 20);
		rec8.setFill(Color.CHOCOLATE);
		rec8.setTranslateX((int)(BLOCK_SIZE * 30));
		rec8.setTranslateY((int)(BLOCK_SIZE * 38));
		return rec8;
	}
	
	public Rectangle addBlock9() {
		Rectangle rec9 = new Rectangle(BLOCK_SIZE * 24, BLOCK_SIZE * 2);
		rec9.setFill(Color.CHOCOLATE);
		rec9.setTranslateX((int)(BLOCK_SIZE * 20));
		rec9.setTranslateY((int)(BLOCK_SIZE * 30));
		return rec9;
	}
	
	public Rectangle addBlock10() {
		Rectangle rec10 = new Rectangle(BLOCK_SIZE * 2, BLOCK_SIZE * 28);
		rec10.setFill(Color.CHOCOLATE);
		rec10.setTranslateX((int)(BLOCK_SIZE * 44));
		rec10.setTranslateY((int)(BLOCK_SIZE * 30));
		return rec10;
	}
	
	public Rectangle addBlock11() {
		Rectangle rec11 = new Rectangle(BLOCK_SIZE * 16, BLOCK_SIZE * 2);
		rec11.setFill(Color.CHOCOLATE);
		rec11.setTranslateX((int)(BLOCK_SIZE * 44));
		rec11.setTranslateY((int)(BLOCK_SIZE * 58));
		return rec11;
	}
}
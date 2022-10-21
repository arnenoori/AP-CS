
public class Main {

	  public static void main(String[] args) 
	  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
	    beach.zeroBlue(); 
	    beach.explore();  
	    beach.negate(); 
	    beach.explore(); 
	    beach.toGrayScale();
	    beach.explore(); 
	    beach.mirrorVertical();
	    beach.explore();
	    beach.mirrorHorizontal(); 
	    beach.explore(); 
	    beach.mirrorHorizontalBotToTop();
	    beach.explore(); 
	    beach.mirrorDiagonal(); 
	    beach.explore();
	    beach.mirrorRectangle(0,0,400,100,0,0); 
	    beach.explore(); 
	    Picture snowman = new Picture("snowman.jpg");
	    snowman.explore();

	  }
}

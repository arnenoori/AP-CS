import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */

  Pixel[][] pixels = getPixels2D();

  // You can then loop through all the Pixel objects in the two-dimensional array
  // to modify the picture. You can get and set the red, green, and/or blue value
  // for a Pixel object. You can also get and/or set the Color value for a Pixel
  // object. Examples:

  // pixels[row][col].setGreen(100);

  // pixels[row][col].getColor();

  public Picture() {
    /*
     * not needed but use it to show students the implicit call to super() child
     * constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName) {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * 
   * @param height the height of the desired picture
   * @param width  the width of the desired picture
   */
  public Picture(int height, int width) {
    // let the parent class handle this width and height
    super(width, height);
  }

  /**
   * Constructor that takes a picture and creates a copy of that picture
   * 
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture) {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * 
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image) {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * 
   * @return a string with information about the picture such as fileName, height
   *         and width.
   */
  public String toString() {
    String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
    return output;
  }

  /** Method to set the blue to 0 */
  public void zeroBlue() {
    Pixel[][] pixels = getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        currentPixel.setBlue(0);
        currentPixel.setBlue(0);
      }
    }
  }

  public void keepOnlyBlue() {
    Pixel[][] pixels = getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        currentPixel.setRed(0);
        currentPixel.setRed(0);
      }
    }
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        currentPixel.setGreen(0);
        currentPixel.setGreen(0);
      }
    }
  }

  public void negate() {
    Pixel[][] pixels = getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        int red = currentPixel.getRed();
        currentPixel.setRed(255 - red);
      }
    }
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        int green = currentPixel.getGreen();
        currentPixel.setGreen(255 - green);
      }
    }
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        int blue = currentPixel.getBlue();
        currentPixel.setBlue(255 - blue);
      }
    }
  }

  public void toGrayScale() {
    Pixel[][] pixels = getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        int average = (currentPixel.getRed() + currentPixel.getBlue() + currentPixel.getGreen()) / 3;
        currentPixel.setRed(average);
        currentPixel.setGreen(average);
        currentPixel.setBlue(average);
      }
    }
  }

  public void mirrorVertical() {
    for (int row = 0; row < matrix.length; row++) {
      int halfIndex = matrix[row].length / 2;
      for (int col = 0; col < halfIndex; col++) {
        Pixel numToReflect = matrix[row][col];
        int newCol = matrix[row].length - col - 1;
        matrix[row][newCol] = matrix[row][col];
      }
    }
  }

  public void mirrorHorizontal() {
    Pixel[][] pixels = this.getPixels2D();
    int halfIndex = pixels.length / 2;
    for (int row = 0; row < halfIndex; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        int newRow = pixels.length - row - 1;
        Pixel originalPixel = pixels[row][col];
        pixels[newRow][col].setColor(originalPixel.getColor());
      }
    }
  }

  public void mirrorHorizontalBotToTop() {
    Pixel[][] pixels = this.getPixels2D();
    int halfIndex = pixels.length / 2;
    for (int row = pixels.length - 1; row > halfIndex; row--) {
      for (int col = 0; col < pixels[row].length; col++) {
        int newRow = pixels.length - row - 1;
        Pixel originalPixel = pixels[row][col];
        pixels[newRow][col].setColor(originalPixel.getColor());
      }
    }
  }

  public void mirrorDiagonal() {
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      int limit = row;
      if (row > pixels.length) {
        limit = pixels.length;
      }
      for (int col = 0; col < limit; col++) {
        int newRow = col;
        int newCol = row;
        Pixel originalPixel = pixels[row][col];
        pixels[col][row].setColor(originalPixel.getColor());
      }
    }
  }

  public void mirrorRectangle(int startX, int startY, int width, int height, int endMirrorX, int endMirrorY) {
    Pixel[][] pixels = this.getPixels2D();
    int endX = startX + width;
    int endY = startY + width;
    for (int row = 0; row < width; row++) {
      for (int col = 0; col < height; col++) {
        int oldRow = startY + row;
        int oldCol = startX + col;
        int newCol = (width - col - 1) + endMirrorX;
        int newRow = row + endMirrorY;
        pixels[newRow][newCol].setColor(pixels[oldRow][oldCol].getColor());
      }
    }
  }

}

/*
 * Pixel[][] pixels = getPixels2D();
 * 
 * You can then loop through all the Pixel objects in the two-dimensional array
 * to modify the picture. You can get and set the red, green, and/or blue value
 * for a Pixel object. You can also get and/or set the Color value for a Pixel
 * object. Examples:
 * 
 * pixels[row][col].setGreen(100);
 * 
 * pixels[row][col].getColor();
 */

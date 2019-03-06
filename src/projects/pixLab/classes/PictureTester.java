package projects.pixLab.classes;
 /**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar =new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar =new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void  testMirrorHorizontal(){
    Picture caterpillar =new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void  testMirrorHorizontalBotToTop(){
    Picture caterpillar =new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms(){
    Picture temple = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }

  public static void testMirrorGull(){
    Picture temple = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testMyCollage(){
  Picture canvas = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\640x480.jpg");
  Picture segall = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\seagull.jpg");
  Picture temple = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\temple.jpg");

  canvas.copy(segall, 200,200,300,300);
    canvas.copy(temple, 120 ,120,200,200);
  canvas.explore();
  }

  public static void testCopy()
  {
    Picture canvas = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\seagull.jpg");
    canvas.copy(canvas, 30,30, 80,80);
    canvas.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\Victo\\Documents\\compsci-2018-lessons\\src\\projects\\pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   // testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
   // testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
   // testCopy();
   // testMyCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
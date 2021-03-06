package pixLab.classes;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester
{
	/** Method to test zeroBlue */
	public static void testZeroBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/**
	 * Method to test keepOnlyBlue
	 */
	public static void testKeepOnlyBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}

	/**
	 * Method to test keepOnlyRed
	 */
	public static void testKeepOnlyRed()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();
	}

	/**
	 * Method to test keepOnlyRed
	 */
	public static void testKeepOnlyGreen()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyGreen();
		beach.explore();
	}

	/**
	 * Method to test negate
	 */
	public static void testNegate()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}

	/**
	 * Method to test grayscale
	 */
	public static void testGrayscale()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical()
	{
		Picture caterpillar = new Picture("carterYouIdiot.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/**
	 * Method to test mirrorVerticleRightToLeft
	 */
	public static void testMirrorVerticalRightToLeft()
	{
		Picture carterYouIdiot = new Picture("carterYouIdiot.jpg");
		carterYouIdiot.explore();
		carterYouIdiot.mirrorVerticalRightToLeft();
		carterYouIdiot.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/**
	 * Method to test mirrorHorizontal
	 */
	public static void testMirrorHorizontal()
	{
		Picture carter = new Picture("carterYouIdiot.jpg");
		carter.explore();
		carter.mirrorHorizontal(carter);
		carter.explore();
	}

	public static void testMirrorHorizontalBotToTop()
	{
		Picture carter = new Picture("carterYouIdiot.jpg");
		carter.explore();
		carter.mirrorHorizontalBotToTop(carter);
		carter.explore();
	}

	public static void testMirrorDiagonal()
	{
		Picture carter = new Picture("carterYouIdiot.jpg");
		carter.explore();
		carter.mirrorDiagonal(carter);
		carter.explore();
	}

	/** Method to test the collage method */
	public static void testCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		Picture swan = new Picture("carterYouIdiot.jpg");
		swan.edgeDetection(10);
		swan.explore();
		
	}

	public static void testFixUnderwater()
	{
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}

	public static void testMirrorArms()
	{
		Picture snow = new Picture("snowman.jpg");
		// snow.explore();
		snow.mirrorArms();
		snow.explore();
	}

	public static void testMirrorGull()
	{
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.mirrorGull();
		gull.explore();
	}
	
	public static void testChromakey()
	{
		
	}
	
	public static void testCopy2()
	{
		
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args)
	{
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorVerticalRightToLeft();
		// testMirrorTemple();
		// testMirrorHorizontal();
		// testMirrorHorizontalBotToTop();
		// testMirrorDiagonal();
		// testMirrorArms();
		testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}
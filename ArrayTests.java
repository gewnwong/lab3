import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = {2.0, 2.0, 6.0, 2.0, 6.0, 2.0};
    assertEquals(6.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test 
  public void testAverageWithoutLowest2() {
    double[] input1 = {1.0, 4.0, 8.0, 6.0};
    assertEquals(6.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }


  
}


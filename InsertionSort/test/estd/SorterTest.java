package estd;

import org.junit.Assert;
import org.junit.Test;

public class SorterTest {

	@Test
	public void sortTest() {
		Sorter sorter = new Sorter();
		int[] n = { 4, 2, 3, 1 };
		int[] expected = { 1, 2, 3, 4 };
		sorter.sort(n);
		Assert.assertArrayEquals(expected, n);
	}

}

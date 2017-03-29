package com.bovespa;

import org.junit.Test;

public class StockReaderTest {

	@Test
	public void readTest() throws Exception {
		StockReader stockReader = new StockReader();
		Stock[] stocks = stockReader.read("C:/eclipseneon2/COTAHIST_A2016.txt");

		long start = System.currentTimeMillis();

		Sorter sorter = new Sorter();
		sorter.sort(stocks);

		long end = System.currentTimeMillis();

		System.out.println((end - start)/1000);
		
	}

}

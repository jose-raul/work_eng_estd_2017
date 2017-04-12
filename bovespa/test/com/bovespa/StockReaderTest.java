package com.bovespa;

import org.junit.Test;

import estd.SLinkedList;

public class StockReaderTest {

	@Test
	public void readAsLinkedListTest() throws Exception {
		StockReader stockReader = new StockReader();
		long start = System.currentTimeMillis();
		SLinkedList<Stock> linkedList = stockReader.readAsLinkedList("C:/eclipseneon2/COTAHIST_A2016.txt");
		long end = System.currentTimeMillis();
		System.out.println((end - start)/1000);
	}	
	
	@Test
	public void readAsArrayTest() throws Exception {
		StockReader stockReader = new StockReader();
		long start = System.currentTimeMillis();
		Stock[] stocks = stockReader.readAsArray("C:/eclipseneon2/COTAHIST_A2016.txt");
		long end = System.currentTimeMillis();
		System.out.println((end - start)/1000);
	}	

}

package com.bovespa;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) throws Exception {

		Stock[] stocks = new Stock[20];

		Stream<String> lines = Files.lines(Paths.get("C:/eclipseneon2/COTAHIST_A2016_TEST.txt"));

		lines.forEach(line -> {
			if (line.startsWith("01")) {
				Stock stock = new Stock();
				stock.setCode(line.substring(12, 23).trim());
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
				stock.setDate(LocalDate.parse(line.substring(2, 10), dtf));
				System.out.println(line.substring(2, 10).trim());
			}
		});

	}

}

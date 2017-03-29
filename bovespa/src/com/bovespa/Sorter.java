package com.bovespa;

public class Sorter {
	
	public void sort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int aux = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > aux)) {
				a[j + 1] = a[j];
				j = j - 1;
			} 
			a[j + 1] = aux;
		}
	}
	
	public void sort(Comparable[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			System.out.println(i);
			Comparable aux = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j].compareTo(aux) > 0)) {
				a[j + 1] = a[j];
				j = j - 1;
			} 
			a[j + 1] = aux;
		}
	}	

}

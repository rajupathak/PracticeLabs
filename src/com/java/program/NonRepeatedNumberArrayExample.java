package com.java.program;

public class NonRepeatedNumberArrayExample {
	public static void main(String[] args) {
		int count = 0;
		int[] a = { 1, 9, 1, 2, 2, 5, 8, 3, 4, 3 };
		int size = a.length;
		int flag = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i != j) {
					if (a[i] == a[j]) {
						flag = 1;

					} else {
						flag = 0;
						break;
					}
				}
			}

			if (flag == 1) {
				count++;
				System.out.println(a[i] + " ");
			}

		}
		System.out.println(	);
	}
}

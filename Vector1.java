package com.usc.ctcl.tree;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k and n");
		int k = sc.nextInt();
		int n = sc.nextInt();
		Vector v1 = new Vector();

		System.out.println("Enter k values");
		for (int l = 1; l <= k; l++) {
			int pos = sc.nextInt();
			if (pos == l) {
				v1.add((Integer.parseInt(sc.next())));
			} else {
				while (l != pos) {
					v1.add(0);
					l++;
				}
				v1.add(sc.nextInt());
			}
		}

		System.out.println("Enter n values");
		Vector v2 = new Vector();
		for (int l = 1; l <= n; l++) {
			int pos = sc.nextInt();
			if (pos == l) {
				v2.add(Integer.parseInt(sc.next()));
			} else {
				while (l != pos) {
					v2.add(0);
					l++;
				}
				v2.add(Integer.parseInt(sc.next()));
			}
		}
		Iterator it1 = v1.iterator();
		Iterator it2 = v2.iterator();
		int res = 0;
		while (it1.hasNext() && it2.hasNext()) {
			res += (int) (it1.next()) * (int) (it2.next());
		}
		System.out.println(res);

	}

}

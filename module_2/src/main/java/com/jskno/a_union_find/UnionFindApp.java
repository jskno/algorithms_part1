package com.jskno.a_union_find;

import java.util.Scanner;

public class UnionFindApp {

    public static void main(String[] args) {

        // Using Scanner for Getting Input from User
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        UnionFind uf = new UnionFind(N);
        while (s.hasNext()) {
            int p = s.nextInt();
            int q = s.nextInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }

    }

}

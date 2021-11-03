package com.tomioka.unionfind;

import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUFTest {
    public static void main(String[] args) {
        QuickUnionUF uf = new QuickUnionUF(10);
        StdOut.println(String.format("Is 1 connected to 3? %s", uf.connected(1, 3)));

        uf.union(1, 3);
        StdOut.println(String.format("Is 1 connected to 3? %s", uf.connected(1, 3)));
        uf.union(1, 5);
        StdOut.println(uf.toString());
    }
}

package com.tomioka.unionfind;

import edu.princeton.cs.algs4.StdOut;

public class QuickFindUFTest {
    public static void main(String[] args) {
        QuickFindUF list = new QuickFindUF(10);
        StdOut.println(String.format("Is 1 connected to 3? %s", list.connected(1, 3)));

        list.union(1, 3);
        StdOut.println(String.format("Is 1 connected to 3? %s", list.connected(1, 3)));
        StdOut.println(list.toString());

        list.union(5, 7);
        StdOut.println(list.toString());

        list.union(1, 5);
        StdOut.println(list.toString());
        StdOut.println(String.format("Is 7 connected to 3? %s", list.connected(7, 3)));

    }
}

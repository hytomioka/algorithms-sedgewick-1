package com.tomioka.unionfind;

import java.util.Arrays;

/**
 * Union Find algorithm, quick union approach.
 */
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        this.id = new int[N];
        for (int i = 0; i < id.length; i++) id[i] = i;
    }

    public int findRoot(int i) {
        while (id[i] != i) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q) {
        int i = findRoot(p);
        int j = findRoot(q);
        id[i] = j;
    }

    @Override
    public String toString() {
        return "QuickUnionUF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}

package com.tomioka.unionfind;

import java.util.Arrays;

public class QuickFindUF {

    private int[] id;

    /**
     * @param N number of elements
     */
    public QuickFindUF(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Verify if p and q are connected.
     * @param p index
     * @param q index
     * @return
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    /**
     * Attach p to q.
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }

    @Override
    public String toString() {
        return "UF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}

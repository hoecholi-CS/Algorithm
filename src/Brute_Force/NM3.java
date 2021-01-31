package Brute_Force;

import java.util.Scanner;

public class NM3 {
    static int N, M;
    static boolean[] visit;
    static int[] list;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        list = new int[M + 1];
        visit = new boolean[N + 1];
        dfs(1);
    }

    static void dfs(int k) {
        if (k == M + 1) {

        }

        for (int i = 1; i <= N; ++i) {
            visit[k] = true;
            list[k] = i;
            dfs(i + 1);
        }
    }
}

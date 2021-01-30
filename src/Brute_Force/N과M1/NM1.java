package Brute_Force.N과M1;

import java.util.Scanner;

public class NM1 {
    static int N;
    static int M;
    static boolean[] visit;
    static int[] list;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        visit = new boolean[N + 1];
        list = new int[M + 1];
        dfs(1);
    }

    static void dfs(int k) {
        if (k == M + 1) {
            for (int p = 1; p < list.length; ++p) {
                System.out.print(list[p] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if (!visit[i]) {
                visit[i] = true;
                list[k] = i;
                dfs(k + 1);
                visit[i] = false;
            }
        }
    }
}


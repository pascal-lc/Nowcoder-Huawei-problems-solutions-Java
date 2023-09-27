#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int trace[100][2] = {0},            // 记录路径
    min_trace[100][2] = {0};        // 记录最短路径
int maze[10][10];                   // 迷宫
// int curStep = 0;                 // 表示当前前进的步数，也是最终的路径长度
int minStep = 100;                  // 最短路径
int flag = 0;

int findTrace(int curXidx, int curYidx, int row, int col, int curStep);

int main() {
    int row, col;
    while (scanf("%d %d", &row, &col) != EOF) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                scanf("%d", &maze[i][j]);
            }
        }
        flag = findTrace(0, 0, row, col, 0);
        if (flag == -1) {
            printf("ERROR\n");
        } else {
            for (int i = 0; i <= minStep; i++) {
                printf("(%d,%d)\n", min_trace[i][0], min_trace[i][1]);
            }
        }
    }
    return 0;
}

int findTrace(int curXidx, int curYidx, int row, int col, int curStep) {
    int f = 0;
    // 到达终点
    if (curXidx == row - 1 && curYidx == col - 1) {
        trace[curStep][0] = curXidx;
        trace[curStep][1] = curYidx;
        if (curStep < minStep) { // 复制最短路径
            minStep = curStep;
            for (int i = 0; i <= minStep; i++) {
                min_trace[i][0] = trace[i][0];
                min_trace[i][1] = trace[i][1];
            }
        }
        return 1;
    }
    // 该点可达
    if ((curXidx >= 0 && curXidx < row ) &&
            (curYidx >= 0 && curYidx < col) &&
            (maze[curXidx][curYidx] == 0)) {
         
        trace[curStep][0] = curXidx;
        trace[curStep][1] = curYidx;
        ++curStep;

        maze[curXidx][curYidx] = -1;    // 表示走过

        f = findTrace(curXidx + 1, curYidx, row, col, curStep) ||
            findTrace(curXidx, curYidx + 1, row, col, curStep) ||
            findTrace(curXidx, curYidx - 1, row, col, curStep) ||
            findTrace(curXidx - 1, curYidx, row, col, curStep);

        maze[curXidx][curYidx] = 0;    // 恢复
    }
    // 此路不通
    else {
        return 0;
    }
    return f;
}

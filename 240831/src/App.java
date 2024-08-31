public class App {
    public static void main(String[] args) throws Exception {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int result = uniquePathsWithObstacles(obstacleGrid);
        System.out.println(result);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if (obstacleGrid[0][0] == 1) {
            return 0;
        } else if (obstacleGrid[0][0] == 0 && obstacleGrid.length == 1 && obstacleGrid[0].length == 1) {
            return 1;
        }

        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (i == 0 && j == 0) {
                    obstacleGrid[0][0] = 1;
                } else {
                    if (obstacleGrid[i][j] == 1) {
                        obstacleGrid[i][j] = 0;
                    } else {
                        if (i == 0) {
                            obstacleGrid[i][j] = obstacleGrid[i][j-1];
                        } else if (j == 0) {
                            obstacleGrid[i][j] = obstacleGrid[i-1][j];
                        } else {
                            obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                        }
                    }
                }
            }
        }

        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}

public class RatInMaze {
    public static void ratInMaze(int[][] maze, int i, int j, int n, boolean[][] visited, String path){
        if (i < 0 || j < 0 || j >= n || i >= n || maze[i][j] == 0 || visited[i][j] == true) {
            return;
        }
        if (i == n-1 && j == n-1) {
            System.out.println("Reached at destination : " + path);
            return;
        }

        visited[i][j] = true;

        ratInMaze(maze, i-1, j, n, visited, path + "U");//up
        ratInMaze(maze, i+1, j, n, visited, path + "D");//down
        ratInMaze(maze, i, j-1, n, visited, path + "L");//left
        ratInMaze(maze, i, j+1, n, visited, path + "R");//right

        visited[i][j] = false;// BackTrackin //So that we can visit these blocks while visiting other
    }
    public static void main(String args[]){
        int[][] maze =  {{ 1, 0, 1, 1 },
                         { 1, 1, 1, 1 },
                         { 0, 1, 0, 1 },
                         { 1, 1, 1, 1 } };
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];

        ratInMaze(maze, 0, 0, n, visited, "");
    }
}

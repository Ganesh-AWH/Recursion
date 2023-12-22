public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean [][]maze = new boolean[][]{
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        printPath(0,0,maze,"");
    }
    private static void printPath(int r,int c,boolean [][]maze,String processed){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(processed);
            return;
        }

        if(maze[r][c] == false){
            return;
        }

        if(r<maze.length-1){
            printPath(r+1, c, maze, processed+"D");
        }
        if(c<maze[0].length-1){
            printPath(r, c+1, maze, processed+"R");
        }
    }
}

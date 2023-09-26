import java.util.*;

class Cell {
    int x, y; // Coordinates of the cell
    int f; // f = g + h
    int g; // Cost from start to current cell
    int h; // Heuristic (estimated) cost from current cell to goal

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class AStarAlgorithm {
    private static final int ROWS = 5;
    private static final int COLS = 5;

    private static final int[][] GRID = {
            { 0, 0, 0, 0, 0 },
            { 0, 1, 0, 1, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 1, 1, 1, 0 },
            { 0, 0, 0, 0, 0 }
    };

    private static final int[][] DIRS = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    public static List<int[]> findPath(int[] start, int[] goal) {
        PriorityQueue<Cell> openSet = new PriorityQueue<>(Comparator.comparingInt(a -> a.f));
        Map<Cell, Cell> cameFrom = new HashMap<>();
        Map<Cell, Integer> gScore = new HashMap<>();

        Cell startCell = new Cell(start[0], start[1]);
        startCell.g = 0;
        startCell.h = heuristic(start, goal);
        startCell.f = startCell.g + startCell.h;

        openSet.add(startCell);
        gScore.put(startCell, 0);

        while (!openSet.isEmpty()) {
            Cell current = openSet.poll();

            if (current.x == goal[0] && current.y == goal[1]) {
                return reconstructPath(cameFrom, current);
            }

            for (int[] dir : DIRS) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];

                if (isValid(newX, newY) && GRID[newX][newY] != 1) {
                    Cell neighbor = new Cell(newX, newY);
                    int tentativeGScore = gScore.get(current) + 1;

                    if (!gScore.containsKey(neighbor) || tentativeGScore < gScore.get(neighbor)) {
                        cameFrom.put(neighbor, current);
                        gScore.put(neighbor, tentativeGScore);
                        neighbor.h = heuristic(new int[] { newX, newY }, goal);
                        neighbor.f = tentativeGScore + neighbor.h;
                        openSet.add(neighbor);
                    }
                }
            }
        }

        return Collections.emptyList(); // No path found
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < ROWS && y >= 0 && y < COLS;
    }

    private static int heuristic(int[] current, int[] goal) {
        // Manhattan distance heuristic
        return Math.abs(current[0] - goal[0]) + Math.abs(current[1] - goal[1]);
    }

    private static List<int[]> reconstructPath(Map<Cell, Cell> cameFrom, Cell current) {
        List<int[]> path = new ArrayList<>();
        while (cameFrom.containsKey(current)) {
            path.add(0, new int[] { current.x, current.y });
            current = cameFrom.get(current);
        }
        path.add(0, new int[] { current.x, current.y });
        return path;
    }

    public static void main(String[] args) {
        int[] start = { 0, 0 };
        int[] goal = { 4, 4 };
        List<int[]> path = findPath(start, goal);

        if (!path.isEmpty()) {
            System.out.println("Path found:");
            for (int[] point : path) {
                System.out.println("(" + point[0] + ", " + point[1] + ")");
            }
        } else {
            System.out.println("No path found.");
        }
    }
}

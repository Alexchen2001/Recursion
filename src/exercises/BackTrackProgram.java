package exercises;

public class BackTrackProgram {

    private static void goNorthEast(int endX, int endY, int x, int y, String route) {

        if (x == endX && y == endY) {
            System.out.println(route);

        }else if(x <= endX && y <= endY){
            goNorthEast(endX, endY, x, y + 1, route + " N");
            goNorthEast(endX, endY,x + 1, y, route + " E");
            goNorthEast(endX, endY,x + 1, y + 1, route + " NE");
        }

        //OTHERWISE : DO NOTHING
    }

    public static void goNorthEast(int startX, int startY, int endX, int endY) {

        goNorthEast(endX, endY, startX, startY, "moves:");
    }

    private static void goSouthWest(int endX, int endY, int x, int y, String route) {

        if (x == endX && y == endY) {
            System.out.println(route);

        }else if(x >= endX && y >= endY){
            goSouthWest(endX, endY, x, y - 1, route + " S");
            goSouthWest(endX, endY,x - 1, y, route + " W");
            goSouthWest(endX, endY,x - 1, y - 1, route + " SW");
        }

        //OTHERWISE : DO NOTHING
    }

    public static void goSouthWest(int startX, int startY, int endX, int endY){
        goSouthWest(endX, endY, 2, 1, "Moves: ");
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Going from (0,0) to (1,2)");
        System.out.println("--------------------------------");
        goNorthEast(0,0,1,2);
        System.out.println();
        System.out.println("Returning from (2,1) to (0,0)");
        System.out.println("--------------------------------");
        goSouthWest(2,1,0,0);

    }
}

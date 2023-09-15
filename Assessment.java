import java.util.*;

public class Assessment {
    static void printPosition(int pos[], char currentFaceDirection) {
        for (int x : pos) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    char makeMove(char currentCommand, int[] position, char faceDirection) {
        if (faceDirection == 'N' && currentCommand == 'f') {
            position[1] = position[1] + 1;
            return 'N';
        } else if (faceDirection == 'N' && currentCommand == 'b') {
            position[1] = position[1] - 1;
            return 'N';
        } else if (faceDirection == 'S' && currentCommand == 'f') {
            position[1] = position[1] - 1;
            return 'S';
        } else if (faceDirection == 'S' && currentCommand == 'b') {
            position[1] = position[1] + 1;
            return 'S';
        } else if (faceDirection == 'E' && currentCommand == 'f') {
            position[0] = position[0] + 1;
            return 'E';
        } else if (faceDirection == 'E' && currentCommand == 'b') {
            position[0] = position[0] - 1;
            return 'E';
        } else if (faceDirection == 'W' && currentCommand == 'f') {
            position[0] = position[0] - 1;
            return 'W';
        } else if (faceDirection == 'W' && currentCommand == 'b') {
            position[0] = position[0] + 1;
            return 'W';
        } else if (faceDirection == 'u' && currentCommand == 'f') {
            position[2] = position[2] + 1;
            return 'u';
        } else if (faceDirection == 'u' && currentCommand == 'b') {
            position[2] = position[2] - 1;
            return 'u';
        } else if (faceDirection == 'd' && currentCommand == 'f') {
            position[2] = position[2] - 1;
            return 'd';
        } else if (faceDirection == 'd' && currentCommand == 'b') {
            position[2] = position[2] + 1;
            return 'd';
        } else if (faceDirection == 'N') {
            switch (currentCommand) {
                case 'l':
                    return 'W';
                case 'r':
                    return 'E';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDirection == 'S') {
            switch (currentCommand) {
                case 'l':
                    return 'E';
                case 'r':
                    return 'W';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDirection == 'E') {
            switch (currentCommand) {
                case 'l':
                    return 'N';
                case 'r':
                    return 'S';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDirection == 'W') {
            switch (currentCommand) {
                case 'l':
                    return 'S';
                case 'r':
                    return 'N';
                case 'u':
                    return 'u';
                case 'd':
                    return 'd';
            }
        } else if (faceDirection == 'u') {
            switch (currentCommand) {
                case 'l':
                    return 'N';
                case 'r':
                    return 'S';
                case 'u':
                    return 'E';
                case 'd':
                    return 'W';
            }
        } else if (faceDirection == 'd') {
            switch (currentCommand) {
                case 'l':
                    return 'S';
                case 'r':
                    return 'N';
                case 'u':
                    return 'E';
                case 'd':
                    return 'W';
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        Assessment obj1 = new Assessment();
        Scanner s = new Scanner(System.in);

        int position[] = new int[3];
        System.out.println("Enter initial position of Craft");
        for(int i = 0; i < 2; i++){
            position[i] = s.nextInt();
        }
        s.close();

        s = new Scanner(System.in);
        System.out.println("Enter the command line (use f, b, l, r, u, d)");
        String commandLines = s.nextLine();
        char[] commands = commandLines.toCharArray();
        s.close();
        
        s = new Scanner(System.in);
        System.out.println("Enter current direction craft (use N, S, E, W, u, d)");
        char currentFaceDirection = s.next().charAt(0);
        s.close();
        
        System.out.println("****Your Final coordinates along with direction***\n");
        for (int i = 0; i < commands.length; i++) {
            currentFaceDirection = obj1.makeMove(commands[i], position, currentFaceDirection);
        }
        printPosition(position, currentFaceDirection);
        System.out.println("Current Direction of Craft: " + currentFaceDirection);
    }
}

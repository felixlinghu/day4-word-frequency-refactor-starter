import java.util.ArrayList;
import java.util.List;

public class MarsRover {

  private int x;
  private int y;
  private char direction;
  public static final char[] DIRECATIONS = {'W', 'S', 'E', 'N'};

  public MarsRover(int x, int y, char direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public List<Integer> operateMarsRover(char command) {
    if (command == 'M') {
      return marsRoverMove();
    }
    if (command == 'L') {
      return marsRoverLeft();
    }
    return null;
  }

  private List<Integer> marsRoverLeft() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    currentLocation.add(x);
    currentLocation.add(y);
    char currentDirecton =
        currentLocation.add()
  }

  private List<Integer> marsRoverMove() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    if (direction == 'N') {
      y++;
    }
    if (direction == 'S') {
      y--;
    }
    if (direction == 'W') {
      x++;
    }
    if (direction == 'E') {
      x--;
    }
    currentLocation.add(x);
    currentLocation.add(y);
    currentLocation.add((int) direction);
    return currentLocation;
  }
}

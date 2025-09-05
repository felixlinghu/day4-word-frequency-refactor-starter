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
    if (command == 'R') {
      return marsRoverRight();
    }
    throw new RuntimeException("invalid command");
  }

  private List<Integer> marsRoverRight() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    currentLocation.add(x);
    currentLocation.add(y);
    switch (direction) {
      case 'N' -> direction = 'W';
      case 'S' -> direction = 'E';
      case 'W' -> direction = 'S';
      case 'E' -> direction = 'N';
    }
    currentLocation.add((int) direction);
    return currentLocation;
  }

  private List<Integer> marsRoverLeft() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    currentLocation.add(x);
    currentLocation.add(y);
    switch (direction) {
      case 'N' -> direction = 'E';
      case 'S' -> direction = 'W';
      case 'W' -> direction = 'N';
      case 'E' -> direction = 'S';
    }
    currentLocation.add((int) direction);
    return currentLocation;
  }

  private List<Integer> marsRoverMove() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    switch (direction) {
      case 'N' -> y++;
      case 'S' -> y--;
      case 'W' -> x++;
      case 'E' -> x--;
    }
    currentLocation.add(x);
    currentLocation.add(y);
    currentLocation.add((int) direction);
    return currentLocation;
  }
}

import java.util.ArrayList;
import java.util.List;

public class MarsRover {

  public static final char LEFT = 'L';
  public static final char CHAR = 'R';
  public static final char WEST = 'W';
  public static final char DIRECTION = 'E';
  public static final char SOUTH = 'S';
  public static final char NORTH = 'N';
  private int x;
  private int y;
  private char direction;
  private final static char MOVE='M';


  public MarsRover(int x, int y, char direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public List<Integer> operateMarsRover(char command) {
    if (command == MOVE) {
      return marsRoverMove();
    }
    if (command == LEFT) {
      return marsRoverLeft();
    }
    if (command == CHAR) {
      return marsRoverRight();
    }
    throw new RuntimeException("invalid command");
  }

  private List<Integer> marsRoverRight() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    currentLocation.add(x);
    currentLocation.add(y);
    switch (direction) {
      case NORTH -> direction = WEST;
      case SOUTH -> direction = DIRECTION;
      case WEST -> direction = SOUTH;
      case DIRECTION -> direction = NORTH;
    }
    currentLocation.add((int) direction);
    return currentLocation;
  }

  private List<Integer> marsRoverLeft() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    currentLocation.add(x);
    currentLocation.add(y);
    switch (direction) {
      case NORTH -> direction = DIRECTION;
      case SOUTH -> direction = WEST;
      case WEST -> direction = NORTH;
      case DIRECTION -> direction = SOUTH;
    }
    currentLocation.add((int) direction);
    return currentLocation;
  }

  private List<Integer> marsRoverMove() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    switch (direction) {
      case NORTH -> y++;
      case SOUTH -> y--;
      case WEST -> x++;
      case DIRECTION -> x--;
    }
    currentLocation.add(x);
    currentLocation.add(y);
    currentLocation.add((int) direction);
    return currentLocation;
  }
}

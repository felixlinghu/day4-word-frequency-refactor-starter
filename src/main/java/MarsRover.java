import java.util.ArrayList;
import java.util.List;

public class MarsRover {

  public static final char LEFT = 'L';
  public static final char RIGHT = 'R';
  public final static char MOVE='M';
  private static final char MOVEBACK = 'B';
  public static final char WEST = 'W';
  public static final char EAST = 'E';
  public static final char SOUTH = 'S';
  public static final char NORTH = 'N';
  private int x;
  private int y;
  private char direction;



  public MarsRover(int x, int y, char direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public List<Integer> operateMarsRover(char command) {
    if (command == MOVE) {
      return marsRoverMove();
    }
    if (command == MOVEBACK) {
      return marsRoverMoveBack();
    }
    if (command == LEFT) {
      return marsRoverLeft();
    }
    if (command == RIGHT) {
      return marsRoverRight();
    }
    throw new RuntimeException("invalid command");
  }

  private List<Integer> marsRoverMoveBack() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    switch (direction) {
      case NORTH -> y--;
      case SOUTH -> y++;
      case WEST -> x++;
      case EAST -> x--;
    }
    currentLocation.add(x);
    currentLocation.add(y);
    currentLocation.add((int) direction);
    return currentLocation;
  }

  private List<Integer> marsRoverRight() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    currentLocation.add(x);
    currentLocation.add(y);
    switch (direction) {
      case NORTH -> direction = WEST;
      case SOUTH -> direction = EAST;
      case WEST -> direction = SOUTH;
      case EAST -> direction = NORTH;
    }
    currentLocation.add((int) direction);
    return currentLocation;
  }

  private List<Integer> marsRoverLeft() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    currentLocation.add(x);
    currentLocation.add(y);
    switch (direction) {
      case NORTH -> direction = EAST;
      case SOUTH -> direction = WEST;
      case WEST -> direction = NORTH;
      case EAST -> direction = SOUTH;
    }
    currentLocation.add((int) direction);
    return currentLocation;
  }

  private List<Integer> marsRoverMove() {
    ArrayList<Integer> currentLocation = new ArrayList<>();
    switch (direction) {
      case NORTH -> y++;
      case SOUTH -> y--;
      case WEST -> x--;
      case EAST -> x++;
    }
    currentLocation.add(x);
    currentLocation.add(y);
    currentLocation.add((int) direction);
    return currentLocation;
  }

}

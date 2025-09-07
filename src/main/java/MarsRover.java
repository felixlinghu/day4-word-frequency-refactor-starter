import java.util.ArrayList;
import java.util.List;

public class MarsRover {

  public static final char LEFT = 'L';
  public static final char RIGHT = 'R';
  public static final char MOVE = 'M';
  public static final char MOVEBACK = 'B';
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

  public List<Integer> operateMarsRoverBatch(String commands) {
    if (commands == null || commands.isEmpty()) {
      return getCurrentLocation();
    }
    for (char command : commands.toCharArray()) {
      operateMarsRover(command);
    }
    return getCurrentLocation();
  }

  public List<Integer> operateMarsRover(char command) {
    switch (command) {
      case MOVE:
        return marsRoverMove();
      case MOVEBACK:
        return marsRoverMoveBack();
      case LEFT:
        return marsRoverLeft();
      case RIGHT:
        return marsRoverRight();
      default:
        throw new RuntimeException("invalid command: " + command);
    }
  }

  private List<Integer> marsRoverMoveBack() {
    updatePosition(-getDeltaX(), -getDeltaY());
    return getCurrentLocation();
  }

  private List<Integer> marsRoverRight() {
    direction = switch (direction) {
      case NORTH -> WEST;
      case SOUTH -> EAST;
      case WEST -> SOUTH;
      case EAST -> NORTH;
      default -> direction;
    };
    return getCurrentLocation();
  }

  private List<Integer> marsRoverLeft() {
    direction = switch (direction) {
      case NORTH -> EAST;
      case SOUTH -> WEST;
      case WEST -> NORTH;
      case EAST -> SOUTH;
      default -> direction;
    };
    return getCurrentLocation();
  }

  private List<Integer> marsRoverMove() {
    updatePosition(getDeltaX(), getDeltaY());
    return getCurrentLocation();
  }

  // 获取当前位置和方向的列表表示
  private List<Integer> getCurrentLocation() {
    List<Integer> location = new ArrayList<>();
    location.add(x);
    location.add(y);
    location.add((int) direction);
    return location;
  }

  private int getDeltaX() {
    return switch (direction) {
      case EAST -> 1;
      case WEST -> -1;
      default -> 0;
    };
  }

  private int getDeltaY() {
    return switch (direction) {
      case NORTH -> 1;
      case SOUTH -> -1;
      default -> 0;
    };
  }

  private void updatePosition(int deltaX, int deltaY) {
    x += deltaX;
    y += deltaY;
  }
}

import java.util.ArrayList;
import java.util.List;

public class MarsRover {

  private int x;
  private int y;
  private char direction;

  public MarsRover(int x, int y, char direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public List<Integer> operateMarsRover(char command) {
    List<Integer> result = new ArrayList<>();
    result.add(x - 1);
    result.add(y);
    result.add((int) direction);
    return result;
  }
}

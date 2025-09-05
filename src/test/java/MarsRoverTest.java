import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

  @Test
  public void should_return_location_change_when_command_is_Movement() {
    //given
    int x = 0;
    int y = 0;
    Character command = 'M';
    List<Character> directions = new ArrayList<>();
    directions.add('W');
    directions.add('N');
    directions.add('S');
    directions.add('E');
    for (char direction : directions) {
      //when
      List<Integer> result = new MarsRover(x, y, direction).operateMarsRover('M');
      //then
      List<Integer> expect = new ArrayList<>();
      expect.add(-1);
      expect.add(0);
      expect.add((int) direction);
      assertEquals(expect, result);
    }
  }
}
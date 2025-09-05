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
      expect.add(x);
      expect.add(y);
      expect.add((int) direction);
      assertEquals(expect, result);
    }
  }

  @Test
  public void should_return_direction_change_when_command_is_Left() {
    //given
    int x = 0;
    int y = 0;
    Character command = 'L';
    List<Character> directions = new ArrayList<>();
    directions.add('W');
    directions.add('N');
    directions.add('S');
    directions.add('E');
    for (char direction : directions) {
      //when
      List<Integer> result = new MarsRover(x, y, direction).operateMarsRover('L');
      //then
      List<Integer> expect = new ArrayList<>();
      expect.add(x);
      expect.add(y);
      if (direction == 'N') {
        direction='E';
      }
      if (direction == 'S') {
        direction='W';
      }
      if (direction == 'W') {
        direction='N';
      }
      if (direction == 'E') {
        direction='S';
      }
      expect.add((int) direction);
      assertEquals(expect, result);
    }
  }

  @Test
  public void should_return_direction_change_when_command_is_Right() {
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
      fail();
    }
  }
}
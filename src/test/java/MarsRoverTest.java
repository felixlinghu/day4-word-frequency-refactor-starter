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
      switch (direction) {
        case 'N' -> y++;
        case 'S' -> y--;
        case 'W' -> x++;
        case 'E' -> x--;
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
      switch (direction) {
        case 'N' -> direction = 'E';
        case 'S' -> direction = 'W';
        case 'W' -> direction = 'N';
        case 'E' -> direction = 'S';
      }
      expect.add((int) direction);
      assertEquals(expect, result);
    }
  }

  @Test
  public void should_return_direction_change_when_command_is_Right() {
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
      List<Integer> result = new MarsRover(x, y, direction).operateMarsRover('R');
      //then
      List<Integer> expect = new ArrayList<>();
      expect.add(x);
      expect.add(y);
      switch (direction) {
        case 'N' -> direction = 'W';
        case 'S' -> direction = 'E';
        case 'W' -> direction = 'S';
        case 'E' -> direction = 'N';
      }
      expect.add((int) direction);
      assertEquals(expect, result);
    }
  }
}
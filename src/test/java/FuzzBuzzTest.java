import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuzzBuzzTest {

  @Test
  public void shoule_return_one_when_order_is_one(){
    //given
    int order=1;
    //when
    String result=FuzzBuzz.countOff(order);
    //then
    assertEquals("1",result);
  }
  @Test
  public void shoule_return_Fuzz_when_order_is_Three(){
    //given
    int order=3;
    //when
    String result=FuzzBuzz.countOff(order);
    //then
    assertEquals("Fuzz",result);
  }
}

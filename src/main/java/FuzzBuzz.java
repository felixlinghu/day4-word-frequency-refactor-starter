public class FuzzBuzz {

  public static String countOff(int order) {
    if (order % 5 == 0) {
      return "Buzz";
    }
    if (order % 3 == 0) {
      return "Fuzz";
    }
    return String.valueOf(order);
  }
}

public class FuzzBuzz {

  public static String countOff(int order) {
    if (order % 3 == 0) {
      return "Fuzz";
    }
    return String.valueOf(order);
  }
}

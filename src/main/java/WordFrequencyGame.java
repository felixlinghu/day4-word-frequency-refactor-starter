import java.util.*;
import java.util.Map.Entry;

public class WordFrequencyGame {

  public String getResult(String inputStr) {
    String[] words = inputStr.split("\\s+");
    HashMap<String, Integer> occurrenceFrequencyWord = new HashMap<>();
    for (String word : words) {
      occurrenceFrequencyWord.put(word, occurrenceFrequencyWord.getOrDefault(word, 0) + 1);
    }
    List<Entry<String, Integer>> sortedResult = new ArrayList<>(occurrenceFrequencyWord.entrySet());
    sortedResult.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
    return getString(sortedResult);
  }

  private static String getString(List<Entry<String, Integer>> sortedResult) {
    StringJoiner joiner = new StringJoiner("\n");
    for (Entry sortedEntry : sortedResult) {
      String s = sortedEntry.getKey() + " " + sortedEntry.getValue();
      joiner.add(s);
    }
    return joiner.toString();
  }

}

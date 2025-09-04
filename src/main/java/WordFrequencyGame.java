import java.util.*;

public class WordFrequencyGame {
    public String getResult(String inputStr) {
        String[] words = inputStr.split("\\s+");
        HashMap<String,Integer> occurrenceFrequencyWord=new HashMap<>();
        for(String word:words){
            occurrenceFrequencyWord.put(word,occurrenceFrequencyWord.getOrDefault(word,0)+1);
        }
        List<Map.Entry<String,Integer>> sortedResult=new ArrayList<>(occurrenceFrequencyWord.entrySet());
        Collections.sort(sortedResult, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        StringJoiner joiner = new StringJoiner("\n");
        for (Map.Entry sortedEntry:sortedResult) {
            String s = sortedEntry.getKey() + " " + sortedEntry.getValue();
            joiner.add(s);
        }
        return joiner.toString();
    }

}

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String firstWord = scanner.nextLine();
            String secondWord = scanner.nextLine();
            List<String> synonyms = wordSynonyms.get(firstWord);
            if (!wordSynonyms.containsKey(firstWord)) {
                synonyms = new ArrayList<>();
                synonyms.add(secondWord);
                wordSynonyms.put(firstWord, synonyms);
            } else {
                synonyms.add(secondWord);
            }
        }

        for (Map.Entry<String, List<String>> stringListEntry : wordSynonyms.entrySet()) {
            System.out.print(stringListEntry.getKey());
            System.out.print(" - ");
            System.out.println(String.join(", " , stringListEntry.getValue()));
        }


    }
}

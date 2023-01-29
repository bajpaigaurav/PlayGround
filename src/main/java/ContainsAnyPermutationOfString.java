import java.util.HashMap;
import java.util.Map;

public class ContainsAnyPermutationOfString {

    public static void main(String[] args) {
        System.out.println(numberOfPermutationPresents("abbcabc","abc"));
    }

    private static boolean isPermutationPresent(String input, String pattern) {
        boolean isPresent = false;
        int windowStart = 0, windowEnd = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int matched = 0;

        for(char chr : pattern.toCharArray()) {
            // key --> value
            frequencyMap.put(chr,frequencyMap.getOrDefault(chr,0) + 1);
        }

        for(windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char rightChar = input.charAt(windowEnd);
            if(frequencyMap.containsKey(rightChar)) {
                frequencyMap.put(rightChar, frequencyMap.get(rightChar) - 1);
                if(frequencyMap.get(rightChar) == 0)
                     matched++;
            }

            if(matched == frequencyMap.size()) {
                return true;
            }

            if(windowEnd >= pattern.length() - 1) {
                char leftChar = input.charAt(windowStart);

                if(frequencyMap.containsKey(leftChar)) {
                    if(frequencyMap.get(leftChar) == 0) {
                        matched--;
                    }
                    frequencyMap.put(leftChar,frequencyMap.get(leftChar) + 1);
                }
                windowStart++;
            }
        }


        return isPresent;
    }

    private static int numberOfPermutationPresents(String input, String pattern) {
        int numberOfPermutations = 0;
        int windowStart = 0, windowEnd = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int matched = 0;

        for(char chr : pattern.toCharArray()) {
            // key --> value
            frequencyMap.put(chr,frequencyMap.getOrDefault(chr,0) + 1);
        }

        for(windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char rightChar = input.charAt(windowEnd);
            if(frequencyMap.containsKey(rightChar)) {
                frequencyMap.put(rightChar, frequencyMap.get(rightChar) - 1);
                if(frequencyMap.get(rightChar) == 0)
                    matched++;
            }

            if(matched == frequencyMap.size()) {
                numberOfPermutations++;
            }

            if(windowEnd >= pattern.length() - 1) {
                char leftChar = input.charAt(windowStart);

                if(frequencyMap.containsKey(leftChar)) {
                    if(frequencyMap.get(leftChar) == 0) {
                        matched--;
                    }
                    frequencyMap.put(leftChar,frequencyMap.get(leftChar) + 1);
                }
                windowStart++;
            }
        }


        return numberOfPermutations;
    }
}

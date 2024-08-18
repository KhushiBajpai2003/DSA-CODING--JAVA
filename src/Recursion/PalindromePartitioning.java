package Recursion;
import java.util.ArrayList;
import java.util.List;

    public class PalindromePartitioning {
        public static void main(String[] args) {
            List<List<String>> partitions = new ArrayList<>();
            partitioning(0, "aab", new ArrayList<>(), partitions);
            System.out.println(partitions);
        }

        public static void partitioning(int index, String given, List<String> currentPartition, List<List<String>> partitions) {
            if (index >= given.length()) {
                partitions.add(new ArrayList<>(currentPartition));
                return;
            }
            for (int i = index; i < given.length(); i++) {
                String substring = given.substring(index, i + 1);
                if (isPalindrome(substring)) {
                    currentPartition.add(substring);
                    partitioning(i + 1, given, currentPartition, partitions);
                    currentPartition.remove(currentPartition.size() - 1);
                }
            }
        }

        public static boolean isPalindrome(String word) {
            int len = word.length();
            int mid = len / 2;

            for (int i = 0; i < mid; i++) {
                if (word.charAt(i) != word.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }


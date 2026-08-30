public class StringFundamentals {
  public void StringFundamentals_main() {
    System.out.println("hasText(null): " + hasText(null));
    System.out.println("hasText(\"\"): " + hasText(""));
    System.out.println("hasText(\"   \"): " + hasText("   "));
    System.out.println("hasText(\"Java\"): " + hasText("Java"));

    System.out.println("\nTesting normalizeCourseCode:");
    System.out.println("normalizeCourseCode(\"  cs101  \"): '" + normalizeCourseCode("  cs101  ") + "'");
    System.out.println("normalizeCourseCode(null): " + normalizeCourseCode(null));


    System.out.println("countOccurrences(\"banana\", 'a'): " + countOccurrences("banana", 'a'));
    System.out.println("countOccurrences(\"banana\", 'z'): " + countOccurrences("banana", 'z'));


    System.out.println("lengthOfLastWord(\"Hello World\"): " + lengthOfLastWord("Hello World"));
    System.out.println("lengthOfLastWord(\"   yadav brand 2   \"): " + lengthOfLastWord("   yadav brand 2  "));
    System.out.println("lengthOfLastWord(\"a\"): " + lengthOfLastWord("a"));

    char[] arr1 = {'h', 'e', 'l', 'l', 'o'};
    reverseString(arr1);
    System.out.println("reversed: " + new String(arr1));
    char[] arr2 = {'H', 'a', 'n', 'n', 'a', 'h'};
    reverseString(arr2);
    System.out.println("reversed: " + new String(arr2));
  }

  static boolean hasText(String value) {
    return value != null && !value.trim().isEmpty();
  }

  static String normalizeCourseCode(String code) {
    if (code == null) return null;
    return code.trim().toUpperCase();
  }

  static int countOccurrences(String text, char target) {
    if (text == null) return 0;
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == target) {
        count++;
      }
    }
    return count;
  }

  static int lengthOfLastWord(String text) {
    if (text == null) return 0;
    int length = 0;
    int index = text.length() - 1;

    while (index >= 0 && text.charAt(index) == ' ') {
      index--;
    }

    while (index >= 0 && text.charAt(index) != ' ') {
      length++;
      index--;
    }

    return length;
  }

  static void reverseString(char[] characters) {
    if (characters == null) return;
    int left = 0;
    int right = characters.length - 1;
    while (left < right) {
      char temp = characters[left];
      characters[left] = characters[right];
      characters[right] = temp;
      left++;
      right--;
    }
  }
}

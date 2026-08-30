public class StringBuilderToolkit {
  public void StringBuilderToolkit_main() {

    System.out.println("reverse(\"Java\"): " + reverse("Java"));

    System.out.println("repeat(\"Code\", 3): " + repeat("Code", 3));

    String[] words = { "Java", "is", "fun" };
    System.out.println("joinWords: " + joinWords(words, " - "));

    System.out.println("removeCharacterAt(\"banana\", 2): " + removeCharacterAt("banana", 2));

    System.out.println("replaceCharacterAt(\"apple\", 0, 'A'): " + replaceCharacterAt("apple", 0, 'A'));

    String[] items = { "First item", "Second item", "Third item" };
    System.out.println(buildNumberedList(items));

    StringBuilder builder = new StringBuilder("Initial");
    String immutableStr = builder.toString();
    builder.append(" and changed");
    System.out.println("Immutable String: " + immutableStr);
    System.out.println("Changed Builder: " + builder.toString());
  }

  public static String reverse(String text) {
    if (text == null)
      return null;
    return new StringBuilder(text).reverse().toString();
  }

  public static String repeat(String text, int count) {
    if (text == null)
      return null;
    if (count <= 0)
      return "";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(text);
    }
    return sb.toString();
  }

  public static String joinWords(String[] words, String separator) {
    if (words == null || words.length == 0)
      return "";
    if (separator == null)
      separator = "";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      sb.append(words[i]);
      if (i < words.length - 1) {
        sb.append(separator);
      }
    }
    return sb.toString();
  }

  public static String removeCharacterAt(String text, int index) {
    if (text == null || index < 0 || index >= text.length())
      return text;
    StringBuilder sb = new StringBuilder(text);
    sb.deleteCharAt(index);
    return sb.toString();
  }

  public static String replaceCharacterAt(String text, int index, char replacement) {
    if (text == null || index < 0 || index >= text.length())
      return text;
    StringBuilder sb = new StringBuilder(text);
    sb.setCharAt(index, replacement);
    return sb.toString();
  }

  public static String buildNumberedList(String[] items) {
    if (items == null || items.length == 0)
      return "";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < items.length; i++) {
      sb.append(i + 1).append(". ").append(items[i]).append("\n");
    }
    return sb.toString();
  }
}

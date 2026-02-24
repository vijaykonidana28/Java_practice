public class Program1 {
    public static void main(String[] args) {
        String mainString = "Hello, Java World!";

        // 1. length(): Get the length of the string
        int length = mainString.length();
        System.out.println("1. Length of the string: " + length);

        // 2. charAt(): Get the character at a specific index
        char character = mainString.charAt(7);
        System.out.println("2. Character at index 7: " + character);

        // 3. substring(): Extract a part of the string
        // From a specific index to the end
        String sub1 = mainString.substring(7);
        System.out.println("3a. Substring from index 7: " + sub1);
        // Between two specific indexes (end index is exclusive)
        String sub2 = mainString.substring(0, 5);
        System.out.println("3b. Substring from index 0 to 5: " + sub2);

        // 4. indexOf(): Find the position of a character or substring
        int index = mainString.indexOf("Java");
        System.out.println("4. Index of 'Java': " + index);
        // If not found, it returns -1
        int notFound = mainString.indexOf("Python");
        System.out.println("4b. Index of 'Python': " + notFound);

        // 5. toUpperCase() and toLowerCase(): Convert case
        String upper = mainString.toUpperCase();
        String lower = mainString.toLowerCase();
        System.out.println("5a. Uppercase: " + upper);
        System.out.println("5b. Lowercase: " + lower);

        // 6. startsWith() and endsWith(): Check prefix and suffix
        boolean starts = mainString.startsWith("Hello");
        boolean ends = mainString.endsWith("World!");
        System.out.println("6a. Starts with 'Hello'? " + starts);
        System.out.println("6b. Ends with 'World!'? " + ends);

        // 7. contains(): Check if a substring exists
        boolean contains = mainString.contains("World");
        System.out.println("7. Contains 'World'? " + contains);
        
        // 8. replace(): Replace characters or substrings
        String replaced = mainString.replace("Java", "World");
        System.out.println("8. After replacing 'Java' with 'World': " + replaced);
    }
}

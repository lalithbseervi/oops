package el_unit_1;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Java Programming  ";
        String str2 = "JAVA";

        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());

        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());
        System.out.println("Character at 2: " + trimmed.charAt(2));
        System.out.println("Equals: " + trimmed.equals(str2));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(str2));
        System.out.println("Contains 'Prog': " + trimmed.contains("Prog"));
        System.out.println("Index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last Index of 'a': " + trimmed.lastIndexOf('a'));
        System.out.println("Substring(5): " + trimmed.substring(5));
        System.out.println("Substring(0,4): " + trimmed.substring(0,4));
        System.out.println("Replace a with o: " + trimmed.replace('a','o'));
        System.out.println("Starts with Java: " + trimmed.startsWith("Java"));
        System.out.println("Ends with ming: " + trimmed.endsWith("ming"));

        String[] words = trimmed.split(" ");
        System.out.println("Words:");
        for(String w : words)
            System.out.println(w);
        
        char[] chars = trimmed.toCharArray();
        System.out.println("Characters:");
        for(char c : chars)
            System.out.print(c + " ");    
        System.out.println();    
    }   
}
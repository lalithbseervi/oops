package el_unit_1;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Casey Muratori  ";
        String str2 = "Java Virtual Machine";

        System.out.println("Length: " + str.length());

        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        System.out.println("Character at index 2 of trimmed str: " + trimmed.charAt(2));

        System.out.println("Equals: " + trimmed.equals(str2));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(str2));
        System.out.println("Contains 'Mura': " + trimmed.contains("Mura"));

        System.out.println("Index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last Index of 'a': " + trimmed.lastIndexOf('a'));

        System.out.println("Substring(5): " + trimmed.substring(5));
        System.out.println("Substring(0,4): " + trimmed.substring(0,4));

        System.out.println("Replace a with o: " + trimmed.replace('a','o'));

        System.out.println("Starts with Case: " + trimmed.startsWith("Case"));
        System.out.println("Ends with ing: " + trimmed.endsWith("ing"));

        String[] words = trimmed.split(" ");
        System.out.println("Words upon splitting by space:");
        for(String w : words)
            System.out.println(w);
        
        char[] chars = trimmed.toCharArray();
        System.out.println("Printing individual characters:");
        for(char c : chars)
            System.out.print(c + " ");    
        System.out.println();    
    }   
}
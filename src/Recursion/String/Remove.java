package Recursion.String;

public class Remove {

    public static String remove(String name, int index) {
        if(index == name.length()) {
            return "";
        }
        String small = remove(name, index + 1);
        char ch = name.charAt(index);
        if(ch != 'a') {
            return ch + small;
        }
        return small;
    }
    public static void main(String[] args) {
        String name = "madam";
        String result = remove(name, 0);
        System.out.println(result);
    }
}

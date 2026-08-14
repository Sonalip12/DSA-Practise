class stringlength {
    public int findLength(String s) {
        return s.length();
    }
}

public class Main {
    public static void main(String[] args) {
        stringlength o = new stringlength();
        String s = "Sonali here";
        System.out.println(o.findLength(s));

    }
}
import week_2022_9_26.CheckPermutation;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";

        CheckPermutation permutation = new CheckPermutation();
        System.out.println(permutation.checkPermutation(s1, s2));
    }
}
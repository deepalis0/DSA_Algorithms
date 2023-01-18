class Precedence {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 1, result;
        result = a- ++c - ++b;
                // 10 - 2 - 6 = 2
        System.out.println(result);
    }
}
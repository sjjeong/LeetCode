class A{

    static class B{

    }
}

class Sample{
    public static void main(String args[]) {
        String a = "abc";
        String b = "abc";

        if (a == b) {
            System.out.println("a==b");
        }
        if (a.equals(b)) {
            System.out.println("a.equals(b)");
        }
    }

}
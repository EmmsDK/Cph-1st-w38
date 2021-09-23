public class Main {
  public static void main(String[] args) {
    int a = 7, b = 42;
    minimum(a,b);
    int smaller = minimum(a,b);
    if (smaller == a) {
      System.out.println(smaller + " is the smallest!");
    }
  }
  public static int minimum(int a, int b) {
    int smaller;

    if (a < b) {
      smaller = a;
    } else {
      smaller = b;
    }
    return smaller;
  }
}

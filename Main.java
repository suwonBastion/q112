import java.util.Scanner;
import static java.lang.Math.*;
// import static java.lang.System.in;
// import static java.lang.System.out;
import static java.lang.System.out.println;

class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(in);
    out.print("실 수:");
    double x = stdin.nextDouble();
    // out.println("절대값:"+abs(x));
    // out.println("제곱근:"+sqrt(x));
    println("넓 이:"+PI*x*x);
  }
}
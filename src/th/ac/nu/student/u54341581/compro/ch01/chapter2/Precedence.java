package th.ac.nu.student.u54341581.compro.ch01.chapter2;
public class Precedence {

 public static void main(String[] args) {
 System.out.println(1 + 2 * 3); // 7
 System.out.println((1 + 2) * 3); // 9
 System.out.println(1 + (2 * 3)); // 7
 }
 }
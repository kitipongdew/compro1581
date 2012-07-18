package th.ac.nu.student.u54341581.compro.ch01.chapter2;
public class Widening {

 public static void main(String[] args) {
 int i = 1234567890;
 float f = i;
 System.out.println(i - (int) f); // -46
 }
}
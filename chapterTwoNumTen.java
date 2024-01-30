import java.util.Scanner;

public class chapterTwoNumTen
{
  public static void main(String[] args)
  {
    double test1;
    double test2;
    double test3;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter test score 1: ");

    test1 = keyboard.nextDouble();

    System.out.print("Enter test score 2: ");

    test2 = keyboard.nextDouble();

    System.out.print("Enter test score 3: ");

    test3 = keyboard.nextDouble();

    double average = (test1 + test2 + test3) / 3;

    System.out.println("Test 1: " + test1);
    System.out.println("Test 2: " + test2);
    System.out.println("Test 3: " + test3);
    System.out.println("Tests average: " + average);

    keyboard.close();
  }
}
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Pillowcase p1 = new Pillowcase();

    Scanner s = new Scanner(System.in);

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    int houses = s.nextInt();

    for (int i=0;i<houses; i++){
      p1.getCandy();
    }

    System.out.println("We have " + p1.getCandyNum() + " candies.");

    p1.printNumCandies();
  }
}
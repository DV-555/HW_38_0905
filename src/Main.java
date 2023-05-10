public class Main {

  public static void main(String[] args) {
    Book harryPotter = new Book("J.K.Rowling", "Stein der Weisen");
    Book harryPotter2 = new Book("J.K.Rowling", "Gefangene von Askaban");
    System.out.println(harryPotter.equals(harryPotter2));
    System.out.println(harryPotter2.equals(harryPotter));
    System.out.println(harryPotter2.equals(harryPotter2));
    System.out.println(harryPotter.hashCode());
    System.out.println(harryPotter2.hashCode());
    System.out.println(harryPotter2.hashCode());
  }
}
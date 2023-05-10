import java.util.Objects;

public class Book {

  //Создайте класс Book (книга), в конструктор которого передавайте автора и название книги.
  //Переопределите сравнение книг: книги должны считаться одинаковыми, если совпадают и название,
  // и автор.
  private String author;
  private String title;

  public Book(String author, String title) {
    this.author = author;
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return " Author: " + getAuthor() +
        " Title: " + getTitle();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Book))
      return false;
    Book book = (Book) o;
    return Objects.equals(author, book.author) &&
        Objects.equals(title, book.title);
  }
  @Override
  public int hashCode() {
    return author.hashCode() + title.hashCode();


  }
}

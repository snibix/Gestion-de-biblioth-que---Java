package training;

public class Book {
  String title ;
  String author;
  int year;
  String isbn;
  boolean available ;

  public Book(String title,String author, int year , String isbn , boolean available){
    this.title = title;
    this.author = author;
    this.year = year;
    this.isbn = isbn;
    this.available = true;
  }

  // Méthode pour savoir si le livre est disponible
  public boolean isAvailable(){
     return available  ;
  }

  // Méthode pour changer l'état (emprunté / disponible)
  public void borrow() {
  available = false;
  }

  public void returnBook(){
      available = true;
  }
}

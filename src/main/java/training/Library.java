package training;

import java.util.ArrayList;
import java.util.List;

public class Library {

List<Book> books=new ArrayList<>();


public void addBook(Book book){
  books.add(book);
}

public void deleteBook(String isbnDelete){
  Book bookToRemove = null;

  // Parcourir la list des livres
  for (Book book : books){
    if(book.isbn.equals(isbnDelete)){
      bookToRemove = book;
      break;
    }
  }

  // Supprimer le livre avec isbn

  if(bookToRemove != null ){
    books.remove(bookToRemove);
    System.out.println("Livre supprimé");
  }else{
    System.out.println("Livre non trouvé");
  }

}

public void searchBook(String findBook){
 List<Book> result = new ArrayList<>();

  // Parcourir la liste
  for (Book book : books){
    if(result.isEmpty()) {
      System.out.println("Aucun livre trouvé");
  } else {
      System.out.println("Résultats de la recherche : " + result);
  }
}

}

public void viewAllBooks(){
  for (Book book : books){
    System.out.println(book.title + " par " + book.author + " (" + book.year + ")");
  }
}

public boolean isAvailable(String title) {
  for (Book book : books) {
      if (book.title.equalsIgnoreCase(title)) {
          if (book.isAvailable()) {
              System.out.println("Livre disponible");
              return true;
          } else {
              System.out.println("Livre indisponible");
              return false;
          }
      }
  }
  System.out.println("Livre non trouvé");
  return false;
}


}

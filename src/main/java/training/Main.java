package training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quitter = false;
        Library lib = new Library();

    while (!quitter) {
    // afficher le menu
    System.out.println("1 - Ajouter un livre");
    System.out.println("2 - Supprimer un livre");
    System.out.println("3 - Rechercher un livre");
    System.out.println("4 - Voir tous les livres");
    System.out.println("5 - Vérifier la disponibilité d'un livre");
    System.out.println("6 - Quitter");

    int choix = sc.nextInt();
    sc.nextLine();
    
    switch (choix) {
        case 1:
        System.out.println("Le titre du livre");
        String title = sc.nextLine();

        System.out.println("L'auteur du livre");
        String author = sc.nextLine();

        System.out.println("L'année du livre");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println("L'ISBN du livre");
        String isbn = sc.nextLine();

        Book newBook = new Book(title, author, year, isbn,true);
        lib.addBook(newBook);
        break;

        case 2:
        System.out.println("L'ISBN du livre");
        String isbnDelete = sc.nextLine();
            lib.deleteBook(isbnDelete);
            break;

        case 3:
        System.out.println("Recherche en fonction du titre ou de l'auteur du livre ");
        String search = sc.nextLine();
            lib.searchBook(search);
            break;

        case 4:
            lib.viewAllBooks();
            break;

        case 5:
        System.out.println("Entrez le titre pour vérifier s'il est disponible :");
        String available = sc.nextLine();
            lib.isAvailable(available);
            break;

        case 6:
            quitter = true;
            System.out.println("Au revoir !");
            break;

        default:
            System.out.println("Choix invalide, réessayez.");
    }
}

sc.close();

    }
}
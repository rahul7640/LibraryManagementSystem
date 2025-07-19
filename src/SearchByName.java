import java.util.Scanner;

public class SearchByName {
    public void searchBook(){
        if (AddBooks.arr == null || AddBooks.arr.length == 0) {
            System.out.println("No Record Found !");
//            return;
        }
      try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title to search : ");
        String searchTitle = sc.next();

        boolean found = false;

        for (BooksEntity book : AddBooks.arr) {
            if (book != null && book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Book Available :");
                book.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book Not Found. ");
        }
      } catch (Exception e) {
          System.out.println("Input Wrong !");
      }
    }
}

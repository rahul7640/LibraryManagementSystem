import java.util.Scanner;

public class IssueBook {
    public void issueBookByID() {
        if (AddBooks.arr == null || AddBooks.arr.length == 0) {
            System.out.println("No Books in Library.");
            return;
        }
         try {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter Book ID to be Issue : ");
             int searchID = sc.nextInt();

             boolean found = false;

             for (BooksEntity book : AddBooks.arr) {
                 if (book != null && book.getId() == searchID) {
                     if (book.isIssued()) {
                         System.out.println("Book Already Issued !");
                     } else {
                         book.issueBook();
                         System.out.println("Book Issued Successfully. ");
                         book.displayInfo();
                     }
                     found = true;
                     break;
                 }
             }

             if (!found) {
                 System.out.println("❌ Book Not Found.");
             }
         } catch (Exception e) {
             System.out.println("Input Wrong !");
         }
    }
}

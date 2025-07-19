import java.util.Scanner;

public class AddBooks {
    public static BooksEntity[] arr;

    public void adBook() {
        try {
            Scanner cd = new Scanner(System.in);
            System.out.println("How Many Books Do You Want to Add?");
            int size = cd.nextInt();
            arr = new BooksEntity[size];

            for (int i = 0; i < arr.length; ) {
                System.out.println("Enter Book Name : ");
                String title = cd.next();

                System.out.println("Enter Book ID : ");
                int id = cd.nextInt();
                if (isDuplicateID(id, i)) {
                    System.out.println("Book with this ID already exists ! Enter a unique ID.");
                    continue;
                }

                System.out.println("Which Stranded Book :");
                String stnd = cd.next();

                BooksEntity o = new BooksEntity(stnd, title, id);
                arr[i] = o;
                System.out.println("Book Stored Successfully");
                i++; // only increment if book was added
            }

        } catch (Exception e) {
            System.out.println(" Input Wrong!");
        }
    }
    private boolean isDuplicateID(int id, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            if (arr[i] != null && arr[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
}

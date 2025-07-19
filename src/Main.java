import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("|| Library Management System ||");
        try {
        while(true){
            System.out.println("================================");
            System.out.println("1. Add Books");
            System.out.println("2. View Books");
            System.out.println("3. Issue Books");
            System.out.println("4. Exit");

                int choice = cd.nextInt();

                if (choice == 1) {
                    AddBooks o = new AddBooks();
                    o.adBook();
                } else if (choice == 2) {
                    while (true) {
                        System.out.println("===================");
                        System.out.println("1. All Books");
                        System.out.println("2. Search By Name");
                        System.out.println("3. Search By Book ID");
                        System.out.println("4. Main menu");
                        int book = cd.nextInt();
                        if (book == 1) {
                            ViewAll a = new ViewAll();
                            a.display();
                        } else if (book == 2) {
                            SearchByName b = new SearchByName();
                            b.searchBook();
                        } else if (book == 3) {
                            SearchByID c = new SearchByID();
                            c.searchBook();
                        } else if (book == 4) {
                            System.out.println("Back To main menu !");
                            break;
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    }
                } else if (choice == 3) {
                    IssueBook z = new IssueBook();
                    z.issueBookByID();

                } else if (choice == 4) {
                    System.out.println("Exit Sucessfully");
                    break;
                } else {
                    System.out.println("Invalid Choice");
                }
             }
          } catch (Exception e) {
            System.out.println(e.getMessage()+" Type Error");
        }
    }
}
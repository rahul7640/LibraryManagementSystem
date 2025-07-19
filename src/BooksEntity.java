public class BooksEntity {
private String title;
private int id;
private String stranded;
private boolean isIssued;

    public BooksEntity(String stranded, String title, int id) {
        this.stranded = stranded;
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getStranded() {
        return stranded;
    }

    public boolean isIssued() {
        return isIssued;
    }
    public void issueBook() {
        this.isIssued = true;
    }

    public String toString() {
        return "Book Title : " + title + ", Book ID : " + id + ", Stranded : " + stranded +
                ", Issued: " + (isIssued ? "Yes" : "No");
    }

    public void displayInfo() {
        System.out.println(this);  // toString() ko call karega
    }
}



public class ViewAll {
    public void display() {
        if(AddBooks.arr==null) {
            System.out.println("No Record Found !");
        }
        else{
            for (int i = 0; i < AddBooks.arr.length; i++) {
                System.out.println(AddBooks.arr[i]);
            }
        }
    }
}

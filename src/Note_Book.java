public class Note_Book {
    public static void main(String[] arg){
        Pages book = new Pages();
        book.setSecondNote("Nnaemeka");
        //book.deleteFirstNote();
        book.setFifthNote(" Mirabel");
        System.out.println(book.getSecondNote() +" "+ book.getFifthNote());
    }
}

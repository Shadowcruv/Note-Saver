import java.util.*;

public class Pages {


    Scanner scanner = new Scanner(System.in);

    private String FirstNote ;
    private String SecondNote;
    private String ThirdNote;
    private String FourthNote;
    private String FifthNote;
    private int reply;

    public Pages(){

    }
     public void setFirstNote(String here){
       scanner.useDelimiter("\n");
        FirstNote = here;
        System.out.println("Do u wish to save this Firstnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
        reply = scanner.nextInt();
        if (reply == 1){System.out.println("Saving...");}
        if (reply == 2){System.out.println("Note Deleted and Discarded");FirstNote = "Nope note";}
        if (reply >2) {
            System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
        }
        }

     public String getFirstNote(){
  //    if (deleteFirstNote()){ return "ndi";}
        if (reply >= 2){ return "missing note";}
        else return FirstNote;
        //return reply; 
     }
    public void setSecondNote(String here){
        scanner.useDelimiter("\n");
        SecondNote = here;
        System.out.println("Do u wish to save this Secondnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
        reply = scanner.nextInt();
        if (reply == 1){System.out.println("Saving...");}
        if (reply == 2){System.out.println("Note Deleted and Discarded");
        SecondNote = "No note";}
        if (reply >2) {
            System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
        }
    }

    public String getSecondNote(){
        if (reply >= 2){return "no note";}
        else return SecondNote;
        //return reply;
    }
    public void setThirdNote(String here){
        scanner.useDelimiter("\n");
        ThirdNote = here;
        System.out.println("Do u wish to save this Thirdnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
        reply = scanner.nextInt();
        if (reply == 1){System.out.println("Saving...");}
        if (reply == 2){System.out.println("Note Deleted and Discarded");ThirdNote = "No note";}
        if (reply >2) {
            System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
        }
    }

    public String getThirdNote(){
        if (reply >= 2){return "no note";}
        else return ThirdNote;
        //return reply;
    }
    public void setFourthNote(String here){
        scanner.useDelimiter("\n");
        FourthNote = here;
        System.out.println("Do u wish to save this Fourthnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
        reply = scanner.nextInt();
        if (reply == 1){System.out.println("Saving...");}
        if (reply == 2){System.out.println("Note Deleted and Discarded");FourthNote = "No note";}
        if (reply >2) {
            System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
        }
    }

    public String getFourthNote(){
        if (reply >= 2){return "no note";}
        else return FourthNote;
        //return reply;
    }
    public void setFifthNote(String here){
        scanner.useDelimiter("\n");
        FifthNote = here;
        System.out.println("Do u wish to save this Fifthnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
        reply = scanner.nextInt();
        if (reply == 1){System.out.println("Saving...");}
        if (reply == 2){System.out.println("Note Deleted and Discarded");FifthNote = "No note";}
        if (reply >2) {
            System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
        }
    }

    public String getFifthNote(){
        if (reply >= 2){return "no note";}
        else return FifthNote;
        //return reply;
    }

    public int getTotalNotes(){return 5;}
    public Boolean deleteFirstNote(){
        return FirstNote == "Note deleted succesfully";
    }
}



package hust.soict.dsai.disc;// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// hust.soict.dsai.disc.DigitalVideoDisc Class
// hust.soict.dsai.disc.DigitalVideoDisc.java

public class DigitalVideoDisc {
    private String title ;
    private String category;
    private String directory;
    private int length;
    private float cost;
    private int id = 0 ;
    private static int nbDigitalVideoDiscs = 0 ;



    public DigitalVideoDisc () {

    }

    // Create a DVD object by all attributes: title, category, director, length and cost
    public DigitalVideoDisc(String title , String category, String directory , int length, float cost) {
        this.title  = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Create a DVD object by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Create a DVD object by director, category, title and cost
    public DigitalVideoDisc(String title, String category, String directory, float cost) {
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    //Create a DVD object by title
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }


    // Getters and Setters
    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getDirectory() {

        return directory;
    }

    public void setDirectory(String directory) {

        this.directory = directory;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }


// toString method
    public String toString () {
        return "DVD" + "  -  " + title +"  -  "+category+"  -  "+directory+"  -  "+length+"  -  "+cost;
    }



// isMatch method
    public boolean isMatch(String title) {
        if(title.equals(this.title)) {
            return true;
        }
        return false;
    }



    // swap method
public void swaptwoObj(DigitalVideoDisc dvd){
        this.title = dvd.getTitle();
        this.category = dvd.getCategory();
        this.directory = dvd.getDirectory();
        this.length = dvd.getLength();
        this.cost = dvd.getCost();
}









}

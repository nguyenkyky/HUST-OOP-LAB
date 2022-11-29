// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// DigitalVideoDisc Class
// DigitalVideoDisc.java

public class DigitalVideoDisc {
    private String title ;
    private String category;
    private String directory;
    private int length;
    private float cost;




    public DigitalVideoDisc () {

    }

    // Create a DVD object by all attributes: title, category, director, length and cost
    public DigitalVideoDisc(String title , String category, String directory , int length, float cost) {
        this.title  = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
    }

    // Create a DVD object by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Create a DVD object by director, category, title and cost
    public DigitalVideoDisc(String title, String category, String directory, float cost) {
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.cost = cost;
    }

    //Create a DVD object by title
    public DigitalVideoDisc(String title) {
        this.title = title;
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




}

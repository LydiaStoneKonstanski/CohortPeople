package main.java.zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String color;
    private String birthMonth;
    private String gitHubHandle;
    private Boolean hasPets;

    public Person(String lname, String fname, String color, String month, String handle, Boolean hasPets) {
        this.firstname = fname;
        this.lastname = lname;
        this.color = color;
        this.birthMonth = month;
        this.gitHubHandle = handle;
        this.hasPets = hasPets;


    }


    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getColor(){
        return color; }
    public void setcolor(String color) {
    this.color = color;
    }
    public String getbirthMonth(){
        return birthMonth;
    }
    public void setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth;
}
    public String getGitHubHandle(){
        return gitHubHandle;
    }
    public void setGitHubHandle(String gitHubHandle){
        this.gitHubHandle = gitHubHandle;
    }
    public Boolean getHasPets(){
        return hasPets;
    }
    public void setHasPets(Boolean hasPets) {
        this.hasPets = hasPets;
    }
    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + color + ", " + birthMonth + ", " + gitHubHandle + ", " + hasPets + "; " ;
    }
}

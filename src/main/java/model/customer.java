package model;
public class customer {
    private int id;
    private String email;
    private String fname;
    private String lname;



    // Constructor
    public customer(int id, String email, String fname, String lname) {
        this.id = id;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
    }

    public customer() {
        this.id = 0;
        this.email = "";
        this.fname = "";
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "customer{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
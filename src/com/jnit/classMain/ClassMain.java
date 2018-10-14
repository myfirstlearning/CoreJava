package com.jnit.classMain;

public class ClassMain {


    private int id;
    private String fName;
    private String lName;

    public ClassMain(){
         this(42,"devender","rao");
          System.out.println("Empty Constructor");
    }

    public ClassMain(String fName, String lName){
        this(21,"karthik", "Boggula");
        System.out.println("Parameterized Constructor");
        this.fName = fName;
        this.lName = lName;
    }

    public ClassMain(int id, String fName, String lName ){
            this.id = id;
            this.fName = fName;
            this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        String givenName = fName.toLowerCase();
        if(givenName.equals("vinesh")){
        this.fName = fName;
        }else{
            this.fName = "Unknown";
        }
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}

//Name Ghanem Ghanem
//Date: 2020-11-08
//ID 110005430
public class Person {
    String fname;
    String lname;
    long phoneNum;
    int month;
    int day;
    public Person(){

    }
    public Person(String fname , String lname, long phoneNum, int month, int day){// keeps information of persons object
        //first name , last name , phone number and birth date.
        this.fname = fname;
        this.lname = lname;
        this.phoneNum=phoneNum;
        this.month=month;
        this.day = day;
    }

    public String getFname() {
        return fname;
    }// getters and setters for each instance variables

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public String toString(){// return the persons first and last name, you can add more properties by using either the
        //instance variable phoneNum or getPhoneNum
        return fname+" "+lname;
    }


}

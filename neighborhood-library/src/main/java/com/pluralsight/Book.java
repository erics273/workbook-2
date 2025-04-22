package com.pluralsight;

public class Book {

    //class properties that describe a book
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        //get values from constructor for these properties
        this.id = id;
        this.isbn = isbn;
        this.title = title;

        //give these properties default values but don't set from the constructor
        this.setCheckedOut(false);
        this.setCheckedOutTo("");
    }

    //My custom methods

    //method to check-out a book that sets the appropriate variables
    public void checkOut(String name){
        //set isCheckedOut to true using setter
        this.setCheckedOut(true);
        //set checkoutOut to, to the name passed in
        this.setCheckedOutTo(name);
    }

    //method to check in a book that clears the appropriate variables
    public void checkIn(){
        //set isCheckedOut to true using setter
        this.setCheckedOut(false);
        //set checkoutOut to, to the name passed in
        this.setCheckedOutTo("");
    }

    //getters and setters for all class properties
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}

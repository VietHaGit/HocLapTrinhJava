package OOP;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day , int month , int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDate(int day , int month , int year){
        this.day = day;
        this.month = month;
        this.year= year;
    }
    public void  setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return  day;
    }
    public void setMonth( int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int year) {
        this.year = year;

    }
    public int getYear(){
        return year;
    }
    public void display(){
        //"dd/MM/yyyy"
        String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";
        if (day.length() == 1){
            day = "0" + day;
        }
        if (month.length()==1){
            month = "0" + month;
        }
        System.out.println(day + "/" + month + "/" + year);
    }
}class Entry102 {
    public static void main(String[] args) {
        Date d = new Date(1, 1, 1997);
        d.display();
        d.setDate(12, 12, 2004);
        d.display();
        d.setMonth(5);
        d.setDay(15);
        d.setYear(1999);
        d.display();
    }
}

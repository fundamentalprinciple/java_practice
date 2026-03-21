class Date {
    private int day, month, year;

    public Date(int d, int m, int y){
        this.day = d;
        month = m;
        year = y;
    }

    public Date(int d, int m){
        day = d;
        month = m;
        year = 2021;
    }

    public Date(Date copy) {
        this.day = copy.day;
        this.month = copy.month;
        this.year = copy.year;
    }    

}

class Main {
    public static void main(String[] args) {
        Date date = new Date(29,3,2026);
        Date date2 = new Date(date);
    }   
}

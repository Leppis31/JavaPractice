package fi.lab.animals;

public class Date {
    private int d;
    private int m;
    private int y;

    public int getD() {
        return d;
    }
    public void setD(int d) {
        this.d = d;
    }
    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Date(){
        this.d=1;
        this.m=1;
        this.y=1900;
    }
    public Date(int d, int m, int y){
        if(!setValues(d, m, y)){
            this.d=1;
            this.m=1;
            this.y=1900;
        }
    }
    public boolean setValues(int d, int m, int y) {
        if(m < 1 || m > 12) {
            return false;
        }
        
        if(y < 1900 || y > 2030) {
            return false;
        }
        
        int maxDays = 31;
        if(m == 4 || m == 6 || m == 9 || m == 11) {
            maxDays = 30;
        } else if(m == 2) {
            maxDays = (y % 4 == 0) ? 29 : 28;
        }
        
        if(d < 1 || d > maxDays) {
            return false;
        }
        
        this.d = d;
        this.m = m;
        this.y = y;
        return true;
    }
    @Override
    public String toString() {
        return ""+d+"."+m+"."+y;
    }

}

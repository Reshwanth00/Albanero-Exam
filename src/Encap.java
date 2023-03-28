public class Encap {
    /*
    we can achieve the encapsulation using access modifiers
    in encapsulation we bind the data to hide from other class members
    but we can still improve the data members by using getters and setters
     */
    private String name;
    private int number;
    private boolean attended;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public boolean getAttended(){
        return attended;
    }
}

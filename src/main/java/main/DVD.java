package main;

public class DVD extends Item {
    private int duration;
    public DVD(String id, String title, int duration){
        super(id, title);
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + ", Title: " + getTitle() + ", Duration: " + this.duration + " minutes";
    }
    
}

package Fan;

public class Fan {
    int slow = 1;
    int medium = 2;
    int fast = 3;
    private int speed;
    private boolean turn;
   private double radius;
   private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getTurn() {
       return turn;
    }

    public void setTurn(boolean turn) {
            this.turn = turn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){

   }
   public Fan (int speed,boolean turn,double radius,String color) {
       this.speed = speed;
       this.turn = turn;
       this.radius = radius;
       this.color = color;
   }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ",fan is " + turn +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

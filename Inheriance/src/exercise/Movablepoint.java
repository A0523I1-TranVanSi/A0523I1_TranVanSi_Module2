package exercise;

public class Movablepoint extends Point{
    private float xSpeed = 0.0f ;
    private float ySpeed = 0.0f ;

    public Movablepoint() {
    }

    public Movablepoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movablepoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return super.toString()+", speed = ("+this.xSpeed+", "+this.ySpeed+")";
    }

    public Movablepoint move(){
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this ;
    }

    public static void main(String[] args) {
        Movablepoint movablepoint = new Movablepoint();
        movablepoint = new Movablepoint(2,3,4,5);
        System.out.println(movablepoint.move());
        System.out.println(movablepoint);
    }
}

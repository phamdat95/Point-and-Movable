public class Movable extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    Movable(){}
    Movable(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    Movable(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    private float getXSpeed(){
        return xSpeed;
    }
    private float getYSpeed(){
        return ySpeed;
    }
    private float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    public String toString(){
        return "(" + getX() + ", " + getY() + "), speed = (" + getXSpeed() + ", " + getYSpeed() + ")";
    }

    void move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }
}

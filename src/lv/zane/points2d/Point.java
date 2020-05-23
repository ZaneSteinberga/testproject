package lv.zane.points2d;

public class Point {

    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        //float[] arrays = {this.x, this.y};
        float[] arr = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }

    public String toString(){
        return "("+this.x + "," + this.y + ")";
    }
}

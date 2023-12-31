package exercise;

public class Point3D extends Point2D{
    private float z = 0.0f ;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z ){
        super.setXY(x,y);
        this.z = z ;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()} ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z = " + z+
                '}' +super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D() ;
        point3D = new Point3D(5,6,8);
        System.out.println(point3D);
    }
}

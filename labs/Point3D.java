package labs;

public class Point3D implements Comparable<Point3D> {
	private int z;
public Point3D(){
	super();
	z=0;}
public Point3D(int x,int y,int z){
	super(x,y);
	this.z = z;	
}
public void setLocation(int x ,int y, int iz){
	super.setLocation(x,y);
	z = iz;
}
	public int getz(){
		return z;
	}
	public String toString(){
		return getx+","+gety+","+z;
	}
	public double distanceFrom (Point3D pt) {
	    double xyDistance = super.distanceFrom ((Point2d) pt);
	    double dz = Math.abs (z - pt.getZ()); 
	    System.out.println("distanceFrom(): deltaZ = " + dz);

	    return Math.sqrt((xyDistance * xyDistance) + (dz * dz));
	   }
	public double distanceFromOrigin () {
	    return distanceFrom (new Point3D ( ));
	   }
	public int compareTo(Point3D p){
		return p.compareTo(new Point3D(super.getx(),super.gety(),getz()));
	}
}


public class Sphere extends Shape3D {
    private double radius;

    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius * radius * 4;
    }

    public double getVolume(){
		return Math.PI * radius * radius * radius * (4/3); 
    }
}
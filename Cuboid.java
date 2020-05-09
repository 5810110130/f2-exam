public class Cuboid extends Shape3D {
    private double width;
    private double heigth;
    private double depth;

	public Cuboid(String name, double width, double heigth, double depth){
		super(name);
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

    public double getHeigth(){
		return heigth;
	}

	public void setHeigth(double heigth){
		this.heigth = heigth;
    }
    public double getDepth(){
		return depth;
	}

	public void setDepth(double depth){
		this.depth = depth;
	}
	public double getArea(){
		return(2 * width * depth) + (2 * depth * heigth) + (2 * width * heigth) ; 
    }
    
    public double getVolume(){
		return width * heigth * depth; 
    }
}
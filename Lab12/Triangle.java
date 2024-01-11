public class Triangle {
    private int width;
    private boolean isRotated;

    public Triangle() {
        this(1); 
    }

    public Triangle(int width) {
        setWidth(width);
        isRotated = false;
    }

    public Triangle(Triangle t) {
        this(t.getWidth()); 
    }

    public int getWidth() {
        return this.width; 
    }

    public void setWidth(int width) { 

        if(width < 1)  
            throw new IllegalArgumentException();
        this.width = width; 
    }

    public double area() {
        return width * width / 2.0;
    }

    public double perimeter() {
        double hypotenuse = Math.sqrt(2.0 * width * width);
        return width + width + hypotenuse;
    }


    public void draw(char ch) {
        if(!isRotated) {
            for(int i = 0; i < width; i++) {
                for(int j = 0; j <= i; j++)
                    System.out.print(ch);

                System.out.print("\n");
            }
        }
        else {
            for(int i = 0; i < width; i++) {
                for(int j = 0; j < width - i - 1; j++)
                    System.out.print(" ");
                for(int j = 0; j <= i; j++)
                    System.out.print(ch);
                System.out.print("\n");
            }
        }
    }

    public void rotate() {
        isRotated = !isRotated; 
    }

    public boolean isRotated() {
        return this.isRotated;
    }
}
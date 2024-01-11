public class Triangle extends Shape2D {

  private int width;

  public Triangle() {
    width = 1;
    super.setColor(Color.RED);
  }

  public Triangle(int width) {
    setWidth(width);
    super.setColor(Color.RED);
  }

  public int getWidth() {
    return width;
  }

  public Triangle setWidth(int width) {
    if (width <= 0) {
      throw new IllegalArgumentException("Width must be greater than 0");
    }
    this.width = width;
    return this;
  }

  @Override
  public double area() {
    return 0.5 * width * width; 
  }

  @Override
  public double perimeter() {
    return 3 * width;
  }

  @Override
  public void draw(char ch) {
    for (int i = 1; i <= width; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  @Override
  public String toString() {
    return "Triangle[width=" + width + ", color=" + super.getColor() + "]";
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Triangle triangle = (Triangle) o;
    return width == triangle.width;
  }

  @Override
  public int hashCode() {
    return Objects.hash(width);
  }

}
public class Sphere extends Shape3D {

  private int radius;

  public Sphere() {
    radius = 1;
    super.setColor(Color.RED); 
  }
 
  public Sphere(int radius) {
    setRadius(radius);
    super.setColor(Color.RED);
  }

  public int getRadius() {
    return radius;
  }

  public Sphere setRadius(int radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be greater than 0");
    }
    this.radius = radius;
    return this;
  }

  @Override
  public double area() {
    return 4 * Math.PI * radius * radius;
  }

  @Override
  public double volume() {
    return (4.0/3) * Math.PI * radius * radius * radius;
  }

  @Override
  public void draw(char ch) {
    for (int i = 0; i < 2 * radius; i++) {
      for (int j = 0; j <= 2 * radius; j++) {
        double d = Math.sqrt(radius * radius - (i - radius) * (i - radius));
        if (j == Math.round(d + radius)) {
          System.out.print(ch);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println(); 
    }
  }

  @Override
  public String toString() {
    return "Sphere[radius=" + radius + ", color="+ super.getColor() + "]";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sphere sphere = (Sphere) o;
    return radius == sphere.radius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius);
  }

}
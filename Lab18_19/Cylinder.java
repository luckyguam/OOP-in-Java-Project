public class Cylinder extends Shape3D {

  private int radius;
  private int height;

  public Cylinder() {
    radius = 1; 
    height = 1;
    super.setColor(Color.RED);
  }

  public Cylinder(int radius, int height) {
    setRadius(radius);
    setHeight(height);
    super.setColor(Color.RED);
  }

  public int getRadius() {
    return radius;
  }

  public Cylinder setRadius(int radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be greater than 0");
    }
    this.radius = radius;
    return this;
  }

  public int getHeight() {
    return height;
  }

  public Cylinder setHeight(int height) {
    if (height <= 0) {
      throw new IllegalArgumentException("Height must be greater than 0");
    }
    this.height = height;
    return this;
  }

  @Override
  public double area() {
    return 2 * Math.PI * radius * (radius + height); 
  }

  @Override
  public double volume() {
    return Math.PI * radius * radius * height;
  }

  @Override
  public void draw(char ch) {
    // draw top half circle
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
    
    // draw body
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < 2 * radius; j++) {
        if (j == 0 || j == 2 * radius - 1) {
          System.out.print(ch);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // draw bottom half circle
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
    return "Cylinder[radius=" + radius + ", height=" + height + ", color=" + super.getColor() + "]";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cylinder cylinder = (Cylinder) o;
    return radius == cylinder.radius && height == cylinder.height;
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius, height);
  }

}
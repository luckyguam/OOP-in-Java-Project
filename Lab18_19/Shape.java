public abstract class Shape {

  private Color color;

  public Shape() {
    color = Color.BLACK; 
  }

  public Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public Shape setColor(Color color) {
    this.color = color;
    return this; 
  }

  public abstract double area();

  public abstract void draw(char ch);

}
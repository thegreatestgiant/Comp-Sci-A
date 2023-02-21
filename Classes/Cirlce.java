// https://replit.com/@merlbaum/Unit-2?embed=1&output=1#Circle.java
class Circle {
    // Atrributes - what defines a circle
    private int radius;
    // private int ;

    // Constuctors - What to do when a circle is constructed/created
    // no args constructor
    public Circle(){
        radius = 1;
    }

    public Circle(int r){
        radius = r;
    }

    // Methods - What the circle can do
    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
class Tri {
  public static void main(String[] args) {
  // Tri t = new Tri();
  // t=new 
  }

  private int side1, side2, side3;

  public Tri() {
    side1=1;
    side2=1;
    side3=1;
  }

  public Tri(int s1, int s2, int s3) {
    side1=s1;
    side2=s2;
    side3=s3;
  }

  public double getArea(){
    double temp = (side1 + side2 + side3) /2;
    double area = Math.sqrt(temp*(temp-side1)*(temp-side2)*(temp-side3));
    return area;
  }

}

public class Line {
  public Point startPoint;
  public Point endPoint;

  public Line(Point startPoint, Point endPoint) {
    this.startPoint = startPoint;
    this.endPoint = endPoint;
  }

  // ïžįđ ðī(ðĨð,ðĶð) , ðĩ(ðĨð,ðĶð) éãŪč·éĒ ðīðĩ ãŊðīðĩ=â(ðĨðâðĨð)^2+(ðĶðâðĶð)^2
  public double getLength() {
    return Math
        .sqrt(Math.pow(this.endPoint.x - this.startPoint.x, 2) + Math.pow(this.endPoint.y - this.startPoint.y, 2));
  }
}

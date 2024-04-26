public class Test extends Terminal {
    public static void main(String[]args){
        shape[]shapes=new shape[]{
            new Square(5),
            new Rectangle(6, 4),
            new Circle(3),
            new elipse(5, 3),
            new triangle(3, 4,5 ),
            new Square(7),
            new Rectangle(8, 2),
            new Circle(4),
            new elipse(6, 2),
            new triangle(7, 8, 10),
            new Square(10),
            new Rectangle(9, 3),
            new Circle(5),
            new elipse(7, 4),
            new triangle(6, 7, 8)
        };
        float AreaTotal=0;
        float PerimetroTotal=0;
        for(shape shape: shapes){
            AreaTotal+=shape.getArea();
            PerimetroTotal+=shape.getPerimetro();
            Console.writeLine(shape.getArea());
            Console.writeLine(shape.getPerimetro());
            System.out.println();
        }
        printLine("Area total= %.2f, perimetro total=%.2f", AreaTotal,PerimetroTotal);
    } 
}

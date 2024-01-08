package TD3.EXO6;
import java.util.ArrayList;
public class TestFigure {
    public void test() {
        Disque disque1 = new Disque();
        Disque disque2 = new Disque(new double[]{2, 6}, 4, " Disque3");
        Rectangle rectangle1 = new Rectangle(4, 2);
        Rectangle rectangle2 = new Rectangle(5, 8, "Rectangle2");

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(disque1);
        figures.add(disque2);
        figures.add(rectangle1);
        figures.add(rectangle2);

        for (Figure figure : figures) {
            System.out.println(figure.toString() + " Le Périmètre est : " + figure.getPerimeter() + ", L'Aire est : " + figure.getArea());
        }
}}

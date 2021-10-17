package collections.task02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Square square01 = new Square(150);
        Square square02 = new Square(60);
        Square square03 = new Square(270);
        Square square04 = new Square(80);
        Rectangle rectangle01 = new Rectangle(10,50);
        Rectangle rectangle02 = new Rectangle(20,60);
        Rectangle rectangle03 = new Rectangle(30,70);
        Rectangle rectangle04 = new Rectangle(40,80);

        Set<Figure> figuresLinkedHashSet = new LinkedHashSet<>();
        figuresLinkedHashSet.add(rectangle02);
        figuresLinkedHashSet.add(square03);
        figuresLinkedHashSet.add(rectangle04);
        figuresLinkedHashSet.add(square04);
        figuresLinkedHashSet.add(rectangle01);
        figuresLinkedHashSet.add(square01);
        figuresLinkedHashSet.add(rectangle03);
        figuresLinkedHashSet.add(square02);

        System.out.println(figuresLinkedHashSet);

        Set<Figure> figuresHashSet = new HashSet<>();
        figuresHashSet.add(rectangle02);
        figuresHashSet.add(square03);
        figuresHashSet.add(rectangle04);
        figuresHashSet.add(square04);
        figuresHashSet.add(rectangle01);
        figuresHashSet.add(square01);
        figuresHashSet.add(rectangle03);
        figuresHashSet.add(square02);

        System.out.println(figuresHashSet);

        Set<Figure> figuresTreeSet = new TreeSet<>();
        figuresTreeSet.add(rectangle02);
        figuresTreeSet.add(square03);
        figuresTreeSet.add(rectangle04);
        figuresTreeSet.add(square04);
        figuresTreeSet.add(rectangle01);
        figuresTreeSet.add(square01);
        figuresTreeSet.add(rectangle03);
        figuresTreeSet.add(square02);

        System.out.println(figuresTreeSet);
    }
}

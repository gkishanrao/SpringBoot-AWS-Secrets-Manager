package com.nirwantech.springboot_aws_secrets_manager.Util;



public class Sealed {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        System.out.println("Shape 1: " + shape1.type());
        System.out.println("Shape 2: " + shape2.type());
    }
}

// Sealed class - restricts who can extend it
sealed class Shape permits Circle, Square {
    public String type() {
        return "Generic Shape";
    }
}

// Only these final classes can extend Shape
final class Circle extends Shape {
    @Override
    public String type() {
        return "Circle";
    }
}

final class Square extends Shape {
    @Override
    public String type() {
        return "Square";
    }
}

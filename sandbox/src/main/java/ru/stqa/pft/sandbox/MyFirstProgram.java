package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Stanislav");
    double l = 5;
    System.out.println("Площадь квардрата со стороной " + l + " = "+ area (l));
    double a = 4;
    double b = 5;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area (a, b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }
  public static double area (double l){
    return l * l;
  }
  public static double area (double a, double b) {
    return a * b;

  }
}

//String somebody = "world";
//System.out.println("Hello, " + somebody + "!");

//double l = 8.1; //Число двойной точности
//double s = l * l;
//System.out.println("Площадь квадрата со стороной " + l + " = " + s);


//int l = 8;//переменная
//int s = l * l;//синоним для вычесленного значения


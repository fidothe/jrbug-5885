package io.werkstatt.jrbug;

public class ExampleConcrete extends ExampleAbstract {
  public static void main(String[] args) {
    new ExampleConcrete().hello();
  }
  
  public void hello() {
    System.out.println("Hello, World");
  }
}
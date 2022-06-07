package Car;

public class Car {
    private String brand;
    private String color;

    public Car setColor(String color){
        this.color = color;
        return this;
    }
    public Car setBrand(String brand){
        this.brand = brand;
        return this;
    }
    void showCar(){
        System.out.println("The car is: " + brand + " " + color);
    }
    public static void main(String[] args){

        new Car().setBrand("Mercedes").setColor("Black").showCar();
    }
}

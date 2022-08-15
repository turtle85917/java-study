class Parent {
    private int a = 20;
    public int b = 10;
}

class Child extends Parent {
    public int c = 30;
    void display() {
        System.out.println(b);
        System.out.println(c);
    }
}

class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    private int currentSpeed;
    private int accelerationTime;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    Car() {
        this("아반떼", 2016, "흰색", 200);
    }

    public void accelerate(int speed, int second) {
        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
    }

    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class Class {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.getModel());
        myCar.accelerate(60, 3);

        Child ch = new Child();
        ch.display();
    }
}
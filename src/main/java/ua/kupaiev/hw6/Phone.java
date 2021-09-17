package ua.kupaiev.hw6;

public class Phone {
    public String number;
    public String model;
    public int weight;

    public void receiveCall(String name) {
        System.out.println("Звонит: "+ name);
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }

    public String getNumber() {
        return number;
    }
}

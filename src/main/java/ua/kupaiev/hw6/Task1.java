package ua.kupaiev.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        Phone xiaomi = new Phone();
        Phone huawey = new Phone("+35434384" , "v40",259);
        iphone.number = "+546645546";
        iphone.model = "12";
        iphone.weight = 250;
        System.out.println(iphone.getNumber() + " "+iphone.weight +" "+ iphone.model);
        xiaomi.model = "Mi11";
        xiaomi.receiveCall("Nikita");
    }
}

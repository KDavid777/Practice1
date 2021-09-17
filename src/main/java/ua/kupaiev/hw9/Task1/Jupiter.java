package ua.kupaiev.hw9.Task1;

import java.util.Objects;

public class Jupiter implements Planet {
    protected boolean water = false;
    protected boolean oxygen = false;
    double accelerationOfGravity = 24.79;

    public void weight() {
        int weight = 1900;
    }


    public void age() {
        System.out.println("4,5682±0,0006 млрд лет ");
    }

    public void averageTemperature() {
        System.out.println("Температура планеты Юпитер : -110°C ");
    }

    public boolean isWater(){
        return water;
    }
    public boolean isOxygen(){
        return oxygen;
    }

    @Override
    public double getAccelerationOfGravity() {
        return accelerationOfGravity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jupiter jupiter = (Jupiter) o;
        return water == jupiter.water && oxygen == jupiter.oxygen && Double.compare(jupiter.accelerationOfGravity, accelerationOfGravity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, oxygen, accelerationOfGravity);
    }
}

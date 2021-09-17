package ua.kupaiev.hw9.Task1;

import java.util.Objects;

public class Earth implements Planet {
    protected boolean water = true;
    protected boolean oxygen = true;
    double accelerationOfGravity = 9.8;

    public void weight () {
        int weight = 59;
        System.out.println(weight);
    }

    public void age() {
        System.out.println("4,5682±0,0006 млрд лет ");
    }

    public void averageTemperature() {
        System.out.println("Температура планеты Земля : +15°C ");
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
        Earth earth = (Earth) o;
        return water == earth.water && oxygen == earth.oxygen
                && Double.compare(earth.accelerationOfGravity, accelerationOfGravity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, oxygen, accelerationOfGravity);
    }
}

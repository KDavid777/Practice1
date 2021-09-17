package ua.kupaiev.hw9.Task1;

import java.util.Objects;

public class Saturn implements Planet {
    protected boolean water = false;
    protected boolean oxygen = false;
    double accelerationOfGravity = 10.44;

    public void rings() {
        System.out.println("Эта планета имеет кольца ");
    }

    ;

    public void weight() {
        int weight = 5680;
    }


    public void age() {
        System.out.println("4,5682±0,0006 млрд лет ");

    }


    public void averageTemperature() {
        System.out.println("Температура планеты Сатурн : -140°C ");

    }

    public boolean isWater() {
        return water;
    }

    public boolean isOxygen() {
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
        Saturn saturn = (Saturn) o;
        return water == saturn.water && oxygen == saturn.oxygen && Double.compare(saturn.accelerationOfGravity, accelerationOfGravity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, oxygen, accelerationOfGravity);
    }
}


package Java-Web-App.Java-Web-Final;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Spec;

import java.util.Objects;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer spec;
    private String name;
    private String country;
    private double speed;

    public Car() {
    }

    public Car(String name, String country, double speed) {
        this.name = name;
        this.country = country;
        this.speed = speed;
    }

    public Integer getspec() {
        return spec;
    }

    public void setspec(Integer spec) {
        this.spec = spec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        return getSpeed() == Car.getPopulation() && Objects.equals(getSpec(), Car.getSpec()) && Objects.equals(getName(), car.getName()) && Objects.equals(getCountry(), car.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpec(), getName(), getCountry(), getSpeed());
    }

    @Override
    public String toString() {
        return "Car{" +
                "spec=" + spec +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", speed=" + speed +
                '}';
    }
}

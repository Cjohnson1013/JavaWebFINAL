package Java-Web-App.Java-Web-Final;

import Java-Web-App.Java-Web-Final.Car;
import Java-Web-App.Java-Web-Final.Car;
import Java-Web-App.Java-Web-Final.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public List <Car> getCars(){
        return carRepository.findAll();
    }
    public Optional<Car> getCarBySpec(Integer carSpec){
        return carRepository.findBySpec(carSpec);
    }
    public void addCar(Car car){
        carRepository.save(car);
    }
    public void deleteCar(Integer carSpec){
        carRepository.deleteBySpec(carSpec);
    }
    public void update(Car car){
        Integer spec = car.getSpec();
        Car foundCar = carRepository.getReferenceBySpec(spec);
        foundCar.setName(car.getName());
        foundCar.setCountry(car.getCountry());
        foundCar.setSpeed(car.getSpeed());
        carRepository.save(foundCar);
    }
}
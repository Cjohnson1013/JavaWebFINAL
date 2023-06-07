package Java-Web-App.Java-Web-Final;

import Java-Web-App.Java-Web-Final.Car;
import package Java-Web-App.Java-Web-Final.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping
    public List<Car> allCars(){
        return carService.getCars();
    }
    @PostMapping
    public void saveCar(@RequestBody Car car){
        this.carService.addCar(car);
    }
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Integer id){
        this.carService.deleteCar(id);
    }
    //Create the PUT

}
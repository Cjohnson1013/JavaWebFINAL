package Java-Web-App.Java-Web-Final;

import package Java-Web-App.Java-Web-Final;.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
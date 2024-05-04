package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.factory.Vehicle;
import one.digitalinnovation.gof.factory.VehicleFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @GetMapping("/vehicle/{type}")
    public Vehicle getVehicle(@PathVariable String type) {
        return VehicleFactory.getVehicle(type);
    }
}

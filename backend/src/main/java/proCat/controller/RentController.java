package proCat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentController {

    @Autowired
    public RentController() {

    }
    @GetMapping("station/list")
    public ResponseEntity<String> getRentStationsList() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}

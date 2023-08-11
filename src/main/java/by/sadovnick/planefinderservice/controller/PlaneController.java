package by.sadovnick.planefinderservice.controller;

import by.sadovnick.planefinderservice.model.Aircraft;
import by.sadovnick.planefinderservice.service.PlaneFinderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/aircraft")
public class PlaneController {
    private final PlaneFinderService finderService;

    public PlaneController(PlaneFinderService finderService) {
        this.finderService = finderService;
    }

    @GetMapping
    public Iterable<Aircraft> getCurrentAircraft() throws IOException {
        return finderService.getAircraft();
    }
}

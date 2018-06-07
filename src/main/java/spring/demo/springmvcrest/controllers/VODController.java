package spring.demo.springmvcrest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring.demo.springmvcrest.domain.VOD;
import spring.demo.springmvcrest.services.VODService;

import java.util.List;

@RestController
@RequestMapping(VODController.BASE_URL)
public class VODController {

    public static final String BASE_URL = "/api/vod";

    private final VODService VODService;

    public VODController(spring.demo.springmvcrest.services.VODService VODService) {
        this.VODService = VODService;
    }

    @GetMapping
    List<VOD> getAllVOD() {
        return VODService.findAllVOD();
    }

    //Get VOD By ID
    @GetMapping("/{id}")
    public VOD getVODById(@PathVariable Long id) {
        return VODService.findVODById(id);
    }

    //Delete VOD By ID
    @DeleteMapping("{id}")
    public String deleteVODById(@PathVariable Long id) {
        return VODService.deleteVODById(id);
    }

    //Up VOD
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VOD saveVOD(@RequestBody VOD VOD) {
        return VODService.saveVOD(VOD);
    }

    //Edit VOD By ID
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String editVODById(@PathVariable Long id,@RequestBody VOD VOD) {
        return VODService.editVODById(id, VOD);
    }
}

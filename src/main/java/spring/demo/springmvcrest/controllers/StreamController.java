package spring.demo.springmvcrest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring.demo.springmvcrest.domain.Stream;
import spring.demo.springmvcrest.services.StreamService;

import java.util.List;

@RestController
@RequestMapping(StreamController.BASE_URL)
public class StreamController {

    public static final String BASE_URL = "/api/stream";

    private final StreamService StreamService;

    public StreamController(spring.demo.springmvcrest.services.StreamService StreamService) {
        this.StreamService = StreamService;
    }

    @GetMapping
    List<Stream> getAllStream() {
        return StreamService.findAllStream();
    }

    //Get Stream By ID
    @GetMapping("/{id}")
    public Stream getStreamById(@PathVariable Long id) {
        return StreamService.findStreamById(id);
    }

    //Delete Stream By ID
    @DeleteMapping("{id}")
    public String deleteStreamById(@PathVariable Long id) {
        return StreamService.deleteStreamById(id);
    }

    //Up Stream
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Stream saveStream(@RequestBody Stream Stream) {
        return StreamService.saveStream(Stream);
    }

    //Edit Stream By ID
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String editStreamById(@PathVariable Long id,@RequestBody Stream Stream) {
        return StreamService.editStreamById(id, Stream);
    }
}

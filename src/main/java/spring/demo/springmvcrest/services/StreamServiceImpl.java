package spring.demo.springmvcrest.services;

import org.springframework.stereotype.Service;
import spring.demo.springmvcrest.domain.Stream;
import spring.demo.springmvcrest.respositories.StreamRepository;

import java.util.Date;
import java.util.List;

@Service
public class StreamServiceImpl implements StreamService {

    private final StreamRepository StreamRepository;

    public StreamServiceImpl(spring.demo.springmvcrest.respositories.StreamRepository StreamRepository) {
        this.StreamRepository = StreamRepository;
    }

    @Override
    public Stream findStreamById(Long id) {
        return StreamRepository.findById(id).get();
    }

    @Override
    public List<Stream> findAllStream() {
        return StreamRepository.findAll();
    }

    @Override
    public String deleteStreamById(Long id) {
        Stream customer = StreamRepository.findById(id).get();
        if (customer != null) {
            StreamRepository.delete(customer);
            return "Success";
        }
        return "Not Found";
    }

    @Override
    public Stream saveStream(Stream Stream) {
        return StreamRepository.save(Stream);
    }

    @Override
    public String editStreamById(Long id, Stream Stream) {
        if (StreamRepository.existsById(id) != true) return "Not Found";
        Stream.setId(id);
        Stream.setDate_create(StreamRepository.getOne(id).getDate_create());
        Stream.setDate_update(new Date());
        StreamRepository.save(Stream);
        return "Success";
    }
}

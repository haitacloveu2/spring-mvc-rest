package spring.demo.springmvcrest.services;


import spring.demo.springmvcrest.domain.Stream;

import java.util.List;

public interface StreamService {
    Stream findStreamById(Long id);

    List<Stream> findAllStream();

    String deleteStreamById(Long id);

    Stream saveStream(Stream Stream);

    String editStreamById(Long id, Stream Stream);


}

package spring.demo.springmvcrest.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.demo.springmvcrest.domain.Stream;

public interface StreamRepository extends JpaRepository<Stream, Long> {
}

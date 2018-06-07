package spring.demo.springmvcrest.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.demo.springmvcrest.domain.VOD;

public interface VODRepository extends JpaRepository<VOD, Long> {
}

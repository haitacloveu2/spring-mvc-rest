package spring.demo.springmvcrest.services;

import spring.demo.springmvcrest.domain.VOD;

import java.util.List;

public interface VODService {
    VOD findVODById(Long id);

    List<VOD> findAllVOD();

    String deleteVODById(Long id);

    VOD saveVOD(VOD VOD);

    String editVODById(Long id, VOD VOD);

}

package spring.demo.springmvcrest.services;

import org.springframework.stereotype.Service;
import spring.demo.springmvcrest.domain.VOD;
import spring.demo.springmvcrest.respositories.VODRepository;

import java.util.Date;
import java.util.List;
@Service
public class VODServiceImpl implements VODService {

    private final VODRepository VODRepository;

    public VODServiceImpl(spring.demo.springmvcrest.respositories.VODRepository VODRepository) {
        this.VODRepository = VODRepository;
    }

    @Override
    public VOD findVODById(Long id) {
        return VODRepository.findById(id).get();
    }

    @Override
    public List<VOD> findAllVOD() {
        return VODRepository.findAll();
    }

    @Override
    public String deleteVODById(Long id) {
        VOD customer = VODRepository.findById(id).get();
        if (customer != null) {
            VODRepository.delete(customer);
            return "Success";
        }
        return "Not Found";
    }

    @Override
    public VOD saveVOD(VOD VOD) {
        return VODRepository.save(VOD);
    }

    @Override
    public String editVODById(Long id, VOD VOD) {
        if (VODRepository.existsById(id) != true) return "Not Found";
        VOD.setId(id);
        VOD.setDate_create(VODRepository.getOne(id).getDate_create());
        VOD.setDate_update(new Date());
        VODRepository.save(VOD);
        return "Success";
    }
}

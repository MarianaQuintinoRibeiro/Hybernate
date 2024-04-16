package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entities.Departamento;
import Repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	private final DepartamentoRepository departamentoRepository;
	
	@Autowired
    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    public Departamento saveDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public Departamento getDepartamentoById(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }

    public List<Departamento> getAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    public void deleteDepartamento(Long id) {
    	departamentoRepository.deleteById(id);
    }
}

}

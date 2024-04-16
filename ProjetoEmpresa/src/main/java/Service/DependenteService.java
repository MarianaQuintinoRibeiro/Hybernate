package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.DependenteRepository;

@Service
public class DependenteService {
	private final DependenteRepository dependenteRepository;
	
	@Autowired
    public DependenteService(DependenteRepository dependenteRepository) {
        this.dependenteRepository = dependenteRepository;
    }

    public Dependente saveDependente(Dependente dependente) {
        return dependenteRepository.save(dependente);
    }

    public Dependente getDependenteById(Long id) {
        return dependenteRepository.findById(id).orElse(null);
    }

    public List<Dependente> getAllDependentes() {
        return dependenteRepository.findAll();
    }

    public void deleteDependente(Long id) {
    	dependenteRepository.deleteById(id);
    }

}

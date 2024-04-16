package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entities.Departamento;
import Service.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	private final DepartamentoService departamentoService;
	
	@Autowired
    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @PostMapping
    public Departamento createProduct(@RequestBody Departamento departamento) {
        return departamentoService.saveDepartamento(departamento);
    }

    @GetMapping("/{id}")
    public Departamento getDepartamento(@PathVariable Long id) {
        return departamentoService.getDepartamentoById(id);
    }

    @GetMapping
    public List<Departamento> getAllDepartamentos() {
        return departamentoService.getAllDepartamentos();
    }

    @DeleteMapping("/{id}")
    public void deleteDepartamento(@PathVariable Long id) {
    	departamentoService.deleteDepartamento(id);
    }

}

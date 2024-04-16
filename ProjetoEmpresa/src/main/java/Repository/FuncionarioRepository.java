package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}

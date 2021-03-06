package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {

    @Query("select e from Turno e order by e.nomeTurno")
    List<Turno> findAllOrdenado();

}

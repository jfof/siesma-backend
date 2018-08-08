package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {

}
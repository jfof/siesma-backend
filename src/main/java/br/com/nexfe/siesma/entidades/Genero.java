package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { @NamedQuery(name="Genero.selectAll", query="select e from Genero e order by e.nomeGenero") } )
@Table(name = "GENERO")
public class Genero implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_GENERO")
	private Long idGenero;
	
	@Column(name = "NOME_GENERO")
	private String nomeGenero;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Aluno.class, mappedBy="genero")
	private List<Aluno> alunos;

}

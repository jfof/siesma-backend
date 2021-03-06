package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.AvaliacaoNotaDTO;
import br.com.nexfe.siesma.entidades.AvaliacaoNota;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AvaliacaoNotaMapper extends BaseMapper<AvaliacaoNota, AvaliacaoNotaDTO> {
}

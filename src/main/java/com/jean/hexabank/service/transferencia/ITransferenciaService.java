package com.jean.hexabank.service.transferencia;

import com.jean.hexabank.DTO.TransferenciaDTO;
import com.jean.hexabank.core.Transacao;

public interface ITransferenciaService {

    Transacao efetuarTransferencia(TransferenciaDTO dto);
}

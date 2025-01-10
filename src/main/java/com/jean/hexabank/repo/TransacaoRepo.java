package com.jean.hexabank.repo;

import com.jean.hexabank.entity.TransacaoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TransacaoRepo extends CrudRepository<TransacaoEntity, String> {
}

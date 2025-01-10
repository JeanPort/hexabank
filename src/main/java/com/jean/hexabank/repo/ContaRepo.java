package com.jean.hexabank.repo;

import com.jean.hexabank.entity.ContaEntity;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepo extends CrudRepository<ContaEntity, Integer> {
}

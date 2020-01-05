package com.irfncr.tacocloud.repositories;

import com.irfncr.tacocloud.models.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {
}

package com.irfncr.tacocloud.repositories;

import com.irfncr.tacocloud.models.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}


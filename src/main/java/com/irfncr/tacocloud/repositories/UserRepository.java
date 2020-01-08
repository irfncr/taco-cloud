package com.irfncr.tacocloud.repositories;

import com.irfncr.tacocloud.models.WebsiteUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<WebsiteUser, Long> {
    WebsiteUser findByUsername(String username);
}

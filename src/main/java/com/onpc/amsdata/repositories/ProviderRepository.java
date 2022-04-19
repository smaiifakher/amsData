package com.onpc.amsdata.repositories;

import com.onpc.amsdata.entities.Provider;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProviderRepository extends CrudRepository<Provider, Long> {
}


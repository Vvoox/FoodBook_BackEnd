package com.example.foodbook.Repositories;

import com.example.foodbook.Modules.Location;
import com.example.foodbook.Modules.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LocationRepository extends JpaRepository<Location,Long> {
}

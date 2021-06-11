package com.example.foodbook.Repositories;

import com.example.foodbook.Modules.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}

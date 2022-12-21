package com.example.apiregion.repository;


import com.example.apiregion.modele.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region,Long> {
}

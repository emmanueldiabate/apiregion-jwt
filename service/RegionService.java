package com.example.apiregion.service;

import com.example.apiregion.modele.Region;

import java.util.List;

public interface RegionService {
    Region creer(Region region);
    List<Region> Lire();
    Region modifier(Long idRegion, Region region);
    String supprimer(Long idRegion);
}

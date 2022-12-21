package com.example.apiregion.controller;

import com.example.apiregion.modele.Pays;
import com.example.apiregion.modele.Population;
import com.example.apiregion.service.PaysService;
import com.example.apiregion.service.PopulationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/population")
@AllArgsConstructor
@Api(value = "hello", description = "Sample hello world application")
public class PopulationController {
    private final PopulationService populationService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/ajouter")
    public Population create(@RequestBody Population population){
        return populationService.Ajouter(population);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read")
    public List<Population> read(){
        return populationService.Lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{idPopulation}")
    public Population update(@PathVariable Long idPopulation, @RequestBody Population population){
        return populationService.modifier(idPopulation, population);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{idPopulation}")
    public String delete(@PathVariable Long idPopulation){
        return populationService.supprimer(idPopulation);
    }
}

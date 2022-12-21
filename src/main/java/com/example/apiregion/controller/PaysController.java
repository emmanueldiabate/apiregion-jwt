package com.example.apiregion.controller;

import com.example.apiregion.modele.Pays;
import com.example.apiregion.modele.Region;
import com.example.apiregion.service.PaysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pays")
@AllArgsConstructor
@Api(value = "hello", description = "Sample hello world application")
public class PaysController {
    private final PaysService paysService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/ajouter")
    public Pays create(@RequestBody Pays pays){
        return paysService.Ajouter(pays);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read")
    public List<Pays> read(){
        return paysService.Lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{idPays}")
    public Pays update(@PathVariable Long idPays, @RequestBody Pays pays){
        return paysService.modifier(idPays, pays);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{idPays}")
    public String delete(@PathVariable Long idPays){
        return paysService.supprimer(idPays);
    }
}

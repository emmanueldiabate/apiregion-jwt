package com.example.apiregion.controller;

import com.example.apiregion.modele.Region;
import com.example.apiregion.service.RegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regions")
@AllArgsConstructor
@Api(value = "hello", description = "Sample hello world application")
public class RegionController {
    private final RegionService regionService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/create")
    public Region create(@RequestBody Region region){
        return regionService.creer(region);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read")
    public List<Region> read(){
        return regionService.Lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{idRegion}")
    public Region update(@PathVariable Long idRegion, @RequestBody Region region){
        return regionService.modifier(idRegion, region);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{idRegion}")
    public String delete(@PathVariable Long idRegion){
        return regionService.supprimer(idRegion);
    }
}

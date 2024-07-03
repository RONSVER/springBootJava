package com.example.teaProject.controller;


import com.example.teaProject.model.Tea;
import com.example.teaProject.service.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/teas")
public class TeaController {

    @Autowired
    private TeaService teaService;

    @GetMapping
    public Set<Tea> getAll() {
        return teaService.getAll();
    }

    @GetMapping("/{uuid}")
    public Tea getById(@PathVariable String uuid) {
        return teaService.getById(uuid);
    }

    @PostMapping
    public Tea add(@RequestBody Tea tea) {
        return teaService.add(tea);
    }
}

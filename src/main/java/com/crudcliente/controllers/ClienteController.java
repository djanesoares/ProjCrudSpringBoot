package com.crudcliente.controllers;

import com.crudcliente.dto.ClienteDTO;
import com.crudcliente.entities.Cliente;
import com.crudcliente.repositories.ClienteRepository;
import com.crudcliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}

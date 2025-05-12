package com.crudcliente.services;

import com.crudcliente.dto.ClienteDTO;
import com.crudcliente.entities.Cliente;
import com.crudcliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id){
        Cliente cliente = repository.findById(id).get();
        return new ClienteDTO(cliente);
    }
}

package com.crudcliente.dto;

import com.crudcliente.entities.Cliente;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClienteDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo Requerido")
    private String name;
    @NotEmpty(message = "Dados obrigatório")
    private String cpf;
    @Positive(message = "valor deve ser positivo")
    private Double income;
    @PastOrPresent(message = "Data nascimento inválida")
    private LocalDate birthDate;
    private Integer children;

    public ClienteDTO(){
    }

    public ClienteDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClienteDTO(Cliente entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}

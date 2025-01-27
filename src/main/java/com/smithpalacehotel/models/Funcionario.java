package com.smithpalacehotel.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Funcionario extends Pessoa{
    @Builder
    public Funcionario(Integer id, String nome, String cpf, String login, String senha) {
        super(id, nome, cpf, login, senha);
        this.login = login;
        this.senha = senha;
    }
}

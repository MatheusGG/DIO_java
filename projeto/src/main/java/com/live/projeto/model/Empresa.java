package com.live.projeto.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
    @Id
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String bairro;
    private String estado;
    private String telefone;
}

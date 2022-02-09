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
public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}

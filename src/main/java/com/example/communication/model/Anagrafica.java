package com.example.communication.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "anagrafica")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
public class Anagrafica implements Serializable {
    @Id
    private Long idana;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="cognome", nullable = false)
    private String cognome;

    @Column(name = "date_create", nullable = false)
    private Date date_create;

    @Column(name = "date_agg", nullable = false)
    private Date date_agg;

}

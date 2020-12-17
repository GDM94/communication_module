package com.example.communication.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IndirizziBean {

    private Long idaddress;

    private Long idana;

    private String descrizione;

    private AnagraficaBean anagrafica;

}

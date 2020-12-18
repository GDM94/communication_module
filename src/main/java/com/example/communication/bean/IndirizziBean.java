package com.example.communication.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Getter
@Setter
@NoArgsConstructor
@RedisHash(value = "indirizzi")
public class IndirizziBean {
    @Id
    @Indexed
    private Long idaddress;

    private Long idana;

    private String descrizione;

    private AnagraficaBean anagrafica;

}

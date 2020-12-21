package com.example.communication.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@RedisHash(value = "anagrafica")
public class AnagraficaBean implements Serializable{
    @Id
    @Indexed
    private Long idana;

    private String nome;

    private String cognome;

}

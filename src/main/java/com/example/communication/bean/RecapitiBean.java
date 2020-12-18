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
@RedisHash(value = "recapiti")
public class RecapitiBean {
    @Id
    @Indexed
    private Long idreca;

    private Long idana;

    private String tipo_recapito;

    private String numero_recapito;

    private AnagraficaBean anagrafica;
}

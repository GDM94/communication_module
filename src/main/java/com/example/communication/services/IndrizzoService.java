package com.example.communication.services;


import com.example.communication.model.Indirizzo;

import java.util.Optional;

public interface IndrizzoService {

    public Optional<Indirizzo> indirizzoById(Long id);
    public Iterable<Indirizzo> indirizzoAll();
    public Indirizzo newIndirizzo(Long id, Long idana, String descrizione);
    public Optional<Indirizzo> updateIndirizzo(Long id, String descrizione);
    public boolean deleteIndirizzo(Long id);


}

package com.example.communication;

import com.example.communication.model.*;

public class CommunicationModuleApp {

    public static void main(String[] args) {
        Anagrafica anagrafica = getAnagrafica();
        Indirizzo indirizzo = getIndirizzo();
        RecapitiTelefonici recapitiTelefonici = getRecapitiTelefonici();
        User user = getUser();
        Authority authority = getAuthority();
    }

    public static Anagrafica getAnagrafica(){
        return new Anagrafica();
    }

    public static Indirizzo getIndirizzo(){
        return new Indirizzo();
    }

    public static RecapitiTelefonici getRecapitiTelefonici(){
        return new RecapitiTelefonici();
    }

    public static User getUser(){
        return new User();
    }

    public static Authority getAuthority(){
        return new Authority();
    }

}

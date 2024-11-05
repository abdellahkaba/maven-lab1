package com.isi.maven.services.imp;

import com.isi.maven.services.Icommande;
import org.springframework.stereotype.Service;

@Service
public class CommandeImpl implements Icommande {
    @Override
    public String getCommande() {
        return "Commande de vehicules " ;
    }
}

package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Agence;
import java.util.List;

public interface IAgence {
    Agence addAgence(Agence agence);
    Agence updateAgence(Agence agence);
    void deleteAgence(Long idAgence);
    List<Agence> getAllAgences();
    Agence getAgenceById(Long idAgence);
}

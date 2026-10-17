package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Contrat;
import java.util.List;

public interface IContrat {
    Contrat addContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    void deleteContrat(Long idContrat);
    List<Contrat> getAllContrats();
    Contrat getContratById(Long idContrat);
}

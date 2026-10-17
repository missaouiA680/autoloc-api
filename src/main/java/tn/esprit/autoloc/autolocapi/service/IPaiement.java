package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Paiement;
import java.util.List;

public interface IPaiement {
    Paiement addPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long idPaiement);
    List<Paiement> getAllPaiements();
    Paiement getPaiementById(Long idPaiement);
}

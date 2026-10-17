package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import java.util.List;

public interface IVehicule {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long idVehicule);
    List<Vehicule> getAllVehicules();
    Vehicule getVehiculeById(Long idVehicule);
}

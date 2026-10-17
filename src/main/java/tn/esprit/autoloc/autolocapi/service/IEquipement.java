package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Equipement;
import java.util.List;

public interface IEquipement {
    Equipement addEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(Long idEquipement);
    List<Equipement> getAllEquipements();
    Equipement getEquipementById(Long idEquipement);
}

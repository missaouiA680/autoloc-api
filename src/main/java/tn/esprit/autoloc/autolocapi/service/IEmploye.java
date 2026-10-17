package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Employe;
import java.util.List;

public interface IEmploye {
    Employe addEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(Long idEmploye);
    List<Employe> getAllEmployes();
    Employe getEmployeById(Long idEmploye);
}

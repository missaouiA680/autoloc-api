package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Maintenance;
import java.util.List;

public interface IMaintenance {
    Maintenance addMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long idMaintenance);
    List<Maintenance> getAllMaintenances();
    Maintenance getMaintenanceById(Long idMaintenance);
}

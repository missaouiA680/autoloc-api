package tn.esprit.autoloc.autolocapi.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "equipement")
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    @Column(nullable = false, length = 100)
    private String libelle;

    public Equipement() {}

    public Equipement(Long idEquipement, String libelle) {
        this.idEquipement = idEquipement;
        this.libelle = libelle;
    }

    public Long getIdEquipement() { return idEquipement; }
    public void setIdEquipement(Long idEquipement) { this.idEquipement = idEquipement; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}

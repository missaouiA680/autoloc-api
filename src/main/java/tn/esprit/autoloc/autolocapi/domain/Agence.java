package tn.esprit.autoloc.autolocapi.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "agence")
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, length = 100)
    private String ville;

    @Column(nullable = false, length = 255)
    private String adresse;

    @Column(length = 20)
    private String telephone;

    public Agence() {}

    public Agence(Long idAgence, String nom, String ville, String adresse, String telephone) {
        this.idAgence = idAgence;
        this.nom = nom;
        this.ville = ville;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Long getIdAgence() { return idAgence; }
    public void setIdAgence(Long idAgence) { this.idAgence = idAgence; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
}

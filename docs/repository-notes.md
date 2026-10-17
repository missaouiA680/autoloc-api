# Atelier 3 — Notes sur la couche Repository

## Choix des interfaces Spring Data JPA

| Interface | Étend | Justification |
|---|---|---|
| IAgenceRepository | JpaRepository<Agence, Long> | CRUD complet, findAll renvoie une List, saveAndFlush disponible |
| IClientRepository | JpaRepository<Client, Long> | CRUD complet, recherche par email possible via méthodes dérivées |
| IVehiculeRepository | JpaRepository<Vehicule, Long> | CRUD complet, pagination et tri pour liste de véhicules |
| IEmployeRepository | JpaRepository<Employe, Long> | CRUD complet, filtrage par rôle possible |
| IEquipementRepository | JpaRepository<Equipement, Long> | CRUD complet, liste d'équipements |
| IReservationRepository | JpaRepository<Reservation, Long> | CRUD complet, tri par date et pagination |
| IContratRepository | JpaRepository<Contrat, Long> | CRUD complet, findAll renvoie une List, saveAndFlush disponible |
| IPaiementRepository | JpaRepository<Paiement, Long> | Lecture des paiements (création via Contrat uniquement) |
| IMaintenanceRepository | JpaRepository<Maintenance, Long> | CRUD complet, suivi des maintenances par véhicule |

> **Pourquoi JpaRepository pour tous ?**  
> JpaRepository réunit ListCrudRepository + ListPagingAndSortingRepository + flush/saveAndFlush.  
> C'est le choix retenu pour AutoLoc : CRUD, listes (List), tri, pagination et flush en une seule interface.

---

## Anomalies détectées par SonarQube for IDE (SonarLint)

| Anomalie | Règle / explication | Correction apportée |
|---|---|---|
| `@Data` sur des entités JPA | `@Data` génère `equals/hashCode/toString` basés sur tous les champs, ce qui provoque des boucles infinies avec les associations bidirectionnelles | Remplacé par `@Getter/@Setter/@NoArgsConstructor/@AllArgsConstructor` ciblés sur toutes les entités |
| Import `jakarta.persistence.*` (wildcard import) | Les imports génériques (`*`) réduisent la lisibilité et importent des classes inutiles — règle SonarQube java:S2208 | Remplacé par des imports spécifiques (`@Entity`, `@Table`, `@Id`…) |
| Champ `serialVersionUID` manquant sur les entités | Les entités JPA sont sérialisables ; l'absence de `serialVersionUID` peut causer des problèmes de compatibilité — règle java:S2057 | Ajout de `private static final long serialVersionUID = 1L` ou suppression de l'implémentation de `Serializable` si non nécessaire |

---

## Hiérarchie des interfaces Spring Data JPA (rappel)

```
Repository<T, ID>                  ← interface marqueur, aucune méthode
├── CrudRepository<T, ID>          ← CRUD de base (Iterable)
│   └── ListCrudRepository<T, ID>  ← CRUD avec List
└── PagingAndSortingRepository     ← tri et pagination (Iterable)
    └── ListPagingAndSortingRepository ← tri et pagination avec List

JpaRepository<T, ID> = ListCrudRepository
                      + ListPagingAndSortingRepository
                      + QueryByExampleExecutor
                      + flush, saveAndFlush, getReferenceById, deleteAllInBatch
```

> **Important (Spring Data 3)** : `PagingAndSortingRepository` n'étend plus `CrudRepository`.  
> Pour avoir CRUD + pagination, utiliser `JpaRepository` qui les réunit déjà.

package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Reservation;
import java.util.List;

public interface IReservation {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long idReservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long idReservation);
}

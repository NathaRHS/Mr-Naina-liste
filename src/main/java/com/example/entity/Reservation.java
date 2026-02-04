package com.example.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservation")
    private Long idReservation;

    @Column(name = "dateHeureArrivee")
    private LocalDateTime dateHeureArrivee;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nombrePersonnes", nullable = false)
    private Integer nombrePersonnes;

    @Column(name = "idHotel", nullable = false)
    private Long idHotel;

    @Column(name = "isTreated", nullable = false)
    private Boolean isTreated;

    @Column(name = "isTreatedForVoiture", nullable = false)
    private Boolean isTreatedForVoiture;

    // getters/setters...
}

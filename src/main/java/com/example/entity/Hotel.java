package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel") 
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHotel") 
    private Long idHotel;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "distanceFromAeroport", nullable = false)
    private Integer distanceFromAeroport;

    @Column(name = "nom")
    private String nom;

    public Hotel() {}

    public Hotel(Long idHotel, String adresse, int distanceFromAeroport, String nom) {
        this.idHotel = idHotel;
        this.adresse = adresse;
        this.distanceFromAeroport = distanceFromAeroport;
        this.nom = nom;
    }

    public Long getIdHotel() { return idHotel; }
    public void setIdHotel(Long idHotel) { this.idHotel = idHotel; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public Integer getDistanceFromAeroport() { return distanceFromAeroport; }
    public void setDistanceFromAeroport(Integer distanceFromAeroport) { this.distanceFromAeroport = distanceFromAeroport; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}

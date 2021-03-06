package com.kehel.equiclient;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Client {
    private int IdClient;
    private String Nom,Prenom,Photo,IdentityNum,Email,MotPasse,Notes;
    private LocalDateTime DateNais,DateInscription,ValiditeAssurence;
    private int Telephone ;
    private boolean IsActive ;

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getIdentityNum() {
        return IdentityNum;
    }

    public void setIdentityNum(String identityNum) {
        IdentityNum = identityNum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMotPasse() {
        return MotPasse;
    }

    public void setMotPasse(String motPasse) {
        MotPasse = motPasse;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public LocalDateTime getDateNais() {
        return DateNais;
    }

    public void setDateNais(LocalDateTime dateNais) {
        DateNais = dateNais;
    }

    public LocalDateTime getDateInscription() {
        return DateInscription;
    }

    public void setDateInscription(LocalDateTime dateInscription) {
        DateInscription = dateInscription;
    }

    public LocalDateTime getValiditeAssurence() {
        return ValiditeAssurence;
    }

    public void setValiditeAssurence(LocalDateTime validiteAssurence) {
        ValiditeAssurence = validiteAssurence;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public Client(){}

    public Client(int idClient, String nom, String prenom, String photo, String identityNum, String email, String motPasse, String notes, LocalDateTime dateNais, LocalDateTime dateInscription, LocalDateTime validiteAssurence, int telephone, boolean isActive) {
        IdClient = idClient;
        Nom = nom;
        Prenom = prenom;
        Photo = photo;
        IdentityNum = identityNum;
        Email = email;
        MotPasse = motPasse;
        Notes = notes;
        DateNais = dateNais;
        DateInscription = dateInscription;
        ValiditeAssurence = validiteAssurence;
        Telephone = telephone;
        IsActive = isActive;
    }
    public Client(int idClient, String nom, String prenom) {
        IdClient = idClient;
        Nom = nom;
        Prenom = prenom;
        Photo = null;
        IdentityNum = null;
        Email = null;
        MotPasse = null;
        Notes = null;
        DateNais = null;
        DateInscription = null;
        ValiditeAssurence = null;
        Telephone = 0;
        IsActive = false;
    }

    @Override
    public String toString() {
        return Nom+" "+Prenom;
    }
}

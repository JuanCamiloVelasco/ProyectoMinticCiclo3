/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Retos.CicloTres.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="reservation")
public class Reservation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation", columnDefinition = "number")
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private Date status;

    //Relacion muchos a uno reservas - partyroom
    @ManyToOne
    @JoinColumn(name="partyroom")
    @JsonIgnoreProperties({"reservations","client"})
    private Partyroom partyroom;

    //Relacion muchos a uno mensajes - clientes
    @ManyToOne
    @JoinColumn(name="client")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;

    public Partyroom getPartyroom() {
        return partyroom;
    }

    public void setPartyroom(Partyroom partyroom) {
        this.partyroom = partyroom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public Date getStatus() {
        return status;
    }

    public void setStatus(Date status) {
        this.status = status;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

}


//package com.Retos.CicloTres.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name="reservation")
//public class Reservation implements Serializable{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="idReservation", columnDefinition = "number")
//    private Integer idReservation;
//    private Date startDate;
//    private Date devolutionDate;
//    private Date status;
//
//    //Relacion muchos a uno reservas - partyroom
//    @ManyToOne
//    @JoinColumn(name="partyroom")
//    @JsonIgnoreProperties({"reservations","client"})
//    private Partyroom partyroom;
//
//    //Relacion muchos a uno mensajes - clientes
//    @ManyToOne
//    @JoinColumn(name="client")
//    @JsonIgnoreProperties({"messages","reservations"})
//    private Client client;
//
//    public Partyroom getPartyroom() {
//        return partyroom;
//    }
//
//    public void setPartyroom(Partyroom partyroom) {
//        this.partyroom = partyroom;
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//    
//    public Date getStatus() {
//        return status;
//    }
//
//    public void setStatus(Date status) {
//        this.status = status;
//    }
//
//    public Integer getIdReservation() {
//        return idReservation;
//    }
//
//    public void setIdReservation(Integer idReservation) {
//        this.idReservation = idReservation;
//    }
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }
//
//    public Date getDevolutionDate() {
//        return devolutionDate;
//    }
//
//    public void setDevolutionDate(Date devolutionDate) {
//        this.devolutionDate = devolutionDate;
//    }
//
//}

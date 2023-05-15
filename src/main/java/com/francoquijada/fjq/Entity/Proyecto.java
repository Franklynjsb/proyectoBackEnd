package com.francoquijada.fjq.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String imgP;

    //Constructors

    public Proyecto() {
    }

    public Proyecto(String nombreE, String descripcionE, String imgP) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgP = imgP;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImg() {
        return imgP;
    }

    public void setImg(String imgP) {
        this.imgP = imgP;
    }
    
}

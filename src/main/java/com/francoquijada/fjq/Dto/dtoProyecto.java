package com.francoquijada.fjq.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imgP;

    //Constructor

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreE, String descripcionE, String imgP) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgP = imgP;
    }
    
    //Getter y Setters

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

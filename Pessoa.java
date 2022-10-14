package com.example.cadastro;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private Integer mat;
    private String nom;
    private String cid;
    private String est;

    public Pessoa() {
    }

    public int getMat() {

        return mat;
    }

    public void setMat(int mat) {

        this.mat = mat;
    }

    public String getNom() {

        return nom;
    }

    public void setNome(String nom) {

        this.nom = nom;
    }

    public String getCid() {

        return cid;
    }

    public void setCid(String cid) {

        this.cid = cid;
    }

    public String getEst() {

        return est;
    }

    public void setEst(String est) {

        this.est = est;
    }
}

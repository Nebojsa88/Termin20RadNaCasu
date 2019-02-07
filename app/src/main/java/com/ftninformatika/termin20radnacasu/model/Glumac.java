package com.ftninformatika.termin20radnacasu.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Glumac {


    private int id;
    private String ime;
    private String prezime;
    private String biografija;
    private String filmoviUkojimaJeigrao;
    private String imageString;
    private float ocena;
    private Date datumRodjenja;
    private Date datumSmrti;


    public Glumac(){

    }
    public Glumac(int id, String ime, String prezime, String biografija, String filmoviUkojimaJeigrao, String imageString, float ocena, Date datumRodjenja, Date datumSmrti){
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.filmoviUkojimaJeigrao = filmoviUkojimaJeigrao;
        this.imageString = imageString;
        this.ocena = ocena;
        this.datumRodjenja = datumRodjenja;
        this.datumSmrti = datumSmrti;

    }

    public Glumac(int id, String ime, String prezime, String biografija, String filmoviUkojimaJeigrao, String imageString, float ocena, Date datumRodjenja) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.filmoviUkojimaJeigrao = filmoviUkojimaJeigrao;
        this.imageString = imageString;
        this.ocena = ocena;
        this.datumRodjenja = datumRodjenja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getFilmoviUkojimaJeigrao() {
        return filmoviUkojimaJeigrao;
    }

    public void setFilmoviUkojimaJeigrao(String filmoviUkojimaJeigrao) {
        this.filmoviUkojimaJeigrao = filmoviUkojimaJeigrao;
    }

    public String getImageString() {
        return imageString;
    }

    public void setImageString(String imageString) {
        this.imageString = imageString;
    }

    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(Date datumSmrti) {
        this.datumSmrti = datumSmrti;
    }

    public String getDatumAsString(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM. DD. yyyy", Locale.US);
        return sdf.format(datumRodjenja);
    }

    @Override
    public String toString() {
        return "Glumac{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", biografija='" + biografija + '\'' +
                ", filmoviUkojimaJeigrao='" + filmoviUkojimaJeigrao + '\'' +
                ", imageString='" + imageString + '\'' +
                ", ocena=" + ocena +
                ", datumRodjenja=" + datumRodjenja +
                ", datumSmrti=" + datumSmrti +
                '}';
    }
}

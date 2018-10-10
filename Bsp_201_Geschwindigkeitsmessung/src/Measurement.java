
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pascal
 */
public class Measurement {

    private LocalDate date;
    private LocalTime time;
    private String kennzeichen;
    private double gemessen;
    private double erlaubt;
    private double uebertretung;

    public Measurement(LocalDate date, LocalTime time, String kennzeichen, double gemessen, double erlaubt, double uebertretung) {
        this.date = date;
        this.time = time;
        this.kennzeichen = kennzeichen;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
        this.uebertretung = uebertretung;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public double getGemessen() {
        return gemessen;
    }

    public void setGemessen(double gemessen) {
        this.gemessen = gemessen;
    }

    public double getErlaubt() {
        return erlaubt;
    }

    public void setErlaubt(double erlaubt) {
        this.erlaubt = erlaubt;
    }

    public double getUebertretung() {
        return uebertretung;
    }

    public void setUebertretung(double uebertretung) {
        this.uebertretung = uebertretung;
    }

}

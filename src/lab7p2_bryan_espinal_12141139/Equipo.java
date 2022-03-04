/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_bryan_espinal_12141139;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Equipo {
    String nombre;
    int parjuga;
    int pargana;
    int parempa;
    int parperdi;
    int golesfabor;
    int golescontra;
    int diferencia;
    int pts;
    public Equipo(String nombre, int parjuga, int pargana, int parempa, int parperdi, int golesfabor, int golescontra, int diferencia, int pts) {
        this.nombre = nombre;
        this.parjuga = parjuga;
        this.pargana = pargana;
        this.parempa = parempa;
        this.parperdi = parperdi;
        this.golesfabor = golesfabor;
        this.golescontra = golescontra;
        this.diferencia = diferencia;
        this.pts = pts;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParjuga() {
        return parjuga;
    }

    public void setParjuga(int parjuga) {
        this.parjuga = parjuga;
    }

    public int getPargana() {
        return pargana;
    }

    public void setPargana(int pargana) {
        this.pargana = pargana;
    }

    public int getParempa() {
        return parempa;
    }

    public void setParempa(int parempa) {
        this.parempa = parempa;
    }

    public int getParperdi() {
        return parperdi;
    }

    public void setParperdi(int parperdi) {
        this.parperdi = parperdi;
    }

    public int getGolesfabor() {
        return golesfabor;
    }

    public void setGolesfabor(int golesfabor) {
        this.golesfabor = golesfabor;
    }

    public int getGolescontra() {
        return golescontra;
    }

    public void setGolescontra(int golescontra) {
        this.golescontra = golescontra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }
    @Override
    public String toString() {
        return  nombre;
    }
        //metodos de administracion
    
}

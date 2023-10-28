/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecicio4poo1;

/**
 *
 * @author carlo
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellidos;
    private double pension;
    private String ciclo;  // Nuevo atributo

    public Estudiante(int codigo, String nombre, int codigo2, double pension) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pension = pension;
        this.ciclo = ciclo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Pensión: " + pension + ", Ciclo: " + ciclo;
    }
}

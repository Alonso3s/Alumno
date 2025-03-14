/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanauno;

/**
 *
 * @author estra
 */
public class Alumno {
    private String id;
    private String name;
    private String carrera;
    private String edad;
    private String genero;

    public Alumno() {
    }

    public Alumno(String id, String name, String carrera, String edad, String genero) {
        this.id = id;
        this.name = name;
        this.carrera = carrera;
        this.edad = edad;
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", name=" + name + ", carrera=" + carrera + ", edad=" + edad + ", genero=" + genero + '}';
    }
    
    
    
    
}

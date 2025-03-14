/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanauno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author estra
 */
public class Crud {
    ArrayList<Alumno> alum = new ArrayList<>();
    Alumno alumno = new Alumno();
    Scanner entrada = new Scanner(System.in);
    
    public void precargaAlumnos(){
    
    alum.add(new Alumno("222", "jorge", "ie", "20", "f"));
    alum.add(new Alumno("333", "alonso", "ie", "20", "f"));
    alum.add(new Alumno("444", "michael", "ie", "20", "f"));
    alum.add(new Alumno("111", "reiko", "ie", "20", "f"));
    }
    
    public void crearAlumno(){

            
         System.out.println("Ingrese el id del alumno: ");
         String id= entrada.nextLine();
         
         System.out.println("Ingrese el nombre del alumno: ");
         String name = entrada.nextLine();
    
         System.out.println("Ingrese la carrera del alumno: ");
         String carrera = entrada.nextLine();
         
         System.out.println("Ingrese la edad del alumno: ");
         String edad = entrada.nextLine();
         
         System.out.println("Ingrese el genero del alumno: ");
         String genero = entrada.nextLine();
            
         alum.add(new Alumno(id, name, carrera, edad, genero));
  
    }
    public void mostrarAlumnos(){
        for (Alumno al: alum) {
            System.out.println(al);
        }
}
    public void encotrarAlumno(){
        boolean encontrado = false;
    System.out.println("Ingrese el id a buscar");
    String id = entrada.nextLine();
    for (Alumno al: alum) {
         if (id.equals(al.getId())) {
            encontrado= true;
            System.out.println(al);
            break;
         }
    }
         if (!encontrado) {
          System.out.println("Id no existe");
             
         }
        
         }
        
 
    
    public void eliminarAlumnos(){

    }
}

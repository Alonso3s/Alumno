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

    public void menu(){
                         int op=0;
                 boolean validacion= false;
                 while(!validacion){
                   System.out.println("-------- MENÚ -------");  
           System.out.println("Indique con un numero su acción");   
                 System.out.println("1. Registar alumno"); 
                 System.out.println("2. Mostrar alumnos registrados"); 
                 System.out.println("3. Modificar dato/s de un alumno"); 
                 System.out.println("4. Eliminra registro de alumno"); 
                 System.out.println("5. Salir del programa");
                 op=entrada.nextLine();
                 if(op==1 || op==2 || op==3 || op==4 || op==5){
                     validacion= true;
                 }else{
                   System.out.println("Entrada invalida");  
                 }
                 }
        switch (op) { 
            case 1:
                 crearAlumno();
             break;
            case 2:
                 mostrarAlumnos();
             break;
            case 3 :
                 modificarAlumno();
             break;
             case 4 :
                 eliminarAlumno();
             break;
             case 5 :
                 exit(0);
             break;
            default:
                 System.out.println("Entrada invalida"); 
          }
         }
    }
    
    public void precargaAlumnos(){
    
    alum.add(new Alumno("222", "jorge", "ie", "21", "f"));
    alum.add(new Alumno("333", "alonso", "ie", "21", "f"));
    alum.add(new Alumno("444", "michael", "ie", "36", "f"));
    alum.add(new Alumno("111", "reiko", "ie", "19", "f"));
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
   /* public void encotrarAlumno(){
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
        
         }*/
        
 
    
    public void eliminarAlumnos(){
    boolean encontrado = false;
    System.out.println("Ingrese el id a buscar");
    String id = entrada.nextLine();
    for (Alumno al: alum) {
         if (id.equals(al.getId())) {
            encontrado= true;
            Alumno.remove(alum);
             System.out.println("Alumno eliminado con exito");
            break;
         }
    }
         if (!encontrado) {
          System.out.println("Id no existe");
             
         }
    }
    public void modificarAlumno(){
        boolean encontrado = false;
        System.out.println("Ingrese el id a buscar");
        String id = entrada.nextLine();
        for (Alumno al: alum) {
             if (id.equals(al.getId())) {
            encontrado= true;
                 int op=0;
                 boolean validacion= false;
                 while(!validacion){
           System.out.println("Indique con un numero la opcion del dato que desea modificar");   
                 System.out.println("1. Nombre"); 
                 System.out.println("2. Carrera"); 
                 System.out.println("3. Edad"); 
                 System.out.println("4. Genero"); 
                 System.out.println("5. Volver al menú");
                 op=entrada.nextLine();
                 if(op==1 || op==2 || op==3 || op==4 || op==5){
                     validacion= true;
                 }else{
                   System.out.println("Entrada invalida");  
                 }
                 }
        switch (op) { 
            case 1:
                 System.out.println("Ingrese el nombre del alumno: ");
                 al.setName(entrada.nextLine());
             break;
            case 2:
                 System.out.println("Ingrese la carrera del alumno: ");
                 al.setCarrera(entrada.nextLine());
             break;
            case 3 :
                 System.out.println("Ingrese la edad del alumno: ");
                 al.setEdad(entrada.nextLine());
             break;
             case 4 :
                 System.out.println("Ingrese el genero del alumno: ");
                 al.setGenero(entrada.nextLine());
             break;
             case 5 :
                 menu();
             break;
            default:
                 System.out.println("Entrada invalida"); 
          }
             System.out.println("Alumno modificado con exito");
            break;
         }
    }
         if (!encontrado) {
          System.out.println("Id no existe");
             
         }  
    }
}

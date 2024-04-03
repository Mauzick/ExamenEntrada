package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Desarrollador des1 = new Desarrollador();
        des1.setId(1);
        des1.setNombre("Desa1");
        des1.setDepartamento("Desarrollo");
        des1.setSalario(100);
        List<String> lengdesa1 = new ArrayList<String>();
        lengdesa1.add("php");
        lengdesa1.add("java");
        lengdesa1.add("python");
        des1.setLenguajes(lengdesa1);
        Desarrollador des2 = new Desarrollador();
        des2.setId(2);
        des2.setNombre("Desa2");
        des2.setDepartamento("Desarrollo");
        des2.setSalario(100);
        List<String> lengdesa2 = new ArrayList<String>();
        lengdesa2.add("php");
        lengdesa2.add("java");
        des2.setLenguajes(lengdesa2);
        Desarrollador des3 = new Desarrollador();
        des3.setId(3);
        des3.setNombre("Desa3");
        des3.setDepartamento("Desarrollo");
        des3.setSalario(50);
        List<String> lengdesa3 = new ArrayList<String>();
        lengdesa3.add("php");
        des3.setLenguajes(lengdesa3);
        Desarrollador des4 = new Desarrollador();
        des4.setId(4);
        des4.setNombre("Desa4");
        des4.setDepartamento("Desarrollo");
        des4.setSalario(100);
        List<String> lengdesa4 = new ArrayList<String>();
        lengdesa4.add("php");
        lengdesa4.add("java");
        lengdesa4.add("python");
        des4.setLenguajes(lengdesa4);
        Desarrollador des5 = new Desarrollador();
        des5.setId(5);
        des5.setNombre("Desa5");
        des5.setDepartamento("Desarrollo");
        des5.setSalario(100);
        List<String> lengdesa5 = new ArrayList<String>();
        lengdesa5.add("php");
        lengdesa5.add("java");
        des5.setLenguajes(lengdesa5);

        Gerente ger1 = new Gerente();
        ger1.setId(1);
        ger1.setNombre("Gere1");
        ger1.setDepartamento("Gerencia");
        ger1.setSalario(200);
        List<Empleado> dess = new ArrayList<>();
        dess.add(des1);
        dess.add(des2);
        dess.add(des3);
        ger1.setEquipo(dess);
        Gerente ger2 = new Gerente();
        ger2.setId(2);
        ger2.setNombre("Gere2");
        ger2.setDepartamento("Gerencia");
        ger2.setSalario(200);
        List<Empleado> dess2 = new ArrayList<>();
        dess2.add(des4);
        dess2.add(des5);
        ger2.setEquipo(dess2);

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(des1);
        empleados.add(des2);
        empleados.add(des3);
        empleados.add(des4);
        empleados.add(des5);
        empleados.add(ger1);
        empleados.add(ger2);

        for (Empleado emp: empleados){
            System.out.println(emp.mostrarDetalles());
            System.out.println(emp.calcularBono());
        }

        System.out.println(des1.evaluarDesempeno("Felicitaciones, su desempeno es: "));
    }
}
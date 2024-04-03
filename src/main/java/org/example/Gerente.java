package org.example;

import java.util.List;

public class Gerente extends Empleado{

    public List<Empleado> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Empleado> equipo) {
        this.equipo = equipo;
    }

    private List<Empleado> equipo;
    @Override
    public double calcularBono() {
        if (equipo.size() == 3){
            return getSalario();
        }else if (equipo.size() < 3 && equipo.size() > 0){
            return getSalario() * 0.5;
        }else{
            return 0;
        }
    }
    public String mostrarDetalles(){
        return super.mostrarDetalles().concat(", ").concat(equipo.toString());
    }
    public String mostrarDetalles(String id){
        return id.concat(equipo.toString());
    }
}

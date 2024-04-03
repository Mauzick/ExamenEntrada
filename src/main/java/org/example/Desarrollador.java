package org.example;

import java.util.List;

public class Desarrollador extends Empleado implements EvaluacionDesempeno{

    public List<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<String> lenguajes) {
        this.lenguajes = lenguajes;
    }


    private List<String> lenguajes;

    @Override
    public double calcularBono() {
        if (lenguajes.size() == 3){
            return getSalario();
        }else if (lenguajes.size() < 3 && lenguajes.size() > 0){
            return getSalario() * 0.5;
        }else{
            return 0;
        }
    }

    @Override
    public String evaluarDesempeno() {
        if (lenguajes.size() == 3){
            return "BUENO";
        }else if (lenguajes.size() < 3 && lenguajes.size() > 0){
            return "REGULAR";
        }else{
            return "NO HAY BONO SI SU DESEMPEÑO ES MALO";
        }
    }
    public String evaluarDesempeno(String mensajePrincipal){
        return mensajePrincipal.concat(". ").concat(evaluarDesempeno());
    }
    public String mostrarDetalles(){
        return super.mostrarDetalles().concat(", ").concat(lenguajes.toString());
    }
    public String mostrarDetalles(String id){
        return id.concat(lenguajes.toString());
    }
}

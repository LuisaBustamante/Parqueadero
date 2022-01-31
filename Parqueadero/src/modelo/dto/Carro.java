/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.util.Date;

/**
 *
 * @author luisa
 */
public class Carro {
    private String placa;
    private String tipo;
    private int horaLlegada;

    public Carro(String placa, int horaLlegada) {
        this.placa = placa;
        this.horaLlegada = horaLlegada;
        this.tipo = "Carro";
    }
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the caja to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the horaLlegada
     */
    public int getHoraLlegada() {
        return horaLlegada;
    }
    /**
     * @param horaLlegada the horaLlegada to set
     */
    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    public long getTiempoEnParqueadero(int horaSalida){
        int tiempoParqueadero = horaSalida - horaLlegada + 1;
        //long tiempoParqueadero = horaSalida.getTime() - horaLlegada.getTime();
        return tiempoParqueadero /(1000*60);
    }
     public boolean verificaPlaca( String placa ) {
        boolean tienePlaca = false;
        tienePlaca = this.placa.equalsIgnoreCase( placa );
        return tienePlaca;
    }
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


package modelo.dto;

/**
 *
 * @author luisa
 */
public class PuestoCarro {

    private Carro vehiculo;
    private String posicion;
    public PuestoCarro(String posicion){
        this.posicion = posicion;
        vehiculo = null;
    }
    public boolean estaOcupado( ){
        boolean ocupado = getVehiculo() != null;
        return ocupado;
    }
    public void parquearVehiculo( Carro vehiculo ){
        this.setVehiculo(vehiculo);
    }
    public void sacarVehiculo( ){
        setVehiculo(null);
    }
    public Carro getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Carro vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public boolean buscarPorPlaca( String placa ){
        boolean tieneCarro = true;
        if( vehiculo == null ){
            tieneCarro = false;
        }
        else tieneCarro = vehiculo.verificaPlaca(placa);
        return tieneCarro;
    }
}

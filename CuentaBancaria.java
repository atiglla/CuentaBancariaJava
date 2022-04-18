import java.util.ArrayList;
import java.util.Random;
public class CuentaBancaria {
    private double saldoCuenta;
    private double saldoAhorros;
    private String numerodecuenta;
    private static int cuentasCreadas=0;
    private static double cantidadTotal=0;
    private static ArrayList<String> numerosDeCuenta= new ArrayList<String>();

    public CuentaBancaria(){
        cuentasCreadas++;
        numerodecuenta=numeroCuenta();
    }

    public double getSaldoCuenta(){
        return saldoCuenta;
    }
    public double getSaldoAhorros(){
        return saldoAhorros;
    }

    public void depositarCuenta(double monto){
        saldoCuenta+=monto;
        cantidadTotal+=monto;
    }
    public void depositarAhorros(double monto){
        saldoAhorros+=monto;
        cantidadTotal+=monto;
    }

    public void retirarCuenta(double monto){
        if (monto<saldoCuenta){
            saldoCuenta-=monto;
            cantidadTotal-=monto;
        }else{
            System.out.println("No tienes suficiente dinero en la cuenta corriente");
        }
    }

    public void retirarAhorros(double monto){
        if (monto<saldoAhorros){
            saldoAhorros-=monto;
            cantidadTotal-=monto;
        }else{
            System.out.println("No tienes suficiente dinero en la cuenta de ahorros");
        }
    }

    public double saldototal(){
        return getSaldoCuenta()+getSaldoAhorros();
    }

    private String numeroCuenta(){

        String numeros="";

        for (int i = 0; i < 10; i++) {
            int numero=(int) (Math.random()*10);
            numeros+=numero;
        }

        if (numerosDeCuenta.contains(numeros)){
            numeroCuenta();
        }else{
            numerosDeCuenta.add(numeros);
        }
        return numeros;
        
    }

    @Override
    public String toString() {
        
        return ("Numero de Cuenta: "+numerodecuenta);
    }


}
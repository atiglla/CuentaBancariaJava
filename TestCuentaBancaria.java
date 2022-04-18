public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        CuentaBancaria cuenta3 = new CuentaBancaria();
        CuentaBancaria cuenta4 = new CuentaBancaria();


        cuenta3.depositarAhorros(2000);
        cuenta3.retirarAhorros(1000);

        System.out.println(cuenta3.getSaldoAhorros());


        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        System.out.println(cuenta4.toString());

        
    }
    
}

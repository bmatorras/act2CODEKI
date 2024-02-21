import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void crearCuenta() {
        System.out.println("Ingrese el número de cuenta:");
        this.numeroCuenta = getInt();
        System.out.println("Ingrese el DNI del cliente:");
        this.DNI = getInt();
        System.out.println("Ingrese el saldo inicial:");
        this.saldo = getInt();
    }

    private int getInt(){
        int numero = 0;
        boolean inputOk = false;
        Scanner sc = new Scanner(System.in);
        do {
            if(sc.hasNextInt()){
                numero = sc.nextInt();
                inputOk = true;
            }else{
                sc.nextLine();
            }

        } while(!inputOk);
        return numero;
    }

    public void ingresar() {
        System.out.println("Saldo a ingresar:");
        this.saldo += getInt();
    }

    public void retirar() {
        System.out.println("Saldo a retirar:");
        double retiro = getInt();
        if (retiro <= saldo) {
            this.saldo -= retiro;
        } else {
            this.saldo = 0;
        }
    }

    public void extraccionRapida() {
        double cantidadARetirar = saldo * 0.20;
        saldo -= cantidadARetirar;
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponible: $" + saldo);
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + DNI);
        System.out.println("Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        cuenta.ingresar();
        cuenta.consultarSaldo();

        cuenta.retirar();
        cuenta.consultarSaldo();
    }
}

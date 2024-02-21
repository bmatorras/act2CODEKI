import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    // Método constructor con todos los atributos pasados por parámetro
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método constructor sin los atributos pasados por parámetro
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // Métodos get y set
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Método para crearOperacion()
    public void crearOperacion() {

        System.out.println("Introduzca el primer número: ");
        numero1 = getInt();
        System.out.println("Introduzca el segundo número: ");
        numero2 = getInt();
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

    // Método para sumar los números
    public int sumar() {
        return numero1 + numero2;
    }

    // Método para restar los números
    public int restar() {
        return numero1 - numero2;
    }

    // Método para multiplicar los números
    public int multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: No se puede realizar la multiplicación por cero.");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    // Método para dividir los números
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede realizar la división por cero.");
            return 0;
        } else {
            return (double) numero1 / numero2;
        }
    }

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        System.out.println("La suma es: " + operacion.sumar());
        System.out.println("La resta es: " + operacion.restar());
        System.out.println("La multiplicación es: " + operacion.multiplicar());
        System.out.println("La división es: " + operacion.dividir());
    }
}
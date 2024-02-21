import java.util.Scanner;/*

Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de
formas geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a
repetir en las dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas,
que tendrá los métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
*/
public interface calculosFormas {
    public static final double PI = 3.1416;

    public double calcularArea();

    public double calcularPerimetro();
}

class Circulo implements calculosFormas{
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }
   @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}

class Rectangulo implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

//main


class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca el radio del círculo: ");
        int radio = getInt();
        Circulo circulo = new Circulo(radio);
        System.out.println("Área y perímetro del círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("Introduzca la base del rectángulo: ");
        int base = getInt();
        System.out.println("Introduzca la altura del rectángulo: ");
        int altura = getInt();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("\nÁrea y perímetro del rectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }
    private static int getInt(){
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
}
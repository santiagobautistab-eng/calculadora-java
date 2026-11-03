import java.util.ArrayList;

public class Calculadora {
    private ArrayList<String> historial = new ArrayList<>();
    private String[] operacionesDisponibles = {"Sumar", "Restar", "Multiplicar", "Dividir"};

    public Calculadora() {
    }

    // Getters
    public ArrayList<String> getHistorial() {
        return historial;
    }

    public String[] getOperacionesDisponibles() {
        return operacionesDisponibles;
    }
// Setters
public void setHistorial(ArrayList<String> historial) {
    this.historial = historial;
}

public void setOperacionesDisponibles(String[] operacionesDisponibles) {
    this.operacionesDisponibles = operacionesDisponibles;
}
    // Operaciones
    public double sumar(double a, double b) {
        double resultado = a + b;
        historial.add(a + " + " + b + " = " + resultado);
        return resultado;
    }

    public double restar(double a, double b) {
        double resultado = a - b;
        historial.add(a + " - " + b + " = " + resultado);
        return resultado;
    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        historial.add(a + " * " + b + " = " + resultado);
        return resultado;
    }

    public double dividir(double a, double b) throws DivisionPorCeroException {
        if (b == 0) {
            throw new DivisionPorCeroException("No se puede dividir entre cero.");
        }
        double resultado = a / b;
        historial.add(a + " / " + b + " = " + resultado);
        return resultado;
    }

    // Recorrido del arreglo
    public void mostrarOperacionesDisponibles() {
        System.out.print("Operaciones disponibles: ");
        for (int i = 0; i < operacionesDisponibles.length; i++) {
            System.out.print(operacionesDisponibles[i]);
            if (i < operacionesDisponibles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Recorrido de la lista
    public void mostrarHistorial() {
        System.out.println("----- HISTORIAL DE OPERACIONES -----");
        if (historial.isEmpty()) {
            System.out.println("No se realizaron operaciones.");
        } else {
            for (String operacion : historial) {
                System.out.println(operacion);
            }
        }
    }
} 
    


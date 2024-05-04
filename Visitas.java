package cl.praxis.miprimerjava.desafio5;

public class Visitas {


    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No se proporcionaron visitas diarias.");
            return;
        }

        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("El valor proporcionado no es un número válido: " + args[i]);
                return;
            }
        }

        double promedioVisitas = promedio(visitasDiarias);
        System.out.println("El promedio de visitas diarias es: " + promedioVisitas);
    }
    public static double promedio(int[] visitasDiarias) {
        int sumaVisitas = 0;
        for (int visita : visitasDiarias) {
            sumaVisitas += visita;
        }
        return (double) sumaVisitas / visitasDiarias.length;
    }
}

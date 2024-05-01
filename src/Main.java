import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Matrix, la mejor película del fin del milenio
                """;
        double mediaEvaluacionesUsuario = 0;

        System.out.println("Película : " + nombre);
        System.out.println("Fue lanzada en : " + fechaDeLanzamiento);
        System.out.println("En este momento está evaluada en : " + evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;

        System.out.println("La media de la evaluación es : " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluacion que le darias a " + nombre);
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario += notaMatrix;
            }
        System.out.println("La media de la pelicula " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionesUsuario / 3);
        }

}
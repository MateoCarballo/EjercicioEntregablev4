import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroAlumnos=0;


        System.out.println("Cuantos alumnos ?");
        numeroAlumnos=Integer.parseInt(br.readLine());
        Alumno[] misAlumnos = new Alumno[numeroAlumnos];

        for (Alumno a:misAlumnos){

        }

            /*

            Product[] obj = new Product[5] ;

            System.out.println("Visualización con forEach:");
            for (Product p:obj){
            p.display();
            }
             */
        }
    }
}
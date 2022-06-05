import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {

    public int[] calificaciones = new int[21];

    public void Archivocsv() {
        String line; String path = "C:\\Users\\Alberto Hu\\Practica11/practica11.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            try {
                while ((line = br.readLine()) != null) {
                    String[] num = line.split(",");
                    num[0] = String.valueOf(num[0].charAt(1)) + String.valueOf(num[0].charAt(2));
                    for (int i = 0; i < num.length; i++) {
                        calificaciones[i] = Integer.parseInt(num[i]);
                    }
                }
            } catch (IOException ex) {
                System.out.println("No se puede leer el archivo" + ex);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se puede abrir el archivo" + e);
        }
    }
}
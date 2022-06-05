import java.io.*;

public class SCR {
    public void Archivos(Alumnos[] alum) {
        try {
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("CalifiAlumnos.txt"));
            for (int i = 0; i < alum.length; i++) {
                s.writeObject(alum[i]);
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Se ha creado exitosamente el archivo...");
    }
}

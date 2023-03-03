//package CommonMethods;

//import org.openqa.selenium.Rectangle;

//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;

/*public class ScreenShot {


    /**
     * Ejemplo de un captura de pantalla( screenshot ) basado en Java.
     * 1.- Obtiene el tamaño del rectangulo
     * 2.- Genera el screenshot basado en el tamaño del rectangulo.
     * 3.- Esbribe la imagen en un fichero.

    public class EjemploCapturaDePantalla {

        /**
         * @param args
         */
        /*public static void main(String... args) {
            // obtenemos el tamaño del rectangulo
            Rectangle rectangleTam = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            try {
                Robot robot = new Robot();
                // tomamos una captura de pantalla( screenshot )
                BufferedImage bufferedImage = robot.createScreenCapture(rectangleTam);

                String nombreFichero=System.getProperty("user.home")+ File.separatorChar+"caputura.jpg";
                System.out.println("Generando el fichero: "+nombreFichero );
                FileOutputStream out = new FileOutputStream(nombreFichero);

                // esbribe la imagen a fichero
                ImageIO.write(bufferedImage, "jpg", out);

            } catch (AWTException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}*/

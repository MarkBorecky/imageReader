/* mbor1 created on 22.11.2020 
inside the package - pl.maro.image.convert */

package pl.maro.image.convert;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TessaractExample {

    public static void main(String[] args) {
        var imageFile = new File("./text.png");
        var instance = new Tesseract();
        instance.setDatapath("/home/mbor1/IdeaProjects/myprojects/image.convert/src/main/resources/static");
        instance.setLanguage("pol");
        try {
            var result = instance.doOCR(imageFile);
            System.out.println("result = " + result);
        } catch (TesseractException e) {
            System.out.println(e.getMessage());
        }
    }
}

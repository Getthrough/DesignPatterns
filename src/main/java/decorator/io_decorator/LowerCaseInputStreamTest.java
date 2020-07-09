package decorator.io_decorator;

import java.io.*;
import java.util.Objects;

/**
 * @author getthrough
 * @date 2020/7/9
 */
public class LowerCaseInputStreamTest {

    public static void main(String[] args) {
        try (InputStream lowerCaseInputStream =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     Objects.requireNonNull(LowerCaseInputStreamTest
                                             .class
                                             .getClassLoader()
                                             .getResourceAsStream("text.txt"))));
             OutputStream os = new BufferedOutputStream(new FileOutputStream("src/main/resources/output.txt"))
        ) {
            byte[] content = new byte[256];
            int count = 0;
            while ((count = lowerCaseInputStream.read(content)) != -1) {
                System.out.print(new String(content));
                os.write(content, 0, count);
            }
        } catch (IOException e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }

}

package decorator.io_decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 将输入的字符转为小写的输入流
 *
 * @author getthrough
 * @date 2020/7/8
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? -1 : Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int count = super.read(b, off, len);
        for (int i = off; i < off + count; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return count;
    }
}

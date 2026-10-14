package ficheros;

import java.io.IOException;
import java.io.RandomAccessFile;

public class GestionProductos {
    public void escribirIniciales(RandomAccessFile randomAccessFile, String[] nombres, int[] existencias, double[] precios)
            throws IOException {
        randomAccessFile.setLength(0);

        for (int i = 0; i < nombres.length; i++) {
            randomAccessFile.writeInt(i + 1);

            StringBuffer stringbuffer = new StringBuffer(nombres[i]);
            stringbuffer.setLength(12);
            randomAccessFile.writeChars(stringbuffer.toString());

            randomAccessFile.writeInt(existencias[i]);
            randomAccessFile.writeDouble(precios[i]);
        }
    }

    public void mostrarTodos(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.seek(0);
        long totalRegistros = randomAccessFile.length() / Producto.tamaño;

        for (int i = 0; i < totalRegistros; i++) {
            mostrarProductoActual(randomAccessFile);
        }
    }

    public void mostrarPorId(RandomAccessFile randomAccessFile, int id) throws IOException {
        long posicion = (long) (id - 1) * Producto.tamaño;
        randomAccessFile.seek(posicion);
        mostrarProductoActual(randomAccessFile);
    }

    public void actualizarExistencias(RandomAccessFile randomAccessFile, int id, int nuevasExistencias) throws IOException {

        long posicion = (long) (id - 1) * Producto.tamaño + 28;
        randomAccessFile.seek(posicion);
        randomAccessFile.writeInt(nuevasExistencias);
    }

    public void actualizarPrecio(RandomAccessFile randomAccesFile, int id, double nuevoPrecio) throws IOException {
        long posicion = (long) (id - 1) * Producto.tamaño + 32;
        randomAccesFile.seek(posicion);
        randomAccesFile.writeDouble(nuevoPrecio);
    }

    private void mostrarProductoActual(RandomAccessFile randomAccessFile) throws IOException {
        int id = randomAccessFile.readInt();

        char[] aux = new char[12];
        for (int i = 0; i < 12; i++) {
            aux[i] = randomAccessFile.readChar();
        }
        String nombre = new String(aux).trim();

        int existencias = randomAccessFile.readInt();
        double precio = randomAccessFile.readDouble();

        Producto p = new Producto(id, nombre, existencias, precio);
        System.out.println(p);
    }
}

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class User {
    public static void main(String[] args) {
        Reader book = new Reader("Создание мини библиотеки автобиографий");
        book.setVisible(true);
        book.setResizable(false);
        book.setLocationRelativeTo(null);
    }
}
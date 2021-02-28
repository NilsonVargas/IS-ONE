package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderDocument {

    protected String access_path;


    public FileReaderDocument(String ac_path) {

        this.access_path = ac_path;

    }

    FileReaderDocument() {

    }

    public DoubleLinkedList ReadFile() {

        DoubleLinkedList list_numbers = new DoubleLinkedList();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(this.getAccess_path()));

            String bfRead = "";

            while ((bfRead = bf.readLine()) != null) {
                //tmp = tmp + bfRead + " "; //Guardar texto del archivo
                //bfRead = bfRead.replaceAll(";", " ");
                //bfRead = bfRead.replaceAll("/", " ");
                //bfRead = bfRead.replaceAll(",", " ");
                try {
                    long numero = Long.parseLong(bfRead);
                    list_numbers.AddFirst(new Nodo(numero));
                    
                } catch (Exception e) {
                }
                

            }
            bf.close();

        } catch (IOException | NumberFormatException e) {
            System.err.println(e);
        }

        return list_numbers;
    }
    
    public ArrayList ReadFileArrayList() {

        ArrayList list_numbers = new ArrayList();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(this.getAccess_path()));

            String bfRead = "";

            while ((bfRead = bf.readLine()) != null) {
                //tmp = tmp + bfRead + " "; //Guardar texto del archivo
                //bfRead = bfRead.replaceAll(";", " ");
                //bfRead = bfRead.replaceAll("/", " ");
                //bfRead = bfRead.replaceAll(",", " ");
                long numero = Long.parseLong(bfRead);

                //list_numbers.AddFirst(new Nodo(numero));
                list_numbers.add(numero);

            }
            bf.close();

        } catch (IOException | NumberFormatException e) {
            System.err.println(e);
        }

        return list_numbers;
    }

    public String ReadFileBig() {
        String text_input = "";

        return text_input;
    }

    public String getAccess_path() {
        return access_path;
    }

    public void setAccess_path(String access_path) {
        this.access_path = access_path;
    }

}

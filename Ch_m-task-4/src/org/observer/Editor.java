package org.observer;
import java.io.*;

public class Editor {
    private EventManager events;

    public Editor(){
        this.events = new EventManager();
    }

    public void openFile(){
        try(FileReader reader = new FileReader("task-4.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public void saveFile(){
        try(FileWriter writer = new FileWriter("task-4.txt", false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}

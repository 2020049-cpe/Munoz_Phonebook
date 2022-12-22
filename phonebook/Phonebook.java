/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author user
 */
public class Phonebook implements CRUD_Interface {

    public static void main(String[] args) {
        //Initialize Data Structure
        CRUD_Interface.DB_Initialize();
        //Insert Sample Data
        System.out.println("Adding Sample Data");
        CRUD_Interface.addRow("Camille", "Munoz", "23/06/1994", "Sto.Tomas", "2020049@ub.edu.ph", "09103710181");
        //Initialize GUI
        MainF app = new MainF();
        app.setVisible(true);
        System.out.println("Hello World!");
        
        
    }
}

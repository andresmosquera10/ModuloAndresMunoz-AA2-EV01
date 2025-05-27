/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloandresmunoz.aa2.ev01;

public class Principal {
    public static void main(String[] args) {
        UsuariosAndresMunozDAO dao = new UsuariosAndresMunozDAO();
        dao.insertarUsuario("Enrique López", "enrilo@gmail.com", "enrique123456");
        dao.actualizarNombreUsuario(4, "Enrique Lopera");
        dao.eliminarUsuario(4);
        
    }
}

       
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moduloandresmunoz.aa2.ev01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosAndresMunozDAO {

    public void insertarUsuario(String nombre, String email, String password) {
        Conexion conexion = new Conexion();
        Connection con = conexion.conectar();

        String sql = "INSERT INTO usuarios (nombre, email, password) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nombre);
            stmt.setString(2, email);
            stmt.setString(3, password);

            stmt.executeUpdate();
            System.out.println("Usuario insertado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
        }
    }

    public void actualizarNombreUsuario(int id, String nuevoNombre) {
        Conexion conexion = new Conexion();
        Connection con = conexion.conectar();

        String sql = "UPDATE usuarios SET nombre = ? WHERE id = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nuevoNombre);
            stmt.setInt(2, id);

            stmt.executeUpdate();
            System.out.println("Nombre del usuario actualizado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al actualizar nombre del usuario: " + e.getMessage());
        }
    }
    
    public void eliminarUsuario(int id) {
    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();

    String sql = "DELETE FROM usuarios WHERE id = ?";

    try {
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);

        int filas = stmt.executeUpdate();
        if (filas > 0) {
            System.out.println("Usuario eliminado correctamente");
        } else {
            System.out.println("No se encontró un usuario con el ID proporcionado");
        }

    } catch (SQLException e) {
        System.out.println("Error al eliminar usuario: " + e.getMessage());
    }
}
}


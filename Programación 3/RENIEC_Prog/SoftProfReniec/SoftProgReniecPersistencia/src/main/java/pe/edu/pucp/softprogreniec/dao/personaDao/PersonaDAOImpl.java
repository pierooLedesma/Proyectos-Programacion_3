package pe.edu.pucp.softprogreniec.dao.personaDao;

import pe.edu.pucp.softprogreniec.dao.DefaultBaseDAO;
import pe.edu.pucp.softprogreniec.personaDto.PersonaDTO;

import java.sql.*;

public class PersonaDAOImpl extends DefaultBaseDAO<PersonaDTO> implements PersonaDAO {
    protected PreparedStatement comandoCrear(Connection conn,
                                             PersonaDTO modelo) throws SQLException {
        String sql = """
            INSERT INTO REG_PERSONAS (
                DNI,
                PATERNO,
                MATERNO,
                NOMBRES
            ) VALUES (?, ?, ?, ?)
            """;

        PreparedStatement cmd = conn.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS);
        cmd.setString(1, modelo.getDni());
        cmd.setString(2,modelo.getPaterno());
        cmd.setString(3, modelo.getMaterno());
        cmd.setString(4, modelo.getNombres());

        return cmd;
    }

    protected PreparedStatement comandoLeer(Connection conn,
                                            Integer id) throws SQLException {
        String sql = """
            SELECT * FROM REG_PERSONAS WHERE id = ?
            """;
        PreparedStatement cmd = conn.prepareStatement(sql);
        cmd.setInt(1, id);
        return cmd;
    }

    // El DNI se maneja como String porque puede tener ceros a la izquierda y no debe convertirse a Integer.
    private PreparedStatement comandoLeerPorDni(Connection conn,
                                                String dni) throws SQLException {
        String sql = """
            SELECT * FROM REG_PERSONAS WHERE DNI = ?
            """;
        PreparedStatement cmd = conn.prepareStatement(sql);
        cmd.setString(1, dni);
        return cmd;
    }


    // Método público del DAO para que la capa de negocio pueda obtener una persona por DNI.
    // Se usa ejecutarComando() para conservar el manejo de conexión y errores que ya tenía BaseDAO.
    @Override
    public PersonaDTO leerPorDni(String dni) {
        return ejecutarComando(conn -> {
            try (PreparedStatement cmd = this.comandoLeerPorDni(conn, dni);
                 ResultSet rs = cmd.executeQuery()) {
                if (!rs.next()) {
                    System.err.println("No se encontro el registro con DNI: " + dni);
                    return null;
                }
                return this.mapearModelo(rs);
            }
        });
    }

    protected PreparedStatement comandoLeerTodos(Connection conn) throws SQLException {
        String sql = """
            SELECT * FROM REG_PERSONAS
            """;
        return conn.prepareStatement(sql);
    }

    protected PersonaDTO mapearModelo(ResultSet rs) throws SQLException {
        PersonaDTO producto = new PersonaDTO();
        producto.setMaterno(rs.getString("MATERNO"));
        producto.setPaterno(rs.getString("PATERNO"));
        producto.setNombres(rs.getString("NOMBRES"));
        producto.setDni(rs.getString("DNI"));
        return producto;
    }
}


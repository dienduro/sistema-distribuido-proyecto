
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author DIEGO
 */
public class ComboBoxRues {

    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }

    public Vector<ComboBoxRues> mostrarRues() {
        Conexion conex = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conex.conectar();

        Vector<ComboBoxRues> datos = new Vector<ComboBoxRues>();

        ComboBoxRues dat = null;

        try {
            String sql = "SELECT * FROM empresas";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new ComboBoxRues();
            dat.setId(0);
            dat.setNombre("Seleccione");
            datos.add(dat);

            while (rs.next()) {
                dat = new ComboBoxRues();
                dat.setId(rs.getInt("ruc"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            rs.close();

        } 
        catch (SQLException ex)
        {
            System.err.println(ex.toString());
        }
        return datos;
    } 
}


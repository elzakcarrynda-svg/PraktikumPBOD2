import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlPersonService {
    Connection koneksi = null;

    // Constructor
    public MysqlPersonService() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_person";
            String user = "root";
            String pass = "";

            koneksi = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
        }
    }

    // Membuat object Person dari ResultSet
    public Person makePersonObject(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");

        return new Person(id, name);
    }

    // Menambahkan data person
    public void add(Person p) {
        try {
            String query = "INSERT INTO person(name) VALUES(?)";

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setString(1, p.getName());

            ps.executeUpdate();

            System.out.println("Data berhasil ditambah");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Update data person
    public void update(Person p) {
        try {
            String query =
                    "UPDATE person SET name=? WHERE id=?";

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setString(1, p.getName());
            ps.setInt(2, p.getId());

            ps.executeUpdate();

            System.out.println("Data berhasil diupdate");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete data person
    public void delete(int id) {
        try {
            String query =
                    "DELETE FROM person WHERE id=?";

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Data berhasil dihapus");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Ambil data berdasarkan id
    public Person getById(int id) {
        Person p = null;

        try {
            String query =
                    "SELECT * FROM person WHERE id=?";

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = makePersonObject(rs);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return p;
    }

    // Ambil semua data
    public List<Person> getAll() {
        List<Person> list = new ArrayList<>();

        try {
            String query = "SELECT * FROM person";

            Statement st = koneksi.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(makePersonObject(rs));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}
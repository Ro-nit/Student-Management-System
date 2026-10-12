import java.sql.*;

public class Student {

    int id;
    String name;
    String subject;
    int marks;

    public Student(int id, String name, String subject, int marks) {

        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }
}

class operations {

    public void addStudent(Student s) throws SQLException {

        String sql = "insert into student values (?, ?, ?, ?)";

        Connection con = DB_Connection.make_Connection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, s.id);
        ps.setString(2, s.name);
        ps.setString(3, s.subject);
        ps.setInt(4, s.marks);

        ps.executeUpdate();

        System.out.println("student added successfully.");
    }

    public void deleteStudent(int id) throws SQLException {

        String sql = "delete from student where id = ?";

        Connection con = DB_Connection.make_Connection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("student deleted successfully");
        } else {
            System.out.println("student not found");
        }
    }

    public void updateStudent(Student s) throws SQLException {

        String sql =
                "update student set name = ?, subject = ?, marks = ? where id = ?";

        Connection con = DB_Connection.make_Connection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, s.name);
        ps.setString(2, s.subject);
        ps.setInt(3, s.marks);
        ps.setInt(4, s.id);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("student updated successfully");
        } else {
            System.out.println("student not found");
        }
    }

    public void list_all() throws SQLException {

        String sql = "select * from student";

        Connection con = DB_Connection.make_Connection();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {

            System.out.println(rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("subject") + " " +
                                rs.getInt("marks")
            );
        }
    }
}
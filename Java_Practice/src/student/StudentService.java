package student;

import utils.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by l on 2/28/2017.
 */
public class StudentService {

    public Student getStudent(){
        Scanner s = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter your name?");
        student.setName(s.nextLine());
        System.out.println("Enter address?");
        student.setAddress(s.nextLine());
        return student;

    }

    public void select(){
        String query = "select * from student";

        PreparedStatement pstm = new DatabaseConnection().getPreparedStatement(query);

        try {
           ResultSet rs =  pstm.executeQuery();

           while (rs.next()) {
               int id = rs.getInt("id");
               String name = rs.getString("name");
               String address = rs.getString("address");
               System.out.println(id+"-----"+name+"----"+address);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(){
        String query = "update student set name=?, address=? where id=?";
        PreparedStatement pstm = new DatabaseConnection().getPreparedStatement(query);

        try {
            pstm.setString(1,"Prakash");
            pstm.setString(2, "Baitadi");
            pstm.setInt(3, 7);
            pstm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        String query = "delete from student where id=?";
        PreparedStatement pstm = new DatabaseConnection().getPreparedStatement(query);

        try {
            pstm.setString(1, String.valueOf(7));
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(){
        Student student = getStudent();
        String query = "insert into student (name,address) values(?,?)";
        PreparedStatement pstm = new DatabaseConnection().getPreparedStatement(query);

        try {
            pstm.setString(1, student.getName());
            pstm.setString(2,student.getAddress());

            pstm.execute();
            System.out.println("data inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package com.isil.jdbc;


import java.sql.*;

public class MainApp {

    public  static void main(String[] args) throws Exception {

        String jdbcUrl = "jdbc:mysql://localhost:3306/DESAI";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(jdbcUrl, "root", "root1234");

        Statement st = con.createStatement();
        //Insertar
        //int filasAfectadas = st.executeUpdate("insert into Users values (4, 'Juan', '999999998', 'Vancuver')");
        //Actualizar
        //int filasAfectadas = st.executeUpdate("update Users set name='Christian' where name='Cueva'");
        //Eliminar
        //int filasAfectadas = st.executeUpdate("delete from Users where idUser=4");

        //Mantenimiento
        /*
        PreparedStatement ps = con.prepareStatement("insert into Users values(?,?,?,?)");
        ps.setInt(1,4);
        ps.setString(2, "Beto");
        ps.setString(3, "998998998");
        ps.setString(4, "Bogota");



        int filasAfectadas = ps.executeUpdate();
        */
        //Consulta

        PreparedStatement ps2 = con.prepareStatement("SELECT * FROM USERS WHERE idUser=?");
        ps2.setInt(1, 3);




        //ResultSet rs = st.executeQuery("select * from users");
        ResultSet rs = ps2.executeQuery();


        while(rs.next()){
            System.out.println(rs.getString("idUser") + " " + rs.getString("name") + " " + rs.getString("phone") + " " + rs.getString("city"));
        }







    }

}

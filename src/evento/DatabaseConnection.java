
package evento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


// Method to establish the database connection
public class DatabaseConnection {
    public Connection connect() throws SQLException{
       Connection connection = null;
       try{
           Class.forName("org.sqlite.JDBC");
           connection = DriverManager.getConnection("jdbc:sqlite:src/evento/eventoDB");
       }
       catch(ClassNotFoundException | SQLException e){
           System.out.println("Unexpected error occured\nError detail:"+e);
           e.printStackTrace();
       }
       return connection; 
    }
    
    
// Method the set the new user data in the database corresponding table
public void setData(User us) throws SQLException{
    // Creating my sql query to insert user data in the database concerned table
    String insertData = "INSERT INTO userData(Name,Surname,Username,Password) VALUES ('"+ us.getName()+"','"+us.getSurname()+"','"+us.getUsername()+"','"+us.getPassword()+"')";
    
    // Handling database connection error 
    try(Connection connection = this.connect();
        Statement statement = connection.createStatement()){
        statement.executeUpdate(insertData);
        System.out.println("You signed up successfuly !");
    }
    catch(SQLException e){
    System.out.println("Unexpected Error\nError Details: "+e);

    }
}
    
    
// Method to add event in the database corresponding database table
public void addEvent(Event e) throws SQLException{
    // Creating my sql query to insert events details in the database concerned table
    String insertEvent = "INSERT INTO events(Name, Place, Date, Time) VALUES ('"+e.getName()+"','"+e.getPlace()+"','"+e.getDate()+"','"+e.getTime()+"')";
    try (
         Connection connection = this.connect();
         Statement statement = connection.createStatement()){
         statement.executeUpdate(insertEvent); 
         System.out.println("Event Added succesfully !");
    }
    catch(SQLException se){
            System.out.println("Error");
            System.out.println(se);
        }
}

// Method to print on the console the user data contained in the database
public void printUserData() {
    String query = "SELECT * FROM userData";
    try (Connection connection = this.connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)){
        System.out.println("eventoDB userData table data");
         while(resultSet.next()){
             System.out.println("ID: " + resultSet.getString("ID"));
             System.out.println("Name: " + resultSet.getString("Name"));
             System.out.println("Surname: " + resultSet.getString("Surname"));
             System.out.println("User: " + resultSet.getString("Username"));
             System.out.println("Password: " + resultSet.getString("Password"));
             System.out.println("-------------------------------------------");
         }
    }
    catch(SQLException e){
        System.out.println("Unexpected Error\nError Details: "+e);
    }
}

// Method to print on the console event details contained in the database
public void printEventsDetails() {
    String query = "SELECT * FROM events";
    try (Connection connection = this.connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)){
        System.out.println("eventoDB events table data");
         while(resultSet.next()){
             System.out.println("ID: " + resultSet.getString("ID"));
             System.out.println("Name: " + resultSet.getString("Name"));
             System.out.println("Place: " + resultSet.getString("Place"));
             System.out.println("Date: " + resultSet.getString("Date"));
             System.out.println("Time: " + resultSet.getString("Time"));
             System.out.println("-------------------------------------------");
         }
    }
    catch(SQLException e){
        System.out.println("Unexpected Error\nError Details: "+e);        
    }
}

// Method to check if the user exists in the database
public boolean isUser( String username, String password){
    String query = "SELECT * FROM userData";
    boolean b = false;
    try (Connection connection = this.connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)) {
        System.out.println("Donnees de la base de donnees");
        while (resultSet.next()) {
            System.out.println("Username: " + resultSet.getString("Username"));
            System.out.println("Password: " + resultSet.getString("Password"));
            System.out.println("--------");
            if (resultSet.getString("username").equals(username) && resultSet.getString("password").equals(password)) {
                b = true;  // Change this to true to indicate a match
                return b;
            }
        }
    } catch (SQLException e) {
        System.out.println("Unexpected Error\nError Details: "+e);
    }
    return b; 
}

// Method to get events from the database and show it in the Event Manager Tabel
public void showEventsInEventManager(DefaultTableModel eventsListTable) throws SQLException {
    String selectData = "SELECT * FROM events";
    try(Connection connection = this.connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectData)){
        
        System.out.println("Data retrieved from the db");
        eventsListTable.setRowCount(0); 
        while (resultSet.next()){
    
            eventsListTable.addRow(new Object[]{
                resultSet.getInt("ID"),
                resultSet.getString("Name"),
                resultSet.getString("Place"),
                resultSet.getString("Date"),
                resultSet.getString("Time"),       
        });
        }
    }
    catch(SQLException e){
        System.out.println("Unexpected Error\nError Details: "+e);
    }
}

// Method to delete a event from the list 
public void deleteEvent(int id) {
    String deleteEvent = "DELETE FROM events WHERE id = " + id;
    try (Connection connection = this.connect();
        Statement statement = connection.createStatement()) {
        int rowsAffected = statement.executeUpdate(deleteEvent);
        if (rowsAffected > 0) {
            System.out.println("Event deleted succesfully !");
        } else {
            System.out.println("Event not found !");
        }
    } catch (SQLException e) {
        System.out.println("Unexpected Error\nError Details: "+e);
    }
}

//Method to update events details
public void updateEvent(int id, String newName, String newPlace, String newDate, String newTime)throws SQLException{
    String updateData = "UPDATE events SET Name = '" + newName + "', Place = '" + newPlace + "', Date = '" + newDate + "', Time = '" + newTime + "' where id = " + id;
        try(Connection connection = this.connect();
            Statement statement = connection.createStatement()){
            int rowsAffected = statement.executeUpdate(updateData);
            if (rowsAffected > 0) {
                System.out.println("Event updated succesfully !");
            }else {
            System.out.println("Event not found !");
        }
        }catch(SQLException e){
            System.out.println("Unexpected Error\nError Details: "+e);
        }
}      
}



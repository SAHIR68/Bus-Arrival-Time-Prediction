package database;

import config.StaticString;
import elements.Bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusData {
    public void addBusMessageToDatabase(Bus bus){

            String SQL_INSERT = "INSERT INTO tbl_admin (c_busid, c_routeName, c_location, c_arrivalTime) VALUES (?,?,?,?)";
            try (Connection conn = DriverManager.getConnection(
                    StaticString.DBUrl, StaticString.DBUser, StaticString.DBPass);
                 PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

                preparedStatement.setInt(1, bus.getId());
                preparedStatement.setString(2, bus.getBusRoute().toString());
                preparedStatement.setString(3, bus.getLoacation().toString());
                preparedStatement.setString(4, bus.getArrivingTime().toString());


            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

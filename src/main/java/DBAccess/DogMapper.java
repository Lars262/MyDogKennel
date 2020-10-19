package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.entities.Dog;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| dogID      | int(2)       | NO   | PRI | NULL    |       |
| Color      | varchar(255) | YES  |     | NULL    |       |
| Breed      | varchar(255) | YES  |     | NULL    |       |
| DogName    | varchar(255) | YES  |     | NULL    |       |
| Gender     | varchar(255) | YES  |     | NULL    |       |
| CityOrigin | varchar(255) | YES  |     | NULL    |       |
| MotherID   | varchar(255) | YES  |     | NULL    |       |
| FatherID   | varchar(255) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
 */

public class DogMapper {

    public static List<String> getAllDogBreeds() {
        List<String> breeds = new ArrayList<>();
        Connection con = null;
        ResultSet res = null;
        PreparedStatement ps = null;

        try {
            con = Connector.connection();
            //String SQL = "INSERT INTO Users (email, password, role) VALUES (?, ?, ?)";
            //  select breed,count(breed) from dogs group by breed order by 2;
            String SQL = "SELECT breed, distinct (breed) FROM dogs group by breed order by 2 limit 6";
            ps = con.prepareStatement( SQL);
            res = ps.executeQuery();
            while (res.next()) {
                String breed = res.getString(1);
                breeds.add(breed);
            }
        } catch ( SQLException | ClassNotFoundException ex ) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return breeds;
    }



    public static Map<String,Integer> getAllDogBreedsCount() throws LoginSampleException {
        Map<String,Integer> breeds = new HashMap<>();
        Connection con = null;
        ResultSet res = null;
        PreparedStatement ps = null;

        try {
            con = Connector.connection();
            //String SQL = "INSERT INTO Users (email, password, role) VALUES (?, ?, ?)";
            //  select breed,count(breed) from dogs group by breed order by 2;
            String SQL = "SELECT breed,  count(breed) FROM dogs group by breed order by 2";
            ps = con.prepareStatement( SQL);
            res = ps.executeQuery();
            while(res.next()) {
                String key=res.getString(1);
                int val=res.getInt(2);
                breeds.put(key,val);
            }

        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return breeds;
    }

    public static List<Dog> getAllDogs() throws LoginSampleException {
        List<Dog> dogs = new ArrayList<>();
        Connection con = null;
        ResultSet res = null;
        PreparedStatement ps = null;
        Dog tmpDog = null;
        try {
            con = Connector.connection();
            //String SQL = "INSERT INTO Users (email, password, role) VALUES (?, ?, ?)";
            String SQL = "SELECT * FROM dogs";
            ps = con.prepareStatement( SQL);
            res = ps.executeQuery();
            while(res.next()) {
                String dogName = res.getString("DogName");
                int dogId = res.getInt("dogID");
                tmpDog = new Dog(dogId,dogName);
                dogs.add(tmpDog);
            }
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return dogs;
    }
}

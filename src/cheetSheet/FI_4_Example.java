package cheetSheet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Consumer;

public class FI_4_Example {

    static Connection connection;

    public static void main(String[] args) {

        try {
            executeQuery("SELECT * FROM employees WHERE start_date = ?", new String[] {"12-03-2016"}, rs -> {
                //do whatever you want with the result set here
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void executeQuery(String query, String[] args, Consumer<ResultSet> callback) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        for (int i = 1; i <= args.length; i++) {
            statement.setString(i, args[i - 1]);
        }
        callback.accept(statement.executeQuery());
    }
}

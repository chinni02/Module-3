// Class: TransactionExample
import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db");
        conn.setAutoCommit(false);

        try {
            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");

            debit.setDouble(1, 100.0);
            debit.setInt(2, 1);
            debit.executeUpdate();

            credit.setDouble(1, 100.0);
            credit.setInt(2, 2);
            credit.executeUpdate();

            conn.commit();
            System.out.println("Transfer successful.");
        } catch (SQLException e) {
            conn.rollback();
            System.out.println("Transfer failed. Transaction rolled back.");
        } finally {
            conn.close();
        }
    }
}

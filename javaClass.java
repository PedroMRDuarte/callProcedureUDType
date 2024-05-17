import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Struct;
import oracle.jdbc.OracleConnection;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

public class MyType {
    private int id;
    private String name;

    // Constructors, getters, and setters

    public STRUCT toSTRUCT(Connection conn) throws SQLException {
        Object[] attributes = { id, name };
        StructDescriptor descriptor = StructDescriptor.createDescriptor("MY_TYPE", conn);
        return new STRUCT(descriptor, conn, attributes);
    }
}

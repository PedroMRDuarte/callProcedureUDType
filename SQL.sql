CREATE TYPE my_type AS OBJECT (
    id NUMBER,
    name VARCHAR2(50)
);

CREATE PROCEDURE my_procedure(p_my_type IN my_type) IS
BEGIN
    -- Procedure logic here
END;

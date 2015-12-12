import TADHDB.SPersons;
import com.querydsl.core.Tuple;

import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.*;
import com.querydsl.sql.mysql.MySQLQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;




/**
 * Created by Mihai on 12/11/2015.
 */
public class testSQL {


    public static void main(String[] args) throws Exception {
        SPersons customer = SPersons.Persons;

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://db4free.net:3306/test_automation";
        Connection conn = DriverManager.getConnection(url, "mihai", "mypassword");

        //nu sterge

        //StringExpression a = StringTemplate.create( "*" );

        //nu sterge

/*
        SQLTemplates templates = new MySQLTemplates();
        Configuration configuration = new Configuration(templates);


        SQLTemplates dialect = new HSQLDBTemplates(); // SQL-dialect
        SQLQueryFactory query = new SQLQueryFactory(configuration,conn);
        List<String> lastNames = query.from(customer)
                .where(customer.firstName.eq("Mihai"))
                .f
*/
        SQLTemplates dialect = new MySQLTemplates ();
        SQLQuery query = new SQLQuery(conn, dialect);
        /*List<Tuple> lastNames = query.from(customer)
                .where(customer.firstName.eq("Bob"))
                .list(customer.lastName);
*/

       System.out.println(query.select(customer.all()).from(customer).where(customer.firstName.contains("Gogu")));
        System.out.println(query.fetchResults().getResults());
        System.out.println("bau");

        query=new SQLQuery(conn, dialect);;

        System.out.println(query.select(customer.all()).from(customer).where(customer.firstName.contains("Gigi")));
        System.out.println(query.fetchResults().getResults());
       // System.out.println(query.select(customer.all()).fetchResults().getResults());
        //System.out.println( query.select(customer.all()).from(customer).where(customer.firstName.eq("Mihai")));

        //List<Tuple> result = query.from(customer).select(customer.firstName, customer.lastName).fetch();
        //query.select(customer.firstName, customer.lastName).fetch();
       // List<Tuple> result = query.from(customer).where(customer.firstName.contains("Mihai"));

        //for (Tuple row : result) {
         //   System.out.println("firstName " + row.get(customer.firstName));
         //   System.out.println("lastName " + row.get(customer.lastName));
        //}




    }

}

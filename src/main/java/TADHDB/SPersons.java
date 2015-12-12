package TADHDB;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SPersons is a Querydsl query type for SPersons
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SPersons extends com.querydsl.sql.RelationalPathBase<SPersons> {

    private static final long serialVersionUID = 1859639050;

    public static final SPersons Persons = new SPersons("Persons");

    public final StringPath address = createString("address");

    public final StringPath city = createString("city");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final NumberPath<Integer> personID = createNumber("personID", Integer.class);

    public SPersons(String variable) {
        super(SPersons.class, forVariable(variable), "null", "Persons");
        addMetadata();
    }

    public SPersons(String variable, String schema, String table) {
        super(SPersons.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SPersons(Path<? extends SPersons> path) {
        super(path.getType(), path.getMetadata(), "null", "Persons");
        addMetadata();
    }

    public SPersons(PathMetadata metadata) {
        super(SPersons.class, metadata, "null", "Persons");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("Address").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(city, ColumnMetadata.named("City").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(firstName, ColumnMetadata.named("FirstName").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lastName, ColumnMetadata.named("LastName").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(personID, ColumnMetadata.named("PersonID").withIndex(1).ofType(Types.INTEGER).withSize(10));
    }

}


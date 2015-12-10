package util.db.configuration;

/**
 * Created by Mihai on 12/11/2015.
 */
public interface  JooqGeneratorConfiguration {
    public String getDriver();
    public String getUrl();
    public String getUsername();
    public String getPassword();
    public String getInputSchema();
    public String getSqlDialect();
    public String getGenratedCodePackageName();
    public String getGeneratedCodeDirectory();
}

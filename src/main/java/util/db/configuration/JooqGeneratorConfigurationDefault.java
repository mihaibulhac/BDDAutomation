package util.db.configuration;

/**
 * Created by Mihai on 12/11/2015.
 */
public class JooqGeneratorConfigurationDefault implements JooqGeneratorConfiguration {
    private String driver;
    private String url;
    private String username;
    private String password;
    private String inputSchema;
    private String sqlDialect;
    private String genratedCodePackageName;
    private String generatedCodeDirectory;

    @Override
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getInputSchema() {
        return inputSchema;
    }

    public void setInputSchema(String inputSchema) {
        this.inputSchema = inputSchema;
    }

    @Override
    public String getSqlDialect() {
        return sqlDialect;
    }

    public void setSqlDialect(String sqlDialect) {
        this.sqlDialect = sqlDialect;
    }

    @Override
    public String getGenratedCodePackageName() {
        return genratedCodePackageName;
    }

    public void setGenratedCodePackageName(String genratedCodePackageName) {
        this.genratedCodePackageName = genratedCodePackageName;
    }

    @Override
    public String getGeneratedCodeDirectory() {
        return generatedCodeDirectory;
    }

    public void setGeneratedCodeDirectory(String generatedCodeDirectory) {
        this.generatedCodeDirectory = generatedCodeDirectory;
    }

    @Override
    public String toString() {
        return "JooqGeneratorConfigurationDefault{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", inputSchema='" + inputSchema + '\'' +
                ", sqlDialect='" + sqlDialect + '\'' +
                ", genratedCodePackageName='" + genratedCodePackageName + '\'' +
                ", generatedCodeDirectory='" + generatedCodeDirectory + '\'' +
                '}';
    }

}

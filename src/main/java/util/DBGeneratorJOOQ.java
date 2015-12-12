package util;

/**
 * Created by Mihai on 12/11/2015.
 */

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;



 class DBGeneratorJOOQ {

     public static void main(String[] args){


         try {

             Configuration configuration = new Configuration()
                     .withJdbc(new Jdbc()
                             .withDriver("com.mysql.jdbc.Driver")
                             .withUrl("jdbc:mysql://db4free.net:3306/test_automation")
                             .withUser("mihai")
                             .withPassword("mypassword"))
                     .withGenerator(new Generator()
                             .withDatabase(new Database()
                                     .withIncludes(".*")
                                     .withExcludes("")
                                     .withInputSchema("test_automation"))
                             .withTarget(new Target()
                                     .withPackageName("MyDB")
                                     .withDirectory("src/main/java")));
             GenerationTool.main(configuration);
         } catch (Exception e) {
             e.printStackTrace();
         }


     }
}

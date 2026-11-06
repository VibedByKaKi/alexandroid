package javax.annotation.sql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE})
@Repeatable(DataSourceDefinitions.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface DataSourceDefinition {
    String className();

    String databaseName() default "";

    String description() default "";

    int initialPoolSize() default -1;

    int isolationLevel() default -1;

    int loginTimeout() default 0;

    int maxIdleTime() default -1;

    int maxPoolSize() default -1;

    int maxStatements() default -1;

    int minPoolSize() default -1;

    String name();

    String password() default "";

    int portNumber() default -1;

    String[] properties() default {};

    String serverName() default "localhost";

    boolean transactional() default true;

    String url() default "";

    String user() default "";
}

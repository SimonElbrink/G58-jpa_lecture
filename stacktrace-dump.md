## NOTE
Make a conclusion that the problem is by reading the important parts of stacktrace.  
 - FOCUS ON THE Caused by:... Line
 - The first Exception is the most general, the last is the most Specific.

---

```cmd
C:\Users\lexicon-simon\.jdks\openjdk-21.0.2\bin\java.exe -XX:TieredStopAtLevel=1 -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-Dmanagement.endpoints.jmx.exposure.include=*" "-javaagent:C:\Users\lexicon-simon\AppData\Local\Programs\IntelliJ IDEA Ultimate\lib\idea_rt.jar=50642" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\lexicon-simon\lexicon-course-code\Java Group 58\g58-jpa_lecture\target\classes;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\3.5.9\spring-boot-starter-data-jpa-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-starter\3.5.9\spring-boot-starter-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.5.9\spring-boot-starter-logging-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\ch\qos\logback\logback-classic\1.5.22\logback-classic-1.5.22.jar;C:\Users\lexicon-simon\.m2\repository\ch\qos\logback\logback-core\1.5.22\logback-core-1.5.22.jar;C:\Users\lexicon-simon\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.24.3\log4j-to-slf4j-2.24.3.jar;C:\Users\lexicon-simon\.m2\repository\org\apache\logging\log4j\log4j-api\2.24.3\log4j-api-2.24.3.jar;C:\Users\lexicon-simon\.m2\repository\org\slf4j\jul-to-slf4j\2.0.17\jul-to-slf4j-2.0.17.jar;C:\Users\lexicon-simon\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\lexicon-simon\.m2\repository\org\yaml\snakeyaml\2.4\snakeyaml-2.4.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\3.5.9\spring-boot-starter-jdbc-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\com\zaxxer\HikariCP\6.3.3\HikariCP-6.3.3.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-jdbc\6.2.15\spring-jdbc-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\hibernate\orm\hibernate-core\6.6.39.Final\hibernate-core-6.6.39.Final.jar;C:\Users\lexicon-simon\.m2\repository\jakarta\persistence\jakarta.persistence-api\3.1.0\jakarta.persistence-api-3.1.0.jar;C:\Users\lexicon-simon\.m2\repository\jakarta\transaction\jakarta.transaction-api\2.0.1\jakarta.transaction-api-2.0.1.jar;C:\Users\lexicon-simon\.m2\repository\org\jboss\logging\jboss-logging\3.6.1.Final\jboss-logging-3.6.1.Final.jar;C:\Users\lexicon-simon\.m2\repository\org\hibernate\common\hibernate-commons-annotations\7.0.3.Final\hibernate-commons-annotations-7.0.3.Final.jar;C:\Users\lexicon-simon\.m2\repository\io\smallrye\jandex\3.2.0\jandex-3.2.0.jar;C:\Users\lexicon-simon\.m2\repository\com\fasterxml\classmate\1.7.1\classmate-1.7.1.jar;C:\Users\lexicon-simon\.m2\repository\net\bytebuddy\byte-buddy\1.17.8\byte-buddy-1.17.8.jar;C:\Users\lexicon-simon\.m2\repository\org\glassfish\jaxb\jaxb-runtime\4.0.6\jaxb-runtime-4.0.6.jar;C:\Users\lexicon-simon\.m2\repository\org\glassfish\jaxb\jaxb-core\4.0.6\jaxb-core-4.0.6.jar;C:\Users\lexicon-simon\.m2\repository\org\eclipse\angus\angus-activation\2.0.3\angus-activation-2.0.3.jar;C:\Users\lexicon-simon\.m2\repository\org\glassfish\jaxb\txw2\4.0.6\txw2-4.0.6.jar;C:\Users\lexicon-simon\.m2\repository\com\sun\istack\istack-commons-runtime\4.1.2\istack-commons-runtime-4.1.2.jar;C:\Users\lexicon-simon\.m2\repository\jakarta\inject\jakarta.inject-api\2.0.1\jakarta.inject-api-2.0.1.jar;C:\Users\lexicon-simon\.m2\repository\org\antlr\antlr4-runtime\4.13.0\antlr4-runtime-4.13.0.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\data\spring-data-jpa\3.5.7\spring-data-jpa-3.5.7.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\data\spring-data-commons\3.5.7\spring-data-commons-3.5.7.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-orm\6.2.15\spring-orm-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-context\6.2.15\spring-context-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-aop\6.2.15\spring-aop-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-tx\6.2.15\spring-tx-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-beans\6.2.15\spring-beans-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\slf4j\slf4j-api\2.0.17\slf4j-api-2.0.17.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-aspects\6.2.15\spring-aspects-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\aspectj\aspectjweaver\1.9.25.1\aspectjweaver-1.9.25.1.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.5.9\spring-boot-starter-web-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.5.9\spring-boot-starter-json-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.19.4\jackson-databind-2.19.4.jar;C:\Users\lexicon-simon\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.19.4\jackson-annotations-2.19.4.jar;C:\Users\lexicon-simon\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.19.4\jackson-core-2.19.4.jar;C:\Users\lexicon-simon\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.19.4\jackson-datatype-jdk8-2.19.4.jar;C:\Users\lexicon-simon\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.19.4\jackson-datatype-jsr310-2.19.4.jar;C:\Users\lexicon-simon\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.19.4\jackson-module-parameter-names-2.19.4.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.5.9\spring-boot-starter-tomcat-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.50\tomcat-embed-core-10.1.50.jar;C:\Users\lexicon-simon\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.50\tomcat-embed-el-10.1.50.jar;C:\Users\lexicon-simon\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.50\tomcat-embed-websocket-10.1.50.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-web\6.2.15\spring-web-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\io\micrometer\micrometer-observation\1.15.7\micrometer-observation-1.15.7.jar;C:\Users\lexicon-simon\.m2\repository\io\micrometer\micrometer-commons\1.15.7\micrometer-commons-1.15.7.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-webmvc\6.2.15\spring-webmvc-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-expression\6.2.15\spring-expression-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-devtools\3.5.9\spring-boot-devtools-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot\3.5.9\spring-boot-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.5.9\spring-boot-autoconfigure-3.5.9.jar;C:\Users\lexicon-simon\.m2\repository\com\mysql\mysql-connector-j\9.5.0\mysql-connector-j-9.5.0.jar;C:\Users\lexicon-simon\.m2\repository\org\projectlombok\lombok\1.18.42\lombok-1.18.42.jar;C:\Users\lexicon-simon\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\4.0.4\jakarta.xml.bind-api-4.0.4.jar;C:\Users\lexicon-simon\.m2\repository\jakarta\activation\jakarta.activation-api\2.1.4\jakarta.activation-api-2.1.4.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-core\6.2.15\spring-core-6.2.15.jar;C:\Users\lexicon-simon\.m2\repository\org\springframework\spring-jcl\6.2.15\spring-jcl-6.2.15.jar" se.lexicon.g58jpa_lecture.G58JpaLectureApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.9)

2026-01-20T09:47:52.543+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] s.l.g.G58JpaLectureApplication           : Starting G58JpaLectureApplication using Java 21.0.2 with PID 356 (C:\Users\lexicon-simon\lexicon-course-code\Java Group 58\g58-jpa_lecture\target\classes started by lexicon-simon in C:\Users\lexicon-simon\lexicon-course-code\Java Group 58\g58-jpa_lecture)
2026-01-20T09:47:52.554+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] s.l.g.G58JpaLectureApplication           : No active profile set, falling back to 1 default profile: "default"
2026-01-20T09:47:52.689+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2026-01-20T09:47:52.690+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2026-01-20T09:47:55.011+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-01-20T09:47:55.152+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 121 ms. Found 1 JPA repository interface.
2026-01-20T09:47:56.440+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-01-20T09:47:56.467+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-01-20T09:47:56.467+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.50]
2026-01-20T09:47:56.566+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-01-20T09:47:56.567+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3876 ms
2026-01-20T09:47:57.107+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-01-20T09:47:57.252+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.39.Final
2026-01-20T09:47:57.339+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-01-20T09:47:57.919+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-01-20T09:47:57.990+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-DEV - Starting...
2026-01-20T09:47:58.731+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] com.zaxxer.hikari.pool.HikariPool        : HikariPool-DEV - Added connection com.mysql.cj.jdbc.ConnectionImpl@3b74662b
2026-01-20T09:47:58.733+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-DEV - Start completed.
2026-01-20T09:47:58.856+01:00  WARN 356 --- [g58-jpa_lecture] [  restartedMain] org.hibernate.orm.deprecation            : HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-01-20T09:47:58.889+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-DEV)']
	Database driver: undefined/unknown
	Database version: 8.0.43
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-01-20T09:48:00.640+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate:
    alter table student
       drop
       foreign key FKcaf6ht0hfw93lwc13ny0sdmvo
Hibernate:
    drop table if exists address
Hibernate:
    drop table if exists student
Hibernate:
    create table address (
        id bigint not null auto_increment,
        city varchar(255),
        postal_code varchar(255),
        street varchar(255),
        primary key (id)
    ) engine=InnoDB
Hibernate:
    create table student (
        status bit not null,
        address_id bigint,
        create_date datetime(6),
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        email varchar(120) not null,
        id varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
Hibernate:
    alter table student
       add constraint UKe3500f0n5n132n60x2ay1woj9 unique (address_id)
Hibernate:
    alter table student
       add constraint UKfe0i52si7ybu0wjedj6motiim unique (email)
Hibernate:
    alter table student
       add constraint FKcaf6ht0hfw93lwc13ny0sdmvo
       foreign key (address_id)
       references address (id)
2026-01-20T09:48:01.269+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-01-20T09:48:01.768+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.s.d.j.r.query.QueryEnhancerFactory     : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-01-20T09:48:02.580+01:00  WARN 356 --- [g58-jpa_lecture] [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'appCommandLineRunner' defined in file [C:\Users\lexicon-simon\lexicon-course-code\Java Group 58\g58-jpa_lecture\target\classes\se\lexicon\g58jpa_lecture\AppCommandLineRunner.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'studentRepository' defined in se.lexicon.g58jpa_lecture.repo.StudentRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Could not create query for public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); Reason: Failed to create query for method public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); No property 'firstname' found for type 'Student'; Did you mean 'firstName'
2026-01-20T09:48:02.580+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2026-01-20T09:48:02.585+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-DEV - Shutdown initiated...
2026-01-20T09:48:02.602+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-DEV - Shutdown completed.
2026-01-20T09:48:02.608+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-01-20T09:48:02.623+01:00  INFO 356 --- [g58-jpa_lecture] [  restartedMain] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-01-20T09:48:02.656+01:00 ERROR 356 --- [g58-jpa_lecture] [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'appCommandLineRunner' defined in file [C:\Users\lexicon-simon\lexicon-course-code\Java Group 58\g58-jpa_lecture\target\classes\se\lexicon\g58jpa_lecture\AppCommandLineRunner.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'studentRepository' defined in se.lexicon.g58jpa_lecture.repo.StudentRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Could not create query for public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); Reason: Failed to create query for method public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); No property 'firstname' found for type 'Student'; Did you mean 'firstName'
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:804) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:240) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1395) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1232) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1228) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1194) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1130) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:990) ~[spring-context-6.2.15.jar:6.2.15]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.15.jar:6.2.15]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.9.jar:3.5.9]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.9.jar:3.5.9]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.9.jar:3.5.9]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.9.jar:3.5.9]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.9.jar:3.5.9]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.9.jar:3.5.9]
	at se.lexicon.g58jpa_lecture.G58JpaLectureApplication.main(G58JpaLectureApplication.java:11) ~[classes/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.5.9.jar:3.5.9]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'studentRepository' defined in se.lexicon.g58jpa_lecture.repo.StudentRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Could not create query for public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); Reason: Failed to create query for method public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); No property 'firstname' found for type 'Student'; Did you mean 'firstName'
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1826) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1708) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1653) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:913) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.2.15.jar:6.2.15]
	... 24 common frames omitted
Caused by: org.springframework.data.repository.query.QueryCreationException: Could not create query for public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); Reason: Failed to create query for method public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); No property 'firstname' found for type 'Student'; Did you mean 'firstName'
	at org.springframework.data.repository.query.QueryCreationException.create(QueryCreationException.java:101) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:120) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.mapMethodsToQuery(QueryExecutorMethodInterceptor.java:104) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lambda$new$0(QueryExecutorMethodInterceptor.java:92) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at java.base/java.util.Optional.map(Optional.java:260) ~[na:na]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.<init>(QueryExecutorMethodInterceptor.java:92) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:434) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$4(RepositoryFactoryBeanSupport.java:355) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.util.Lazy.getNullable(Lazy.java:135) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.util.Lazy.get(Lazy.java:113) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:361) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:132) ~[spring-data-jpa-3.5.7.jar:3.5.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1873) ~[spring-beans-6.2.15.jar:6.2.15]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1822) ~[spring-beans-6.2.15.jar:6.2.15]
	... 34 common frames omitted
Caused by: java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List se.lexicon.g58jpa_lecture.repo.StudentRepository.findByfirstname(java.lang.String); No property 'firstname' found for type 'Student'; Did you mean 'firstName'
	at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.<init>(PartTreeJpaQuery.java:107) ~[spring-data-jpa-3.5.7.jar:3.5.7]
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:128) ~[spring-data-jpa-3.5.7.jar:3.5.7]
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateIfNotFoundQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:260) ~[spring-data-jpa-3.5.7.jar:3.5.7]
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$AbstractQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:99) ~[spring-data-jpa-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.lookupQuery(QueryExecutorMethodInterceptor.java:116) ~[spring-data-commons-3.5.7.jar:3.5.7]
	... 46 common frames omitted
Caused by: org.springframework.data.mapping.PropertyReferenceException: No property 'firstname' found for type 'Student'; Did you mean 'firstName'
	at org.springframework.data.mapping.PropertyPath.<init>(PropertyPath.java:94) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:455) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:431) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.mapping.PropertyPath.lambda$from$0(PropertyPath.java:384) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.util.ConcurrentReferenceHashMap$6.execute(ConcurrentReferenceHashMap.java:395) ~[spring-core-6.2.15.jar:6.2.15]
	at org.springframework.util.ConcurrentReferenceHashMap$Segment.doTask(ConcurrentReferenceHashMap.java:688) ~[spring-core-6.2.15.jar:6.2.15]
	at org.springframework.util.ConcurrentReferenceHashMap.doTask(ConcurrentReferenceHashMap.java:570) ~[spring-core-6.2.15.jar:6.2.15]
	at org.springframework.util.ConcurrentReferenceHashMap.computeIfAbsent(ConcurrentReferenceHashMap.java:389) ~[spring-core-6.2.15.jar:6.2.15]
	at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:366) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:344) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.query.parser.Part.<init>(Part.java:81) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.query.parser.PartTree$OrPart.lambda$new$0(PartTree.java:259) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
	at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:1024) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682) ~[na:na]
	at org.springframework.data.repository.query.parser.PartTree$OrPart.<init>(PartTree.java:260) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.query.parser.PartTree$Predicate.lambda$new$0(PartTree.java:389) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
	at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:1024) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682) ~[na:na]
	at org.springframework.data.repository.query.parser.PartTree$Predicate.<init>(PartTree.java:390) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.repository.query.parser.PartTree.<init>(PartTree.java:103) ~[spring-data-commons-3.5.7.jar:3.5.7]
	at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.<init>(PartTreeJpaQuery.java:101) ~[spring-data-jpa-3.5.7.jar:3.5.7]
	... 50 common frames omitted


Process finished with exit code 0

```
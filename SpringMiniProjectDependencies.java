<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>springmvc_examplr</groupId>
  <artifactId>SpringMvcCRUDExample</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>war</packaging>
  
  <dependencies>
  	
  	<!-- spring webmvc -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>4.3.0.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-tx</artifactId>
			<version>4.3.0.RELEASE</version>
		</dependency> 
		<!-- jstl lib -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
		<!-- java servlet -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
		</dependency>  
		<!-- spring jbdc -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>4.3.0.RELEASE</version>
		</dependency>   
  
  </dependencies>
  
  
  <build>
  
  		<pluginManagement>
  			<plugins>
  				<plugin>
  				
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-war-plugin</artifactId>
			<version>2.4</version>
			
			<configuration>
			<warSourceDirectory>src/main/webapp</warSourceDirectory>
			<failOnMissingWebXml>false</failOnMissingWebXml>
			
			</configuration>
  				</plugin>
  			</plugins>
  		</pluginManagement>
  
  
  </build>
  
  
</project>


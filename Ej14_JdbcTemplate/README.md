# JDBC Template

Esta parte de spring esta pensanda para que de una manera basica nos ayude a interactuar con una base de datos. Este motor se apoya en JDBC para hacer las peticiones contra la BBDD.

## Configuracion

A parte de las librerias core de Spring habria que meter las librerías  de JDBC Template. Además debemos de meter los drivers de conexion contra la bbdd que usemos.

	<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.framework.version}</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>${spring.framework.version}</version>
		</dependency>
				
		<dependency>
		    <groupId>mysql</groupId>
		    <artifactId>mysql-connector-java</artifactId>
		    <version>8.0.26</version>
		</dependency>
		
Lo siguiente seria crear la tabla de BBDD, para ello podemos ejecutar la clase es.curso.main.MainCrearTabla

Aun así, tenemos que crear el schema de BBDD, que este caso se llamará "jdbcTemplate"

## Script de BD

CREATE TABLE cliente (
				id int NOT NULL AUTO_INCREMENT,
				nombre varchar(25) NOT NULL,
				edad int NOT NULL,
				genero varchar(255),
				year int,
				PRIMARY KEY (id)
				);


CREATE TABLE pedido (
				id int NOT NULL AUTO_INCREMENT,
				importe double NOT NULL,
				fecha date NOT NULL,
    				idCliente int,
				PRIMARY KEY (id),
    				FOREIGN KEY (idCliente)
                			REFERENCES cliente(id)
        				ON DELETE CASCADE ON UPDATE CASCADE
				);



package spel.cfg;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spel.entity.Computer;
import spel.entity.Monitor;
import spel.entity.PlacaBase;
import spel.entity.Procesador;
import spel.entity.Ram;
import spel.entity.Raton;
import spel.entity.TarjetaGrafica;
import spel.entity.Teclado;
import spel.marcas.Marca;
import spel.repository.OrdenadorRepository;
import spel.repository.impl.OrdenadorRepositoryImpl;
import spel.service.OrdenadorService;
import spel.service.impl.OrdenadorServiceImpl;
import utils.Util;

@Configuration
@ComponentScan(basePackages = "spel.cfg")
public class ApplicationConfig {

	
}

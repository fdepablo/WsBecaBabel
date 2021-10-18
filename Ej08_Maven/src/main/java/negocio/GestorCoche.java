package negocio;

import java.util.List;

import entidad.Coche;
import persistencia.DaoCocheMysql;
import persistencia.interfaz.DaoCoche;

public class GestorCoche {
	private DaoCoche cocheDao = null;
	private CochesToExcel cte = null;
	private CochesToPdf ctp = null;
	
	public boolean alta(Coche c){
		if(c.getMatricula().length() == 7
				&& c.getMarca()!= null 
				&& c.getModelo()!=null) {
			
			boolean alta = cocheDao.alta(c);
			return alta;
		}
		return false;
	}
	public boolean modificar(Coche c) {
		if(c.getMatricula().length() == 7
				&& c.getMarca()!= null 
				&& c.getModelo()!=null) {
			
			boolean modif = cocheDao.modificar(c);
			return modif;
		}
		return false;
	}
	public boolean baja (String matricula) {
		boolean baja = cocheDao.baja(matricula);
		return baja;
	}
	
	public Coche obtener(String matricula) {
		Coche c = cocheDao.obtener(matricula);
		return c;
	}
	 public List<Coche> listar(){
		 List <Coche> lista = cocheDao.listar();
		 return lista;
	 }
	 
	 public void generarFicheroExcel() throws Exception{
		 cte.generarFichero(listar());
	 }
	
	 public void generarFicheroPdf() throws Exception{
		 ctp.generarFichero(listar());
	 }
}
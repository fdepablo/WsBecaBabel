package negocio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

import entidad.Coche;

public class CochesToExcel {
	public void generarFichero(List<Coche> lista) throws Exception{
		// Creo la estructura
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		workbook.setSheetName(0, "Hoja Excel");

		// Formato
		String headers[] = new String[] { "Matricula", "Marca", "Modelo", "Numero KM" };
		CellStyle headerStyle = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setBold(true);
		headerStyle.setFont(font);

		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// Creacion de la tabla
		HSSFRow headerRow = sheet.createRow(0);
		for (int i = 0; i < headers.length; ++i) {
			String header = headers[i];
			HSSFCell cell = headerRow.createCell(i);
			cell.setCellStyle(headerStyle);
			cell.setCellValue(header);
		}
		int contador = 1;
		for (Coche coche : lista) {
			HSSFRow dataRow = sheet.createRow(contador++);

			dataRow.createCell(0).setCellValue(coche.getMatricula());
			dataRow.createCell(1).setCellValue(coche.getMarca());
			dataRow.createCell(2).setCellValue(coche.getModelo());
			dataRow.createCell(3).setCellValue(coche.getNumeroKm());
		}

		FileOutputStream file;
		try {
			file = new FileOutputStream("data.xls");
			workbook.write(file);
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}
}

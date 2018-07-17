package co.com.bancolombia.certification.technical_challenge_mobile.utilities;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	private String sheet;
	private String[][] moviesList = new String[3][2];

	public WriteExcel(String sheet, String[][] moviesList) {
		this.sheet = sheet;
		this.moviesList = moviesList;
	}

	public void setSheet(String sheet) {
		this.sheet = sheet;
	}

	public void setMoviesList(String[][] moviesList) {
		this.moviesList = moviesList;
	}

	public void start() {

		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja1 = libro.createSheet(sheet);

		// cabecera de la hoja de excel
		String[] header = new String[] { "Movies " + sheet, "Date" };

		// poner negrita a la cabecera
		CellStyle style = libro.createCellStyle();
		Font font = libro.createFont();
		((XSSFFont) font).setBold(true);
		style.setFont(font);

		// generar los datos para el documento
		for (int i = 0; i < 4; i++) {
			XSSFRow row = hoja1.createRow(i);// se crea las filas
			for (int j = 0; j < header.length; j++) {
				if (i == 0) {// para la cabecera
					XSSFCell cell = row.createCell(j);// se crea las celdas para la cabecera, junto con la posición
					cell.setCellStyle(style); // se añade el style crea anteriormente
					cell.setCellValue(header[j]);// se añade el contenido
				} else {// para el contenido
					XSSFCell cell = row.createCell(j);// se crea las celdas para la contenido, junto con la posición
					cell.setCellValue(moviesList[i - 1][j]); // se añade el contenido
				}
			}
		}

		File file;
		file = new File("cinephile" + sheet + ".xlsx");
		try {
			if (file.exists()) {// si el archivo existe se elimina
				file.delete();
			}
			FileOutputStream fileOuS = new FileOutputStream(file);
			libro.write(fileOuS);
			fileOuS.flush();
			fileOuS.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

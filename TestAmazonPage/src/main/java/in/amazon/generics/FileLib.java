package in.amazon.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * Generic class for Data Driven Testing
 * @author PRANAV
 *
 */
public class FileLib {
	/**
	 * Generic method to read data from property file
	 * @param key
	 * @return String Value
	 * @throws IOException
	 */
	public String getPropertyValue(String key,String path) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
	/**
	 * Generic method to read data from Excel file
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @param path
	 * @return String data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int rownum,int cellnum,String path) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		return data;
		
	}
	/**
	 * Generic method to write data to Excel file
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @param value
	 * @param path
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetName,int rownum,int cellnum,String value,String path) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
	

}

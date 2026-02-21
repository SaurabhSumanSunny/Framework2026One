import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExOne {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream Fis=new FileInputStream("D://Book1.xlsx");
Workbook wb=WorkbookFactory.create(Fis);
Cell c=wb.getSheet("Sheet1").getRow(0).getCell(0);
String v=c.toString();
int rc=wb.getSheet("Sheet1").getLastRowNum();
System.out.println(rc);
System.out.println(v);
c.setCellValue("managertwo");
FileOutputStream Fos=new FileOutputStream("D://Book1.xlsx");
wb.write(Fos);
	}

}

package files.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
FileInputStream file= new FileInputStream("D:\\business data\\UserLogin.xls");   //FileInputStream is an inbuild class of Poi used to read path of the file

		HSSFWorkbook wb=new HSSFWorkbook(file);  //HSSFWorkbook used to go inside a workbook
	
		/*HSSFSheet sheet= wb.getSheetAt(0);              // HSSFSheet to get into sheet 
		
		HSSFRow row=sheet.getRow(0);
	    
	    HSSFCell cell=row.getCell(0);
	    
	    String str= cell.getStringCellValue();
	    
	    System.out.println(str);
*/	   
	   String val=wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
	   System.out.println(val);
	   int row=wb.getSheetAt(1).getLastRowNum();
	   int cols=wb.getSheetAt(1).getRow(0).getLastCellNum();
	   System.out.println("Rows ="+row+", cols="+cols);
	   
	   
	   for(int r=1; r<=row;r++){
		   
		   for(int c=0;c<cols;c++)
		   {
			   System.out.print(wb.getSheetAt(1).getRow(r).getCell(c).getStringCellValue()+" ");  //gives output in single line
		   }
		   
		   System.out.println();
	   }
	
	   
	   
	}

}

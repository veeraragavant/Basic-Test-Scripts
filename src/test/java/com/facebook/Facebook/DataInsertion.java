package com.facebook.Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInsertion {

	public static void writingxl(int r, int c, String value) throws IOException {
		
		String path = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\target\\BookDetails.xlsx";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(r);
		Cell cell = row.getCell(c);
		
//		if (row==null) {
//	     sheetAt.createRow(r);
//	     }
//
//		if (cell==null) {
//			row.createCell(c);
//		}

		cell.setCellValue(value);
		FileOutputStream os = new FileOutputStream(f);
		wb.write(os);
		wb.close();

	}
	
	public static void main(String[] args) throws IOException {
		
		List<String> str = new ArrayList<String>();
		str.add("Java");
		str.add("Python");
		str.add("C++");
		str.add(".Net");
		str.add("SQL");
		System.out.println(str);
		
		int a = 0;
		
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {				
			writingxl(i, j, str.get(a));
			a++;	
			}
			
		}
		
		
	}
	
}

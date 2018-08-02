package tests;

import utilities.ExcelUtils;

public class ExcelFileTest {

	public static void main(String[] args) {
		ExcelUtils.openExcelSheet("/Users/cybertekchicago-1/Desktop/data.xlsx", "dataHere");
		int rows = ExcelUtils.getUsedRows();
		for(int row = 0; row < rows; row++) {
			String value = ExcelUtils.getData(row, 0);
			ExcelUtils.setData(value, row, 1);
		}
		System.out.println("done");
	}
}

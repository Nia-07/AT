package CommonMethods;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    public void readExcelFile(String filepath, List<String> listToSearch, String value) throws InvalidFormatException {
        try{
            File file = new File(filepath);
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            int indexToSearch = 10000;
            int i = 0;

            for(Row row: sheet){
                int j = 0;
                ArrayList<String> rowList = new ArrayList();
                for(Cell cell:row){
                    rowList.add(cell.toString());
                    if(cell.toString().equalsIgnoreCase(value)){
                        indexToSearch = rowList.indexOf(value);
                    }
                    if(i>0 && j == indexToSearch){
                        listToSearch.add(cell.toString());
                    }
                    j++;
                }
                i++;
            }
        }catch(IOException ioException){
            ioException.printStackTrace();
        }
    }




}

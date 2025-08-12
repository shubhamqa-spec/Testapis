package api.utils;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "Data")
    public String[][] getAllData() throws IOException {
        String path = System.getProperty("user.dir") + "//testData//testdata.xlsx";

        int rownum = XLUtils.getRowCount(path,"Sheet1");
        int cellcount = XLUtils.getCellCount(path,"Sheet1", 0);

        String apidata[][] = new String[rownum][cellcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < cellcount; j++) {
                apidata[i - 1][j] = XLUtils.getCellData(path,"Sheet1", i, j);
            }
        }
        
    

        return apidata;
    }



@DataProvider(name = "useremail")
public String[] getUserEmails() throws IOException {
    String path = System.getProperty("user.dir") + "//testData//testdata.xlsx";

    int rownum = XLUtils.getRowCount(path,"Sheet1");

    String apidata[] = new String[rownum];

    for (int i = 1; i <= rownum; i++) {
        apidata[i - 1] = XLUtils.getCellData(path,"Sheet1", i, 1);
    }

    return apidata;
}

}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: tao
 * @date: 2022年03月14日 15:10
 */
public class csvUtils {
//    public static void main(String[] args) {
//        //String csvFile = "/Users/tao/HW-RT/src/data/qos.csv";
//        //String csvFile = "/Users/tao/HW-RT/src/data/demand.csv";
//        String csvFile = "/Users/tao/HW-RT/src/data/site_bandwidth.csv";
//        //String[][] res = getCsv(csvFile);
//        String iniFile = "/Users/tao/HW-RT/src/data/config.ini";
//        String val = getIni(iniFile);
////        for (int i = 0; i < res.length; ++i) {
////            for (int j = 0; j < res[i].length; ++j)
////                System.out.print(res[i][j]+" ");
////            System.out.println();
////        }
//        System.out.println(val);
//    }

    public static String[][] getCsv(String csvFile){
        String line = "";
        String cvsSplitBy = ",";
        String[][] res;
        List<String[]> list = new ArrayList<String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                list.add(line.split(cvsSplitBy));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        res = new String[list.size()][];
        list.toArray(res);
        return res;
    }
    public static String getIni(String iniFile){
        String line = "";
        String res = "";
        try(BufferedReader br = new BufferedReader(new FileReader(iniFile));){
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split("=");
                if (i==1){
                    res = temp[1];
                }
                i++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return res;
    }
}

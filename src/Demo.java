/**
 * @Description: TODO
 * @author: tao
 * @date: 2022年03月14日 15:06
 */
public class Demo {
    public static void main(String[] args) {
        //git test
        String[][] demand = csvUtils.getCsv("/Users/tao/HW-RT/src/data/demand.csv");
        String[][] qos = csvUtils.getCsv("/Users/tao/HW-RT/src/data/qos.csv");
        String[][] site_bandwidth = csvUtils.getCsv("/Users/tao/HW-RT/src/data/site_bandwidth.csv");
        String qos_constraint = csvUtils.getIni("/Users/tao/HW-RT/src/data/config.ini");
        System.out.println("github");
    }
}

package Com;

import com.opencsv.bean.CsvBindByName;

public class StateCodeCsv {
    @CsvBindByName(column = "SrNo", required = true)
    public String srNo;

    @CsvBindByName(column = "stateName", required = true)
    public String stateName;

    @CsvBindByName(column = "TIN", required = true)
    public int tin;

    @CsvBindByName(column = "StateCode", required = true)
    public String stateCode;

    @Override
    public String toString() {
        return "IndiaStateCodeCSV{" +
                "srNo='" + srNo + '\'' +
                ", stateName=" + stateName +
                ", tin=" + tin +
                ", stateCode=" + stateCode +
                '}';
    }
}
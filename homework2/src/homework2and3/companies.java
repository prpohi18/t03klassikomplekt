package homework2and3;
import java.util.Calendar;

public class companies {
    protected String company;
    protected int revenue;
    protected int foundedAt;
    protected int employees;
    
    public companies(String company, int revenue, int foundedAt, int employees){
        this.company = company;
        this.revenue=revenue;
        this.foundedAt=foundedAt;
        this.employees=employees;
    }
    
    public int revenuePerEmployee(){
        return revenue/employees;
    }

    
    public int activeYears() {
        int year = Calendar.getInstance().get(Calendar.YEAR); //    from https://stackoverflow.com/questions/136419/get-integer-value-of-the-current-year-in-java
        return year-foundedAt;
    }
    
}

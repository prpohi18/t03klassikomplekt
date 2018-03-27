package homework2and3;

public class clients {
    protected String customerName;
    protected int budget;
    protected int projects;
    protected int minRequiredRevenue;

    
    public clients(String customerName, int budget, int projects, int minRequiredRevenue){
        this.customerName = customerName;
        this.budget = budget;
        this.projects = projects;
        this.minRequiredRevenue = minRequiredRevenue;
    }
    
    public int projectValue(){
        return budget/projects;
    }
    

    

}


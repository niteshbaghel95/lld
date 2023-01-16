package modules;

import java.util.List;

public class Expense {
    private int spent;
    private Users payingUser;
    private List<Users> payesList;
    private ExpenseType expenseType;
    private List<Integer> persentShare;
    public Expense(int spent, Users payingUser, List<Users> payesList, ExpenseType expenseType,
            List<Integer> persentShare) {
        this.spent = spent;
        this.payingUser = payingUser;
        this.payesList = payesList;
        this.expenseType = expenseType;
        this.persentShare = persentShare;
    }
    public Expense(int spent, Users payingUser, List<Users> payesList, ExpenseType expenseType) {
        this.spent = spent;
        this.payingUser = payingUser;
        this.payesList = payesList;
        this.expenseType = expenseType;
    }
    public int getSpent() {
        return spent;
    }
    public void setSpent(int spent) {
        this.spent = spent;
    }
    public Users getPayingUser() {
        return payingUser;
    }
    public void setPayingUser(Users payingUser) {
        this.payingUser = payingUser;
    }
    public List<Users> getPayesList() {
        return payesList;
    }
    public void setPayesList(List<Users> payesList) {
        this.payesList = payesList;
    }
    public ExpenseType getExpenseType() {
        return expenseType;
    }
    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }
    public List<Integer> getPersentShare() {
        return persentShare;
    }
    public void setPersentShare(List<Integer> persentShare) {
        this.persentShare = persentShare;
    }
    
    
}

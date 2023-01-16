package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modules.Expense;
import modules.ExpenseType;
import modules.Users;

public class ExpenseMap {

    private static ExpenseMap instance = null;
    private Map<Users,List<Expense>> userExpenseList;

    public static ExpenseMap getInstance()
    {
        if(instance == null)
        {
            instance = new ExpenseMap();
        }
        return instance;
    }

    public Map<Users, List<Expense>> getUserExpenseList() {
        return userExpenseList;
    }

    public void setUserExpenseList(Map<Users, List<Expense>> userExpenseList) {
        this.userExpenseList = userExpenseList;
    }

    private ExpenseMap()
    {
        userExpenseList = new HashMap<>();
    }

    public Expense addExpenseInMap(int spent, Users payingUser , List<Users> payesList, ExpenseType expenseType, 
    List<Integer> persentShare)
    {
        Expense expense = new Expense(spent, payingUser, payesList, expenseType,persentShare);
        List<Expense> list  = userExpenseList.getOrDefault(payingUser, new ArrayList<>());
        list.add(expense);
        userExpenseList.put(payingUser, list);
        return expense;
    }
    
    public Expense addExpenseInMap(int spent, Users payingUser , List<Users> payesList, ExpenseType expenseType)
    {
        Expense expense = new Expense(spent, payingUser, payesList, expenseType);
        List<Expense> list  = userExpenseList.getOrDefault(payingUser, new ArrayList<>());
        list.add(expense);
        userExpenseList.put(payingUser, list);
        return expense;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Customer;

/**
 *
 * @author dattvi
 */
public class AccountDetailsForm {
    private String accountNum;
    private int custId;
    private String creditCardActive;
    private String debitCardActive;
    private String creditNo;
    private String debitNo;
    private String creditLimit;
    private double totalBalance;
    private String accType;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
    

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCreditCardActive() {
        return creditCardActive;
    }

    public void setCreditCardActive(String creditCardActive) {
        this.creditCardActive = creditCardActive;
    }

    public String getDebitCardActive() {
        return debitCardActive;
    }

    public void setDebitCardActive(String debitCardActive) {
        this.debitCardActive = debitCardActive;
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }

    public String getDebitNo() {
        return debitNo;
    }

    public void setDebitNo(String debitNo) {
        this.debitNo = debitNo;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
    
    
    
}

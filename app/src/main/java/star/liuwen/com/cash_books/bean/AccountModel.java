package star.liuwen.com.cash_books.bean;

/**
 * Created by liuwen on 2017/1/6.
 */
public class AccountModel {

    private Long id;
    private String AccountType;
    private String Data;
    private String Money;
    private String ConsumeType;
    private int url;
    private String timeMinSec;
    public AccountType mAccountType;


    public AccountModel() {
    }

    public enum AccountType {
        zhiChu, shouRu;
    }

    public AccountModel(String accountType, String data, String money, String consumeType, int url, String timeMinSec, AccountModel.AccountType accountType1) {
        AccountType = accountType;
        Data = data;
        Money = money;
        ConsumeType = consumeType;
        this.url = url;
        this.timeMinSec = timeMinSec;
        mAccountType = accountType1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }

    public String getConsumeType() {
        return ConsumeType;
    }

    public void setConsumeType(String consumeType) {
        ConsumeType = consumeType;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public String getTimeMinSec() {
        return timeMinSec;
    }

    public void setTimeMinSec(String timeMinSec) {
        this.timeMinSec = timeMinSec;
    }
}

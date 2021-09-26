
package model;

import java.util.Date;

public class Sales {
    
    private int id;
    private String partname;
    private double pricewithgst;
    private String company;
    private String modelname;
    private String type;
    private int year;
    private String code;
    private int quantity;
    private int available;
    private String cname;
    private String ccontact;
    private String caddress;
    private String gstnumber;
    private Date saledate;
    private Double totalamt;
    private Double amount;
    private String invoiceno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public double getPricewithgst() {
        return pricewithgst;
    }

    public void setPricewithgst(double pricewithgst) {
        this.pricewithgst = pricewithgst;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCcontact() {
        return ccontact;
    }

    public void setCcontact(String ccontact) {
        this.ccontact = ccontact;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String getGstnumber() {
        return gstnumber;
    }

    public void setGstnumber(String gstnumber) {
        this.gstnumber = gstnumber;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public Double getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(Double totalamt) {
        this.totalamt = totalamt;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }
    
    
}

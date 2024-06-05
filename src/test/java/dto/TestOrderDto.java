package dto;

public class TestOrderDto {
    String status;
    int courierID;
    String customerName;
    String customerPhone;
    String comment;
    long id;

    public TestOrderDto( String customerName, String customerPhone, String comment) {
        this.status = "OPEN";
        this.courierID = 0;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.comment = comment;
        this.id = 0;
    }

    public TestOrderDto() {
        this.status = "OPEN";
        this.id = 0;
        this.courierID = 0;
    }

    // setters method
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}






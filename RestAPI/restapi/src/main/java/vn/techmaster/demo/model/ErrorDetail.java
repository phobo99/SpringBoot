package vn.techmaster.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorDetail {
    private java.util.Date errorTime;
    private String message;
    private String detail;

    public ErrorDetail(String name, String detail) {
        this.message = message;
        this.detail = detail;
        this.errorTime = new Date();
    }
}

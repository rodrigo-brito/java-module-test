package br.ufmg.model;

public class Response {
    private String code = null;
    private String message = null;
    ResponseData data;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public ResponseData getData() {
        return data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }
}
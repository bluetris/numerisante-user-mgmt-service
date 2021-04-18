package com.numerisante.usermgmt.dto;


import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.numerisante.usermgmt.constants.CommonConstants;

public class AppResponse implements Serializable {

    private static final long serialVersionUID = 7789284253047806745L;
    private Object data;
    private boolean success = true;
    private String message ;

    @JsonFormat(pattern = CommonConstants.DATE_TIME_FORMAT)
    private Date timestamp = new Date();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
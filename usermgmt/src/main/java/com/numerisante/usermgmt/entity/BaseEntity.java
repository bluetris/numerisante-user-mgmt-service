package com.numerisante.usermgmt.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.numerisante.usermgmt.constants.CommonConstants;


@MappedSuperclass
public class BaseEntity extends Serializable {

    private static final long serialVersionUID = 1L;

	private Boolean isDeleted = Boolean.FALSE;

	@JsonFormat(pattern = CommonConstants.DATE_TIME_FORMAT)
	private Date createdAt;

	@JsonFormat(pattern = CommonConstants.DATE_TIME_FORMAT)
	private Date updatedAt;

	@PrePersist
	public void prePersist() {
		this.createdAt = Calendar.getInstance().getTime();
	}

	@PreUpdate
	public void preUpdate() {
		this.updatedAt = Calendar.getInstance().getTime();
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date submittedAt) {
		this.createdAt = submittedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
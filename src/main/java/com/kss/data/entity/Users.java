package com.kss.data.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ROLE_ID")
	private String roleId;
	
	@Column(name="INSERT_TS")
	private Date insertTS;
	
	@Column(name="INSERTED_BY")
	private String insertedBy;
	
	@Column(name="UPDATE_TS")
	private Date updateTS;
	
	@Column(name="UPDATED_BY")
	private String upatedBy;
	
	@Column(name="SALT")
	private String salt;
	

	

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the insertTS
	 */
	public Date getInsertTS() {
		return insertTS;
	}

	/**
	 * @param insertTS the insertTS to set
	 */
	public void setInsertTS(Date insertTS) {
		this.insertTS = insertTS;
	}

	/**
	 * @return the insertedBy
	 */
	public String getInsertedBy() {
		return insertedBy;
	}

	/**
	 * @param insertedBy the insertedBy to set
	 */
	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	/**
	 * @return the updateTS
	 */
	public Date getUpdateTS() {
		return updateTS;
	}

	/**
	 * @param updateTS the updateTS to set
	 */
	public void setUpdateTS(Date updateTS) {
		this.updateTS = updateTS;
	}

	/**
	 * @return the upatedBy
	 */
	public String getUpatedBy() {
		return upatedBy;
	}

	/**
	 * @param upatedBy the upatedBy to set
	 */
	public void setUpatedBy(String upatedBy) {
		this.upatedBy = upatedBy;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", roleId=" + roleId
				+ ", insertTS=" + insertTS + ", insertedBy=" + insertedBy + ", updateTS=" + updateTS + ", upatedBy="
				+ upatedBy + "]";
	}
	
	

}

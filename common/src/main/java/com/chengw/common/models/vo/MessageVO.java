package com.chengw.common.models.vo;

import com.chengw.common.enums.StatusCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chengw
 */
@JsonInclude(value = Include.NON_NULL)
@Data
public class MessageVO<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 请求成功完成后返回的数据 根据不同的api 需求 返回的数据可能是 object 也可能是 array */
	protected T data;

	/** 操作成功标识，true成功，false失败  */
	protected boolean success;

	/** 操作代码 200表示操作成功 */
	protected int code;

	/**
	 * 提示信息。
	 * <p>未赋值，默认为空值或空字符串时，返回字符串中没有该变量（被Json过滤掉了）；</p>
	 */
	protected String message = "";

	public MessageVO() {
	}

	public MessageVO(StatusCode bo) {
		this(bo.getCode(), null, bo.getMessage());
	}

	public MessageVO(String message) {
		this(StatusCode.FAIL.getCode(), null, message);
	}

	public MessageVO(int code) {
		this.setCode(code);
	}

	public MessageVO(int code, String message) {
		this(code, null, message);
	}

	public MessageVO(int code, T data) {
		this(code, data, null);
	}

	public MessageVO(int code, T data, String message) {
		if (data != null) {
			this.data = data;
		}
		this.message = message;
		this.setCode(code);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
		if (this.code == StatusCode.OK.getCode()) {
			this.success = true;
			if (message == null || message.equals("")) {
				this.message = StatusCode.OK.getMessage();
			}
		} else {
			this.success = false;
			if (message == null || message.equals("")) {
				this.message = StatusCode.FAIL.getMessage();
			}
		}
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}

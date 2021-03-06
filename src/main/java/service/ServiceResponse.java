package service;

public class ServiceResponse {

	private double version = 1.0;
	private Integer code = ResponseStatus.SUCCESS.getCode();
	private String description = ResponseStatus.SUCCESS.getDescription();
	private Object result;

	public ServiceResponse() {
		super();
	}
	
	public ServiceResponse(ResponseStatus responseStatus) {
		super();
		this.code = responseStatus.getCode();
		this.description = responseStatus.getDescription();
	}
	
	public ServiceResponse(Integer code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public ServiceResponse(double version, Integer code, String description, Object result) {
		super();
		this.version = version;
		this.code = code;
		this.description = description;
		this.result = result;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public void changeStatus(ResponseStatus responseStatus, Object result) {
		if (null == responseStatus) {
			return;
		}
		setResult(result);
		setCode(responseStatus.getCode());
		setDescription(responseStatus.getDescription());
	}
}



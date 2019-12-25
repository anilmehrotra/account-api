package com.ms.accounts.property.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiInfo {
	private String apiName;
	private String fieldName;
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	@Override
	public String toString() {
		return "ApiInfo [apiName=" + apiName + ", fieldName=" + fieldName + "]";
	}
	
}

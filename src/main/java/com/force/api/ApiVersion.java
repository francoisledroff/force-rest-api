package com.force.api;

public class  ApiVersion {

	public static ApiVersion DEFAULT_VERSION = new ApiVersion("v27.0");

	private String value;
	
	public ApiVersion(String value) {
		this.value=value;
	}

    public String getValue()
    {
        return this.value;
    }

    @Override
    public String toString()
    {
        return this.value;
    }
}
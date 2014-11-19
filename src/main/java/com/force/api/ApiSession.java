package com.force.api;

import com.google.gson.annotations.SerializedName;

public class ApiSession implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("access_token") String accessToken;
	@SerializedName("instance_url") String apiEndpoint;
    @SerializedName("refresh_token") String refreshToken;

	public ApiSession() {}
	
	public ApiSession(String accessToken, String apiEndpoint) {
		this.accessToken = accessToken;
		this.apiEndpoint = apiEndpoint;
	}

	public String getAccessToken() {
		return accessToken;
	}
	public String getApiEndpoint() {
		return apiEndpoint;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public ApiSession setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		return this;
	}
	public ApiSession setApiEndpoint(String apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
		return this;
	}

	public ApiSession setRefreshToken(String value) {
		refreshToken = value;
		return this;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiSession that = (ApiSession) o;

        if (!accessToken.equals(that.accessToken)) return false;
        if (!apiEndpoint.equals(that.apiEndpoint)) return false;
        if (!refreshToken.equals(that.refreshToken)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accessToken.hashCode();
        result = 31 * result + apiEndpoint.hashCode();
        result = 31 * result + refreshToken.hashCode();
        return result;
    }
}

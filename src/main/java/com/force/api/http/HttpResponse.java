package com.force.api.http;


import com.force.api.Constants;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class HttpResponse {

    private byte[] byteResponse;
    private int responseCode;

    public int getResponseCode() {
        return responseCode;
    }

    public String getString() {
        if (byteResponse != null) {
            try {
                return new String(byteResponse, Constants.ENCODING_UTF8);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Cannot decode string content", e);
            }
        }
        return null;
    }

    public byte[] getByte() {
        return byteResponse;
    }

    public HttpResponse setString(String stringResponse) {
        this.byteResponse = stringResponse.getBytes();
        return this;
    }

    public HttpResponse setByte(byte[] byteResponse) {
        this.byteResponse = byteResponse;
        return this;
    }

    public HttpResponse setStream(InputStream streamResponse) {
        try {
            this.byteResponse = IOUtils.toByteArray(streamResponse);
            return this;
        } catch (IOException e) {
            throw new RuntimeException(e); //TODO ugly stuff
        }

    }

    public HttpResponse setResponseCode(int value) {
        responseCode = value;
        return this;
    }


}

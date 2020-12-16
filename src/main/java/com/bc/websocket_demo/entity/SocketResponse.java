package com.bc.websocket_demo.entity;

/**
 * @Description
 * @Author Roger
 * @Date 2020/12/15
 */
public class SocketResponse {

    private String responseMessage;

    public SocketResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
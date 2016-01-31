package com.kaznowski.hugh.homepage.models;

/**
 * Created by hugh on 29/01/16.
 */
public class HomepageResponse {
    private String msg;
    private Long time;
    public HomepageResponse() {

    }

    /**
     * Getter method for msg
     *
     * @return value of msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter method for msg
     *
     * @param msg the value to be assigned to msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Getter method for time
     *
     * @return value of time
     */
    public Long getTime() {
        return time;
    }

    /**
     * Setter method for time
     *
     * @param time the value to be assigned to time
     */
    public void setTime(Long time) {
        this.time = time;
    }
}

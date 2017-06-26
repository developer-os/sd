package com.chen.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
public class Result implements Serializable {
    public static final int SUCCESS = 1;
    public static final int FAILURE = -1;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    private static final long serialVersionUID = -4786411890548488101L;
    private boolean success = false;
    private String msg = "";

    public boolean isSuccess() {
        return success;
    }

    public String getMsg() {
        return msg;
    }

    private Object obj = null;

}

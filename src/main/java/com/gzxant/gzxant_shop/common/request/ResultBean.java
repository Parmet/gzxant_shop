package com.gzxant.gzxant_shop.common.request;

import java.io.Serializable;

/**
 * 接口返回数据模型
 *
 * @author hfb
 * @date 2017/9/18
 */
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = -6248298306422072592L;
    /**
     * 表示接口调用成功
     */
    public static final int SUCCESS = 0;
    /**
     * 表示接口调用失败
     */
    public static final int FAIL = 1;
    /**
     * 表示没有权限调用该接口
     */
    public static final int NO_PERMISSION = 2;

    public static final String NO_LOGIN_MSG = "老铁，这是需要登陆的！";
    public static final String NO_PERMISSION_MSG = "不许碰我！";
    public static final String SUCC_MSG = "看到了吧！";
    public static final String FAIL_MSG = "我现在不行，有点忙！";

    private String message = SUCC_MSG;
    private int state = SUCCESS;
    /**
     * 返回的数据
     */
    private T data;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;
    }

    /**
     * 包装异常信息
     *
     * @param e
     */
    public ResultBean(Throwable e) {
        super();
        this.message = e.getMessage();
        this.state = FAIL;
    }

    public ResultBean(String message) {
        super();
        this.message = message;
        this.state = FAIL;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "message='" + message + '\'' +
                ", state=" + state +
                ", data=" + data +
                '}';
    }
}

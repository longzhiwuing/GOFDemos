package com.lzw.chainofresp;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/11
 * Time: 16:29
 */
public class HandlerC extends Handler {
    public void handleRequest(int request) {
        if (request > 10) {
            System.out.println("HandlerC handle request...");
        } else {
            this.handler.handleRequest(request);
        }
    }
}

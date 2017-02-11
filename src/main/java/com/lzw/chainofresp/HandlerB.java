package com.lzw.chainofresp;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/11
 * Time: 16:29
 */
public class HandlerB extends Handler {
    public void handleRequest(int request) {
        if (1 < request && request < 10) {
            System.out.println("HandlerB handle request...");
        }else{
            this.handler.handleRequest(request);
        }
    }
}

package com.lzw.observer;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/17
 * Time: 21:32
 */
public class ASubject extends Subject{

    private String subjectState;

    public ASubject(String subjectState) {
        this.subjectState = subjectState;
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    @Override
    void showState() {
        System.out.println("ASubject状态:"+subjectState);
    }
}

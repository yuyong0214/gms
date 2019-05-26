package com.yong.gmspro.controller.admin;

/**
 * @author: YUY
 * @date: 2019/5/24 8:50
 */
public class TestClass {
    public int i = 2;
    static public int m = 3;

    public static void main(String[] args) {
        try{
            m=23;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            m = 33;
        }
    }

}

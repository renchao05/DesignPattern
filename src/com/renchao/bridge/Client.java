package com.renchao.bridge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("===========");
        UpRightPhone upRightPhone = new UpRightPhone(new ViVo());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
    }
}

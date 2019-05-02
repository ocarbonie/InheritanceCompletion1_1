package com.company;

public class Main {

    public static void main(String[] args) {

        Book novel = new Book();
        novel.setAuthor("A.J Bently");
        novel.setPages(450);
        novel.setPrice(45.20);
        novel.setCode("AIBCC");
        novel.setDescription("A made up book about life");
        System.out.println(novel.toString());

        Software sft = new Software();
        sft.setProgrammer("Jack Black");
        sft.getProgrammer();
        sft.setPlatform("Chrome");
        sft.setOs("Windows");
        System.out.println(sft.toString());


    }
}

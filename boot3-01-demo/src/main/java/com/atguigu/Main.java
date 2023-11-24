package com.atguigu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.test("202305"));
        System.out.println(Main.test(null));
    }

    public static String test(String date){
        String df;
        if (date == null){
            df = DateTimeFormatter.ofPattern("yyyyMM").format(LocalDate.now().minusMonths(1L));
        }else {
            df = date.substring(0, 6);
        }
        return df;
    }
}
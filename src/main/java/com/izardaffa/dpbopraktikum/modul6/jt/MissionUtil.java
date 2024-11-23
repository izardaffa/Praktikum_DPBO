package com.izardaffa.dpbopraktikum.modul6.jt;

import java.text.NumberFormat;
import java.util.Locale;

public class MissionUtil {
    public static String moneyFormat(int price) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(price);
    }
}

package com.nolovr.core.lancet;

import android.util.Log;

import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public class ToolsLancet {

    @TargetClass("com.nolovr.core.lancet.Tools")
    @Insert("evilCode")
    public static void evilCode() {
        Log.d("llg", "evilCode: yyyyyy");
    }


    @TargetClass("com.nolovr.core.lancet.Tools")
    @Insert("evilCodeX")
    public int evilCodeX(int a,int b) {
        Log.d("llg", "evilCodeX: gggggg");
        return a+b+100;
    }

}

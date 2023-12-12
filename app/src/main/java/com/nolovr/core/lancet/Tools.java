
package com.nolovr.core.lancet;

import android.util.Log;

public class Tools {

    public static void evilCode() {
//        int a = 1 / 0;
        Log.e("llg", "evilCode: xxxxxxxxxxxxxxxxxxxx");
    }

    public int evilCodeX(int a, int b) {
//        int a = 1 / 0;
        int ret = a + b;
        Log.e("llg", "evilCodeX: xxxxxxxxxxxxxxxxxxxx  " + ret);
        return ret;
    }
}

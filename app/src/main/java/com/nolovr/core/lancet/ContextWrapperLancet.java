package com.nolovr.core.lancet;

import android.util.Log;

import java.io.File;
import java.io.IOException;

import me.ele.lancet.base.Origin;
import me.ele.lancet.base.Scope;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class ContextWrapperLancet {

    // public File getObbDir()

    @TargetClass(value = "java.io.File",scope = Scope.ALL)
    @Proxy("mkdirs")
    public boolean mkdirs() {
        Log.d("llg", "mkdirs: ");
//        return (boolean)Origin.call();
        return false;
    }


    @TargetClass("java.io.InputStream")
    @Proxy("read")
    public int read(byte[] bytes) throws IOException {
        try {
            return (int) Origin.<IOException>callThrowOne();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }


    @Proxy("d")
    @TargetClass("android.util.Log")
    public static int anyName(String tag, String msg) {
        msg = msg + "=============lancet";
        return (int) Origin.call();
    }


//
//
//    @TargetClass(value = "android.content.ContextWrapper", scope = Scope.ALL)
//    @Proxy("getObbDir")
//    public File getObbDir2() {
//        Log.d("llg", "getObbDir2: hahahh::::::::::::");
//        return null;
//    }
//
//    @TargetClass(value = "android.content.ContextWrapper", scope = Scope.ALL)
//    @Proxy("getObbDirs")
//    public File getObbDir2sssssss() {
//        Log.d("llg", "getObbDir2: hahahh::::::::::::");
//        return null;
//    }
//    //Contextlmpl
//
//    //android.app.Contextlmpl
//    @TargetClass(value = "android.app.ContextImpl", scope = Scope.ALL)
//    @Insert("getObbDir")
//    public File getObbDir3() {
//        Log.d("llg", "getObbDir3: hahahh::::::::::::");
//        return null;
//    }
//
//
//    @TargetClass(value = "android.app.ContextImpl", scope = Scope.ALL)
//    @Insert("getObbDirs")
//    public File getObbDirs() {
//        Log.d("llg", "getObbDirs: hahahh::::::::::::");
//        return null;
//    }


    //android.app.Contextimpl.getObbDirs
}

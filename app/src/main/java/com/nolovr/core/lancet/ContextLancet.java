package com.nolovr.core.lancet;

import android.util.Log;

import java.io.File;

import me.ele.lancet.base.Scope;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class ContextLancet {



    @TargetClass(value = "android.content.Context", scope = Scope.ALL)
    @Proxy(value = "getObbDirs")
    public File getObbDirs_xx() {
        Log.d("llg", "getObbDir: hahahh::::::::::::");
        return null;
    }

    @TargetClass(value = "android.content.Context", scope = Scope.ALL)
    @Proxy("getObbDir")
    public File getObbDir_xx() {
        Log.d("llg", "getObbDir: hahahh::::::::::::");
        return null;
    }
}

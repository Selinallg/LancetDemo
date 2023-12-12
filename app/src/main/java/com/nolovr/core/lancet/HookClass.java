package com.nolovr.core.lancet;

import android.util.Log;

import java.io.File;

import me.ele.lancet.base.Origin;
import me.ele.lancet.base.Scope;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public class HookClass {

    @TargetClass(value = "androidx.appcompat.app.AppCompatActivity", scope = Scope.LEAF)
    @Insert(value = "onResume", mayCreateSuper = true)
    protected void onResume() {
        Log.d("llg","hello onResume   --------------------------   ");
        Origin.callVoid();
    }



//    // 验证确实 无效
//    @TargetClass(value = "com.nolovr.core.lancet.MainActivity", scope = Scope.ALL)
//    @Insert(value = "getObbDirs")
//    public File getObbDirs_ac() {
//        Log.d("llg", "getObbDir: hahahh::::::::::::");
//        return null;
//    }
//
//    @TargetClass(value = "com.nolovr.core.lancet.MainActivity", scope = Scope.ALL)
//    @Insert("getObbDir")
//    public File getObbDir_ac() {
//        Log.d("llg", "getObbDir: hahahh::::::::::::");
//        return null;
//    }



//    // 验证确实 无效
//    @TargetClass(value = "androidx.appcompat.app.AppCompatActivity", scope = Scope.ALL)
//    @Insert(value = "getObbDirs")
//    public File getObbDirs_ac() {
//        Log.d("llg", "getObbDir: hahahh::::::::::::");
//        return null;
//    }
//
//    @TargetClass(value = "androidx.appcompat.app.AppCompatActivity", scope = Scope.ALL)
//    @Insert("getObbDir")
//    public File getObbDir_ac() {
//        Log.d("llg", "getObbDir: hahahh::::::::::::");
//        return null;
//    }

}


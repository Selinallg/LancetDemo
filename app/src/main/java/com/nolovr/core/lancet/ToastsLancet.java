package com.nolovr.core.lancet;


import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import me.ele.lancet.base.Origin;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class ToastsLancet {

    private static final String TAG = "HookToast";

    @TargetClass("android.widget.Toast")
    @Proxy("show")
    public void show() {
        Log.i(TAG, "Toast方法被调用----------> showToast()");
        showStackTraceLog();
        Origin.callVoid();
    }

    @TargetClass("android.widget.Toast")
    @Proxy("makeText")
    public static Toast makeText(Context context, CharSequence text, int duration) {
        Log.i(TAG, "Toast方法被调用----------> makeText(text)");
        Log.i(TAG, "text = " + text);
        showStackTraceLog();
        return (Toast) Origin.call();
    }

    @TargetClass("android.widget.Toast")
    @Proxy("makeText")
    public static Toast makeText(Context context, int res, int duration) {
        Log.i(TAG, "Toast方法被调用----------> makeText(res)");
        Log.i(TAG, "text = " + context.getString(res));
        showStackTraceLog();
        return (Toast) Origin.call();
    }

    @TargetClass("android.widget.Toast")
    @Proxy("setText")
    public void setText(CharSequence text) {
        Log.i(TAG, "Toast方法被调用----------> setText(text)");
        Log.i(TAG, "text = " + text);
        showStackTraceLog();
        Origin.callVoid();
    }

    @TargetClass("android.widget.Toast")
    @Proxy("setText")
    public void setText(int res) {
        Log.i(TAG, "Toast方法被调用----------> setText(res)");
//        Log.i(TAG, "text = " + Application.getString(res));
        showStackTraceLog();
        Origin.callVoid();
    }

    @TargetClass("android.widget.Toast")
    @Proxy("setView")
    public void setView(View view) {
//        List<TextView> textViewList = FindViewHelper.findTextView(view);
//        for (TextView textView : textViewList) {
//            Log.i(TAG, "Toast方法被调用----------> setView(view)");
//            Log.i(TAG, "text = " + textView.getText().toString());
//            showStackTraceLog();
//        }
        Origin.callVoid();
    }

    private static void showStackTraceLog() {
        //打印堆栈信息
        Log.i(TAG, Log.getStackTraceString(new Throwable()));
    }

}


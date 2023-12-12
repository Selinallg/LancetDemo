package com.nolovr.core.lancet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "llg";
    Context mContext = this;
//    MainActivity mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "88888888", Toast.LENGTH_SHORT).show();

//        Tools.evilCode();
        Tools tools = new Tools();
        int   i     = tools.evilCodeX(3, 7);
        Log.d(TAG, "onCreate: =======---" + i);
//        File obbDir = getObbDir();
        File obbDir = new File("/storage/emulated/0/Android/obb/com.nolovr.core.lancet/xxxxx");
        boolean ret = obbDir.mkdirs();
        if (ret){
            Log.d(TAG, "onCreate: ok");
        }else {
            Log.d(TAG, "onCreate: not xxxxxxx no");
        }
        if (mContext.getObbDir() == null) {
            Log.e(TAG, "onCreate: sucess .....................");
        } else {
            Log.e(TAG, "onCreate: fail  " + mContext.getObbDir().getPath());
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }
}
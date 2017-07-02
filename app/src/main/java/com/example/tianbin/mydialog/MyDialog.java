package com.example.tianbin.mydialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by TianBin on 2017/6/30.
 */

public class MyDialog extends Dialog {
    private static final String TAG = "MyDialog";
    public MyDialog(@NonNull Context context) {
        this(context,R.style.MyDialog);
    }

    public MyDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        init(context);
    }

    private void init(Context mContext){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_dialog);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        findViewById(R.id.iv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        Window win = getWindow();

        WindowManager.LayoutParams lp = win.getAttributes();

//        lp.width = WindowManager.LayoutParams.MATCH_PARENT;

//        lp.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,300,getContext().getResources().getDisplayMetrics());

        //设置背景半透明程度
        lp.dimAmount = 0.2f;

        win.setAttributes(lp);
        Log.e(TAG, "onCreate: "+lp.height);
    }
}

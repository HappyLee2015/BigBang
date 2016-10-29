package cn.woblog.bigbang.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by renpingqing on 10/29/16.
 */
public class TouchSelectLayout extends ViewGroup {
    public TouchSelectLayout(Context context) {
        super(context);
    }

    public TouchSelectLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchSelectLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TouchSelectLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}

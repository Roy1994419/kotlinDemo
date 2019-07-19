package com.zotost.kotlindemo;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @Description:
 * @Author: roy
 * @Date: 2019/7/19 17:43
 * @Since: V1.0.0
 * @Version: V1.0.0
 */
public class AdvanceSwipeRefreshLayout extends SwipeRefreshLayout {
private OnPreInterceptTouchEventDelegate mOnPreInterceptTouchEventDelegate;

public AdvanceSwipeRefreshLayout(Context context) {
        super(context);
}

    public AdvanceSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    //     ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
    }

@Override
public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean disallowIntercept = false;
if (mOnPreInterceptTouchEventDelegate != null)
  disallowIntercept = mOnPreInterceptTouchEventDelegate.shouldDisallowInterceptTouchEvent(ev);

if (disallowIntercept) {
            return false;
}
        return super.onInterceptTouchEvent(ev);
}

    public void setOnPreInterceptTouchEventDelegate(OnPreInterceptTouchEventDelegate listener) {
        mOnPreInterceptTouchEventDelegate = listener;
}

    public interface OnPreInterceptTouchEventDelegate {
        boolean shouldDisallowInterceptTouchEvent(MotionEvent ev);
}
}
 

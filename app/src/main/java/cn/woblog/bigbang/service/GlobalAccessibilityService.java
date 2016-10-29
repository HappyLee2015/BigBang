package cn.woblog.bigbang.service;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

import cn.woblog.bigbang.activity.ParticipleActivity;
import cn.woblog.bigbang.domain.Info;

/**
 * Created by renpingqing on 10/29/16.
 */
public class GlobalAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int eventType = accessibilityEvent.getEventType();
        CharSequence className = accessibilityEvent.getClassName();
        switch (eventType) {
            case AccessibilityEvent.TYPE_VIEW_CLICKED: {
                if (TextView.class.getName().equals(className)) {
                    AccessibilityNodeInfo source = accessibilityEvent.getSource();
                    String text = source.getText().toString();
                    Intent intent = new Intent(this, ParticipleActivity.class);
                    intent.addFlags(intent.getFlags() | Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra(ParticipleActivity.DATA, new Info(Info.TYPE_TEXT, text.toString()));
                    startActivity(intent);
                }
                break;
            }

        }
    }

    @Override
    public void onInterrupt() {

    }
}

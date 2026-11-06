package com.amazon.alexa.accessory.frames.media.viewer;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.media.utils.TimestampUtils;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class MediaViewerHeader extends ConstraintLayout {
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String TAG = "MediaViewerHeader";

    @Nullable
    private ImageButton backButton;

    @Nullable
    private TextView dateText;

    @Nullable
    private TextView timeText;

    public MediaViewerHeader(@NonNull Context context) {
        super(context);
        init(context);
    }

    private void expandBackButtonTouchTarget() {
        if (this.backButton == null) {
            return;
        }
        post(new MediaViewerHeader$$ExternalSyntheticLambda0(this, 0));
    }

    private void init(@NonNull Context context) {
        LayoutInflater.from(context).inflate(R.layout.media_viewer_header, (ViewGroup) this, true);
        this.backButton = (ImageButton) findViewById(R.id.backButton);
        this.dateText = (TextView) findViewById(R.id.dateText);
        this.timeText = (TextView) findViewById(R.id.timeText);
        expandBackButtonTouchTarget();
        Log.d(TAG, "MediaViewerHeader initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$expandBackButtonTouchTarget$0() {
        if (this.backButton == null) {
            return;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        Rect rect = new Rect();
        this.backButton.getHitRect(rect);
        int max = Math.max(0, (applyDimension - rect.width()) / 2);
        int max2 = Math.max(0, (applyDimension - rect.height()) / 2);
        if (max == 0 && max2 == 0) {
            return;
        }
        rect.left -= max;
        rect.right += max;
        rect.top -= max2;
        rect.bottom += max2;
        setTouchDelegate(new TouchDelegate(rect, this.backButton));
    }

    public void setBackButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageButton imageButton = this.backButton;
        if (imageButton == null) {
            Log.w(TAG, "Cannot set back button listener: button not initialized");
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void setTimestamp(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            Log.w(TAG, "Null or empty timestamp provided");
        } else {
            TimestampUtils.parseAndFormatTimestamp(getContext(), str, this.dateText, this.timeText);
        }
    }

    public MediaViewerHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public MediaViewerHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}

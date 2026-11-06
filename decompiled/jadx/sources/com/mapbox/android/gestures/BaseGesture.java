package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public abstract class BaseGesture<L> {
    protected final Context context;
    private MotionEvent currentEvent;
    private long gestureDuration;
    private final AndroidGesturesManager gesturesManager;
    private boolean isEnabled = true;
    protected L listener;
    private MotionEvent previousEvent;
    protected final WindowManager windowManager;

    public BaseGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        this.context = context;
        this.windowManager = (WindowManager) context.getSystemService("window");
        this.gesturesManager = androidGesturesManager;
    }

    private boolean analyze(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        MotionEvent motionEvent2 = this.previousEvent;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.previousEvent = null;
        }
        MotionEvent motionEvent3 = this.currentEvent;
        if (motionEvent3 != null) {
            this.previousEvent = MotionEvent.obtain(motionEvent3);
            this.currentEvent.recycle();
            this.currentEvent = null;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.currentEvent = obtain;
        this.gestureDuration = obtain.getEventTime() - this.currentEvent.getDownTime();
        return analyzeEvent(motionEvent);
    }

    public abstract boolean analyzeEvent(@NonNull MotionEvent motionEvent);

    public boolean canExecute(int i) {
        if (this.listener == null || !this.isEnabled) {
            return false;
        }
        for (Set<Integer> set : this.gesturesManager.getMutuallyExclusiveGestures()) {
            if (set.contains(Integer.valueOf(i))) {
                for (Integer num : set) {
                    num.intValue();
                    for (BaseGesture baseGesture : this.gesturesManager.getDetectors()) {
                        if (baseGesture instanceof ProgressiveGesture) {
                            ProgressiveGesture progressiveGesture = (ProgressiveGesture) baseGesture;
                            if (progressiveGesture.getHandledTypes().contains(num) && progressiveGesture.isInProgress()) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public MotionEvent getCurrentEvent() {
        return this.currentEvent;
    }

    public long getGestureDuration() {
        return this.gestureDuration;
    }

    public MotionEvent getPreviousEvent() {
        return this.previousEvent;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return analyze(motionEvent);
    }

    public void removeListener() {
        this.listener = null;
    }

    public void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public void setListener(L l) {
        this.listener = l;
    }
}

package com.reactnativecommunity.slider;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ReactSliderManagerImpl {
    public static final String REACT_CLASS = "RNCSlider";

    public static ReactSlider createViewInstance(ThemedReactContext themedReactContext) {
        ReactSlider reactSlider = new ReactSlider(themedReactContext, null);
        reactSlider.setSplitTrack(false);
        return reactSlider;
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.of("topChange", MapBuilder.of("registrationName", "topChange"));
    }

    public static Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(ReactSlidingStartEvent.EVENT_NAME, MapBuilder.of("registrationName", ReactSlidingStartEvent.EVENT_NAME), ReactSlidingCompleteEvent.EVENT_NAME, MapBuilder.of("registrationName", ReactSlidingCompleteEvent.EVENT_NAME));
    }

    public static void setAccessibilityIncrements(ReactSlider reactSlider, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        reactSlider.setAccessibilityIncrements(arrayList2);
    }

    public static void setAccessibilityUnits(ReactSlider reactSlider, String str) {
        reactSlider.setAccessibilityUnits(str);
    }

    public static void setDisabled(ReactSlider reactSlider, boolean z) {
        reactSlider.setEnabled(!z);
    }

    public static void setInverted(ReactSlider reactSlider, boolean z) {
        if (z) {
            reactSlider.setScaleX(-1.0f);
        } else {
            reactSlider.setScaleX(1.0f);
        }
    }

    public static void setLowerLimit(ReactSlider reactSlider, double d) {
        reactSlider.setLowerLimit(d);
    }

    public static void setMaximumTrackTintColor(ReactSlider reactSlider, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(android.R.id.background);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
    }

    public static void setMaximumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMaxValue(d);
    }

    public static void setMinimumTrackTintColor(ReactSlider reactSlider, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(android.R.id.progress);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
    }

    public static void setMinimumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMinValue(d);
    }

    public static void setStep(ReactSlider reactSlider, double d) {
        reactSlider.setStep(d);
    }

    public static void setThumbImage(ReactSlider reactSlider, @Nullable ReadableMap readableMap) {
        reactSlider.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    public static void setThumbTintColor(ReactSlider reactSlider, Integer num) {
        if (reactSlider.getThumb() != null) {
            if (num == null) {
                reactSlider.getThumb().clearColorFilter();
            } else {
                reactSlider.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public static void setUpperLimit(ReactSlider reactSlider, double d) {
        reactSlider.setUpperLimit(d);
    }

    public static void setValue(ReactSlider reactSlider, double d) {
        if (reactSlider.isSliding()) {
            return;
        }
        reactSlider.setValue(d);
        if (!reactSlider.isAccessibilityFocused() || Build.VERSION.SDK_INT <= 29) {
            return;
        }
        reactSlider.setupAccessibility((int) d);
    }
}

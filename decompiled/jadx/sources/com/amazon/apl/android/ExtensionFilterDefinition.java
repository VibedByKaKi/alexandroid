package com.amazon.apl.android;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.apl.enums.ImageCount;
import com.amazon.common.BoundObject;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtensionFilterDefinition extends BoundObject {
    private static final String TAG = "ExtensionFilter";

    public ExtensionFilterDefinition(String str, String str2, ImageCount imageCount) {
        long nCreate = nCreate(str, str2, imageCount.getIndex());
        if (nCreate != 0) {
            bind(nCreate);
        }
    }

    private static native long nCreate(String str, String str2, int i);

    private static native String nGetName(long j);

    private static native int nGetPropertyCount(long j);

    private static native Object nGetPropertyValue(long j, String str);

    private static native String nGetURI(long j);

    private static native void nProperty(long j, String str, Object obj);

    @VisibleForTesting
    public String getName() {
        return nGetName(getNativeHandle());
    }

    @VisibleForTesting
    public int getPropertyCount() {
        return nGetPropertyCount(getNativeHandle());
    }

    @VisibleForTesting
    public <T> T getPropertyValue(String str) {
        return (T) nGetPropertyValue(getNativeHandle(), str);
    }

    @VisibleForTesting
    public String getURI() {
        return nGetURI(getNativeHandle());
    }

    public ExtensionFilterDefinition property(String str, Object obj) {
        if (!str.equalsIgnoreCase("when") && !str.equalsIgnoreCase("type") && !str.equalsIgnoreCase("source") && !str.equalsIgnoreCase(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY)) {
            nProperty(getNativeHandle(), str, obj);
            return this;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Unable to register property '", str, "' in custom filter ");
        m2m.append(getName());
        Log.w(TAG, m2m.toString());
        return this;
    }
}

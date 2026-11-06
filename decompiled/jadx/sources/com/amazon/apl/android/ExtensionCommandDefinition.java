package com.amazon.apl.android;

import android.util.Log;
import com.amazon.common.BoundObject;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtensionCommandDefinition extends BoundObject {
    private static final String TAG = "ExtCommandDef";
    private Set<String> mProperties = new HashSet();

    public ExtensionCommandDefinition(String str, String str2) {
        long nCreate = nCreate(str, str2);
        if (nCreate != 0) {
            bind(nCreate);
        }
    }

    private static native void nAllowFastMode(long j, boolean z);

    private static native void nArrayProperty(long j, String str, boolean z);

    private static native long nCreate(String str, String str2);

    private static native boolean nGetAllowFastMode(long j);

    private static native String nGetName(long j);

    private static native int nGetPropertyCount(long j);

    private static native Object nGetPropertyValue(long j, String str);

    private static native boolean nGetRequireResolution(long j);

    private static native String nGetURI(long j);

    private static native boolean nIsPropertyRequired(long j, String str);

    private static native void nProperty(long j, String str, Object obj, boolean z);

    private static native void nRequireResolution(long j, boolean z);

    public ExtensionCommandDefinition allowFastMode(boolean z) {
        nAllowFastMode(getNativeHandle(), z);
        return this;
    }

    public ExtensionCommandDefinition arrayProperty(String str, boolean z) {
        if (!str.equalsIgnoreCase("when") && !str.equalsIgnoreCase("type")) {
            this.mProperties.add(str);
            nArrayProperty(getNativeHandle(), str, z);
            return this;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Unable to register array-ified property '", str, "' in custom command ");
        m2m.append(getName());
        Log.w(TAG, m2m.toString());
        return this;
    }

    public boolean getAllowFastMode() {
        return nGetAllowFastMode(getNativeHandle());
    }

    public String getName() {
        return nGetName(getNativeHandle());
    }

    public Set<String> getProperties() {
        return this.mProperties;
    }

    public int getPropertyCount() {
        return nGetPropertyCount(getNativeHandle());
    }

    public <T> T getPropertyValue(String str) {
        return (T) nGetPropertyValue(getNativeHandle(), str);
    }

    public boolean getRequireResolution() {
        return nGetRequireResolution(getNativeHandle());
    }

    public String getURI() {
        return nGetURI(getNativeHandle());
    }

    public boolean isPropertyRequired(String str) {
        return nIsPropertyRequired(getNativeHandle(), str);
    }

    public ExtensionCommandDefinition property(String str, Object obj, boolean z) {
        if (!str.equalsIgnoreCase("when") && !str.equalsIgnoreCase("type")) {
            this.mProperties.add(str);
            nProperty(getNativeHandle(), str, obj, z);
            return this;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Unable to register property '", str, "' in custom command ");
        m2m.append(getName());
        Log.w(TAG, m2m.toString());
        return this;
    }

    public ExtensionCommandDefinition requireResolution(boolean z) {
        nRequireResolution(getNativeHandle(), z);
        return this;
    }
}

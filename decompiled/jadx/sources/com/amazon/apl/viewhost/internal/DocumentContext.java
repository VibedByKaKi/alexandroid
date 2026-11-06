package com.amazon.apl.viewhost.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.Action;
import com.amazon.apl.android.utils.JNIUtils;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DocumentContext extends BoundObject {

    @Nullable
    private String mCachedDataSourceContext;

    @Nullable
    private String mCachedVisualContext;
    private boolean mVisualContextChangeNotified = false;
    private boolean mDataSourceContextChangeNotified = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ContextType {
        VISUAL,
        DATA_SOURCE
    }

    public DocumentContext(long j) {
        bind(j);
    }

    private native void nClearDataSourceContextDirty(long j);

    private native void nClearVisualContextDirty(long j);

    private static native long nExecuteCommands(long j, String str);

    private native long nGetId(long j);

    private native boolean nIsDataSourceContextDirty(long j);

    private native boolean nIsVisualContextDirty(long j);

    private native String nSerializeDataSourceContext(long j);

    private native String nSerializeVisualContext(long j);

    @Nullable
    public Action executeCommands(@NonNull String str) {
        long nExecuteCommands = nExecuteCommands(getNativeHandle(), str);
        if (nExecuteCommands == 0) {
            return null;
        }
        return new Action(nExecuteCommands);
    }

    public boolean getAndClearHasContextChanged(ContextType contextType) {
        if (contextType == ContextType.VISUAL) {
            if (this.mVisualContextChangeNotified || !nIsVisualContextDirty(getNativeHandle())) {
                return false;
            }
            this.mVisualContextChangeNotified = true;
            this.mCachedVisualContext = null;
            return true;
        }
        if (this.mDataSourceContextChangeNotified || !nIsDataSourceContextDirty(getNativeHandle())) {
            return false;
        }
        this.mDataSourceContextChangeNotified = true;
        this.mCachedDataSourceContext = null;
        return true;
    }

    public long getId() {
        return nGetId(getNativeHandle());
    }

    public String serializeDataSourceContext() {
        if (this.mCachedDataSourceContext == null) {
            this.mCachedDataSourceContext = JNIUtils.safeStringValues(nSerializeDataSourceContext(getNativeHandle()));
            nClearDataSourceContextDirty(getNativeHandle());
            this.mDataSourceContextChangeNotified = false;
        }
        return this.mCachedDataSourceContext;
    }

    public String serializeVisualContext() {
        if (this.mCachedVisualContext == null) {
            this.mCachedVisualContext = JNIUtils.safeStringValues(nSerializeVisualContext(getNativeHandle()));
            nClearVisualContextDirty(getNativeHandle());
            this.mVisualContextChangeNotified = false;
        }
        return this.mCachedVisualContext;
    }
}

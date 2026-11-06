package com.amazon.apl.android;

import androidx.annotation.NonNull;
import com.amazon.apl.android.scaling.MetricsTransform;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DocumentState extends BoundObject {
    private final Content mContent;
    private final MetricsTransform mMetricsTransform;
    private boolean mOnBackstack;

    @NonNull
    private APLOptions mOptions;
    private final RootConfig mRootConfig;
    private final int mSerializedDocId;

    public DocumentState(@NonNull RootContext rootContext, @NonNull Content content, int i) {
        bind(rootContext.getNativeHandle());
        this.mOptions = rootContext.getOptions();
        this.mMetricsTransform = rootContext.getMetricsTransform();
        this.mRootConfig = rootContext.getRootConfig();
        this.mContent = content;
        this.mSerializedDocId = i;
    }

    public void finish() {
        this.mRootConfig.getExtensionMediator().finish();
    }

    public Content getContent() {
        return this.mContent;
    }

    public MetricsTransform getMetricsTransform() {
        return this.mMetricsTransform;
    }

    @NonNull
    public APLOptions getOptions() {
        return this.mOptions;
    }

    public RootConfig getRootConfig() {
        return this.mRootConfig;
    }

    public int getSerializedDocId() {
        return this.mSerializedDocId;
    }

    public boolean isOnBackStack() {
        return this.mOnBackstack;
    }

    public void setOnBackstack(boolean z) {
        this.mOnBackstack = z;
    }

    public void setOptions(@NonNull APLOptions aPLOptions) {
        this.mOptions = aPLOptions;
    }
}

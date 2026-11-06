package com.amazonaws.internal;

import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes.dex */
public class SdkFilterOutputStream extends FilterOutputStream implements MetricAware {
    public SdkFilterOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.amazonaws.internal.MetricAware
    public boolean isMetricActivated() {
        Closeable closeable = ((FilterOutputStream) this).out;
        if (closeable instanceof MetricAware) {
            return ((MetricAware) closeable).isMetricActivated();
        }
        return false;
    }
}

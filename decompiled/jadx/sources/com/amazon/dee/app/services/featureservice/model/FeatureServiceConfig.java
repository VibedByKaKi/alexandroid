package com.amazon.dee.app.services.featureservice.model;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/services/featureservice/model/FeatureServiceConfig;", "", "<init>", "()V", "forceSync", "", "metricSampleRateDbl", "", "batchUploadRate", "", "isForceSync", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureServiceConfig {

    @JvmField
    public boolean forceSync;

    @JvmField
    public double metricSampleRateDbl = 0.001d;

    @JvmField
    public int batchUploadRate = 5;

    /* renamed from: isForceSync, reason: from getter */
    public final boolean getForceSync() {
        return this.forceSync;
    }
}

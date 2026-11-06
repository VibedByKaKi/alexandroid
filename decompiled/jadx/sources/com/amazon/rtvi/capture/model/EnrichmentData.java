package com.amazon.rtvi.capture.model;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/rtvi/capture/model/EnrichmentData;", "Landroid/os/Parcelable;", "<init>", "()V", "version", "", "getVersion", "()I", "type", "Lcom/amazon/rtvi/capture/model/EnrichmentType;", "getType", "()Lcom/amazon/rtvi/capture/model/EnrichmentType;", "frameCaptureTimestampMillis", "", "getFrameCaptureTimestampMillis", "()J", "processingTimestampMillis", "getProcessingTimestampMillis", "Lcom/amazon/rtvi/capture/model/FaceDetectionEnrichmentData;", "Lcom/amazon/rtvi/capture/model/GestureDetectionEnrichmentData;", "Lcom/amazon/rtvi/capture/model/OCREnrichmentData;", "Lcom/amazon/rtvi/capture/model/OpticalCodeDetectionEnrichmentData;", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class EnrichmentData implements Parcelable {
    public /* synthetic */ EnrichmentData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getFrameCaptureTimestampMillis();

    public abstract long getProcessingTimestampMillis();

    @NotNull
    public abstract EnrichmentType getType();

    public abstract int getVersion();

    private EnrichmentData() {
    }
}

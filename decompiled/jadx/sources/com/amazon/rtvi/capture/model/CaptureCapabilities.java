package com.amazon.rtvi.capture.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/amazon/rtvi/capture/model/CaptureCapabilities;", "Landroid/os/Parcelable;", "version", "", "detailCapabilities", "Lcom/amazon/rtvi/capture/model/DetailCaptureCapabilities;", "temporalCapabilities", "Lcom/amazon/rtvi/capture/model/TemporalCaptureCapabilities;", "<init>", "(ILcom/amazon/rtvi/capture/model/DetailCaptureCapabilities;Lcom/amazon/rtvi/capture/model/TemporalCaptureCapabilities;)V", "getVersion", "()I", "getDetailCapabilities", "()Lcom/amazon/rtvi/capture/model/DetailCaptureCapabilities;", "getTemporalCapabilities", "()Lcom/amazon/rtvi/capture/model/TemporalCaptureCapabilities;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CaptureCapabilities implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CaptureCapabilities> CREATOR = new Creator();

    @Nullable
    private final DetailCaptureCapabilities detailCapabilities;

    @Nullable
    private final TemporalCaptureCapabilities temporalCapabilities;
    private final int version;

    public CaptureCapabilities(int i, @Nullable DetailCaptureCapabilities detailCaptureCapabilities, @Nullable TemporalCaptureCapabilities temporalCaptureCapabilities) {
        this.version = i;
        this.detailCapabilities = detailCaptureCapabilities;
        this.temporalCapabilities = temporalCaptureCapabilities;
    }

    public static /* synthetic */ CaptureCapabilities copy$default(CaptureCapabilities captureCapabilities, int i, DetailCaptureCapabilities detailCaptureCapabilities, TemporalCaptureCapabilities temporalCaptureCapabilities, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = captureCapabilities.version;
        }
        if ((i2 & 2) != 0) {
            detailCaptureCapabilities = captureCapabilities.detailCapabilities;
        }
        if ((i2 & 4) != 0) {
            temporalCaptureCapabilities = captureCapabilities.temporalCapabilities;
        }
        return captureCapabilities.copy(i, detailCaptureCapabilities, temporalCaptureCapabilities);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DetailCaptureCapabilities getDetailCapabilities() {
        return this.detailCapabilities;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final TemporalCaptureCapabilities getTemporalCapabilities() {
        return this.temporalCapabilities;
    }

    @NotNull
    public final CaptureCapabilities copy(int version, @Nullable DetailCaptureCapabilities detailCapabilities, @Nullable TemporalCaptureCapabilities temporalCapabilities) {
        return new CaptureCapabilities(version, detailCapabilities, temporalCapabilities);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureCapabilities)) {
            return false;
        }
        CaptureCapabilities captureCapabilities = (CaptureCapabilities) other;
        return this.version == captureCapabilities.version && Intrinsics.areEqual(this.detailCapabilities, captureCapabilities.detailCapabilities) && Intrinsics.areEqual(this.temporalCapabilities, captureCapabilities.temporalCapabilities);
    }

    @Nullable
    public final DetailCaptureCapabilities getDetailCapabilities() {
        return this.detailCapabilities;
    }

    @Nullable
    public final TemporalCaptureCapabilities getTemporalCapabilities() {
        return this.temporalCapabilities;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.version) * 31;
        DetailCaptureCapabilities detailCaptureCapabilities = this.detailCapabilities;
        int hashCode2 = (hashCode + (detailCaptureCapabilities == null ? 0 : detailCaptureCapabilities.hashCode())) * 31;
        TemporalCaptureCapabilities temporalCaptureCapabilities = this.temporalCapabilities;
        return hashCode2 + (temporalCaptureCapabilities != null ? temporalCaptureCapabilities.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CaptureCapabilities(version=" + this.version + ", detailCapabilities=" + this.detailCapabilities + ", temporalCapabilities=" + this.temporalCapabilities + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.version);
        DetailCaptureCapabilities detailCaptureCapabilities = this.detailCapabilities;
        if (detailCaptureCapabilities == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            detailCaptureCapabilities.writeToParcel(dest, flags);
        }
        TemporalCaptureCapabilities temporalCaptureCapabilities = this.temporalCapabilities;
        if (temporalCaptureCapabilities == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            temporalCaptureCapabilities.writeToParcel(dest, flags);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CaptureCapabilities> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CaptureCapabilities createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CaptureCapabilities(parcel.readInt(), parcel.readInt() == 0 ? null : DetailCaptureCapabilities.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TemporalCaptureCapabilities.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CaptureCapabilities[] newArray(int i) {
            return new CaptureCapabilities[i];
        }
    }

    public /* synthetic */ CaptureCapabilities(int i, DetailCaptureCapabilities detailCaptureCapabilities, TemporalCaptureCapabilities temporalCaptureCapabilities, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, detailCaptureCapabilities, temporalCaptureCapabilities);
    }
}

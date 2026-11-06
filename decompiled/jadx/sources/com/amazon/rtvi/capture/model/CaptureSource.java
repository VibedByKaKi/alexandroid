package com.amazon.rtvi.capture.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006#"}, d2 = {"Lcom/amazon/rtvi/capture/model/CaptureSource;", "Landroid/os/Parcelable;", "version", "", "type", "Lcom/amazon/rtvi/capture/model/SourceType;", "cameraCategory", "", "id", "<init>", "(ILcom/amazon/rtvi/capture/model/SourceType;Ljava/lang/String;Ljava/lang/String;)V", "getVersion", "()I", "getType", "()Lcom/amazon/rtvi/capture/model/SourceType;", "getCameraCategory", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CaptureSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CaptureSource> CREATOR = new Creator();

    @Nullable
    private final String cameraCategory;

    @Nullable
    private final String id;

    @NotNull
    private final SourceType type;
    private final int version;

    public /* synthetic */ CaptureSource(int i, SourceType sourceType, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, sourceType, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ CaptureSource copy$default(CaptureSource captureSource, int i, SourceType sourceType, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = captureSource.version;
        }
        if ((i2 & 2) != 0) {
            sourceType = captureSource.type;
        }
        if ((i2 & 4) != 0) {
            str = captureSource.cameraCategory;
        }
        if ((i2 & 8) != 0) {
            str2 = captureSource.id;
        }
        return captureSource.copy(i, sourceType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SourceType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCameraCategory() {
        return this.cameraCategory;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final CaptureSource copy(int version, @NotNull SourceType type, @Nullable String cameraCategory, @Nullable String id) {
        type.getClass();
        return new CaptureSource(version, type, cameraCategory, id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureSource)) {
            return false;
        }
        CaptureSource captureSource = (CaptureSource) other;
        return this.version == captureSource.version && this.type == captureSource.type && Intrinsics.areEqual(this.cameraCategory, captureSource.cameraCategory) && Intrinsics.areEqual(this.id, captureSource.id);
    }

    @Nullable
    public final String getCameraCategory() {
        return this.cameraCategory;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final SourceType getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (Integer.hashCode(this.version) * 31)) * 31;
        String str = this.cameraCategory;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.version;
        SourceType sourceType = this.type;
        String str = this.cameraCategory;
        String str2 = this.id;
        StringBuilder sb = new StringBuilder("CaptureSource(version=");
        sb.append(i);
        sb.append(", type=");
        sb.append(sourceType);
        sb.append(", cameraCategory=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str, ", id=", str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.version);
        dest.writeString(this.type.name());
        dest.writeString(this.cameraCategory);
        dest.writeString(this.id);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CaptureSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CaptureSource createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CaptureSource(parcel.readInt(), SourceType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CaptureSource[] newArray(int i) {
            return new CaptureSource[i];
        }
    }

    public CaptureSource(int i, @NotNull SourceType sourceType, @Nullable String str, @Nullable String str2) {
        sourceType.getClass();
        this.version = i;
        this.type = sourceType;
        this.cameraCategory = str;
        this.id = str2;
    }
}

package com.amazon.rtvi.capture.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J|\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0006\u00103\u001a\u00020\u0003J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\rHÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006?"}, d2 = {"Lcom/amazon/rtvi/capture/model/CaptureConfiguration;", "Landroid/os/Parcelable;", "version", "", AmazonPhotosConstants.CAPTURE_MODE_KEY, "Lcom/amazon/rtvi/capture/model/CaptureMode;", "sourceType", "Lcom/amazon/rtvi/capture/model/SourceType;", "frameResolution", "Lcom/amazon/rtvi/capture/model/Resolution;", "frameRate", "", "frameImageType", "", "maxFrameBytes", "maxFrameCount", "enrichmentsEnabled", "", "Lcom/amazon/rtvi/capture/model/EnrichmentType;", "<init>", "(ILcom/amazon/rtvi/capture/model/CaptureMode;Lcom/amazon/rtvi/capture/model/SourceType;Lcom/amazon/rtvi/capture/model/Resolution;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getVersion", "()I", "getCaptureMode", "()Lcom/amazon/rtvi/capture/model/CaptureMode;", "getSourceType", "()Lcom/amazon/rtvi/capture/model/SourceType;", "getFrameResolution", "()Lcom/amazon/rtvi/capture/model/Resolution;", "getFrameRate", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFrameImageType", "()Ljava/lang/String;", "getMaxFrameBytes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxFrameCount", "getEnrichmentsEnabled", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/amazon/rtvi/capture/model/CaptureMode;Lcom/amazon/rtvi/capture/model/SourceType;Lcom/amazon/rtvi/capture/model/Resolution;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/amazon/rtvi/capture/model/CaptureConfiguration;", "describeContents", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCaptureConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureConfiguration.kt\ncom/amazon/rtvi/capture/model/CaptureConfiguration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* loaded from: classes14.dex */
public final /* data */ class CaptureConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CaptureConfiguration> CREATOR = new Creator();

    @NotNull
    private final CaptureMode captureMode;

    @Nullable
    private final List<EnrichmentType> enrichmentsEnabled;

    @Nullable
    private final String frameImageType;

    @Nullable
    private final Float frameRate;

    @Nullable
    private final Resolution frameResolution;

    @Nullable
    private final Integer maxFrameBytes;

    @Nullable
    private final Integer maxFrameCount;

    @Nullable
    private final SourceType sourceType;
    private final int version;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CaptureConfiguration(int r2, com.amazon.rtvi.capture.model.CaptureMode r3, com.amazon.rtvi.capture.model.SourceType r4, com.amazon.rtvi.capture.model.Resolution r5, java.lang.Float r6, java.lang.String r7, java.lang.Integer r8, java.lang.Integer r9, java.util.List r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L5
            r2 = 1
        L5:
            r12 = r11 & 4
            r0 = 0
            if (r12 == 0) goto Lb
            r4 = r0
        Lb:
            r12 = r11 & 8
            if (r12 == 0) goto L10
            r5 = r0
        L10:
            r12 = r11 & 16
            if (r12 == 0) goto L15
            r6 = r0
        L15:
            r12 = r11 & 32
            if (r12 == 0) goto L1a
            r7 = r0
        L1a:
            r12 = r11 & 64
            if (r12 == 0) goto L1f
            r8 = r0
        L1f:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L24
            r9 = r0
        L24:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L33
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3d
        L33:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.rtvi.capture.model.CaptureConfiguration.<init>(int, com.amazon.rtvi.capture.model.CaptureMode, com.amazon.rtvi.capture.model.SourceType, com.amazon.rtvi.capture.model.Resolution, java.lang.Float, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ CaptureConfiguration copy$default(CaptureConfiguration captureConfiguration, int i, CaptureMode captureMode, SourceType sourceType, Resolution resolution, Float f, String str, Integer num, Integer num2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = captureConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            captureMode = captureConfiguration.captureMode;
        }
        if ((i2 & 4) != 0) {
            sourceType = captureConfiguration.sourceType;
        }
        if ((i2 & 8) != 0) {
            resolution = captureConfiguration.frameResolution;
        }
        if ((i2 & 16) != 0) {
            f = captureConfiguration.frameRate;
        }
        if ((i2 & 32) != 0) {
            str = captureConfiguration.frameImageType;
        }
        if ((i2 & 64) != 0) {
            num = captureConfiguration.maxFrameBytes;
        }
        if ((i2 & 128) != 0) {
            num2 = captureConfiguration.maxFrameCount;
        }
        if ((i2 & 256) != 0) {
            list = captureConfiguration.enrichmentsEnabled;
        }
        Integer num3 = num2;
        List list2 = list;
        String str2 = str;
        Integer num4 = num;
        Float f2 = f;
        SourceType sourceType2 = sourceType;
        return captureConfiguration.copy(i, captureMode, sourceType2, resolution, f2, str2, num4, num3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final SourceType getSourceType() {
        return this.sourceType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Resolution getFrameResolution() {
        return this.frameResolution;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getFrameRate() {
        return this.frameRate;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getFrameImageType() {
        return this.frameImageType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getMaxFrameBytes() {
        return this.maxFrameBytes;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getMaxFrameCount() {
        return this.maxFrameCount;
    }

    @Nullable
    public final List<EnrichmentType> component9() {
        return this.enrichmentsEnabled;
    }

    @NotNull
    public final CaptureConfiguration copy(int version, @NotNull CaptureMode captureMode, @Nullable SourceType sourceType, @Nullable Resolution frameResolution, @Nullable Float frameRate, @Nullable String frameImageType, @Nullable Integer maxFrameBytes, @Nullable Integer maxFrameCount, @Nullable List<? extends EnrichmentType> enrichmentsEnabled) {
        captureMode.getClass();
        return new CaptureConfiguration(version, captureMode, sourceType, frameResolution, frameRate, frameImageType, maxFrameBytes, maxFrameCount, enrichmentsEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureConfiguration)) {
            return false;
        }
        CaptureConfiguration captureConfiguration = (CaptureConfiguration) other;
        return this.version == captureConfiguration.version && this.captureMode == captureConfiguration.captureMode && this.sourceType == captureConfiguration.sourceType && Intrinsics.areEqual(this.frameResolution, captureConfiguration.frameResolution) && Intrinsics.areEqual((Object) this.frameRate, (Object) captureConfiguration.frameRate) && Intrinsics.areEqual(this.frameImageType, captureConfiguration.frameImageType) && Intrinsics.areEqual(this.maxFrameBytes, captureConfiguration.maxFrameBytes) && Intrinsics.areEqual(this.maxFrameCount, captureConfiguration.maxFrameCount) && Intrinsics.areEqual(this.enrichmentsEnabled, captureConfiguration.enrichmentsEnabled);
    }

    @NotNull
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @Nullable
    public final List<EnrichmentType> getEnrichmentsEnabled() {
        return this.enrichmentsEnabled;
    }

    @Nullable
    public final String getFrameImageType() {
        return this.frameImageType;
    }

    @Nullable
    public final Float getFrameRate() {
        return this.frameRate;
    }

    @Nullable
    public final Resolution getFrameResolution() {
        return this.frameResolution;
    }

    @Nullable
    public final Integer getMaxFrameBytes() {
        return this.maxFrameBytes;
    }

    @Nullable
    public final Integer getMaxFrameCount() {
        return this.maxFrameCount;
    }

    @Nullable
    public final SourceType getSourceType() {
        return this.sourceType;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = (this.captureMode.hashCode() + (Integer.hashCode(this.version) * 31)) * 31;
        SourceType sourceType = this.sourceType;
        int hashCode2 = (hashCode + (sourceType == null ? 0 : sourceType.hashCode())) * 31;
        Resolution resolution = this.frameResolution;
        int hashCode3 = (hashCode2 + (resolution == null ? 0 : resolution.hashCode())) * 31;
        Float f = this.frameRate;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.frameImageType;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxFrameBytes;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxFrameCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<EnrichmentType> list = this.enrichmentsEnabled;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.version;
        CaptureMode captureMode = this.captureMode;
        SourceType sourceType = this.sourceType;
        Resolution resolution = this.frameResolution;
        Float f = this.frameRate;
        String str = this.frameImageType;
        Integer num = this.maxFrameBytes;
        Integer num2 = this.maxFrameCount;
        List<EnrichmentType> list = this.enrichmentsEnabled;
        StringBuilder sb = new StringBuilder("CaptureConfiguration(version=");
        sb.append(i);
        sb.append(", captureMode=");
        sb.append(captureMode);
        sb.append(", sourceType=");
        sb.append(sourceType);
        sb.append(", frameResolution=");
        sb.append(resolution);
        sb.append(", frameRate=");
        sb.append(f);
        sb.append(", frameImageType=");
        sb.append(str);
        sb.append(", maxFrameBytes=");
        sb.append(num);
        sb.append(", maxFrameCount=");
        sb.append(num2);
        sb.append(", enrichmentsEnabled=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.version);
        dest.writeString(this.captureMode.name());
        SourceType sourceType = this.sourceType;
        if (sourceType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sourceType.name());
        }
        Resolution resolution = this.frameResolution;
        if (resolution == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            resolution.writeToParcel(dest, flags);
        }
        Float f = this.frameRate;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        dest.writeString(this.frameImageType);
        Integer num = this.maxFrameBytes;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.maxFrameCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        List<EnrichmentType> list = this.enrichmentsEnabled;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<EnrichmentType> it2 = list.iterator();
        while (it2.hasNext()) {
            dest.writeString(it2.next().name());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CaptureConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CaptureConfiguration createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            CaptureMode valueOf = CaptureMode.valueOf(parcel.readString());
            ArrayList arrayList = null;
            SourceType valueOf2 = parcel.readInt() == 0 ? null : SourceType.valueOf(parcel.readString());
            Resolution createFromParcel = parcel.readInt() == 0 ? null : Resolution.CREATOR.createFromParcel(parcel);
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(EnrichmentType.valueOf(parcel.readString()));
                }
            }
            return new CaptureConfiguration(readInt, valueOf, valueOf2, createFromParcel, valueOf3, readString, valueOf4, valueOf5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CaptureConfiguration[] newArray(int i) {
            return new CaptureConfiguration[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CaptureConfiguration(int i, @NotNull CaptureMode captureMode, @Nullable SourceType sourceType, @Nullable Resolution resolution, @Nullable Float f, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends EnrichmentType> list) {
        captureMode.getClass();
        this.version = i;
        this.captureMode = captureMode;
        this.sourceType = sourceType;
        this.frameResolution = resolution;
        this.frameRate = f;
        this.frameImageType = str;
        this.maxFrameBytes = num;
        this.maxFrameCount = num2;
        this.enrichmentsEnabled = list;
        if (f == null || f.floatValue() > 0.0f) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("frameRate must be positive");
        throw null;
    }
}

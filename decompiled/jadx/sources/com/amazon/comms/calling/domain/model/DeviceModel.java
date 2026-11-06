package com.amazon.comms.calling.domain.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/domain/model/DeviceModel;", "", "deviceGruu", "", "deviceName", "deviceSerialNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceGruu", "()Ljava/lang/String;", "getDeviceName", "getDeviceSerialNumber", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class DeviceModel {

    @SerializedName("deviceGruu")
    @Nullable
    private final String deviceGruu;

    @SerializedName("deviceName")
    @Nullable
    private final String deviceName;

    @SerializedName("deviceSerialNumber")
    @Nullable
    private final String deviceSerialNumber;

    public /* synthetic */ DeviceModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ DeviceModel copy$default(DeviceModel deviceModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceModel.deviceGruu;
        }
        if ((i & 2) != 0) {
            str2 = deviceModel.deviceName;
        }
        if ((i & 4) != 0) {
            str3 = deviceModel.deviceSerialNumber;
        }
        return deviceModel.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDeviceGruu() {
        return this.deviceGruu;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @NotNull
    public final DeviceModel copy(@Nullable String deviceGruu, @Nullable String deviceName, @Nullable String deviceSerialNumber) {
        return new DeviceModel(deviceGruu, deviceName, deviceSerialNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceModel)) {
            return false;
        }
        DeviceModel deviceModel = (DeviceModel) other;
        return Intrinsics.areEqual(this.deviceGruu, deviceModel.deviceGruu) && Intrinsics.areEqual(this.deviceName, deviceModel.deviceName) && Intrinsics.areEqual(this.deviceSerialNumber, deviceModel.deviceSerialNumber);
    }

    @Nullable
    public final String getDeviceGruu() {
        return this.deviceGruu;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public int hashCode() {
        String str = this.deviceGruu;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceSerialNumber;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.deviceGruu;
        String str2 = this.deviceName;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("DeviceModel(deviceGruu=", str, ", deviceName=", str2, ", deviceSerialNumber="), this.deviceSerialNumber, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public DeviceModel(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.deviceGruu = str;
        this.deviceName = str2;
        this.deviceSerialNumber = str3;
    }

    public DeviceModel() {
        this(null, null, null, 7, null);
    }
}

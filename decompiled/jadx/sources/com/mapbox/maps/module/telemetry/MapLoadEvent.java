package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020\rH\u0016J\b\u0010.\u001a\u00020\u0003H\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0016\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012R\u0016\u0010#\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012R\u0016\u0010'\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0012¨\u00060"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapLoadEvent;", "Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "userId", "", "uiFramework", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/module/telemetry/PhoneState;)V", "accessibilityFontScale", "", "getAccessibilityFontScale", "()F", "batteryLevel", "", "getBatteryLevel", "()I", AMPDInformationProvider.DEVICE_CARRIER_KEY, "getCarrier", "()Ljava/lang/String;", "cellularNetworkType", "getCellularNetworkType", "isPluggedIn", "", "()Z", "isWifi", "model", "getModel", "operatingSystem", "getOperatingSystem", ModelSourceWrapper.ORIENTATION, "getOrientation", "resolution", "getResolution", "sdkIdentifier", "getSdkIdentifier", "sdkVersion", "getSdkVersion", "getUiFramework", "getUserId", "version", "getVersion", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "getEventName", "hashCode", "toString", "Companion", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ParcelCreator"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes9.dex */
public final class MapLoadEvent extends MapBaseEvent {

    @NotNull
    private static final String EVENT_NAME = "map.load";

    @NotNull
    private static final String EVENT_SCHEMA_VERSION = "2.3";

    @SerializedName("accessibilityFontScale")
    private final float accessibilityFontScale;

    @SerializedName("batteryLevel")
    private final int batteryLevel;

    @SerializedName(AMPDInformationProvider.DEVICE_CARRIER_KEY)
    @Nullable
    private final String carrier;

    @SerializedName("cellularNetworkType")
    @Nullable
    private final String cellularNetworkType;

    @SerializedName("pluggedIn")
    private final boolean isPluggedIn;

    @SerializedName("wifi")
    private final boolean isWifi;

    @SerializedName("model")
    @NotNull
    private final String model;

    @SerializedName("operatingSystem")
    @Nullable
    private final String operatingSystem;

    @SerializedName(ModelSourceWrapper.ORIENTATION)
    @NotNull
    private final String orientation;

    @SerializedName("resolution")
    private final float resolution;

    @SerializedName("sdkIdentifier")
    @NotNull
    private final String sdkIdentifier;

    @SerializedName("sdkVersion")
    @NotNull
    private final String sdkVersion;

    @SerializedName("uiFramework")
    @Nullable
    private final String uiFramework;

    @SerializedName("userId")
    @Nullable
    private final String userId;

    @SerializedName("version")
    @NotNull
    private final String version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapLoadEvent(@Nullable String str, @Nullable String str2, @NotNull PhoneState phoneState) {
        super(phoneState);
        phoneState.getClass();
        this.userId = str;
        this.uiFramework = str2;
        this.operatingSystem = "Android - " + Build.VERSION.RELEASE;
        this.sdkIdentifier = com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER;
        this.sdkVersion = com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION;
        String str3 = Build.MODEL;
        str3.getClass();
        this.model = str3;
        this.carrier = phoneState.getCarrier();
        this.cellularNetworkType = phoneState.getCellularNetworkType();
        this.orientation = phoneState.getOrientation().getOrientation();
        this.resolution = phoneState.getResolution();
        this.accessibilityFontScale = phoneState.getAccessibilityFontScale();
        this.batteryLevel = phoneState.getBatteryLevel();
        this.isPluggedIn = phoneState.getIsPluggedIn();
        this.isWifi = phoneState.getIsWifi();
        this.version = EVENT_SCHEMA_VERSION;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(MapLoadEvent.class, other.getClass())) {
            return false;
        }
        MapLoadEvent mapLoadEvent = (MapLoadEvent) other;
        if (Intrinsics.areEqual(getEvent(), mapLoadEvent.getEvent()) && Intrinsics.areEqual(getCreated(), mapLoadEvent.getCreated()) && Float.compare(mapLoadEvent.resolution, this.resolution) == 0 && Float.compare(mapLoadEvent.accessibilityFontScale, this.accessibilityFontScale) == 0 && this.batteryLevel == mapLoadEvent.batteryLevel && this.isPluggedIn == mapLoadEvent.isPluggedIn && this.isWifi == mapLoadEvent.isWifi && Intrinsics.areEqual(this.operatingSystem, mapLoadEvent.operatingSystem) && Intrinsics.areEqual(this.sdkIdentifier, mapLoadEvent.sdkIdentifier) && Intrinsics.areEqual(this.sdkVersion, mapLoadEvent.sdkVersion) && Intrinsics.areEqual(this.version, mapLoadEvent.version) && Intrinsics.areEqual(this.model, mapLoadEvent.model) && Intrinsics.areEqual(this.userId, mapLoadEvent.userId) && Intrinsics.areEqual(this.uiFramework, mapLoadEvent.uiFramework) && Intrinsics.areEqual(this.carrier, mapLoadEvent.carrier) && Intrinsics.areEqual(this.cellularNetworkType, mapLoadEvent.cellularNetworkType)) {
            return Intrinsics.areEqual(this.orientation, mapLoadEvent.orientation);
        }
        return false;
    }

    public final float getAccessibilityFontScale() {
        return this.accessibilityFontScale;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final String getCellularNetworkType() {
        return this.cellularNetworkType;
    }

    @Override // com.mapbox.maps.module.telemetry.MapBaseEvent
    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    @NotNull
    public final String getOrientation() {
        return this.orientation;
    }

    public final float getResolution() {
        return this.resolution;
    }

    @NotNull
    public final String getSdkIdentifier() {
        return this.sdkIdentifier;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final String getUiFramework() {
        return this.uiFramework;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.operatingSystem;
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((getCreated().hashCode() + ((getEvent().hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31, 31, this.sdkIdentifier), 31, this.sdkVersion), 31, this.version), 31, this.model);
        String str2 = this.userId;
        int hashCode = (m + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.uiFramework;
        int hashCode2 = (hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.carrier;
        int hashCode3 = (hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.cellularNetworkType;
        int m2 = ArcMode$$ExternalSyntheticOutline0.m((hashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.orientation);
        float f = this.resolution;
        int floatToIntBits = (m2 + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.accessibilityFontScale;
        return ((((((floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.batteryLevel) * 31) + (this.isPluggedIn ? 1 : 0)) * 31) + (this.isWifi ? 1 : 0);
    }

    /* renamed from: isPluggedIn, reason: from getter */
    public final boolean getIsPluggedIn() {
        return this.isPluggedIn;
    }

    /* renamed from: isWifi, reason: from getter */
    public final boolean getIsWifi() {
        return this.isWifi;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MapLoadEvent{, operatingSystem='");
        sb.append(this.operatingSystem);
        sb.append("', sdkIdentifier='");
        sb.append(this.sdkIdentifier);
        sb.append("', sdkVersion='");
        sb.append(this.sdkVersion);
        sb.append("', version='");
        sb.append(this.version);
        sb.append("', model='");
        sb.append(this.model);
        sb.append("', userId='");
        sb.append(this.userId);
        sb.append("', uiFramework='");
        sb.append(this.uiFramework);
        sb.append("', carrier='");
        sb.append(this.carrier);
        sb.append("', cellularNetworkType='");
        sb.append(this.cellularNetworkType);
        sb.append("', orientation='");
        sb.append(this.orientation);
        sb.append("', resolution=");
        sb.append(this.resolution);
        sb.append(", accessibilityFontScale=");
        sb.append(this.accessibilityFontScale);
        sb.append(", batteryLevel=");
        sb.append(this.batteryLevel);
        sb.append(", pluggedIn=");
        sb.append(this.isPluggedIn);
        sb.append(", wifi=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.isWifi, AbstractJsonLexerKt.END_OBJ);
    }
}

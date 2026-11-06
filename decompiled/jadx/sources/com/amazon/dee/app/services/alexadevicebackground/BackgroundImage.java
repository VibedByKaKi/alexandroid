package com.amazon.dee.app.services.alexadevicebackground;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.client.utils.CacheControl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.text.StringSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0011\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\u001e\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&J\u0013\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010*\u001a\u00020 H\u0016R\"\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0016¨\u0006-"}, d2 = {"Lcom/amazon/dee/app/services/alexadevicebackground/BackgroundImage;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", BuildConfig.FLAVOR_authType, "", "", "", "(Ljava/util/Map;)V", "value", "deviceType", "getDeviceType", "()Ljava/lang/String;", "deviceSerialNumber", "getDeviceSerialNumber", "softwareVersion", "getSoftwareVersion", BackgroundImage.BACKGROUND_IMAGE_ID, "getBackgroundImageID", "setBackgroundImageID", "(Ljava/lang/String;)V", BackgroundImage.BACKGROUND_IMAGE_TYPE, "getBackgroundImageType", "setBackgroundImageType", BackgroundImage.BACKGROUND_IMAGE_URL, "getBackgroundImageURL", "setBackgroundImageURL", "getString", "key", "describeContents", "", "writeToParcel", "", "i", "toString", "isDownloading", "", "isDelete", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "BackgroundImageType", "Companion", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundImage implements Parcelable {

    @NotNull
    public static final String BACKGROUND_IMAGE_MODEL = "background_image_model";

    @NotNull
    public static final String DEFAULT_THEME = "DEFAULT_THEME";

    @NotNull
    public static final String DELETE_PERSONAL_PHOTO = "DELETE_PERSONAL_PHOTOS";

    @NotNull
    public static final String DEVICE_SERIAL_NUMBER = "deviceSerialNumber";

    @NotNull
    public static final String DEVICE_TYPE = "deviceType";

    @NotNull
    public static final String DOWNLOADING_PERSONAL_PHOTOS = "DOWNLOADING_PERSONAL_PHOTOS";

    @NotNull
    public static final String PERSONAL_BG_IMAGE = "PERSONAL_PHOTOS";

    @NotNull
    public static final String PRIME_PHOTOS = "PRIME_PHOTOS";

    @NotNull
    public static final String SOFTWARE_VERSION = "softwareVersion";

    @Nullable
    private String backgroundImageID;

    @Nullable
    private String backgroundImageType;

    @Nullable
    private String backgroundImageURL;

    @Nullable
    private String deviceSerialNumber;

    @Nullable
    private String deviceType;

    @Nullable
    private String softwareVersion;

    @NotNull
    public static final String BACKGROUND_IMAGE_ID = "backgroundImageID";

    @NotNull
    public static final String BACKGROUND_IMAGE_TYPE = "backgroundImageType";

    @NotNull
    public static final String BACKGROUND_IMAGE_URL = "backgroundImageURL";

    @NotNull
    private static final List<String> REQUIRED_KEYS = CollectionsKt.listOf((Object[]) new String[]{"deviceType", "deviceSerialNumber", "softwareVersion", BACKGROUND_IMAGE_ID, BACKGROUND_IMAGE_TYPE, BACKGROUND_IMAGE_URL});

    @JvmField
    @NotNull
    public static final Parcelable.Creator<BackgroundImage> CREATOR = new Parcelable.Creator<BackgroundImage>() { // from class: com.amazon.dee.app.services.alexadevicebackground.BackgroundImage$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackgroundImage createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BackgroundImage(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackgroundImage[] newArray(int size) {
            return new BackgroundImage[size];
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/amazon/dee/app/services/alexadevicebackground/BackgroundImage$BackgroundImageType;", "", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BackgroundImageType {
    }

    public BackgroundImage(@NotNull Map<String, ? extends Object> map) throws MissingKeyException, InvalidValueException {
        map.getClass();
        Set<String> keySet = map.keySet();
        List<String> list = REQUIRED_KEYS;
        if (!keySet.containsAll(list)) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.removeAll(map.keySet());
            throw new MissingKeyException("Invalid Background Image Data: Missing keys: " + arrayList);
        }
        this.deviceSerialNumber = getString(map, "deviceSerialNumber");
        this.deviceType = getString(map, "deviceType");
        this.softwareVersion = getString(map, "softwareVersion");
        this.backgroundImageID = getString(map, BACKGROUND_IMAGE_ID);
        this.backgroundImageType = getString(map, BACKGROUND_IMAGE_TYPE);
        this.backgroundImageURL = getString(map, BACKGROUND_IMAGE_URL);
    }

    private final String getString(Map<String, ? extends Object> map, String key) throws InvalidValueException {
        Object obj = map.get(key);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new InvalidValueException(BitVector$$ExternalSyntheticOutline0.m("Value '", obj, "' must be a string or null."));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(BackgroundImage.class, other.getClass())) {
            return false;
        }
        BackgroundImage backgroundImage = (BackgroundImage) other;
        if (!Intrinsics.areEqual(this.deviceSerialNumber, backgroundImage.deviceSerialNumber) || !Intrinsics.areEqual(this.deviceType, backgroundImage.deviceType) || !Intrinsics.areEqual(this.softwareVersion, backgroundImage.softwareVersion) || !Intrinsics.areEqual(this.backgroundImageType, backgroundImage.backgroundImageType)) {
            return false;
        }
        String str = this.backgroundImageID;
        if (str != null && str.length() != 0) {
            return Intrinsics.areEqual(this.backgroundImageID, backgroundImage.backgroundImageID);
        }
        String str2 = backgroundImage.backgroundImageID;
        return str2 == null || str2.length() == 0;
    }

    @Nullable
    public final String getBackgroundImageID() {
        return this.backgroundImageID;
    }

    @Nullable
    public final String getBackgroundImageType() {
        return this.backgroundImageType;
    }

    @Nullable
    public final String getBackgroundImageURL() {
        return this.backgroundImageURL;
    }

    @Nullable
    public final String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public int hashCode() {
        String str = this.deviceSerialNumber;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.deviceType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.softwareVersion;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.backgroundImageType;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.backgroundImageID;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isDelete() {
        return Intrinsics.areEqual(this.backgroundImageType, DELETE_PERSONAL_PHOTO);
    }

    public final boolean isDownloading() {
        return Intrinsics.areEqual(this.backgroundImageType, DOWNLOADING_PERSONAL_PHOTOS);
    }

    public final void setBackgroundImageID(@Nullable String str) {
        this.backgroundImageID = str;
    }

    public final void setBackgroundImageType(@Nullable String str) {
        this.backgroundImageType = str;
    }

    public final void setBackgroundImageURL(@Nullable String str) {
        this.backgroundImageURL = str;
    }

    @NotNull
    public String toString() {
        String str = this.deviceSerialNumber;
        String str2 = this.deviceType;
        String str3 = this.softwareVersion;
        String str4 = this.backgroundImageID;
        String str5 = this.backgroundImageType;
        String str6 = this.backgroundImageURL;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("BackgroundImage{deviceSerialNumber = '", str, "', deviceType =' ", str2, "', softwareVersion =' ");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, "', backgroundImageID = '", str4, "', backgroundImageType = ");
        return DoubleList$$ExternalSyntheticOutline0.m(m, str5, "', backgroundImageURL = ", str6, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.deviceSerialNumber);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.softwareVersion);
        parcel.writeString(this.backgroundImageID);
        parcel.writeString(this.backgroundImageType);
        parcel.writeString(this.backgroundImageURL);
    }

    private BackgroundImage(Parcel parcel) {
        this.deviceSerialNumber = parcel.readString();
        this.deviceType = parcel.readString();
        this.softwareVersion = parcel.readString();
        this.backgroundImageID = parcel.readString();
        this.backgroundImageType = parcel.readString();
        this.backgroundImageURL = parcel.readString();
    }

    public /* synthetic */ BackgroundImage(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }
}

package com.amazon.alexa.api.compat.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEndpointConfigurationBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u00061"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaEndpointConfiguration;", "Landroid/os/Parcelable;", "endpointId", "", "capabilities", "", "Lcom/amazon/alexa/api/compat/model/AlexaCapability;", AlexaEndpointConfigurationBundleKeys.DISPLAY_CATEGORIES, "", "description", "friendlyName", "manufacturerName", "relationships", AlexaEndpointConfigurationBundleKeys.APP_PACKAGE_NAME, "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndpointId", "()Ljava/lang/String;", "getCapabilities", "()Ljava/util/Set;", "getDisplayCategories", "()Ljava/util/List;", "getDescription", "getFriendlyName", "getManufacturerName", "getRelationships", "getAppPackageName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaEndpointConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaEndpointConfiguration.kt\ncom/amazon/alexa/api/compat/model/AlexaEndpointConfiguration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1#2:64\n1734#3,3:65\n*S KotlinDebug\n*F\n+ 1 AlexaEndpointConfiguration.kt\ncom/amazon/alexa/api/compat/model/AlexaEndpointConfiguration\n*L\n46#1:65,3\n*E\n"})
/* loaded from: classes16.dex */
public final /* data */ class AlexaEndpointConfiguration implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AlexaEndpointConfiguration> CREATOR = new Creator();

    @Nullable
    private final String appPackageName;

    @NotNull
    private final Set<AlexaCapability> capabilities;

    @NotNull
    private final String description;

    @NotNull
    private final List<String> displayCategories;

    @NotNull
    private final String endpointId;

    @NotNull
    private final String friendlyName;

    @NotNull
    private final String manufacturerName;

    @Nullable
    private final String relationships;

    @JvmOverloads
    public AlexaEndpointConfiguration(@NotNull String str, @NotNull Set<AlexaCapability> set, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6) {
        str.getClass();
        set.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.endpointId = str;
        this.capabilities = set;
        this.displayCategories = list;
        this.description = str2;
        this.friendlyName = str3;
        this.manufacturerName = str4;
        this.relationships = str5;
        this.appPackageName = str6;
        if (StringsKt.isBlank(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("endpointId must not be blank");
            throw null;
        }
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (StringsKt.isBlank((String) it2.next())) {
                    Single$$ExternalSyntheticBUOutline0.m$3("displayCategories must not contain blank entries");
                    throw null;
                }
            }
        }
        if (StringsKt.isBlank(this.description)) {
            Single$$ExternalSyntheticBUOutline0.m$3("description must not be blank");
            throw null;
        }
        if (StringsKt.isBlank(this.friendlyName)) {
            Single$$ExternalSyntheticBUOutline0.m$3("friendlyName must not be blank");
            throw null;
        }
        if (StringsKt.isBlank(this.manufacturerName)) {
            Single$$ExternalSyntheticBUOutline0.m$3("manufacturerName must not be blank");
            throw null;
        }
        String str7 = this.relationships;
        if (str7 != null && StringsKt.isBlank(str7)) {
            Single$$ExternalSyntheticBUOutline0.m$3("relationships must not be blank if provided");
            throw null;
        }
        String str8 = this.relationships;
        if (str8 != null) {
            try {
                new JSONObject(str8);
            } catch (JSONException e) {
                Single$$ExternalSyntheticBUOutline0.m("relationships must be valid JSON", e);
                throw null;
            }
        }
        String str9 = this.appPackageName;
        if (str9 == null || !StringsKt.isBlank(str9)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("appPackageName must not be blank if provided");
        throw null;
    }

    public static /* synthetic */ AlexaEndpointConfiguration copy$default(AlexaEndpointConfiguration alexaEndpointConfiguration, String str, Set set, List list, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaEndpointConfiguration.endpointId;
        }
        if ((i & 2) != 0) {
            set = alexaEndpointConfiguration.capabilities;
        }
        if ((i & 4) != 0) {
            list = alexaEndpointConfiguration.displayCategories;
        }
        if ((i & 8) != 0) {
            str2 = alexaEndpointConfiguration.description;
        }
        if ((i & 16) != 0) {
            str3 = alexaEndpointConfiguration.friendlyName;
        }
        if ((i & 32) != 0) {
            str4 = alexaEndpointConfiguration.manufacturerName;
        }
        if ((i & 64) != 0) {
            str5 = alexaEndpointConfiguration.relationships;
        }
        if ((i & 128) != 0) {
            str6 = alexaEndpointConfiguration.appPackageName;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return alexaEndpointConfiguration.copy(str, set, list, str2, str9, str10, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEndpointId() {
        return this.endpointId;
    }

    @NotNull
    public final Set<AlexaCapability> component2() {
        return this.capabilities;
    }

    @NotNull
    public final List<String> component3() {
        return this.displayCategories;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getManufacturerName() {
        return this.manufacturerName;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getRelationships() {
        return this.relationships;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    @NotNull
    public final AlexaEndpointConfiguration copy(@NotNull String endpointId, @NotNull Set<AlexaCapability> capabilities, @NotNull List<String> displayCategories, @NotNull String description, @NotNull String friendlyName, @NotNull String manufacturerName, @Nullable String relationships, @Nullable String appPackageName) {
        endpointId.getClass();
        capabilities.getClass();
        displayCategories.getClass();
        description.getClass();
        friendlyName.getClass();
        manufacturerName.getClass();
        return new AlexaEndpointConfiguration(endpointId, capabilities, displayCategories, description, friendlyName, manufacturerName, relationships, appPackageName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaEndpointConfiguration)) {
            return false;
        }
        AlexaEndpointConfiguration alexaEndpointConfiguration = (AlexaEndpointConfiguration) other;
        return Intrinsics.areEqual(this.endpointId, alexaEndpointConfiguration.endpointId) && Intrinsics.areEqual(this.capabilities, alexaEndpointConfiguration.capabilities) && Intrinsics.areEqual(this.displayCategories, alexaEndpointConfiguration.displayCategories) && Intrinsics.areEqual(this.description, alexaEndpointConfiguration.description) && Intrinsics.areEqual(this.friendlyName, alexaEndpointConfiguration.friendlyName) && Intrinsics.areEqual(this.manufacturerName, alexaEndpointConfiguration.manufacturerName) && Intrinsics.areEqual(this.relationships, alexaEndpointConfiguration.relationships) && Intrinsics.areEqual(this.appPackageName, alexaEndpointConfiguration.appPackageName);
    }

    @Nullable
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    @NotNull
    public final Set<AlexaCapability> getCapabilities() {
        return this.capabilities;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<String> getDisplayCategories() {
        return this.displayCategories;
    }

    @NotNull
    public final String getEndpointId() {
        return this.endpointId;
    }

    @NotNull
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    @NotNull
    public final String getManufacturerName() {
        return this.manufacturerName;
    }

    @Nullable
    public final String getRelationships() {
        return this.relationships;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.displayCategories, (this.capabilities.hashCode() + (this.endpointId.hashCode() * 31)) * 31, 31), 31, this.description), 31, this.friendlyName), 31, this.manufacturerName);
        String str = this.relationships;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appPackageName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.endpointId;
        Set<AlexaCapability> set = this.capabilities;
        List<String> list = this.displayCategories;
        String str2 = this.description;
        String str3 = this.friendlyName;
        String str4 = this.manufacturerName;
        String str5 = this.relationships;
        String str6 = this.appPackageName;
        StringBuilder sb = new StringBuilder("AlexaEndpointConfiguration(endpointId=");
        sb.append(str);
        sb.append(", capabilities=");
        sb.append(set);
        sb.append(", displayCategories=");
        sb.append(list);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", friendlyName=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str3, ", manufacturerName=", str4, ", relationships=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str5, ", appPackageName=", str6, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.endpointId);
        Set<AlexaCapability> set = this.capabilities;
        dest.writeInt(set.size());
        Iterator<AlexaCapability> it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        dest.writeStringList(this.displayCategories);
        dest.writeString(this.description);
        dest.writeString(this.friendlyName);
        dest.writeString(this.manufacturerName);
        dest.writeString(this.relationships);
        dest.writeString(this.appPackageName);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlexaEndpointConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlexaEndpointConfiguration createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(AlexaCapability.CREATOR.createFromParcel(parcel));
            }
            return new AlexaEndpointConfiguration(readString, linkedHashSet, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlexaEndpointConfiguration[] newArray(int i) {
            return new AlexaEndpointConfiguration[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlexaEndpointConfiguration(@NotNull String str, @NotNull Set<AlexaCapability> set, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        this(str, set, list, str2, str3, str4, str5, null, 128, null);
        str.getClass();
        set.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlexaEndpointConfiguration(@NotNull String str, @NotNull Set<AlexaCapability> set, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this(str, set, list, str2, str3, str4, null, null, 192, null);
        str.getClass();
        set.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public /* synthetic */ AlexaEndpointConfiguration(String str, Set set, List list, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, list, str2, str3, str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }
}

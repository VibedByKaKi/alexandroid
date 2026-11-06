package com.amazon.comms.calling.data.dao;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/data/dao/GetIdentityPreferencesResponse;", "", "namespace", "", "key", "value", "set", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNamespace", "()Ljava/lang/String;", "getKey", "getValue", "getSet", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class GetIdentityPreferencesResponse {

    @SerializedName("key")
    @Nullable
    private final String key;

    @SerializedName("namespace")
    @Nullable
    private final String namespace;

    @SerializedName("set")
    @Nullable
    private final String set;

    @SerializedName("value")
    @Nullable
    private final String value;

    public GetIdentityPreferencesResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.namespace = str;
        this.key = str2;
        this.value = str3;
        this.set = str4;
    }

    public static /* synthetic */ GetIdentityPreferencesResponse copy$default(GetIdentityPreferencesResponse getIdentityPreferencesResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getIdentityPreferencesResponse.namespace;
        }
        if ((i & 2) != 0) {
            str2 = getIdentityPreferencesResponse.key;
        }
        if ((i & 4) != 0) {
            str3 = getIdentityPreferencesResponse.value;
        }
        if ((i & 8) != 0) {
            str4 = getIdentityPreferencesResponse.set;
        }
        return getIdentityPreferencesResponse.copy(str, str2, str3, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getSet() {
        return this.set;
    }

    @NotNull
    public final GetIdentityPreferencesResponse copy(@Nullable String namespace, @Nullable String key, @Nullable String value, @Nullable String set) {
        return new GetIdentityPreferencesResponse(namespace, key, value, set);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetIdentityPreferencesResponse)) {
            return false;
        }
        GetIdentityPreferencesResponse getIdentityPreferencesResponse = (GetIdentityPreferencesResponse) other;
        return Intrinsics.areEqual(this.namespace, getIdentityPreferencesResponse.namespace) && Intrinsics.areEqual(this.key, getIdentityPreferencesResponse.key) && Intrinsics.areEqual(this.value, getIdentityPreferencesResponse.value) && Intrinsics.areEqual(this.set, getIdentityPreferencesResponse.set);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    public final String getSet() {
        return this.set;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.namespace;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.set;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.namespace;
        String str2 = this.key;
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("GetIdentityPreferencesResponse(namespace=", str, ", key=", str2, ", value="), this.value, ", set=", this.set, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

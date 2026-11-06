package com.amazon.alexa.redesign.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/redesign/entity/SectionData;", "", "sectionDataJson", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "sectionId", "", "getSectionId", "()Ljava/lang/String;", "refreshUri", "getRefreshUri", "expiryTimestamp", "", "getExpiryTimestamp", "()Ljava/lang/Long;", "isPremium", "", "()Z", "hasExpired", "getHasExpired", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSectionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionData.kt\ncom/amazon/alexa/redesign/entity/SectionData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: classes19.dex */
public final /* data */ class SectionData {
    public static final int $stable = 8;

    @Nullable
    private final JSONObject sectionDataJson;

    public SectionData(@Nullable JSONObject jSONObject) {
        this.sectionDataJson = jSONObject;
    }

    /* renamed from: component1, reason: from getter */
    private final JSONObject getSectionDataJson() {
        return this.sectionDataJson;
    }

    public static /* synthetic */ SectionData copy$default(SectionData sectionData, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = sectionData.sectionDataJson;
        }
        return sectionData.copy(jSONObject);
    }

    @NotNull
    public final SectionData copy(@Nullable JSONObject sectionDataJson) {
        return new SectionData(sectionDataJson);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SectionData) && Intrinsics.areEqual(this.sectionDataJson, ((SectionData) other).sectionDataJson);
    }

    @Nullable
    public final Long getExpiryTimestamp() {
        JSONObject jSONObject = this.sectionDataJson;
        if (jSONObject != null) {
            return Long.valueOf(jSONObject.optLong("expiryTimestamp"));
        }
        return null;
    }

    public final boolean getHasExpired() {
        Long expiryTimestamp = getExpiryTimestamp();
        if (expiryTimestamp != null) {
            long longValue = expiryTimestamp.longValue();
            if (longValue > 0 && System.currentTimeMillis() > longValue) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String getRefreshUri() {
        JSONObject jSONObject = this.sectionDataJson;
        if (jSONObject != null) {
            return jSONObject.optString("refreshUri");
        }
        return null;
    }

    @Nullable
    public final String getSectionId() {
        JSONObject jSONObject = this.sectionDataJson;
        if (jSONObject != null) {
            return jSONObject.optString("sectionId");
        }
        return null;
    }

    public int hashCode() {
        JSONObject jSONObject = this.sectionDataJson;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public final boolean isPremium() {
        JSONObject jSONObject = this.sectionDataJson;
        if (jSONObject != null) {
            return jSONObject.optBoolean("premium");
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "SectionData(sectionDataJson=" + this.sectionDataJson + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}

package com.amazon.alexa.redesign.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/entity/ContentMetadata;", "", "cardJsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "refreshData", "Lcom/amazon/alexa/redesign/entity/RefreshData;", "getRefreshData", "()Lcom/amazon/alexa/redesign/entity/RefreshData;", "setRefreshData", "(Lcom/amazon/alexa/redesign/entity/RefreshData;)V", "sectionData", "Lcom/amazon/alexa/redesign/entity/SectionData;", "getSectionData", "()Lcom/amazon/alexa/redesign/entity/SectionData;", "setSectionData", "(Lcom/amazon/alexa/redesign/entity/SectionData;)V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ContentMetadata {
    public static final int $stable = 8;

    @Nullable
    private RefreshData refreshData;

    @Nullable
    private SectionData sectionData;

    public ContentMetadata(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        JSONObject jSONObject2 = jSONObject.getJSONObject("contentMetadata");
        JSONObject optJSONObject = jSONObject2.optJSONObject("refreshData");
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("sectionData");
        if (optJSONObject != null) {
            this.refreshData = new RefreshData(optJSONObject);
        }
        if (optJSONObject2 != null) {
            this.sectionData = new SectionData(optJSONObject2);
        }
    }

    @Nullable
    public final RefreshData getRefreshData() {
        return this.refreshData;
    }

    @Nullable
    public final SectionData getSectionData() {
        return this.sectionData;
    }

    public final void setRefreshData(@Nullable RefreshData refreshData) {
        this.refreshData = refreshData;
    }

    public final void setSectionData(@Nullable SectionData sectionData) {
        this.sectionData = sectionData;
    }
}

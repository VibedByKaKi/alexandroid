package com.amazon.alexa.redesign.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/redesign/entity/RefreshData;", "", "refreshDataJson", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "contentPublisher", "", "getContentPublisher", "()Ljava/lang/String;", "contentTags", "", "getContentTags", "()Ljava/util/List;", "intervalInMs", "", "getIntervalInMs", "()I", "enabled", "", "getEnabled", "()Z", "buildRefreshDataUrl", "isDifferent", "newData", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRefreshData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefreshData.kt\ncom/amazon/alexa/redesign/entity/RefreshData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1#2:49\n1863#3,2:50\n*S KotlinDebug\n*F\n+ 1 RefreshData.kt\ncom/amazon/alexa/redesign/entity/RefreshData\n*L\n33#1:50,2\n*E\n"})
/* loaded from: classes19.dex */
public final class RefreshData {
    private static final int DEFAULT_INTERVAL = 0;

    @NotNull
    private final String contentPublisher;

    @NotNull
    private final List<String> contentTags;
    private final boolean enabled;
    private final int intervalInMs;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public RefreshData(@NotNull JSONObject jSONObject) {
        ?? emptyList;
        jSONObject.getClass();
        String optString = jSONObject.optString("contentPublisher", "");
        optString.getClass();
        this.contentPublisher = optString;
        JSONArray optJSONArray = jSONObject.optJSONArray("contentTags");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            emptyList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                emptyList.add(optJSONArray.optString(i, ""));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        this.contentTags = emptyList;
        this.intervalInMs = jSONObject.optInt("intervalInMs", 0);
        this.enabled = jSONObject.optBoolean("enabled", false);
    }

    @NotNull
    public final String buildRefreshDataUrl() {
        StringBuilder sb = new StringBuilder("/api/content?contentPublisher=");
        sb.append(this.contentPublisher);
        for (String str : this.contentTags) {
            sb.append("&contentTags=");
            sb.append(str);
        }
        return sb.toString();
    }

    @NotNull
    public final String getContentPublisher() {
        return this.contentPublisher;
    }

    @NotNull
    public final List<String> getContentTags() {
        return this.contentTags;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getIntervalInMs() {
        return this.intervalInMs;
    }

    public final boolean isDifferent(@Nullable RefreshData newData) {
        return (newData != null && this.enabled == newData.enabled && this.intervalInMs == newData.intervalInMs && Intrinsics.areEqual(this.contentPublisher, newData.contentPublisher) && Intrinsics.areEqual(this.contentTags, newData.contentTags)) ? false : true;
    }
}

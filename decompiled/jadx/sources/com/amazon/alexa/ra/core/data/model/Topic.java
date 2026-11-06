package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/Topic;", "", "id", "", "title", "imageURL", "startTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getImageURL", "getStartTime", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Topic {
    public static final int $stable = 0;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("imageURL")
    @Nullable
    private final String imageURL;

    @SerializedName("startTime")
    @NotNull
    private final String startTime;

    @SerializedName("title")
    @NotNull
    private final String title;

    public Topic(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str4);
        this.id = str;
        this.title = str2;
        this.imageURL = str3;
        this.startTime = str4;
    }

    public static /* synthetic */ Topic copy$default(Topic topic, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topic.id;
        }
        if ((i & 2) != 0) {
            str2 = topic.title;
        }
        if ((i & 4) != 0) {
            str3 = topic.imageURL;
        }
        if ((i & 8) != 0) {
            str4 = topic.startTime;
        }
        return topic.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final Topic copy(@NotNull String id, @NotNull String title, @Nullable String imageURL, @NotNull String startTime) {
        id.getClass();
        title.getClass();
        startTime.getClass();
        return new Topic(id, title, imageURL, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) other;
        return Intrinsics.areEqual(this.id, topic.id) && Intrinsics.areEqual(this.title, topic.title) && Intrinsics.areEqual(this.imageURL, topic.imageURL) && Intrinsics.areEqual(this.startTime, topic.startTime);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Topic(id=", str, ", title=", str2, ", imageURL="), this.imageURL, ", startTime=", this.startTime, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ Topic(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4);
    }
}

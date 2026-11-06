package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/api/compat/model/TextResponse;", "", "title", "", "description", "url", "dialogRequestId", "metadata", "Lcom/amazon/alexa/api/compat/model/TextResponseMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/TextResponseMetadata;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getUrl", "getDialogRequestId", "getMetadata", "()Lcom/amazon/alexa/api/compat/model/TextResponseMetadata;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TextResponse {
    public static final int $stable = 0;

    @Nullable
    private final String description;

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final TextResponseMetadata metadata;

    @NotNull
    private final String title;

    @Nullable
    private final String url;

    public /* synthetic */ TextResponse(String str, String str2, String str3, String str4, TextResponseMetadata textResponseMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : textResponseMetadata);
    }

    public static /* synthetic */ TextResponse copy$default(TextResponse textResponse, String str, String str2, String str3, String str4, TextResponseMetadata textResponseMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = textResponse.description;
        }
        if ((i & 4) != 0) {
            str3 = textResponse.url;
        }
        if ((i & 8) != 0) {
            str4 = textResponse.dialogRequestId;
        }
        if ((i & 16) != 0) {
            textResponseMetadata = textResponse.metadata;
        }
        TextResponseMetadata textResponseMetadata2 = textResponseMetadata;
        String str5 = str3;
        return textResponse.copy(str, str2, str5, str4, textResponseMetadata2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final TextResponseMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final TextResponse copy(@NotNull String title, @Nullable String description, @Nullable String url, @Nullable String dialogRequestId, @Nullable TextResponseMetadata metadata) {
        title.getClass();
        return new TextResponse(title, description, url, dialogRequestId, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextResponse)) {
            return false;
        }
        TextResponse textResponse = (TextResponse) other;
        return Intrinsics.areEqual(this.title, textResponse.title) && Intrinsics.areEqual(this.description, textResponse.description) && Intrinsics.areEqual(this.url, textResponse.url) && Intrinsics.areEqual(this.dialogRequestId, textResponse.dialogRequestId) && Intrinsics.areEqual(this.metadata, textResponse.metadata);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final TextResponseMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dialogRequestId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TextResponseMetadata textResponseMetadata = this.metadata;
        return hashCode4 + (textResponseMetadata != null ? textResponseMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.url;
        String str4 = this.dialogRequestId;
        TextResponseMetadata textResponseMetadata = this.metadata;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("TextResponse(title=", str, ", description=", str2, ", url=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", dialogRequestId=", str4, ", metadata=");
        m.append(textResponseMetadata);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public TextResponse(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable TextResponseMetadata textResponseMetadata) {
        str.getClass();
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.dialogRequestId = str4;
        this.metadata = textResponseMetadata;
    }
}

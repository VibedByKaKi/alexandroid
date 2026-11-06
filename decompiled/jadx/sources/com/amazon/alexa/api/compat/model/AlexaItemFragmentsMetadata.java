package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaItemFragmentsMetadata;", "", "itemId", "", "personId", "before", "after", "maxResults", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getItemId", "()Ljava/lang/String;", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "getBefore", "getAfter", "getMaxResults", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaItemFragmentsMetadata {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String after;

    @Nullable
    private final String before;

    @NotNull
    private final String itemId;
    private final int maxResults;

    @Nullable
    private final String personId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaItemFragmentsMetadata$Builder;", "", "<init>", "()V", "itemId", "", "personId", "before", "after", "maxResults", "", "setItemId", "setPersonId", "setBefore", "setAfter", "setMaxResults", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaItemFragmentsMetadata;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaItemFragmentsMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaItemFragmentsMetadata.kt\ncom/amazon/alexa/api/compat/model/AlexaItemFragmentsMetadata$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String after;

        @Nullable
        private String before;

        @Nullable
        private String itemId;
        private int maxResults;

        @Nullable
        private String personId;

        @NotNull
        public final AlexaItemFragmentsMetadata build() {
            String str = this.itemId;
            if (str != null) {
                return new AlexaItemFragmentsMetadata(str, this.personId, this.before, this.after, this.maxResults);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("itemId must be set");
            return null;
        }

        @NotNull
        public final Builder setAfter(@Nullable String after) {
            this.after = after;
            return this;
        }

        @NotNull
        public final Builder setBefore(@Nullable String before) {
            this.before = before;
            return this;
        }

        @NotNull
        public final Builder setItemId(@NotNull String itemId) {
            itemId.getClass();
            this.itemId = itemId;
            return this;
        }

        @NotNull
        public final Builder setMaxResults(int maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        @NotNull
        public final Builder setPersonId(@Nullable String personId) {
            this.personId = personId;
            return this;
        }
    }

    public /* synthetic */ AlexaItemFragmentsMetadata(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0 : i);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaItemFragmentsMetadata copy$default(AlexaItemFragmentsMetadata alexaItemFragmentsMetadata, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = alexaItemFragmentsMetadata.itemId;
        }
        if ((i2 & 2) != 0) {
            str2 = alexaItemFragmentsMetadata.personId;
        }
        if ((i2 & 4) != 0) {
            str3 = alexaItemFragmentsMetadata.before;
        }
        if ((i2 & 8) != 0) {
            str4 = alexaItemFragmentsMetadata.after;
        }
        if ((i2 & 16) != 0) {
            i = alexaItemFragmentsMetadata.maxResults;
        }
        int i3 = i;
        String str5 = str3;
        return alexaItemFragmentsMetadata.copy(str, str2, str5, str4, i3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPersonId() {
        return this.personId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBefore() {
        return this.before;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxResults() {
        return this.maxResults;
    }

    @NotNull
    public final AlexaItemFragmentsMetadata copy(@NotNull String itemId, @Nullable String personId, @Nullable String before, @Nullable String after, int maxResults) {
        itemId.getClass();
        return new AlexaItemFragmentsMetadata(itemId, personId, before, after, maxResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaItemFragmentsMetadata)) {
            return false;
        }
        AlexaItemFragmentsMetadata alexaItemFragmentsMetadata = (AlexaItemFragmentsMetadata) other;
        return Intrinsics.areEqual(this.itemId, alexaItemFragmentsMetadata.itemId) && Intrinsics.areEqual(this.personId, alexaItemFragmentsMetadata.personId) && Intrinsics.areEqual(this.before, alexaItemFragmentsMetadata.before) && Intrinsics.areEqual(this.after, alexaItemFragmentsMetadata.after) && this.maxResults == alexaItemFragmentsMetadata.maxResults;
    }

    @Nullable
    public final String getAfter() {
        return this.after;
    }

    @Nullable
    public final String getBefore() {
        return this.before;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public final int getMaxResults() {
        return this.maxResults;
    }

    @Nullable
    public final String getPersonId() {
        return this.personId;
    }

    public int hashCode() {
        int hashCode = this.itemId.hashCode() * 31;
        String str = this.personId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.before;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.after;
        return Integer.hashCode(this.maxResults) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        String str2 = this.personId;
        String str3 = this.before;
        String str4 = this.after;
        int i = this.maxResults;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AlexaItemFragmentsMetadata(itemId=", str, ", personId=", str2, ", before=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", after=", str4, ", maxResults=");
        return a$$ExternalSyntheticOutline0.m(m, i, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaItemFragmentsMetadata$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaItemFragmentsMetadata$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public AlexaItemFragmentsMetadata(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i) {
        str.getClass();
        this.itemId = str;
        this.personId = str2;
        this.before = str3;
        this.after = str4;
        this.maxResults = i;
    }
}

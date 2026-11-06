package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaFragmentsMetadataBundleKeys;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u0017¨\u0006."}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsMetadata;", "", "personId", "", "conversationId", "token", AlexaFragmentsMetadataBundleKeys.ENABLE_SYNC, "", "paginationContext", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext;)V", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "()Ljava/lang/String;", "getConversationId", "getToken", "getEnableSync", "()Z", "getPaginationContext", "()Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext;", AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_FRAGMENT_URI, "getLastSignificantTurnFragmentUri", "setLastSignificantTurnFragmentUri", "(Ljava/lang/String;)V", AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_TIMESTAMP, "getLastSignificantTurnTimestamp", "setLastSignificantTurnTimestamp", "itemId", "getItemId", "setItemId", "topicId", "getTopicId", "setTopicId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaFragmentsMetadata {

    @Nullable
    private final String conversationId;
    private final boolean enableSync;

    @Nullable
    private String itemId;

    @Nullable
    private String lastSignificantTurnFragmentUri;

    @Nullable
    private String lastSignificantTurnTimestamp;

    @Nullable
    private final AlexaFragmentsPaginationContext paginationContext;

    @Nullable
    private final String personId;

    @Nullable
    private final String token;

    @Nullable
    private String topicId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsMetadata$Builder;", "", "<init>", "()V", "personId", "", "conversationId", "token", AlexaFragmentsMetadataBundleKeys.ENABLE_SYNC, "", "paginationContext", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext;", AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_FRAGMENT_URI, AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_TIMESTAMP, "itemId", "topicId", "setPersonId", "id", "setConversationId", "setToken", "setSyncEnabled", "enabled", "setPaginationContext", "context", "setLastSignificantTurnFragmentUri", "uri", "setLastSignificantTurnTimestamp", "timestamp", "setItemId", "setTopicId", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsMetadata;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaFragmentsMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaFragmentsMetadata.kt\ncom/amazon/alexa/api/compat/model/AlexaFragmentsMetadata$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String conversationId;
        private boolean enableSync;

        @Nullable
        private String itemId;

        @Nullable
        private String lastSignificantTurnFragmentUri;

        @Nullable
        private String lastSignificantTurnTimestamp;

        @Nullable
        private AlexaFragmentsPaginationContext paginationContext;

        @Nullable
        private String personId;

        @Nullable
        private String token;

        @Nullable
        private String topicId;

        @NotNull
        public final AlexaFragmentsMetadata build() {
            AlexaFragmentsMetadata alexaFragmentsMetadata = new AlexaFragmentsMetadata(this.personId, this.conversationId, this.token, this.enableSync, this.paginationContext);
            alexaFragmentsMetadata.setLastSignificantTurnFragmentUri(this.lastSignificantTurnFragmentUri);
            alexaFragmentsMetadata.setLastSignificantTurnTimestamp(this.lastSignificantTurnTimestamp);
            alexaFragmentsMetadata.setItemId(this.itemId);
            alexaFragmentsMetadata.setTopicId(this.topicId);
            return alexaFragmentsMetadata;
        }

        @NotNull
        public final Builder setConversationId(@Nullable String id) {
            this.conversationId = id;
            return this;
        }

        @NotNull
        public final Builder setItemId(@Nullable String id) {
            this.itemId = id;
            return this;
        }

        @NotNull
        public final Builder setLastSignificantTurnFragmentUri(@Nullable String uri) {
            this.lastSignificantTurnFragmentUri = uri;
            return this;
        }

        @NotNull
        public final Builder setLastSignificantTurnTimestamp(@Nullable String timestamp) {
            this.lastSignificantTurnTimestamp = timestamp;
            return this;
        }

        @NotNull
        public final Builder setPaginationContext(@Nullable AlexaFragmentsPaginationContext context) {
            this.paginationContext = context;
            return this;
        }

        @NotNull
        public final Builder setPersonId(@Nullable String id) {
            this.personId = id;
            return this;
        }

        @NotNull
        public final Builder setSyncEnabled(boolean enabled) {
            this.enableSync = enabled;
            return this;
        }

        @NotNull
        public final Builder setToken(@Nullable String token) {
            this.token = token;
            return this;
        }

        @NotNull
        public final Builder setTopicId(@Nullable String id) {
            this.topicId = id;
            return this;
        }
    }

    public /* synthetic */ AlexaFragmentsMetadata(String str, String str2, String str3, boolean z, AlexaFragmentsPaginationContext alexaFragmentsPaginationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : alexaFragmentsPaginationContext);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaFragmentsMetadata copy$default(AlexaFragmentsMetadata alexaFragmentsMetadata, String str, String str2, String str3, boolean z, AlexaFragmentsPaginationContext alexaFragmentsPaginationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaFragmentsMetadata.personId;
        }
        if ((i & 2) != 0) {
            str2 = alexaFragmentsMetadata.conversationId;
        }
        if ((i & 4) != 0) {
            str3 = alexaFragmentsMetadata.token;
        }
        if ((i & 8) != 0) {
            z = alexaFragmentsMetadata.enableSync;
        }
        if ((i & 16) != 0) {
            alexaFragmentsPaginationContext = alexaFragmentsMetadata.paginationContext;
        }
        AlexaFragmentsPaginationContext alexaFragmentsPaginationContext2 = alexaFragmentsPaginationContext;
        String str4 = str3;
        return alexaFragmentsMetadata.copy(str, str2, str4, z, alexaFragmentsPaginationContext2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPersonId() {
        return this.personId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableSync() {
        return this.enableSync;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AlexaFragmentsPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @NotNull
    public final AlexaFragmentsMetadata copy(@Nullable String personId, @Nullable String conversationId, @Nullable String token, boolean enableSync, @Nullable AlexaFragmentsPaginationContext paginationContext) {
        return new AlexaFragmentsMetadata(personId, conversationId, token, enableSync, paginationContext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaFragmentsMetadata)) {
            return false;
        }
        AlexaFragmentsMetadata alexaFragmentsMetadata = (AlexaFragmentsMetadata) other;
        return Intrinsics.areEqual(this.personId, alexaFragmentsMetadata.personId) && Intrinsics.areEqual(this.conversationId, alexaFragmentsMetadata.conversationId) && Intrinsics.areEqual(this.token, alexaFragmentsMetadata.token) && this.enableSync == alexaFragmentsMetadata.enableSync && Intrinsics.areEqual(this.paginationContext, alexaFragmentsMetadata.paginationContext);
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    public final boolean getEnableSync() {
        return this.enableSync;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getLastSignificantTurnFragmentUri() {
        return this.lastSignificantTurnFragmentUri;
    }

    @Nullable
    public final String getLastSignificantTurnTimestamp() {
        return this.lastSignificantTurnTimestamp;
    }

    @Nullable
    public final AlexaFragmentsPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @Nullable
    public final String getPersonId() {
        return this.personId;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        String str = this.personId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conversationId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        int m = DoubleList$$ExternalSyntheticOutline0.m(this.enableSync, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        AlexaFragmentsPaginationContext alexaFragmentsPaginationContext = this.paginationContext;
        return m + (alexaFragmentsPaginationContext != null ? alexaFragmentsPaginationContext.hashCode() : 0);
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setLastSignificantTurnFragmentUri(@Nullable String str) {
        this.lastSignificantTurnFragmentUri = str;
    }

    public final void setLastSignificantTurnTimestamp(@Nullable String str) {
        this.lastSignificantTurnTimestamp = str;
    }

    public final void setTopicId(@Nullable String str) {
        this.topicId = str;
    }

    @NotNull
    public String toString() {
        String str = this.personId;
        String str2 = this.conversationId;
        String str3 = this.token;
        boolean z = this.enableSync;
        AlexaFragmentsPaginationContext alexaFragmentsPaginationContext = this.paginationContext;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AlexaFragmentsMetadata(personId=", str, ", conversationId=", str2, ", token=");
        Automotive$$ExternalSyntheticOutline0.m(m, str3, ", enableSync=", z, ", paginationContext=");
        m.append(alexaFragmentsPaginationContext);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsMetadata$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsMetadata$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public AlexaFragmentsMetadata(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable AlexaFragmentsPaginationContext alexaFragmentsPaginationContext) {
        this.personId = str;
        this.conversationId = str2;
        this.token = str3;
        this.enableSync = z;
        this.paginationContext = alexaFragmentsPaginationContext;
    }

    public AlexaFragmentsMetadata() {
        this(null, null, null, false, null, 31, null);
    }
}

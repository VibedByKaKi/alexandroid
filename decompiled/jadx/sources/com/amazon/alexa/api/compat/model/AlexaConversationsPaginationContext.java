package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
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

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext;", "", "previousToken", "", AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPreviousToken", "()Ljava/lang/String;", "getNextToken", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaConversationsPaginationContext {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String nextToken;

    @Nullable
    private final String previousToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext$Builder;", "", "<init>", "()V", "previousToken", "", AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN, "setPreviousToken", "token", "setNextToken", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaConversationsPaginationContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaConversationsPaginationContext.kt\ncom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String nextToken;

        @Nullable
        private String previousToken;

        @NotNull
        public final AlexaConversationsPaginationContext build() {
            return new AlexaConversationsPaginationContext(this.previousToken, this.nextToken);
        }

        @NotNull
        public final Builder setNextToken(@Nullable String token) {
            this.nextToken = token;
            return this;
        }

        @NotNull
        public final Builder setPreviousToken(@Nullable String token) {
            this.previousToken = token;
            return this;
        }
    }

    public /* synthetic */ AlexaConversationsPaginationContext(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaConversationsPaginationContext copy$default(AlexaConversationsPaginationContext alexaConversationsPaginationContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaConversationsPaginationContext.previousToken;
        }
        if ((i & 2) != 0) {
            str2 = alexaConversationsPaginationContext.nextToken;
        }
        return alexaConversationsPaginationContext.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPreviousToken() {
        return this.previousToken;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNextToken() {
        return this.nextToken;
    }

    @NotNull
    public final AlexaConversationsPaginationContext copy(@Nullable String previousToken, @Nullable String nextToken) {
        return new AlexaConversationsPaginationContext(previousToken, nextToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaConversationsPaginationContext)) {
            return false;
        }
        AlexaConversationsPaginationContext alexaConversationsPaginationContext = (AlexaConversationsPaginationContext) other;
        return Intrinsics.areEqual(this.previousToken, alexaConversationsPaginationContext.previousToken) && Intrinsics.areEqual(this.nextToken, alexaConversationsPaginationContext.nextToken);
    }

    @Nullable
    public final String getNextToken() {
        return this.nextToken;
    }

    @Nullable
    public final String getPreviousToken() {
        return this.previousToken;
    }

    public int hashCode() {
        String str = this.previousToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nextToken;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AlexaConversationsPaginationContext(previousToken=", this.previousToken, ", nextToken=", this.nextToken, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public AlexaConversationsPaginationContext(@Nullable String str, @Nullable String str2) {
        this.previousToken = str;
        this.nextToken = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaConversationsPaginationContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

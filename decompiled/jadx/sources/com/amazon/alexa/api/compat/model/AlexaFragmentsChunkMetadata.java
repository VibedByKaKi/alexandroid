package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaFragmentsChunkMetadataBundleKeys;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata;", "", AlexaFragmentsChunkMetadataBundleKeys.CURRENT_CHUNK_INDEX, "", AlexaFragmentsChunkMetadataBundleKeys.TOTAL_CHUNKS, "requestId", "", "<init>", "(IILjava/lang/String;)V", "getCurrentChunkIndex", "()I", "getTotalChunks", "getRequestId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaFragmentsChunkMetadata {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int currentChunkIndex;

    @Nullable
    private final String requestId;
    private final int totalChunks;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata$Builder;", "", "<init>", "()V", AlexaFragmentsChunkMetadataBundleKeys.CURRENT_CHUNK_INDEX, "", AlexaFragmentsChunkMetadataBundleKeys.TOTAL_CHUNKS, "requestId", "", "setCurrentChunkIndex", "index", "setTotalChunks", "total", "setRequestId", "id", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaFragmentsChunkMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaFragmentsChunkMetadata.kt\ncom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        private int currentChunkIndex;

        @Nullable
        private String requestId;
        private int totalChunks;

        @NotNull
        public final AlexaFragmentsChunkMetadata build() {
            return new AlexaFragmentsChunkMetadata(this.currentChunkIndex, this.totalChunks, this.requestId);
        }

        @NotNull
        public final Builder setCurrentChunkIndex(int index) {
            this.currentChunkIndex = index;
            return this;
        }

        @NotNull
        public final Builder setRequestId(@Nullable String id) {
            this.requestId = id;
            return this;
        }

        @NotNull
        public final Builder setTotalChunks(int total) {
            this.totalChunks = total;
            return this;
        }
    }

    public AlexaFragmentsChunkMetadata(int i, int i2, @Nullable String str) {
        this.currentChunkIndex = i;
        this.totalChunks = i2;
        this.requestId = str;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaFragmentsChunkMetadata copy$default(AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = alexaFragmentsChunkMetadata.currentChunkIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = alexaFragmentsChunkMetadata.totalChunks;
        }
        if ((i3 & 4) != 0) {
            str = alexaFragmentsChunkMetadata.requestId;
        }
        return alexaFragmentsChunkMetadata.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentChunkIndex() {
        return this.currentChunkIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalChunks() {
        return this.totalChunks;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final AlexaFragmentsChunkMetadata copy(int currentChunkIndex, int totalChunks, @Nullable String requestId) {
        return new AlexaFragmentsChunkMetadata(currentChunkIndex, totalChunks, requestId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaFragmentsChunkMetadata)) {
            return false;
        }
        AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata = (AlexaFragmentsChunkMetadata) other;
        return this.currentChunkIndex == alexaFragmentsChunkMetadata.currentChunkIndex && this.totalChunks == alexaFragmentsChunkMetadata.totalChunks && Intrinsics.areEqual(this.requestId, alexaFragmentsChunkMetadata.requestId);
    }

    public final int getCurrentChunkIndex() {
        return this.currentChunkIndex;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public final int getTotalChunks() {
        return this.totalChunks;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.totalChunks, Integer.hashCode(this.currentChunkIndex) * 31, 31);
        String str = this.requestId;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.currentChunkIndex;
        int i2 = this.totalChunks;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "AlexaFragmentsChunkMetadata(currentChunkIndex=", ", totalChunks=", ", requestId="), this.requestId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
}

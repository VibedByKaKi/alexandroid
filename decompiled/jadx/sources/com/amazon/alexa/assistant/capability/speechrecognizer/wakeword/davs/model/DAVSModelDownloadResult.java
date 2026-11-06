package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.davs.model;

import com.amazon.alexa.assistant.toolkit.session.davs.DAVSArtifactResponse;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "", "<init>", "()V", "ArtifactWithSameChecksum", "NewArtifact", "RetryExhausted", "NetworkError", "LocationError", "DataError", "Cancelled", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$ArtifactWithSameChecksum;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$Cancelled;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$DataError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$LocationError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$NetworkError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$NewArtifact;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$RetryExhausted;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DAVSModelDownloadResult {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$ArtifactWithSameChecksum;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ArtifactWithSameChecksum extends DAVSModelDownloadResult {

        @NotNull
        public static final ArtifactWithSameChecksum INSTANCE = new ArtifactWithSameChecksum();

        private ArtifactWithSameChecksum() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$Cancelled;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cancelled extends DAVSModelDownloadResult {

        @NotNull
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$DataError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataError extends DAVSModelDownloadResult {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataError(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.error = th;
        }

        public static /* synthetic */ DataError copy$default(DataError dataError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = dataError.error;
            }
            return dataError.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final DataError copy(@NotNull Throwable error) {
            error.getClass();
            return new DataError(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DataError) && Intrinsics.areEqual(this.error, ((DataError) other).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "DataError(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$LocationError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocationError extends DAVSModelDownloadResult {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationError(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.error = th;
        }

        public static /* synthetic */ LocationError copy$default(LocationError locationError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = locationError.error;
            }
            return locationError.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final LocationError copy(@NotNull Throwable error) {
            error.getClass();
            return new LocationError(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocationError) && Intrinsics.areEqual(this.error, ((LocationError) other).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocationError(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$NetworkError;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkError extends DAVSModelDownloadResult {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.error = th;
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = networkError.error;
            }
            return networkError.copy(th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final NetworkError copy(@NotNull Throwable error) {
            error.getClass();
            return new NetworkError(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkError) && Intrinsics.areEqual(this.error, ((NetworkError) other).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetworkError(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$NewArtifact;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "response", "Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSArtifactResponse;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSArtifactResponse;)V", "getResponse", "()Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSArtifactResponse;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NewArtifact extends DAVSModelDownloadResult {

        @NotNull
        private final DAVSArtifactResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewArtifact(@NotNull DAVSArtifactResponse dAVSArtifactResponse) {
            super(null);
            dAVSArtifactResponse.getClass();
            this.response = dAVSArtifactResponse;
        }

        public static /* synthetic */ NewArtifact copy$default(NewArtifact newArtifact, DAVSArtifactResponse dAVSArtifactResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                dAVSArtifactResponse = newArtifact.response;
            }
            return newArtifact.copy(dAVSArtifactResponse);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DAVSArtifactResponse getResponse() {
            return this.response;
        }

        @NotNull
        public final NewArtifact copy(@NotNull DAVSArtifactResponse response) {
            response.getClass();
            return new NewArtifact(response);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewArtifact) && Intrinsics.areEqual(this.response, ((NewArtifact) other).response);
        }

        @NotNull
        public final DAVSArtifactResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        @NotNull
        public String toString() {
            return "NewArtifact(response=" + this.response + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult$RetryExhausted;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "lastError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getLastError", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RetryExhausted extends DAVSModelDownloadResult {

        @NotNull
        private final Exception lastError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryExhausted(@NotNull Exception exc) {
            super(null);
            exc.getClass();
            this.lastError = exc;
        }

        public static /* synthetic */ RetryExhausted copy$default(RetryExhausted retryExhausted, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = retryExhausted.lastError;
            }
            return retryExhausted.copy(exc);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Exception getLastError() {
            return this.lastError;
        }

        @NotNull
        public final RetryExhausted copy(@NotNull Exception lastError) {
            lastError.getClass();
            return new RetryExhausted(lastError);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RetryExhausted) && Intrinsics.areEqual(this.lastError, ((RetryExhausted) other).lastError);
        }

        @NotNull
        public final Exception getLastError() {
            return this.lastError;
        }

        public int hashCode() {
            return this.lastError.hashCode();
        }

        @NotNull
        public String toString() {
            return "RetryExhausted(lastError=" + this.lastError + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ DAVSModelDownloadResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DAVSModelDownloadResult() {
    }
}

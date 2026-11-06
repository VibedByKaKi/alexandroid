package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayerError;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\f\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0002\b\n\u0082\u0001\f\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "toExternalMediaPlayerError", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "namespace", "", "name", "toExternalMediaPlayerError$voice_release", "OperationUnsupported", "OperationRejectedEndOfQueue", "OperationRejectedSkipLimit", "OperationRejectedUninterruptible", "UnplayableByAuthorization", "UnplayableByAccount", "UnplayableBySubscription", "UnplayableByStreamConcurrency", "UnplayableByRegion", "UnplayableByParentalControl", "InternalError", MetricsConstants.Error.UNKNOWN_ERROR, "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$InternalError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationRejectedEndOfQueue;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationRejectedSkipLimit;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationRejectedUninterruptible;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationUnsupported;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnknownError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByAccount;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByAuthorization;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByParentalControl;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByRegion;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByStreamConcurrency;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableBySubscription;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ExternalMediaPlayerPlaybackError extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$InternalError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "errorName", "", "<init>", "(Ljava/lang/String;)V", "getErrorName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InternalError extends ExternalMediaPlayerPlaybackError {

        @NotNull
        private final String errorName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(@NotNull String str) {
            super(null);
            str.getClass();
            this.errorName = str;
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internalError.errorName;
            }
            return internalError.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorName() {
            return this.errorName;
        }

        @NotNull
        public final InternalError copy(@NotNull String errorName) {
            errorName.getClass();
            return new InternalError(errorName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InternalError) && Intrinsics.areEqual(this.errorName, ((InternalError) other).errorName);
        }

        @NotNull
        public final String getErrorName() {
            return this.errorName;
        }

        public int hashCode() {
            return this.errorName.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("InternalError(errorName=", this.errorName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationRejectedEndOfQueue;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationRejectedEndOfQueue extends ExternalMediaPlayerPlaybackError {

        @NotNull
        public static final OperationRejectedEndOfQueue INSTANCE = new OperationRejectedEndOfQueue();

        private OperationRejectedEndOfQueue() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OperationRejectedEndOfQueue);
        }

        public int hashCode() {
            return 2101692096;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "OperationRejectedEndOfQueue";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationRejectedSkipLimit;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationRejectedSkipLimit extends ExternalMediaPlayerPlaybackError {

        @NotNull
        public static final OperationRejectedSkipLimit INSTANCE = new OperationRejectedSkipLimit();

        private OperationRejectedSkipLimit() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OperationRejectedSkipLimit);
        }

        public int hashCode() {
            return 1772161723;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "OperationRejectedSkipLimit";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationRejectedUninterruptible;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationRejectedUninterruptible extends ExternalMediaPlayerPlaybackError {

        @NotNull
        public static final OperationRejectedUninterruptible INSTANCE = new OperationRejectedUninterruptible();

        private OperationRejectedUninterruptible() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OperationRejectedUninterruptible);
        }

        public int hashCode() {
            return -759463621;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "OperationRejectedUninterruptible";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$OperationUnsupported;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationUnsupported extends ExternalMediaPlayerPlaybackError {

        @NotNull
        public static final OperationUnsupported INSTANCE = new OperationUnsupported();

        private OperationUnsupported() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OperationUnsupported);
        }

        public int hashCode() {
            return 1831043090;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "OperationUnsupported";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnknownError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "errorName", "", "<init>", "(Ljava/lang/String;)V", "getErrorName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnknownError extends ExternalMediaPlayerPlaybackError {

        @NotNull
        private final String errorName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull String str) {
            super(null);
            str.getClass();
            this.errorName = str;
        }

        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.errorName;
            }
            return unknownError.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorName() {
            return this.errorName;
        }

        @NotNull
        public final UnknownError copy(@NotNull String errorName) {
            errorName.getClass();
            return new UnknownError(errorName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownError) && Intrinsics.areEqual(this.errorName, ((UnknownError) other).errorName);
        }

        @NotNull
        public final String getErrorName() {
            return this.errorName;
        }

        public int hashCode() {
            return this.errorName.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnknownError(errorName=", this.errorName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByAccount;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByAccount extends ExternalMediaPlayerPlaybackError {

        @NotNull
        public static final UnplayableByAccount INSTANCE = new UnplayableByAccount();

        private UnplayableByAccount() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof UnplayableByAccount);
        }

        public int hashCode() {
            return 173112107;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "UnplayableByAccount";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByAuthorization;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByAuthorization extends ExternalMediaPlayerPlaybackError {

        @NotNull
        public static final UnplayableByAuthorization INSTANCE = new UnplayableByAuthorization();

        private UnplayableByAuthorization() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof UnplayableByAuthorization);
        }

        public int hashCode() {
            return 1076009719;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "UnplayableByAuthorization";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByParentalControl;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "parentalControlPolicyName", "", "<init>", "(Ljava/lang/String;)V", "getParentalControlPolicyName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByParentalControl extends ExternalMediaPlayerPlaybackError {

        @NotNull
        private final String parentalControlPolicyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnplayableByParentalControl(@NotNull String str) {
            super(null);
            str.getClass();
            this.parentalControlPolicyName = str;
        }

        public static /* synthetic */ UnplayableByParentalControl copy$default(UnplayableByParentalControl unplayableByParentalControl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unplayableByParentalControl.parentalControlPolicyName;
            }
            return unplayableByParentalControl.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getParentalControlPolicyName() {
            return this.parentalControlPolicyName;
        }

        @NotNull
        public final UnplayableByParentalControl copy(@NotNull String parentalControlPolicyName) {
            parentalControlPolicyName.getClass();
            return new UnplayableByParentalControl(parentalControlPolicyName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnplayableByParentalControl) && Intrinsics.areEqual(this.parentalControlPolicyName, ((UnplayableByParentalControl) other).parentalControlPolicyName);
        }

        @NotNull
        public final String getParentalControlPolicyName() {
            return this.parentalControlPolicyName;
        }

        public int hashCode() {
            return this.parentalControlPolicyName.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnplayableByParentalControl(parentalControlPolicyName=", this.parentalControlPolicyName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByRegion;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "countryCode", "", "<init>", "(Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByRegion extends ExternalMediaPlayerPlaybackError {

        @NotNull
        private final String countryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnplayableByRegion(@NotNull String str) {
            super(null);
            str.getClass();
            this.countryCode = str;
        }

        public static /* synthetic */ UnplayableByRegion copy$default(UnplayableByRegion unplayableByRegion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unplayableByRegion.countryCode;
            }
            return unplayableByRegion.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final UnplayableByRegion copy(@NotNull String countryCode) {
            countryCode.getClass();
            return new UnplayableByRegion(countryCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnplayableByRegion) && Intrinsics.areEqual(this.countryCode, ((UnplayableByRegion) other).countryCode);
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            return this.countryCode.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnplayableByRegion(countryCode=", this.countryCode, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableByStreamConcurrency;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "maximumNumberOfStreams", "", "<init>", "(Ljava/lang/String;)V", "getMaximumNumberOfStreams", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByStreamConcurrency extends ExternalMediaPlayerPlaybackError {

        @NotNull
        private final String maximumNumberOfStreams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnplayableByStreamConcurrency(@NotNull String str) {
            super(null);
            str.getClass();
            this.maximumNumberOfStreams = str;
        }

        public static /* synthetic */ UnplayableByStreamConcurrency copy$default(UnplayableByStreamConcurrency unplayableByStreamConcurrency, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unplayableByStreamConcurrency.maximumNumberOfStreams;
            }
            return unplayableByStreamConcurrency.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMaximumNumberOfStreams() {
            return this.maximumNumberOfStreams;
        }

        @NotNull
        public final UnplayableByStreamConcurrency copy(@NotNull String maximumNumberOfStreams) {
            maximumNumberOfStreams.getClass();
            return new UnplayableByStreamConcurrency(maximumNumberOfStreams);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnplayableByStreamConcurrency) && Intrinsics.areEqual(this.maximumNumberOfStreams, ((UnplayableByStreamConcurrency) other).maximumNumberOfStreams);
        }

        @NotNull
        public final String getMaximumNumberOfStreams() {
            return this.maximumNumberOfStreams;
        }

        public int hashCode() {
            return this.maximumNumberOfStreams.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnplayableByStreamConcurrency(maximumNumberOfStreams=", this.maximumNumberOfStreams, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError$UnplayableBySubscription;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackError;", "subscriptionTierName", "", "<init>", "(Ljava/lang/String;)V", "getSubscriptionTierName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableBySubscription extends ExternalMediaPlayerPlaybackError {

        @NotNull
        private final String subscriptionTierName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnplayableBySubscription(@NotNull String str) {
            super(null);
            str.getClass();
            this.subscriptionTierName = str;
        }

        public static /* synthetic */ UnplayableBySubscription copy$default(UnplayableBySubscription unplayableBySubscription, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unplayableBySubscription.subscriptionTierName;
            }
            return unplayableBySubscription.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSubscriptionTierName() {
            return this.subscriptionTierName;
        }

        @NotNull
        public final UnplayableBySubscription copy(@NotNull String subscriptionTierName) {
            subscriptionTierName.getClass();
            return new UnplayableBySubscription(subscriptionTierName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnplayableBySubscription) && Intrinsics.areEqual(this.subscriptionTierName, ((UnplayableBySubscription) other).subscriptionTierName);
        }

        @NotNull
        public final String getSubscriptionTierName() {
            return this.subscriptionTierName;
        }

        public int hashCode() {
            return this.subscriptionTierName.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnplayableBySubscription(subscriptionTierName=", this.subscriptionTierName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ ExternalMediaPlayerPlaybackError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final ExternalMediaPlayerError toExternalMediaPlayerError$voice_release(@NotNull String namespace, @NotNull String name) {
        namespace.getClass();
        name.getClass();
        if (this instanceof OperationUnsupported) {
            return new ExternalMediaPlayerError.OperationUnsupported(name);
        }
        if (this instanceof OperationRejectedEndOfQueue) {
            return ExternalMediaPlayerError.OperationRejectedEndOfQueue.INSTANCE;
        }
        if (this instanceof OperationRejectedSkipLimit) {
            return ExternalMediaPlayerError.OperationRejectedSkipLimit.INSTANCE;
        }
        if (this instanceof OperationRejectedUninterruptible) {
            return new ExternalMediaPlayerError.OperationRejectedUninterruptible(name);
        }
        if (this instanceof UnplayableByAuthorization) {
            return new ExternalMediaPlayerError.UnplayableByAuthorization(namespace, name);
        }
        if (this instanceof UnplayableByAccount) {
            return new ExternalMediaPlayerError.UnplayableByAccount(namespace, name);
        }
        if (this instanceof UnplayableBySubscription) {
            return new ExternalMediaPlayerError.UnplayableBySubscription(((UnplayableBySubscription) this).getSubscriptionTierName());
        }
        if (this instanceof UnplayableByStreamConcurrency) {
            return new ExternalMediaPlayerError.UnplayableByStreamConcurrency(((UnplayableByStreamConcurrency) this).getMaximumNumberOfStreams());
        }
        if (this instanceof UnplayableByRegion) {
            return new ExternalMediaPlayerError.UnplayableByRegion(((UnplayableByRegion) this).getCountryCode());
        }
        if (this instanceof UnplayableByParentalControl) {
            return new ExternalMediaPlayerError.UnplayableByParentalControl(((UnplayableByParentalControl) this).getParentalControlPolicyName());
        }
        if (this instanceof InternalError) {
            return new ExternalMediaPlayerError.InternalError(namespace, name, ((InternalError) this).getErrorName());
        }
        if (this instanceof UnknownError) {
            return new ExternalMediaPlayerError.UnknownError(namespace, name, ((UnknownError) this).getErrorName());
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private ExternalMediaPlayerPlaybackError() {
    }
}

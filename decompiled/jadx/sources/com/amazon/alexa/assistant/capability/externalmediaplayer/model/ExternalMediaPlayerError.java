package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.enrollment.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.custom.AnimationConstants;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\u0082\u0001\f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerEventError;", "<init>", "()V", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "name", "getName", "code", "", "getCode", "()J", "description", "getDescription", "message", "getMessage", "OperationUnsupported", "OperationRejectedEndOfQueue", "OperationRejectedSkipLimit", "OperationRejectedUninterruptible", "UnplayableByAuthorization", "UnplayableByAccount", "UnplayableBySubscription", "UnplayableByStreamConcurrency", "UnplayableByRegion", "UnplayableByParentalControl", "InternalError", MetricsConstants.Error.UNKNOWN_ERROR, "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$InternalError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationRejectedEndOfQueue;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationRejectedSkipLimit;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationRejectedUninterruptible;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationUnsupported;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnknownError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByAccount;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByAuthorization;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByParentalControl;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByRegion;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByStreamConcurrency;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableBySubscription;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ExternalMediaPlayerError extends Exception implements ExternalMediaPlayerEventError {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$InternalError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "directiveNamespace", "", "directiveName", "internalErrorOrExceptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDirectiveNamespace", "()Ljava/lang/String;", "getDirectiveName", "getInternalErrorOrExceptionName", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InternalError extends ExternalMediaPlayerError {

        @NotNull
        private final String directiveName;

        @NotNull
        private final String directiveNamespace;

        @NotNull
        private final String internalErrorOrExceptionName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
            this.directiveNamespace = str;
            this.directiveName = str2;
            this.internalErrorOrExceptionName = str3;
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internalError.directiveNamespace;
            }
            if ((i & 2) != 0) {
                str2 = internalError.directiveName;
            }
            if ((i & 4) != 0) {
                str3 = internalError.internalErrorOrExceptionName;
            }
            return internalError.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getInternalErrorOrExceptionName() {
            return this.internalErrorOrExceptionName;
        }

        @NotNull
        public final InternalError copy(@NotNull String directiveNamespace, @NotNull String directiveName, @NotNull String internalErrorOrExceptionName) {
            directiveNamespace.getClass();
            directiveName.getClass();
            internalErrorOrExceptionName.getClass();
            return new InternalError(directiveNamespace, directiveName, internalErrorOrExceptionName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalError)) {
                return false;
            }
            InternalError internalError = (InternalError) other;
            return Intrinsics.areEqual(this.directiveNamespace, internalError.directiveNamespace) && Intrinsics.areEqual(this.directiveName, internalError.directiveName) && Intrinsics.areEqual(this.internalErrorOrExceptionName, internalError.internalErrorOrExceptionName);
        }

        @NotNull
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        @NotNull
        public final String getInternalErrorOrExceptionName() {
            return this.internalErrorOrExceptionName;
        }

        public int hashCode() {
            return this.internalErrorOrExceptionName.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.directiveNamespace.hashCode() * 31, 31, this.directiveName);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            String str = this.directiveNamespace;
            String str2 = this.directiveName;
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("InternalError(directiveNamespace=", str, ", directiveName=", str2, ", internalErrorOrExceptionName="), this.internalErrorOrExceptionName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationRejectedEndOfQueue;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationRejectedEndOfQueue extends ExternalMediaPlayerError {

        @NotNull
        public static final OperationRejectedEndOfQueue INSTANCE = new OperationRejectedEndOfQueue();

        private OperationRejectedEndOfQueue() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OperationRejectedEndOfQueue);
        }

        public int hashCode() {
            return -984212837;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "OperationRejectedEndOfQueue";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationRejectedSkipLimit;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationRejectedSkipLimit extends ExternalMediaPlayerError {

        @NotNull
        public static final OperationRejectedSkipLimit INSTANCE = new OperationRejectedSkipLimit();

        private OperationRejectedSkipLimit() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OperationRejectedSkipLimit);
        }

        public int hashCode() {
            return -1098330240;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "OperationRejectedSkipLimit";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationRejectedUninterruptible;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "directiveOrOperationName", "", "<init>", "(Ljava/lang/String;)V", "getDirectiveOrOperationName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationRejectedUninterruptible extends ExternalMediaPlayerError {

        @NotNull
        private final String directiveOrOperationName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OperationRejectedUninterruptible(@NotNull String str) {
            super(null);
            str.getClass();
            this.directiveOrOperationName = str;
        }

        public static /* synthetic */ OperationRejectedUninterruptible copy$default(OperationRejectedUninterruptible operationRejectedUninterruptible, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = operationRejectedUninterruptible.directiveOrOperationName;
            }
            return operationRejectedUninterruptible.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDirectiveOrOperationName() {
            return this.directiveOrOperationName;
        }

        @NotNull
        public final OperationRejectedUninterruptible copy(@NotNull String directiveOrOperationName) {
            directiveOrOperationName.getClass();
            return new OperationRejectedUninterruptible(directiveOrOperationName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OperationRejectedUninterruptible) && Intrinsics.areEqual(this.directiveOrOperationName, ((OperationRejectedUninterruptible) other).directiveOrOperationName);
        }

        @NotNull
        public final String getDirectiveOrOperationName() {
            return this.directiveOrOperationName;
        }

        public int hashCode() {
            return this.directiveOrOperationName.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("OperationRejectedUninterruptible(directiveOrOperationName=", this.directiveOrOperationName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$OperationUnsupported;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "directiveOrOperationName", "", "<init>", "(Ljava/lang/String;)V", "getDirectiveOrOperationName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OperationUnsupported extends ExternalMediaPlayerError {

        @NotNull
        private final String directiveOrOperationName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OperationUnsupported(@NotNull String str) {
            super(null);
            str.getClass();
            this.directiveOrOperationName = str;
        }

        public static /* synthetic */ OperationUnsupported copy$default(OperationUnsupported operationUnsupported, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = operationUnsupported.directiveOrOperationName;
            }
            return operationUnsupported.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDirectiveOrOperationName() {
            return this.directiveOrOperationName;
        }

        @NotNull
        public final OperationUnsupported copy(@NotNull String directiveOrOperationName) {
            directiveOrOperationName.getClass();
            return new OperationUnsupported(directiveOrOperationName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OperationUnsupported) && Intrinsics.areEqual(this.directiveOrOperationName, ((OperationUnsupported) other).directiveOrOperationName);
        }

        @NotNull
        public final String getDirectiveOrOperationName() {
            return this.directiveOrOperationName;
        }

        public int hashCode() {
            return this.directiveOrOperationName.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("OperationUnsupported(directiveOrOperationName=", this.directiveOrOperationName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnknownError;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "directiveNamespace", "", "directiveName", "errorOrExceptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDirectiveNamespace", "()Ljava/lang/String;", "getDirectiveName", "getErrorOrExceptionName", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnknownError extends ExternalMediaPlayerError {

        @NotNull
        private final String directiveName;

        @NotNull
        private final String directiveNamespace;

        @NotNull
        private final String errorOrExceptionName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
            this.directiveNamespace = str;
            this.directiveName = str2;
            this.errorOrExceptionName = str3;
        }

        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.directiveNamespace;
            }
            if ((i & 2) != 0) {
                str2 = unknownError.directiveName;
            }
            if ((i & 4) != 0) {
                str3 = unknownError.errorOrExceptionName;
            }
            return unknownError.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getErrorOrExceptionName() {
            return this.errorOrExceptionName;
        }

        @NotNull
        public final UnknownError copy(@NotNull String directiveNamespace, @NotNull String directiveName, @NotNull String errorOrExceptionName) {
            directiveNamespace.getClass();
            directiveName.getClass();
            errorOrExceptionName.getClass();
            return new UnknownError(directiveNamespace, directiveName, errorOrExceptionName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) other;
            return Intrinsics.areEqual(this.directiveNamespace, unknownError.directiveNamespace) && Intrinsics.areEqual(this.directiveName, unknownError.directiveName) && Intrinsics.areEqual(this.errorOrExceptionName, unknownError.errorOrExceptionName);
        }

        @NotNull
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        @NotNull
        public final String getErrorOrExceptionName() {
            return this.errorOrExceptionName;
        }

        public int hashCode() {
            return this.errorOrExceptionName.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.directiveNamespace.hashCode() * 31, 31, this.directiveName);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            String str = this.directiveNamespace;
            String str2 = this.directiveName;
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("UnknownError(directiveNamespace=", str, ", directiveName=", str2, ", errorOrExceptionName="), this.errorOrExceptionName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByAccount;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "directiveNamespace", "", "directiveName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDirectiveNamespace", "()Ljava/lang/String;", "getDirectiveName", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByAccount extends ExternalMediaPlayerError {

        @NotNull
        private final String directiveName;

        @NotNull
        private final String directiveNamespace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnplayableByAccount(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.directiveNamespace = str;
            this.directiveName = str2;
        }

        public static /* synthetic */ UnplayableByAccount copy$default(UnplayableByAccount unplayableByAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unplayableByAccount.directiveNamespace;
            }
            if ((i & 2) != 0) {
                str2 = unplayableByAccount.directiveName;
            }
            return unplayableByAccount.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        public final UnplayableByAccount copy(@NotNull String directiveNamespace, @NotNull String directiveName) {
            directiveNamespace.getClass();
            directiveName.getClass();
            return new UnplayableByAccount(directiveNamespace, directiveName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnplayableByAccount)) {
                return false;
            }
            UnplayableByAccount unplayableByAccount = (UnplayableByAccount) other;
            return Intrinsics.areEqual(this.directiveNamespace, unplayableByAccount.directiveNamespace) && Intrinsics.areEqual(this.directiveName, unplayableByAccount.directiveName);
        }

        @NotNull
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        public int hashCode() {
            return this.directiveName.hashCode() + (this.directiveNamespace.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnplayableByAccount(directiveNamespace=", this.directiveNamespace, ", directiveName=", this.directiveName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByAuthorization;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "directiveNamespace", "", "directiveName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDirectiveNamespace", "()Ljava/lang/String;", "getDirectiveName", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByAuthorization extends ExternalMediaPlayerError {

        @NotNull
        private final String directiveName;

        @NotNull
        private final String directiveNamespace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnplayableByAuthorization(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.directiveNamespace = str;
            this.directiveName = str2;
        }

        public static /* synthetic */ UnplayableByAuthorization copy$default(UnplayableByAuthorization unplayableByAuthorization, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unplayableByAuthorization.directiveNamespace;
            }
            if ((i & 2) != 0) {
                str2 = unplayableByAuthorization.directiveName;
            }
            return unplayableByAuthorization.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        public final UnplayableByAuthorization copy(@NotNull String directiveNamespace, @NotNull String directiveName) {
            directiveNamespace.getClass();
            directiveName.getClass();
            return new UnplayableByAuthorization(directiveNamespace, directiveName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnplayableByAuthorization)) {
                return false;
            }
            UnplayableByAuthorization unplayableByAuthorization = (UnplayableByAuthorization) other;
            return Intrinsics.areEqual(this.directiveNamespace, unplayableByAuthorization.directiveNamespace) && Intrinsics.areEqual(this.directiveName, unplayableByAuthorization.directiveName);
        }

        @NotNull
        public final String getDirectiveName() {
            return this.directiveName;
        }

        @NotNull
        public final String getDirectiveNamespace() {
            return this.directiveNamespace;
        }

        public int hashCode() {
            return this.directiveName.hashCode() + (this.directiveNamespace.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnplayableByAuthorization(directiveNamespace=", this.directiveNamespace, ", directiveName=", this.directiveName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByParentalControl;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "parentalControlPolicyName", "", "<init>", "(Ljava/lang/String;)V", "getParentalControlPolicyName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByParentalControl extends ExternalMediaPlayerError {

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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByRegion;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "countryCode", "", "<init>", "(Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByRegion extends ExternalMediaPlayerError {

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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableByStreamConcurrency;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "maximumNumberOfStreams", "", "<init>", "(Ljava/lang/String;)V", "getMaximumNumberOfStreams", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableByStreamConcurrency extends ExternalMediaPlayerError {

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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError$UnplayableBySubscription;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerError;", "subscriptionTierName", "", "<init>", "(Ljava/lang/String;)V", "getSubscriptionTierName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnplayableBySubscription extends ExternalMediaPlayerError {

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

    public /* synthetic */ ExternalMediaPlayerError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String getStringValue() {
        if (this instanceof OperationUnsupported) {
            return "OPERATION_UNSUPPORTED";
        }
        if (this instanceof OperationRejectedEndOfQueue) {
            return "OPERATION_REJECTED_END_OF_QUEUE";
        }
        if (this instanceof OperationRejectedSkipLimit) {
            return "OPERATION_REJECTED_SKIP_LIMIT";
        }
        if (this instanceof OperationRejectedUninterruptible) {
            return "OPERATION_REJECTED_UNINTERRUPTIBLE";
        }
        if (this instanceof UnplayableByAuthorization) {
            return "UNPLAYABLE_BY_AUTHORIZATION";
        }
        if (this instanceof UnplayableByAccount) {
            return "UNPLAYABLE_BY_ACCOUNT";
        }
        if (this instanceof UnplayableBySubscription) {
            return "UNPLAYABLE_BY_SUBSCRIPTION";
        }
        if (this instanceof UnplayableByStreamConcurrency) {
            return "UNPLAYABLE_BY_STREAM_CONCURRENCY";
        }
        if (this instanceof UnplayableByRegion) {
            return "UNPLAYABLE_BY_REGION";
        }
        if (this instanceof UnplayableByParentalControl) {
            return "UNPLAYABLE_BY_PARENTAL_CONTROL";
        }
        if (this instanceof InternalError) {
            return "INTERNAL_ERROR";
        }
        if (this instanceof UnknownError) {
            return MetricsConstants.OperationalMetrics.UNKNOWN_ERROR;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayerEventError
    public long getCode() {
        if (this instanceof OperationUnsupported) {
            return 1000L;
        }
        if (this instanceof OperationRejectedEndOfQueue) {
            return 1100L;
        }
        if (this instanceof OperationRejectedSkipLimit) {
            return 1200L;
        }
        if (this instanceof OperationRejectedUninterruptible) {
            return AnimationConstants.ACTIONBAR_ANIMATION_DELAY;
        }
        if (this instanceof UnplayableByAuthorization) {
            return 2000L;
        }
        if (this instanceof UnplayableByAccount) {
            return 2100L;
        }
        if (this instanceof UnplayableBySubscription) {
            return 2300L;
        }
        if (this instanceof UnplayableByStreamConcurrency) {
            return 2400L;
        }
        if (this instanceof UnplayableByRegion) {
            return 2500L;
        }
        if (this instanceof UnplayableByParentalControl) {
            return 2600L;
        }
        if (this instanceof InternalError) {
            return 3000L;
        }
        if (this instanceof UnknownError) {
            return 3100L;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return 0L;
    }

    @Override // com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayerEventError
    @NotNull
    public String getDescription() {
        if (this instanceof OperationUnsupported) {
            return BitVector$$ExternalSyntheticOutline0.m(((OperationUnsupported) this).getDirectiveOrOperationName(), " is not supported on current playing item.");
        }
        if (this instanceof OperationRejectedEndOfQueue) {
            return "Reaching the end of current playback, no more item available.";
        }
        if (this instanceof OperationRejectedSkipLimit) {
            return "Skip request has been rejected because user reached skip limit.";
        }
        if (this instanceof OperationRejectedUninterruptible) {
            return BitVector$$ExternalSyntheticOutline0.m(((OperationRejectedUninterruptible) this).getDirectiveOrOperationName(), " is not allowed on current playing item.");
        }
        if (this instanceof UnplayableByAuthorization) {
            UnplayableByAuthorization unplayableByAuthorization = (UnplayableByAuthorization) this;
            return a$$ExternalSyntheticOutline0.m("Content cannot be played because the user is not logged in for directive ", unplayableByAuthorization.getDirectiveNamespace(), ".", unplayableByAuthorization.getDirectiveName(), ".");
        }
        if (this instanceof UnplayableByAccount) {
            UnplayableByAccount unplayableByAccount = (UnplayableByAccount) this;
            return a$$ExternalSyntheticOutline0.m("User account cannot be played for directive ", unplayableByAccount.getDirectiveNamespace(), ".", unplayableByAccount.getDirectiveName(), ".");
        }
        if (this instanceof UnplayableBySubscription) {
            return a$$ExternalSyntheticOutline0.m("Requested content is not available for user subscription ", ((UnplayableBySubscription) this).getSubscriptionTierName(), " unless upgraded.");
        }
        if (this instanceof UnplayableByStreamConcurrency) {
            return a$$ExternalSyntheticOutline0.m("User has reached maximum ", ((UnplayableByStreamConcurrency) this).getMaximumNumberOfStreams(), " concurrent streams limit.");
        }
        if (this instanceof UnplayableByRegion) {
            return a$$ExternalSyntheticOutline0.m("Requested content is not available in country/region ", ((UnplayableByRegion) this).getCountryCode(), ".");
        }
        if (this instanceof UnplayableByParentalControl) {
            return a$$ExternalSyntheticOutline0.m("Requested content is not available when ", ((UnplayableByParentalControl) this).getParentalControlPolicyName(), " is ON.");
        }
        if (this instanceof InternalError) {
            InternalError internalError = (InternalError) this;
            String directiveNamespace = internalError.getDirectiveNamespace();
            String directiveName = internalError.getDirectiveName();
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Directive ", directiveNamespace, ".", directiveName, " failed due to internal error "), internalError.getInternalErrorOrExceptionName(), ".");
        }
        if (!(this instanceof UnknownError)) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        UnknownError unknownError = (UnknownError) this;
        String errorOrExceptionName = unknownError.getErrorOrExceptionName();
        String directiveNamespace2 = unknownError.getDirectiveNamespace();
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Request failed due to Exception/Error ", errorOrExceptionName, " for directive ", directiveNamespace2, "."), unknownError.getDirectiveName(), ".");
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return getDescription();
    }

    @Override // com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayerEventError
    @NotNull
    public String getName() {
        return getStringValue();
    }

    private ExternalMediaPlayerError() {
    }
}

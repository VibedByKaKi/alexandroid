package com.amazon.alexa.ra.core.data.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallFailureBundleKeys;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.minerva.client.thirdparty.transport.UploadResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "", "<init>", "()V", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "message", "", "getMessage", "()Ljava/lang/String;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "getException", "()Ljava/lang/Exception;", "FailureType", "UnknownFailure", "TimeoutFailure", "MessagingFailure", "InternalFailure", "NetworkFailure", "ServerErrorFailure", "AuthorizationFailure", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$AuthorizationFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$InternalFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$MessagingFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$NetworkFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$ServerErrorFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$TimeoutFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$UnknownFailure;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class ApiFailure {
    public static final int $stable = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "TIMEOUT", "MESSAGING", "INTERNAL", VisualShareErrorType.NETWORK, UploadResult.SERVER_ERROR, "AUTHORIZATION", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailureType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureType[] $VALUES;
        public static final FailureType UNKNOWN = new FailureType("UNKNOWN", 0);
        public static final FailureType TIMEOUT = new FailureType("TIMEOUT", 1);
        public static final FailureType MESSAGING = new FailureType("MESSAGING", 2);
        public static final FailureType INTERNAL = new FailureType("INTERNAL", 3);
        public static final FailureType NETWORK = new FailureType(VisualShareErrorType.NETWORK, 4);
        public static final FailureType SERVER_ERROR = new FailureType(UploadResult.SERVER_ERROR, 5);
        public static final FailureType AUTHORIZATION = new FailureType("AUTHORIZATION", 6);

        private static final /* synthetic */ FailureType[] $values() {
            return new FailureType[]{UNKNOWN, TIMEOUT, MESSAGING, INTERNAL, NETWORK, SERVER_ERROR, AUTHORIZATION};
        }

        static {
            FailureType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private FailureType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<FailureType> getEntries() {
            return $ENTRIES;
        }

        public static FailureType valueOf(String str) {
            return (FailureType) Enum.valueOf(FailureType.class, str);
        }

        public static FailureType[] values() {
            return (FailureType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ApiFailure(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract Exception getException();

    @NotNull
    public abstract FailureType getFailureType();

    @Nullable
    public abstract String getMessage();

    private ApiFailure() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$AuthorizationFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AuthorizationFailure extends ApiFailure {
        public static final int $stable = 8;

        @Nullable
        private final Exception exception;

        @NotNull
        private final FailureType failureType;

        @Nullable
        private final String message;

        public /* synthetic */ AuthorizationFailure(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
        }

        public static /* synthetic */ AuthorizationFailure copy$default(AuthorizationFailure authorizationFailure, String str, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationFailure.message;
            }
            if ((i & 2) != 0) {
                exc = authorizationFailure.exception;
            }
            return authorizationFailure.copy(str, exc);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final AuthorizationFailure copy(@Nullable String message, @Nullable Exception exception) {
            return new AuthorizationFailure(message, exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationFailure)) {
                return false;
            }
            AuthorizationFailure authorizationFailure = (AuthorizationFailure) other;
            return Intrinsics.areEqual(this.message, authorizationFailure.message) && Intrinsics.areEqual(this.exception, authorizationFailure.exception);
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @NotNull
        public FailureType getFailureType() {
            return this.failureType;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.exception;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AuthorizationFailure(message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AuthorizationFailure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public AuthorizationFailure(@Nullable String str, @Nullable Exception exc) {
            super(null);
            this.message = str;
            this.exception = exc;
            this.failureType = FailureType.AUTHORIZATION;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$InternalFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InternalFailure extends ApiFailure {
        public static final int $stable = 8;

        @Nullable
        private final Exception exception;

        @NotNull
        private final FailureType failureType;

        @Nullable
        private final String message;

        public /* synthetic */ InternalFailure(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
        }

        public static /* synthetic */ InternalFailure copy$default(InternalFailure internalFailure, String str, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internalFailure.message;
            }
            if ((i & 2) != 0) {
                exc = internalFailure.exception;
            }
            return internalFailure.copy(str, exc);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final InternalFailure copy(@Nullable String message, @Nullable Exception exception) {
            return new InternalFailure(message, exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalFailure)) {
                return false;
            }
            InternalFailure internalFailure = (InternalFailure) other;
            return Intrinsics.areEqual(this.message, internalFailure.message) && Intrinsics.areEqual(this.exception, internalFailure.exception);
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @NotNull
        public FailureType getFailureType() {
            return this.failureType;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.exception;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "InternalFailure(message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InternalFailure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public InternalFailure(@Nullable String str, @Nullable Exception exc) {
            super(null);
            this.message = str;
            this.exception = exc;
            this.failureType = FailureType.INTERNAL;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$MessagingFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MessagingFailure extends ApiFailure {
        public static final int $stable = 8;

        @Nullable
        private final Exception exception;

        @NotNull
        private final FailureType failureType;

        @Nullable
        private final String message;

        public /* synthetic */ MessagingFailure(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
        }

        public static /* synthetic */ MessagingFailure copy$default(MessagingFailure messagingFailure, String str, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messagingFailure.message;
            }
            if ((i & 2) != 0) {
                exc = messagingFailure.exception;
            }
            return messagingFailure.copy(str, exc);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final MessagingFailure copy(@Nullable String message, @Nullable Exception exception) {
            return new MessagingFailure(message, exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessagingFailure)) {
                return false;
            }
            MessagingFailure messagingFailure = (MessagingFailure) other;
            return Intrinsics.areEqual(this.message, messagingFailure.message) && Intrinsics.areEqual(this.exception, messagingFailure.exception);
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @NotNull
        public FailureType getFailureType() {
            return this.failureType;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.exception;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MessagingFailure(message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MessagingFailure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public MessagingFailure(@Nullable String str, @Nullable Exception exc) {
            super(null);
            this.message = str;
            this.exception = exc;
            this.failureType = FailureType.MESSAGING;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$NetworkFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NetworkFailure extends ApiFailure {
        public static final int $stable = 8;

        @Nullable
        private final Exception exception;

        @NotNull
        private final FailureType failureType;

        @Nullable
        private final String message;

        public /* synthetic */ NetworkFailure(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
        }

        public static /* synthetic */ NetworkFailure copy$default(NetworkFailure networkFailure, String str, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                str = networkFailure.message;
            }
            if ((i & 2) != 0) {
                exc = networkFailure.exception;
            }
            return networkFailure.copy(str, exc);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final NetworkFailure copy(@Nullable String message, @Nullable Exception exception) {
            return new NetworkFailure(message, exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkFailure)) {
                return false;
            }
            NetworkFailure networkFailure = (NetworkFailure) other;
            return Intrinsics.areEqual(this.message, networkFailure.message) && Intrinsics.areEqual(this.exception, networkFailure.exception);
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @NotNull
        public FailureType getFailureType() {
            return this.failureType;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.exception;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NetworkFailure(message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkFailure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public NetworkFailure(@Nullable String str, @Nullable Exception exc) {
            super(null);
            this.message = str;
            this.exception = exc;
            this.failureType = FailureType.NETWORK;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$TimeoutFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeoutFailure extends ApiFailure {
        public static final int $stable = 8;

        @Nullable
        private final Exception exception;

        @NotNull
        private final FailureType failureType;

        @Nullable
        private final String message;

        public /* synthetic */ TimeoutFailure(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
        }

        public static /* synthetic */ TimeoutFailure copy$default(TimeoutFailure timeoutFailure, String str, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timeoutFailure.message;
            }
            if ((i & 2) != 0) {
                exc = timeoutFailure.exception;
            }
            return timeoutFailure.copy(str, exc);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final TimeoutFailure copy(@Nullable String message, @Nullable Exception exception) {
            return new TimeoutFailure(message, exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeoutFailure)) {
                return false;
            }
            TimeoutFailure timeoutFailure = (TimeoutFailure) other;
            return Intrinsics.areEqual(this.message, timeoutFailure.message) && Intrinsics.areEqual(this.exception, timeoutFailure.exception);
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @NotNull
        public FailureType getFailureType() {
            return this.failureType;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.exception;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TimeoutFailure(message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TimeoutFailure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TimeoutFailure(@Nullable String str, @Nullable Exception exc) {
            super(null);
            this.message = str;
            this.exception = exc;
            this.failureType = FailureType.TIMEOUT;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$UnknownFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownFailure extends ApiFailure {
        public static final int $stable = 8;

        @Nullable
        private final Exception exception;

        @NotNull
        private final FailureType failureType;

        @Nullable
        private final String message;

        public /* synthetic */ UnknownFailure(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
        }

        public static /* synthetic */ UnknownFailure copy$default(UnknownFailure unknownFailure, String str, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownFailure.message;
            }
            if ((i & 2) != 0) {
                exc = unknownFailure.exception;
            }
            return unknownFailure.copy(str, exc);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final UnknownFailure copy(@Nullable String message, @Nullable Exception exception) {
            return new UnknownFailure(message, exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnknownFailure)) {
                return false;
            }
            UnknownFailure unknownFailure = (UnknownFailure) other;
            return Intrinsics.areEqual(this.message, unknownFailure.message) && Intrinsics.areEqual(this.exception, unknownFailure.exception);
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @NotNull
        public FailureType getFailureType() {
            return this.failureType;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.exception;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UnknownFailure(message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UnknownFailure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public UnknownFailure(@Nullable String str, @Nullable Exception exc) {
            super(null);
            this.message = str;
            this.exception = exc;
            this.failureType = FailureType.UNKNOWN;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiFailure$ServerErrorFailure;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", ApiCallFailureBundleKeys.HTTP_ERROR_CODE, "", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Integer;)V", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", "getHttpErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "getFailureType", "()Lcom/amazon/alexa/ra/core/data/api/ApiFailure$FailureType;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Integer;)Lcom/amazon/alexa/ra/core/data/api/ApiFailure$ServerErrorFailure;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerErrorFailure extends ApiFailure {
        public static final int $stable = 8;

        @Nullable
        private final Exception exception;

        @NotNull
        private final FailureType failureType;

        @Nullable
        private final Integer httpErrorCode;

        @Nullable
        private final String message;

        public /* synthetic */ ServerErrorFailure(String str, Exception exc, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc, (i & 4) != 0 ? null : num);
        }

        public static /* synthetic */ ServerErrorFailure copy$default(ServerErrorFailure serverErrorFailure, String str, Exception exc, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverErrorFailure.message;
            }
            if ((i & 2) != 0) {
                exc = serverErrorFailure.exception;
            }
            if ((i & 4) != 0) {
                num = serverErrorFailure.httpErrorCode;
            }
            return serverErrorFailure.copy(str, exc, num);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getHttpErrorCode() {
            return this.httpErrorCode;
        }

        @NotNull
        public final ServerErrorFailure copy(@Nullable String message, @Nullable Exception exception, @Nullable Integer httpErrorCode) {
            return new ServerErrorFailure(message, exception, httpErrorCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerErrorFailure)) {
                return false;
            }
            ServerErrorFailure serverErrorFailure = (ServerErrorFailure) other;
            return Intrinsics.areEqual(this.message, serverErrorFailure.message) && Intrinsics.areEqual(this.exception, serverErrorFailure.exception) && Intrinsics.areEqual(this.httpErrorCode, serverErrorFailure.httpErrorCode);
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public Exception getException() {
            return this.exception;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @NotNull
        public FailureType getFailureType() {
            return this.failureType;
        }

        @Nullable
        public final Integer getHttpErrorCode() {
            return this.httpErrorCode;
        }

        @Override // com.amazon.alexa.ra.core.data.api.ApiFailure
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.exception;
            int hashCode2 = (hashCode + (exc == null ? 0 : exc.hashCode())) * 31;
            Integer num = this.httpErrorCode;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.message;
            Exception exc = this.exception;
            Integer num = this.httpErrorCode;
            StringBuilder sb = new StringBuilder("ServerErrorFailure(message=");
            sb.append(str);
            sb.append(", exception=");
            sb.append(exc);
            sb.append(", httpErrorCode=");
            return Automotive$$ExternalSyntheticOutline0.m(sb, num, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public ServerErrorFailure() {
            this(null, null, null, 7, null);
        }

        public ServerErrorFailure(@Nullable String str, @Nullable Exception exc, @Nullable Integer num) {
            super(null);
            this.message = str;
            this.exception = exc;
            this.httpErrorCode = num;
            this.failureType = FailureType.SERVER_ERROR;
        }
    }
}

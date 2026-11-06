package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallFailureBundleKeys;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import com.amazon.minerva.client.thirdparty.transport.UploadResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "", ApiCallFailureBundleKeys.FAILURE_TYPE, "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$FailureType;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lcom/amazon/alexa/api/compat/model/ApiCallFailure$FailureType;Ljava/lang/String;Ljava/lang/Exception;)V", "getFailureType", "()Lcom/amazon/alexa/api/compat/model/ApiCallFailure$FailureType;", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", "FailureType", "UnknownFailure", "TimeoutFailure", "MessagingFailure", "InternalFailure", "NetworkFailure", "ServerErrorFailure", "AuthorizationFailure", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$AuthorizationFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$InternalFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$MessagingFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$NetworkFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$ServerErrorFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$TimeoutFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$UnknownFailure;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ApiCallFailure {
    public static final int $stable = 8;

    @Nullable
    private final Exception exception;

    @NotNull
    private final FailureType failureType;

    @Nullable
    private final String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$FailureType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "TIMEOUT", "MESSAGING", "INTERNAL", VisualShareErrorType.NETWORK, UploadResult.SERVER_ERROR, "AUTHORIZATION", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    private ApiCallFailure(FailureType failureType, String str, Exception exc) {
        this.failureType = failureType;
        this.message = str;
        this.exception = exc;
    }

    @Nullable
    public final Exception getException() {
        return this.exception;
    }

    @NotNull
    public final FailureType getFailureType() {
        return this.failureType;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$AuthorizationFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "message", "", "<init>", "(Ljava/lang/String;)V", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthorizationFailure extends ApiCallFailure {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX WARN: Multi-variable type inference failed */
        private AuthorizationFailure(String str) {
            super(FailureType.AUTHORIZATION, str, null, 0 == true ? 1 : 0);
        }

        @JvmStatic
        @NotNull
        public static final AuthorizationFailure create(@Nullable String str) {
            return INSTANCE.create(str);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$AuthorizationFailure$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$AuthorizationFailure;", "message", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final AuthorizationFailure create(@Nullable String message) {
                return new AuthorizationFailure(message, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ AuthorizationFailure(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB#\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$InternalFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalFailure extends ApiCallFailure {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        private InternalFailure(String str, Exception exc) {
            super(FailureType.INTERNAL, str, exc, null);
        }

        @JvmStatic
        @NotNull
        public static final InternalFailure create(@Nullable String str) {
            return INSTANCE.create(str);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$InternalFailure$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$InternalFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final InternalFailure create(@Nullable String message, @Nullable Exception exception) {
                return new InternalFailure(message, exception, null);
            }

            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final InternalFailure create(@Nullable String message) {
                return create(message, null);
            }
        }

        public /* synthetic */ InternalFailure(String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, exc);
        }

        @JvmStatic
        @NotNull
        public static final InternalFailure create(@Nullable String str, @Nullable Exception exc) {
            return INSTANCE.create(str, exc);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB#\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$MessagingFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MessagingFailure extends ApiCallFailure {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        private MessagingFailure(String str, Exception exc) {
            super(FailureType.MESSAGING, str, exc, null);
        }

        @JvmStatic
        @NotNull
        public static final MessagingFailure create(@Nullable String str) {
            return INSTANCE.create(str);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$MessagingFailure$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$MessagingFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final MessagingFailure create(@Nullable String message, @Nullable Exception exception) {
                return new MessagingFailure(message, exception, null);
            }

            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final MessagingFailure create(@Nullable String message) {
                return create(message, null);
            }
        }

        public /* synthetic */ MessagingFailure(String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, exc);
        }

        @JvmStatic
        @NotNull
        public static final MessagingFailure create(@Nullable String str, @Nullable Exception exc) {
            return INSTANCE.create(str, exc);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB#\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$NetworkFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkFailure extends ApiCallFailure {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        private NetworkFailure(String str, Exception exc) {
            super(FailureType.NETWORK, str, exc, null);
        }

        @JvmStatic
        @NotNull
        public static final NetworkFailure create(@Nullable String str, @Nullable Exception exc) {
            return INSTANCE.create(str, exc);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$NetworkFailure$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$NetworkFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final NetworkFailure create(@Nullable String message, @Nullable Exception exception) {
                return new NetworkFailure(message, exception, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ NetworkFailure(String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, exc);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB-\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$ServerErrorFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", ApiCallFailureBundleKeys.HTTP_ERROR_CODE, "", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Integer;)V", "getHttpErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerErrorFailure extends ApiCallFailure {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer httpErrorCode;

        private ServerErrorFailure(String str, Exception exc, Integer num) {
            super(FailureType.SERVER_ERROR, str, exc, null);
            this.httpErrorCode = num;
        }

        @JvmStatic
        @NotNull
        public static final ServerErrorFailure create(@Nullable String str) {
            return INSTANCE.create(str);
        }

        @Nullable
        public final Integer getHttpErrorCode() {
            return this.httpErrorCode;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J!\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ1\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$ServerErrorFailure$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$ServerErrorFailure;", "message", "", ApiCallFailureBundleKeys.HTTP_ERROR_CODE, "", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/amazon/alexa/api/compat/model/ApiCallFailure$ServerErrorFailure;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Integer;)Lcom/amazon/alexa/api/compat/model/ApiCallFailure$ServerErrorFailure;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final ServerErrorFailure create(@Nullable String message, @Nullable Exception exception, @Nullable Integer httpErrorCode) {
                return new ServerErrorFailure(message, exception, httpErrorCode, null);
            }

            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final ServerErrorFailure create(@Nullable String message, @Nullable Integer httpErrorCode) {
                return create(message, null, httpErrorCode);
            }

            @JvmStatic
            @NotNull
            public final ServerErrorFailure create(@Nullable String message) {
                return create(message, null, null);
            }
        }

        @JvmStatic
        @NotNull
        public static final ServerErrorFailure create(@Nullable String str, @Nullable Exception exc, @Nullable Integer num) {
            return INSTANCE.create(str, exc, num);
        }

        @JvmStatic
        @NotNull
        public static final ServerErrorFailure create(@Nullable String str, @Nullable Integer num) {
            return INSTANCE.create(str, num);
        }

        public /* synthetic */ ServerErrorFailure(String str, Exception exc, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, exc, num);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB#\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$TimeoutFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TimeoutFailure extends ApiCallFailure {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        private TimeoutFailure(String str, Exception exc) {
            super(FailureType.TIMEOUT, str, exc, null);
        }

        @JvmStatic
        @NotNull
        public static final TimeoutFailure create(@Nullable String str) {
            return INSTANCE.create(str);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$TimeoutFailure$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$TimeoutFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @JvmStatic
            @NotNull
            public final TimeoutFailure create(@Nullable String message) {
                return new TimeoutFailure(message, null, 0 == true ? 1 : 0);
            }

            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final TimeoutFailure create(@Nullable String message, @Nullable Exception exception) {
                return new TimeoutFailure(message, exception, null);
            }
        }

        public /* synthetic */ TimeoutFailure(String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, exc);
        }

        @JvmStatic
        @NotNull
        public static final TimeoutFailure create(@Nullable String str, @Nullable Exception exc) {
            return INSTANCE.create(str, exc);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB#\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$UnknownFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownFailure extends ApiCallFailure {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        private UnknownFailure(String str, Exception exc) {
            super(FailureType.UNKNOWN, str, exc, null);
        }

        @JvmStatic
        @NotNull
        public static final UnknownFailure create(@Nullable String str) {
            return INSTANCE.create(str);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ApiCallFailure$UnknownFailure$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure$UnknownFailure;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final UnknownFailure create(@Nullable String message, @Nullable Exception exception) {
                return new UnknownFailure(message, exception, null);
            }

            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final UnknownFailure create(@Nullable String message) {
                return create(message, null);
            }
        }

        public /* synthetic */ UnknownFailure(String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, exc);
        }

        @JvmStatic
        @NotNull
        public static final UnknownFailure create(@Nullable String str, @Nullable Exception exc) {
            return INSTANCE.create(str, exc);
        }
    }

    public /* synthetic */ ApiCallFailure(FailureType failureType, String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
        this(failureType, str, exc);
    }
}

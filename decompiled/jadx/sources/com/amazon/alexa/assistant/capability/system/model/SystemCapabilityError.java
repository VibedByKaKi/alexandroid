package com.amazon.alexa.assistant.capability.system.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\t\nB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "FailedToSetLocaleError", "FailedToSetTimeZoneError", "Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError$FailedToSetLocaleError;", "Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError$FailedToSetTimeZoneError;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SystemCapabilityError extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError$FailedToSetLocaleError;", "Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailedToSetLocaleError extends SystemCapabilityError {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToSetLocaleError(@NotNull String str, @Nullable Throwable th) {
            super(str, th, null);
            str.getClass();
            this.message = str;
            this.cause = th;
        }

        public static /* synthetic */ FailedToSetLocaleError copy$default(FailedToSetLocaleError failedToSetLocaleError, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedToSetLocaleError.message;
            }
            if ((i & 2) != 0) {
                th = failedToSetLocaleError.cause;
            }
            return failedToSetLocaleError.copy(str, th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final FailedToSetLocaleError copy(@NotNull String message, @Nullable Throwable cause) {
            message.getClass();
            return new FailedToSetLocaleError(message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedToSetLocaleError)) {
                return false;
            }
            FailedToSetLocaleError failedToSetLocaleError = (FailedToSetLocaleError) other;
            return Intrinsics.areEqual(this.message, failedToSetLocaleError.message) && Intrinsics.areEqual(this.cause, failedToSetLocaleError.cause);
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "FailedToSetLocaleError(message=" + this.message + ", cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError$FailedToSetTimeZoneError;", "Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailedToSetTimeZoneError extends SystemCapabilityError {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToSetTimeZoneError(@NotNull String str, @Nullable Throwable th) {
            super(str, th, null);
            str.getClass();
            this.message = str;
            this.cause = th;
        }

        public static /* synthetic */ FailedToSetTimeZoneError copy$default(FailedToSetTimeZoneError failedToSetTimeZoneError, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedToSetTimeZoneError.message;
            }
            if ((i & 2) != 0) {
                th = failedToSetTimeZoneError.cause;
            }
            return failedToSetTimeZoneError.copy(str, th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final FailedToSetTimeZoneError copy(@NotNull String message, @Nullable Throwable cause) {
            message.getClass();
            return new FailedToSetTimeZoneError(message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedToSetTimeZoneError)) {
                return false;
            }
            FailedToSetTimeZoneError failedToSetTimeZoneError = (FailedToSetTimeZoneError) other;
            return Intrinsics.areEqual(this.message, failedToSetTimeZoneError.message) && Intrinsics.areEqual(this.cause, failedToSetTimeZoneError.cause);
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "FailedToSetTimeZoneError(message=" + this.message + ", cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ SystemCapabilityError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    public /* synthetic */ SystemCapabilityError(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    private SystemCapabilityError(String str, Throwable th) {
        super(str, th);
    }
}

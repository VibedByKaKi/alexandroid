package com.amazon.alexa.ra.core.features.personality;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.mobile.assistant.client.metrics.RaUiEventMetricsAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult;", "", "<init>", "()V", "Valid", RaUiEventMetricsAdapter.INVALID_METRIC_NAME_SUFFIX, "NotProvided", "Error", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$Error;", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$Invalid;", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$NotProvided;", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$Valid;", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class ChecksumValidationResult {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$Error;", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends ChecksumValidationResult {
        public static final int $stable = 8;

        @NotNull
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception exc) {
            super(null);
            exc.getClass();
            this.exception = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final Error copy(@NotNull Exception exception) {
            exception.getClass();
            return new Error(exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
        }

        @NotNull
        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$Invalid;", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult;", "expected", "", "actual", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpected", "()Ljava/lang/String;", "getActual", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Invalid extends ChecksumValidationResult {
        public static final int $stable = 0;

        @NotNull
        private final String actual;

        @NotNull
        private final String expected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invalid(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.expected = str;
            this.actual = str2;
        }

        public static /* synthetic */ Invalid copy$default(Invalid invalid, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalid.expected;
            }
            if ((i & 2) != 0) {
                str2 = invalid.actual;
            }
            return invalid.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getExpected() {
            return this.expected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActual() {
            return this.actual;
        }

        @NotNull
        public final Invalid copy(@NotNull String expected, @NotNull String actual) {
            expected.getClass();
            actual.getClass();
            return new Invalid(expected, actual);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Invalid)) {
                return false;
            }
            Invalid invalid = (Invalid) other;
            return Intrinsics.areEqual(this.expected, invalid.expected) && Intrinsics.areEqual(this.actual, invalid.actual);
        }

        @NotNull
        public final String getActual() {
            return this.actual;
        }

        @NotNull
        public final String getExpected() {
            return this.expected;
        }

        public int hashCode() {
            return this.actual.hashCode() + (this.expected.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Invalid(expected=", this.expected, ", actual=", this.actual, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$NotProvided;", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotProvided extends ChecksumValidationResult {
        public static final int $stable = 0;

        @NotNull
        public static final NotProvided INSTANCE = new NotProvided();

        private NotProvided() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NotProvided);
        }

        public int hashCode() {
            return -1038229542;
        }

        @NotNull
        public String toString() {
            return "NotProvided";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult$Valid;", "Lcom/amazon/alexa/ra/core/features/personality/ChecksumValidationResult;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Valid extends ChecksumValidationResult {
        public static final int $stable = 0;

        @NotNull
        public static final Valid INSTANCE = new Valid();

        private Valid() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Valid);
        }

        public int hashCode() {
            return -865029888;
        }

        @NotNull
        public String toString() {
            return "Valid";
        }
    }

    public /* synthetic */ ChecksumValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChecksumValidationResult() {
    }
}

package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/DirectiveError;", "", "directive", "Lcom/amazon/alexa/assistant/foundation/model/Directive;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Lcom/amazon/alexa/assistant/foundation/model/ExceptionEncounteredError;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/Directive;Lcom/amazon/alexa/assistant/foundation/model/ExceptionEncounteredError;)V", "getDirective", "()Lcom/amazon/alexa/assistant/foundation/model/Directive;", "getException", "()Lcom/amazon/alexa/assistant/foundation/model/ExceptionEncounteredError;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DirectiveError {

    @NotNull
    private final Directive directive;

    @NotNull
    private final ExceptionEncounteredError exception;

    public DirectiveError(@NotNull Directive directive, @NotNull ExceptionEncounteredError exceptionEncounteredError) {
        directive.getClass();
        exceptionEncounteredError.getClass();
        this.directive = directive;
        this.exception = exceptionEncounteredError;
    }

    public static /* synthetic */ DirectiveError copy$default(DirectiveError directiveError, Directive directive, ExceptionEncounteredError exceptionEncounteredError, int i, Object obj) {
        if ((i & 1) != 0) {
            directive = directiveError.directive;
        }
        if ((i & 2) != 0) {
            exceptionEncounteredError = directiveError.exception;
        }
        return directiveError.copy(directive, exceptionEncounteredError);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Directive getDirective() {
        return this.directive;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ExceptionEncounteredError getException() {
        return this.exception;
    }

    @NotNull
    public final DirectiveError copy(@NotNull Directive directive, @NotNull ExceptionEncounteredError exception) {
        directive.getClass();
        exception.getClass();
        return new DirectiveError(directive, exception);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectiveError)) {
            return false;
        }
        DirectiveError directiveError = (DirectiveError) other;
        return Intrinsics.areEqual(this.directive, directiveError.directive) && Intrinsics.areEqual(this.exception, directiveError.exception);
    }

    @NotNull
    public final Directive getDirective() {
        return this.directive;
    }

    @NotNull
    public final ExceptionEncounteredError getException() {
        return this.exception;
    }

    public int hashCode() {
        return this.exception.hashCode() + (this.directive.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DirectiveError(directive=" + this.directive + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}

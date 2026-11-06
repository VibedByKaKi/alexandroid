package com.amazon.alexa.assistant.foundation.authorization;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationResult;", "", "token", "", "metadata", "Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationMetadata;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationMetadata;)V", "getToken", "()Ljava/lang/String;", "getMetadata", "()Lcom/amazon/alexa/assistant/foundation/authorization/AuthorizationMetadata;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AuthorizationResult {

    @NotNull
    private final AuthorizationMetadata metadata;

    @NotNull
    private final String token;

    public AuthorizationResult(@NotNull String str, @NotNull AuthorizationMetadata authorizationMetadata) {
        str.getClass();
        authorizationMetadata.getClass();
        this.token = str;
        this.metadata = authorizationMetadata;
    }

    public static /* synthetic */ AuthorizationResult copy$default(AuthorizationResult authorizationResult, String str, AuthorizationMetadata authorizationMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizationResult.token;
        }
        if ((i & 2) != 0) {
            authorizationMetadata = authorizationResult.metadata;
        }
        return authorizationResult.copy(str, authorizationMetadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AuthorizationMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final AuthorizationResult copy(@NotNull String token, @NotNull AuthorizationMetadata metadata) {
        token.getClass();
        metadata.getClass();
        return new AuthorizationResult(token, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) other;
        return Intrinsics.areEqual(this.token, authorizationResult.token) && Intrinsics.areEqual(this.metadata, authorizationResult.metadata);
    }

    @NotNull
    public final AuthorizationMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.token.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AuthorizationResult(token=" + this.token + ", metadata=" + this.metadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}

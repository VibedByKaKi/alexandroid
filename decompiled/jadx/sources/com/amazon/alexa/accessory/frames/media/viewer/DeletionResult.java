package com.amazon.alexa.accessory.frames.media.viewer;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/viewer/DeletionResult;", "", "success", "", "errorMessage", "", "position", "", "<init>", "(ZLjava/lang/String;I)V", "getSuccess", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeletionResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String errorMessage;
    private final int position;
    private final boolean success;

    public DeletionResult(boolean z, @Nullable String str, int i) {
        this.success = z;
        this.errorMessage = str;
        this.position = i;
    }

    public static /* synthetic */ DeletionResult copy$default(DeletionResult deletionResult, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = deletionResult.success;
        }
        if ((i2 & 2) != 0) {
            str = deletionResult.errorMessage;
        }
        if ((i2 & 4) != 0) {
            i = deletionResult.position;
        }
        return deletionResult.copy(z, str, i);
    }

    @JvmStatic
    @NotNull
    public static final DeletionResult error(@NotNull Exception exc) {
        return INSTANCE.error(exc);
    }

    @JvmStatic
    @NotNull
    public static final DeletionResult failure(@NotNull String str) {
        return INSTANCE.failure(str);
    }

    @JvmStatic
    @NotNull
    public static final DeletionResult success(int i) {
        return INSTANCE.success(i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final DeletionResult copy(boolean success, @Nullable String errorMessage, int position) {
        return new DeletionResult(success, errorMessage, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeletionResult)) {
            return false;
        }
        DeletionResult deletionResult = (DeletionResult) other;
        return this.success == deletionResult.success && Intrinsics.areEqual(this.errorMessage, deletionResult.errorMessage) && this.position == deletionResult.position;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        String str = this.errorMessage;
        return Integer.hashCode(this.position) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        boolean z = this.success;
        String str = this.errorMessage;
        int i = this.position;
        StringBuilder sb = new StringBuilder("DeletionResult(success=");
        sb.append(z);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", position=");
        return a$$ExternalSyntheticOutline0.m(sb, i, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0014\u0010\u000b\u001a\u00020\u00052\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/viewer/DeletionResult$Companion;", "", "<init>", "()V", "success", "Lcom/amazon/alexa/accessory/frames/media/viewer/DeletionResult;", "position", "", SendEventResultBundleKeys.FAILURE, "message", "", "error", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DeletionResult error(@NotNull Exception exception) {
            exception.getClass();
            return new DeletionResult(false, exception.getMessage(), -1);
        }

        @JvmStatic
        @NotNull
        public final DeletionResult failure(@NotNull String message) {
            message.getClass();
            return new DeletionResult(false, message, -1);
        }

        @JvmStatic
        @NotNull
        public final DeletionResult success(int position) {
            return new DeletionResult(true, null, position);
        }

        private Companion() {
        }
    }
}

package com.amazon.alexa.accessory.speechapi.speech;

import com.amazon.alexa.accessory.speechapi.LaunchType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/DialogRequest;", "", "invocationType", "", "launchType", "Lcom/amazon/alexa/accessory/speechapi/LaunchType;", "(Ljava/lang/String;Lcom/amazon/alexa/accessory/speechapi/LaunchType;)V", "getInvocationType", "()Ljava/lang/String;", "getLaunchType", "()Lcom/amazon/alexa/accessory/speechapi/LaunchType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DialogRequest {

    @NotNull
    private final String invocationType;

    @NotNull
    private final LaunchType launchType;

    public DialogRequest(@NotNull String str, @NotNull LaunchType launchType) {
        str.getClass();
        launchType.getClass();
        this.invocationType = str;
        this.launchType = launchType;
    }

    public static /* synthetic */ DialogRequest copy$default(DialogRequest dialogRequest, String str, LaunchType launchType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogRequest.invocationType;
        }
        if ((i & 2) != 0) {
            launchType = dialogRequest.launchType;
        }
        return dialogRequest.copy(str, launchType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    @NotNull
    public final DialogRequest copy(@NotNull String invocationType, @NotNull LaunchType launchType) {
        invocationType.getClass();
        launchType.getClass();
        return new DialogRequest(invocationType, launchType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogRequest)) {
            return false;
        }
        DialogRequest dialogRequest = (DialogRequest) other;
        return Intrinsics.areEqual(this.invocationType, dialogRequest.invocationType) && this.launchType == dialogRequest.launchType;
    }

    @NotNull
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    public int hashCode() {
        return this.launchType.hashCode() + (this.invocationType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DialogRequest(invocationType=" + this.invocationType + ", launchType=" + this.launchType + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}

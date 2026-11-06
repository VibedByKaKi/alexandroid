package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/api/compat/model/DialogTurnData;", "", "dialogTurnId", "", "<init>", "(Ljava/lang/String;)V", "getDialogTurnId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DialogTurnData {
    public static final int $stable = 0;

    @NotNull
    private final String dialogTurnId;

    public DialogTurnData(@NotNull String str) {
        str.getClass();
        this.dialogTurnId = str;
    }

    public static /* synthetic */ DialogTurnData copy$default(DialogTurnData dialogTurnData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogTurnData.dialogTurnId;
        }
        return dialogTurnData.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDialogTurnId() {
        return this.dialogTurnId;
    }

    @NotNull
    public final DialogTurnData copy(@NotNull String dialogTurnId) {
        dialogTurnId.getClass();
        return new DialogTurnData(dialogTurnId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DialogTurnData) && Intrinsics.areEqual(this.dialogTurnId, ((DialogTurnData) other).dialogTurnId);
    }

    @NotNull
    public final String getDialogTurnId() {
        return this.dialogTurnId;
    }

    public int hashCode() {
        return this.dialogTurnId.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("DialogTurnData(dialogTurnId=", this.dialogTurnId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}

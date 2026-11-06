package com.amazon.alexa.hho.navigation.transit.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;", "", "instructionType", "Lcom/amazon/alexa/hho/navigation/transit/model/InstructionType;", "action", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationAction;", "text", "", "displayText", "audioUrl", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/model/InstructionType;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInstructionType", "()Lcom/amazon/alexa/hho/navigation/transit/model/InstructionType;", "getAction", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationAction;", "getText", "()Ljava/lang/String;", "getDisplayText", "getAudioUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NavigationInstruction {

    @NotNull
    private final NavigationAction action;

    @Nullable
    private final String audioUrl;

    @Nullable
    private final String displayText;

    @NotNull
    private final InstructionType instructionType;

    @NotNull
    private final String text;

    public NavigationInstruction(@NotNull InstructionType instructionType, @NotNull NavigationAction navigationAction, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        instructionType.getClass();
        navigationAction.getClass();
        str.getClass();
        this.instructionType = instructionType;
        this.action = navigationAction;
        this.text = str;
        this.displayText = str2;
        this.audioUrl = str3;
    }

    public static /* synthetic */ NavigationInstruction copy$default(NavigationInstruction navigationInstruction, InstructionType instructionType, NavigationAction navigationAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            instructionType = navigationInstruction.instructionType;
        }
        if ((i & 2) != 0) {
            navigationAction = navigationInstruction.action;
        }
        if ((i & 4) != 0) {
            str = navigationInstruction.text;
        }
        if ((i & 8) != 0) {
            str2 = navigationInstruction.displayText;
        }
        if ((i & 16) != 0) {
            str3 = navigationInstruction.audioUrl;
        }
        String str4 = str3;
        String str5 = str;
        return navigationInstruction.copy(instructionType, navigationAction, str5, str2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InstructionType getInstructionType() {
        return this.instructionType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavigationAction getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @NotNull
    public final NavigationInstruction copy(@NotNull InstructionType instructionType, @NotNull NavigationAction action, @NotNull String text, @Nullable String displayText, @Nullable String audioUrl) {
        instructionType.getClass();
        action.getClass();
        text.getClass();
        return new NavigationInstruction(instructionType, action, text, displayText, audioUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationInstruction)) {
            return false;
        }
        NavigationInstruction navigationInstruction = (NavigationInstruction) other;
        return this.instructionType == navigationInstruction.instructionType && this.action == navigationInstruction.action && Intrinsics.areEqual(this.text, navigationInstruction.text) && Intrinsics.areEqual(this.displayText, navigationInstruction.displayText) && Intrinsics.areEqual(this.audioUrl, navigationInstruction.audioUrl);
    }

    @NotNull
    public final NavigationAction getAction() {
        return this.action;
    }

    @Nullable
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    public final String getDisplayText() {
        return this.displayText;
    }

    @NotNull
    public final InstructionType getInstructionType() {
        return this.instructionType;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m((this.action.hashCode() + (this.instructionType.hashCode() * 31)) * 31, 31, this.text);
        String str = this.displayText;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        InstructionType instructionType = this.instructionType;
        NavigationAction navigationAction = this.action;
        String str = this.text;
        String str2 = this.displayText;
        String str3 = this.audioUrl;
        StringBuilder sb = new StringBuilder("NavigationInstruction(instructionType=");
        sb.append(instructionType);
        sb.append(", action=");
        sb.append(navigationAction);
        sb.append(", text=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str, ", displayText=", str2, ", audioUrl=");
        return a$$ExternalSyntheticOutline0.m(sb, str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ NavigationInstruction(InstructionType instructionType, NavigationAction navigationAction, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instructionType, navigationAction, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}

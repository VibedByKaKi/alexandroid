package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/comms/calling/domain/model/DTMFState;", "", "<init>", "()V", "DTMFUIState", "Lcom/amazon/comms/calling/domain/model/DTMFState$DTMFUIState;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class DTMFState {
    public /* synthetic */ DTMFState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DTMFState() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/domain/model/DTMFState$DTMFUIState;", "Lcom/amazon/comms/calling/domain/model/DTMFState;", "isEnabled", "", "isShown", "screenText", "", "<init>", "(ZZLjava/lang/String;)V", "()Z", "getScreenText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DTMFUIState extends DTMFState {
        private final boolean isEnabled;
        private final boolean isShown;

        @NotNull
        private final String screenText;

        public /* synthetic */ DTMFUIState(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, str);
        }

        public static /* synthetic */ DTMFUIState copy$default(DTMFUIState dTMFUIState, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dTMFUIState.isEnabled;
            }
            if ((i & 2) != 0) {
                z2 = dTMFUIState.isShown;
            }
            if ((i & 4) != 0) {
                str = dTMFUIState.screenText;
            }
            return dTMFUIState.copy(z, z2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsShown() {
            return this.isShown;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getScreenText() {
            return this.screenText;
        }

        @NotNull
        public final DTMFUIState copy(boolean isEnabled, boolean isShown, @NotNull String screenText) {
            screenText.getClass();
            return new DTMFUIState(isEnabled, isShown, screenText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DTMFUIState)) {
                return false;
            }
            DTMFUIState dTMFUIState = (DTMFUIState) other;
            return this.isEnabled == dTMFUIState.isEnabled && this.isShown == dTMFUIState.isShown && Intrinsics.areEqual(this.screenText, dTMFUIState.screenText);
        }

        @NotNull
        public final String getScreenText() {
            return this.screenText;
        }

        public int hashCode() {
            return this.screenText.hashCode() + c.a(this.isShown, Boolean.hashCode(this.isEnabled) * 31, 31);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final boolean isShown() {
            return this.isShown;
        }

        @NotNull
        public String toString() {
            boolean z = this.isEnabled;
            boolean z2 = this.isShown;
            return a$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("DTMFUIState(isEnabled=", z, ", isShown=", z2, ", screenText="), this.screenText, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DTMFUIState(boolean z, boolean z2, @NotNull String str) {
            super(null);
            str.getClass();
            this.isEnabled = z;
            this.isShown = z2;
            this.screenText = str;
        }
    }
}

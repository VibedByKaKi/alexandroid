package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState;", "", "<init>", "()V", "None", "NeedsOobe", "NeedsMicPermission", "NeedsOobeWithMicPermission", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$NeedsMicPermission;", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$NeedsOobe;", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$NeedsOobeWithMicPermission;", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$None;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class LivemodeOnboardingState {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$NeedsMicPermission;", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState;", "useOsDialog", "", "<init>", "(Z)V", "getUseOsDialog", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeedsMicPermission extends LivemodeOnboardingState {
        public static final int $stable = 0;
        private final boolean useOsDialog;

        public NeedsMicPermission(boolean z) {
            super(null);
            this.useOsDialog = z;
        }

        public static /* synthetic */ NeedsMicPermission copy$default(NeedsMicPermission needsMicPermission, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = needsMicPermission.useOsDialog;
            }
            return needsMicPermission.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUseOsDialog() {
            return this.useOsDialog;
        }

        @NotNull
        public final NeedsMicPermission copy(boolean useOsDialog) {
            return new NeedsMicPermission(useOsDialog);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NeedsMicPermission) && this.useOsDialog == ((NeedsMicPermission) other).useOsDialog;
        }

        public final boolean getUseOsDialog() {
            return this.useOsDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.useOsDialog);
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("NeedsMicPermission(useOsDialog=", MarkdownConstants.RIGHT_PARENTHESIS, this.useOsDialog);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$NeedsOobe;", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NeedsOobe extends LivemodeOnboardingState {
        public static final int $stable = 0;

        @NotNull
        public static final NeedsOobe INSTANCE = new NeedsOobe();

        private NeedsOobe() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$NeedsOobeWithMicPermission;", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState;", "useOsDialog", "", "<init>", "(Z)V", "getUseOsDialog", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeedsOobeWithMicPermission extends LivemodeOnboardingState {
        public static final int $stable = 0;
        private final boolean useOsDialog;

        public NeedsOobeWithMicPermission(boolean z) {
            super(null);
            this.useOsDialog = z;
        }

        public static /* synthetic */ NeedsOobeWithMicPermission copy$default(NeedsOobeWithMicPermission needsOobeWithMicPermission, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = needsOobeWithMicPermission.useOsDialog;
            }
            return needsOobeWithMicPermission.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUseOsDialog() {
            return this.useOsDialog;
        }

        @NotNull
        public final NeedsOobeWithMicPermission copy(boolean useOsDialog) {
            return new NeedsOobeWithMicPermission(useOsDialog);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NeedsOobeWithMicPermission) && this.useOsDialog == ((NeedsOobeWithMicPermission) other).useOsDialog;
        }

        public final boolean getUseOsDialog() {
            return this.useOsDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.useOsDialog);
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("NeedsOobeWithMicPermission(useOsDialog=", MarkdownConstants.RIGHT_PARENTHESIS, this.useOsDialog);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState$None;", "Lcom/amazon/alexa/ra/core/data/model/LivemodeOnboardingState;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends LivemodeOnboardingState {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ LivemodeOnboardingState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LivemodeOnboardingState() {
    }
}

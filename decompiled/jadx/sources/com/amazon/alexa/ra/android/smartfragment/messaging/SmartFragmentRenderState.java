package com.amazon.alexa.ra.android.smartfragment.messaging;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/messaging/SmartFragmentRenderState;", "", "Visible", "Hidden", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/SmartFragmentRenderState$Hidden;", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/SmartFragmentRenderState$Visible;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface SmartFragmentRenderState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/messaging/SmartFragmentRenderState$Hidden;", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/SmartFragmentRenderState;", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Lcom/amazon/alexa/ra/android/smartfragment/messaging/FailureKind;", "name", "", "<init>", "(Lcom/amazon/alexa/ra/android/smartfragment/messaging/FailureKind;Ljava/lang/String;)V", "getKind", "()Lcom/amazon/alexa/ra/android/smartfragment/messaging/FailureKind;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Hidden implements SmartFragmentRenderState {
        public static final int $stable = 0;

        @NotNull
        private final FailureKind kind;

        @NotNull
        private final String name;

        public Hidden(@NotNull FailureKind failureKind, @NotNull String str) {
            failureKind.getClass();
            str.getClass();
            this.kind = failureKind;
            this.name = str;
        }

        public static /* synthetic */ Hidden copy$default(Hidden hidden, FailureKind failureKind, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                failureKind = hidden.kind;
            }
            if ((i & 2) != 0) {
                str = hidden.name;
            }
            return hidden.copy(failureKind, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final FailureKind getKind() {
            return this.kind;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Hidden copy(@NotNull FailureKind kind, @NotNull String name) {
            kind.getClass();
            name.getClass();
            return new Hidden(kind, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hidden)) {
                return false;
            }
            Hidden hidden = (Hidden) other;
            return this.kind == hidden.kind && Intrinsics.areEqual(this.name, hidden.name);
        }

        @NotNull
        public final FailureKind getKind() {
            return this.kind;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.kind.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Hidden(kind=" + this.kind + ", name=" + this.name + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/messaging/SmartFragmentRenderState$Visible;", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/SmartFragmentRenderState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Visible implements SmartFragmentRenderState {
        public static final int $stable = 0;

        @NotNull
        public static final Visible INSTANCE = new Visible();

        private Visible() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Visible);
        }

        public int hashCode() {
            return 1566230331;
        }

        @NotNull
        public String toString() {
            return "Visible";
        }
    }
}

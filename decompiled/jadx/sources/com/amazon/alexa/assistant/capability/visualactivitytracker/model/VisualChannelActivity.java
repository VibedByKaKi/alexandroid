package com.amazon.alexa.assistant.capability.visualactivitytracker.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/visualactivitytracker/model/VisualChannelActivity;", "", "<init>", "()V", "Occupied", "Released", "Lcom/amazon/alexa/assistant/capability/visualactivitytracker/model/VisualChannelActivity$Occupied;", "Lcom/amazon/alexa/assistant/capability/visualactivitytracker/model/VisualChannelActivity$Released;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class VisualChannelActivity {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/visualactivitytracker/model/VisualChannelActivity$Occupied;", "Lcom/amazon/alexa/assistant/capability/visualactivitytracker/model/VisualChannelActivity;", "interfaceName", "", "<init>", "(Ljava/lang/String;)V", "getInterfaceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Occupied extends VisualChannelActivity {

        @NotNull
        private final String interfaceName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Occupied(@NotNull String str) {
            super(null);
            str.getClass();
            this.interfaceName = str;
        }

        public static /* synthetic */ Occupied copy$default(Occupied occupied, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = occupied.interfaceName;
            }
            return occupied.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getInterfaceName() {
            return this.interfaceName;
        }

        @NotNull
        public final Occupied copy(@NotNull String interfaceName) {
            interfaceName.getClass();
            return new Occupied(interfaceName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Occupied) && Intrinsics.areEqual(this.interfaceName, ((Occupied) other).interfaceName);
        }

        @NotNull
        public final String getInterfaceName() {
            return this.interfaceName;
        }

        public int hashCode() {
            return this.interfaceName.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Occupied(interfaceName=", this.interfaceName, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/visualactivitytracker/model/VisualChannelActivity$Released;", "Lcom/amazon/alexa/assistant/capability/visualactivitytracker/model/VisualChannelActivity;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Released extends VisualChannelActivity {

        @NotNull
        public static final Released INSTANCE = new Released();

        private Released() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Released);
        }

        public int hashCode() {
            return 1382374593;
        }

        @NotNull
        public String toString() {
            return "Released";
        }
    }

    public /* synthetic */ VisualChannelActivity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VisualChannelActivity() {
    }
}

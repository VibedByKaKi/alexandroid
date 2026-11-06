package com.amazon.alexa.assistant.capability.audioactivitytracker.model;

import com.amazon.alexa.assistant.session.audio.model.AudioChannelType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity;", "", "<init>", "()V", "Occupied", "Released", "Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity$Occupied;", "Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity$Released;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ChannelActivity {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity$Occupied;", "Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity;", "type", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "interfaceName", "", "<init>", "(Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;Ljava/lang/String;)V", "getType", "()Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "getInterfaceName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Occupied extends ChannelActivity {

        @NotNull
        private final String interfaceName;

        @NotNull
        private final AudioChannelType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Occupied(@NotNull AudioChannelType audioChannelType, @NotNull String str) {
            super(null);
            audioChannelType.getClass();
            str.getClass();
            this.type = audioChannelType;
            this.interfaceName = str;
        }

        public static /* synthetic */ Occupied copy$default(Occupied occupied, AudioChannelType audioChannelType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                audioChannelType = occupied.type;
            }
            if ((i & 2) != 0) {
                str = occupied.interfaceName;
            }
            return occupied.copy(audioChannelType, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AudioChannelType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getInterfaceName() {
            return this.interfaceName;
        }

        @NotNull
        public final Occupied copy(@NotNull AudioChannelType type, @NotNull String interfaceName) {
            type.getClass();
            interfaceName.getClass();
            return new Occupied(type, interfaceName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Occupied)) {
                return false;
            }
            Occupied occupied = (Occupied) other;
            return this.type == occupied.type && Intrinsics.areEqual(this.interfaceName, occupied.interfaceName);
        }

        @NotNull
        public final String getInterfaceName() {
            return this.interfaceName;
        }

        @NotNull
        public final AudioChannelType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.interfaceName.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Occupied(type=" + this.type + ", interfaceName=" + this.interfaceName + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity$Released;", "Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity;", "type", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "interfaceName", "", "<init>", "(Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;Ljava/lang/String;)V", "getType", "()Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "getInterfaceName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Released extends ChannelActivity {

        @NotNull
        private final String interfaceName;

        @NotNull
        private final AudioChannelType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Released(@NotNull AudioChannelType audioChannelType, @NotNull String str) {
            super(null);
            audioChannelType.getClass();
            str.getClass();
            this.type = audioChannelType;
            this.interfaceName = str;
        }

        public static /* synthetic */ Released copy$default(Released released, AudioChannelType audioChannelType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                audioChannelType = released.type;
            }
            if ((i & 2) != 0) {
                str = released.interfaceName;
            }
            return released.copy(audioChannelType, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AudioChannelType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getInterfaceName() {
            return this.interfaceName;
        }

        @NotNull
        public final Released copy(@NotNull AudioChannelType type, @NotNull String interfaceName) {
            type.getClass();
            interfaceName.getClass();
            return new Released(type, interfaceName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Released)) {
                return false;
            }
            Released released = (Released) other;
            return this.type == released.type && Intrinsics.areEqual(this.interfaceName, released.interfaceName);
        }

        @NotNull
        public final String getInterfaceName() {
            return this.interfaceName;
        }

        @NotNull
        public final AudioChannelType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.interfaceName.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Released(type=" + this.type + ", interfaceName=" + this.interfaceName + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ ChannelActivity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChannelActivity() {
    }
}

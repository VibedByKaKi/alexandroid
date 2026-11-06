package com.amazon.alexa.assistant.foundation.voicechat.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatMode;", "", "<init>", "()V", BucketLifecycleConfiguration.DISABLED, "Enabled", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatMode$Disabled;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatMode$Enabled;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class VoiceChatMode {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatMode$Disabled;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatMode;", "<init>", "()V", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Disabled extends VoiceChatMode {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    public /* synthetic */ VoiceChatMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VoiceChatMode() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatMode$Enabled;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatMode;", "configuration", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeConfiguration;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeConfiguration;)V", "getConfiguration", "()Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeConfiguration;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Enabled extends VoiceChatMode {

        @NotNull
        private final VoiceChatModeConfiguration configuration;

        public /* synthetic */ Enabled(VoiceChatModeConfiguration voiceChatModeConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new VoiceChatModeConfiguration(0, false, false, false, 15, null) : voiceChatModeConfiguration);
        }

        public static /* synthetic */ Enabled copy$default(Enabled enabled, VoiceChatModeConfiguration voiceChatModeConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceChatModeConfiguration = enabled.configuration;
            }
            return enabled.copy(voiceChatModeConfiguration);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final VoiceChatModeConfiguration getConfiguration() {
            return this.configuration;
        }

        @NotNull
        public final Enabled copy(@NotNull VoiceChatModeConfiguration configuration) {
            configuration.getClass();
            return new Enabled(configuration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Enabled) && Intrinsics.areEqual(this.configuration, ((Enabled) other).configuration);
        }

        @NotNull
        public final VoiceChatModeConfiguration getConfiguration() {
            return this.configuration;
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        @NotNull
        public String toString() {
            return "Enabled(configuration=" + this.configuration + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Enabled() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enabled(@NotNull VoiceChatModeConfiguration voiceChatModeConfiguration) {
            super(null);
            voiceChatModeConfiguration.getClass();
            this.configuration = voiceChatModeConfiguration;
        }
    }
}

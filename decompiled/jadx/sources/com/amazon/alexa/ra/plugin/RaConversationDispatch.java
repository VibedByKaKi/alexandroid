package com.amazon.alexa.ra.plugin;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.ui.ra.RaConversationHost;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/plugin/RaConversationDispatch;", "", "UpdateInPlace", "ReactivateContainerThenUpdate", "ActivateHomeCardThenUpdate", "OpenFresh", "CloseThenOpenFresh", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$ActivateHomeCardThenUpdate;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$CloseThenOpenFresh;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$OpenFresh;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$ReactivateContainerThenUpdate;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$UpdateInPlace;", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface RaConversationDispatch {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$ActivateHomeCardThenUpdate;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch;", "<init>", "()V", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivateHomeCardThenUpdate implements RaConversationDispatch {
        public static final int $stable = 0;

        @NotNull
        public static final ActivateHomeCardThenUpdate INSTANCE = new ActivateHomeCardThenUpdate();

        private ActivateHomeCardThenUpdate() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$CloseThenOpenFresh;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch;", "hostToClose", "Lcom/amazon/alexa/voice/ui/ra/RaConversationHost;", "<init>", "(Lcom/amazon/alexa/voice/ui/ra/RaConversationHost;)V", "getHostToClose", "()Lcom/amazon/alexa/voice/ui/ra/RaConversationHost;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseThenOpenFresh implements RaConversationDispatch {
        public static final int $stable = 0;

        @Nullable
        private final RaConversationHost hostToClose;

        public CloseThenOpenFresh(@Nullable RaConversationHost raConversationHost) {
            this.hostToClose = raConversationHost;
        }

        public static /* synthetic */ CloseThenOpenFresh copy$default(CloseThenOpenFresh closeThenOpenFresh, RaConversationHost raConversationHost, int i, Object obj) {
            if ((i & 1) != 0) {
                raConversationHost = closeThenOpenFresh.hostToClose;
            }
            return closeThenOpenFresh.copy(raConversationHost);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final RaConversationHost getHostToClose() {
            return this.hostToClose;
        }

        @NotNull
        public final CloseThenOpenFresh copy(@Nullable RaConversationHost hostToClose) {
            return new CloseThenOpenFresh(hostToClose);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CloseThenOpenFresh) && this.hostToClose == ((CloseThenOpenFresh) other).hostToClose;
        }

        @Nullable
        public final RaConversationHost getHostToClose() {
            return this.hostToClose;
        }

        public int hashCode() {
            RaConversationHost raConversationHost = this.hostToClose;
            if (raConversationHost == null) {
                return 0;
            }
            return raConversationHost.hashCode();
        }

        @NotNull
        public String toString() {
            return "CloseThenOpenFresh(hostToClose=" + this.hostToClose + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$OpenFresh;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch;", "<init>", "()V", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OpenFresh implements RaConversationDispatch {
        public static final int $stable = 0;

        @NotNull
        public static final OpenFresh INSTANCE = new OpenFresh();

        private OpenFresh() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$ReactivateContainerThenUpdate;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch;", "<init>", "()V", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReactivateContainerThenUpdate implements RaConversationDispatch {
        public static final int $stable = 0;

        @NotNull
        public static final ReactivateContainerThenUpdate INSTANCE = new ReactivateContainerThenUpdate();

        private ReactivateContainerThenUpdate() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/plugin/RaConversationDispatch$UpdateInPlace;", "Lcom/amazon/alexa/ra/plugin/RaConversationDispatch;", "<init>", "()V", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateInPlace implements RaConversationDispatch {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateInPlace INSTANCE = new UpdateInPlace();

        private UpdateInPlace() {
        }
    }
}

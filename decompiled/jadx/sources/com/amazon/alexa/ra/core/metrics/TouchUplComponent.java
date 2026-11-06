package com.amazon.alexa.ra.core.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import org.apache.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent;", "", HttpHeaders.DESTINATION, AlexaMetricsConstants.EventConstants.SOURCE, "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent$Destination;", "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent$Source;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface TouchUplComponent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent$Destination;", "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent;", "value", "Lcom/amazon/alexa/ra/core/metrics/TouchDestination;", "<init>", "(Lcom/amazon/alexa/ra/core/metrics/TouchDestination;)V", "getValue", "()Lcom/amazon/alexa/ra/core/metrics/TouchDestination;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Destination implements TouchUplComponent {
        public static final int $stable = 0;

        @NotNull
        private final TouchDestination value;

        public Destination(@NotNull TouchDestination touchDestination) {
            touchDestination.getClass();
            this.value = touchDestination;
        }

        public static /* synthetic */ Destination copy$default(Destination destination, TouchDestination touchDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                touchDestination = destination.value;
            }
            return destination.copy(touchDestination);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TouchDestination getValue() {
            return this.value;
        }

        @NotNull
        public final Destination copy(@NotNull TouchDestination value) {
            value.getClass();
            return new Destination(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Destination) && this.value == ((Destination) other).value;
        }

        @NotNull
        public final TouchDestination getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "Destination(value=" + this.value + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent$Source;", "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent;", "value", "Lcom/amazon/alexa/ra/core/metrics/TouchSource;", "<init>", "(Lcom/amazon/alexa/ra/core/metrics/TouchSource;)V", "getValue", "()Lcom/amazon/alexa/ra/core/metrics/TouchSource;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Source implements TouchUplComponent {
        public static final int $stable = 0;

        @NotNull
        private final TouchSource value;

        public Source(@NotNull TouchSource touchSource) {
            touchSource.getClass();
            this.value = touchSource;
        }

        public static /* synthetic */ Source copy$default(Source source, TouchSource touchSource, int i, Object obj) {
            if ((i & 1) != 0) {
                touchSource = source.value;
            }
            return source.copy(touchSource);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TouchSource getValue() {
            return this.value;
        }

        @NotNull
        public final Source copy(@NotNull TouchSource value) {
            value.getClass();
            return new Source(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Source) && this.value == ((Source) other).value;
        }

        @NotNull
        public final TouchSource getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "Source(value=" + this.value + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }
}

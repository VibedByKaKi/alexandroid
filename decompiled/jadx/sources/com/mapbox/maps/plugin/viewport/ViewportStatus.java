package com.mapbox.maps.plugin.viewport;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import com.mapbox.maps.plugin.viewport.transition.ViewportTransition;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "", "()V", "Idle", "State", "Transition", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus$Idle;", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus$State;", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus$Transition;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class ViewportStatus {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportStatus$Idle;", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "()V", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Idle extends ViewportStatus {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "ViewportStatus#Idle";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportStatus$State;", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "state", "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "(Lcom/mapbox/maps/plugin/viewport/state/ViewportState;)V", "getState", "()Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class State extends ViewportStatus {

        @NotNull
        private final ViewportState state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public State(@NotNull ViewportState viewportState) {
            super(null);
            viewportState.getClass();
            this.state = viewportState;
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof State) && ((State) other).state == this.state;
        }

        @NotNull
        public final ViewportState getState() {
            return this.state;
        }

        public int hashCode() {
            return Objects.hash(this.state);
        }

        @NotNull
        public String toString() {
            return "ViewportStatus#State(state=" + this.state + ')';
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportStatus$Transition;", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "transition", "Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "toState", "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "(Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;Lcom/mapbox/maps/plugin/viewport/state/ViewportState;)V", "getToState", "()Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "getTransition", "()Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Transition extends ViewportStatus {

        @NotNull
        private final ViewportState toState;

        @NotNull
        private final ViewportTransition transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transition(@NotNull ViewportTransition viewportTransition, @NotNull ViewportState viewportState) {
            super(null);
            viewportTransition.getClass();
            viewportState.getClass();
            this.transition = viewportTransition;
            this.toState = viewportState;
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Transition)) {
                return false;
            }
            Transition transition = (Transition) other;
            return transition.transition == this.transition && transition.toState == this.toState;
        }

        @NotNull
        public final ViewportState getToState() {
            return this.toState;
        }

        @NotNull
        public final ViewportTransition getTransition() {
            return this.transition;
        }

        public int hashCode() {
            return Objects.hash(this.transition, this.toState);
        }

        @NotNull
        public String toString() {
            return "ViewportStatus#Transition(transition=" + this.transition + ", toState=" + this.toState + ')';
        }
    }

    public /* synthetic */ ViewportStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ViewportStatus() {
    }
}

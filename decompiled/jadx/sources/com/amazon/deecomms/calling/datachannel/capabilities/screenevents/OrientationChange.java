package com.amazon.deecomms.calling.datachannel.capabilities.screenevents;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.deecomms.calling.datachannel.InCallOrientation;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class OrientationChange {
    private Orientation orientation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Orientation orientation;

        public OrientationChange build() {
            return new OrientationChange(this.orientation, 0);
        }

        public Builder with(InCallOrientation inCallOrientation, InCallOrientation inCallOrientation2) {
            this.orientation = new Orientation(inCallOrientation, inCallOrientation2);
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Orientation {

        @SerializedName("from")
        private InCallOrientation from;

        @SerializedName(TypedValues.TransitionType.S_TO)
        private InCallOrientation to;

        public Orientation(InCallOrientation inCallOrientation, InCallOrientation inCallOrientation2) {
            this.from = inCallOrientation;
            this.to = inCallOrientation2;
        }

        public InCallOrientation getFrom() {
            return this.from;
        }

        public InCallOrientation getTo() {
            return this.to;
        }
    }

    private OrientationChange(Orientation orientation) {
        this.orientation = orientation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Orientation getOrientation() {
        return this.orientation;
    }

    public /* synthetic */ OrientationChange(Orientation orientation, int i) {
        this(orientation);
    }
}

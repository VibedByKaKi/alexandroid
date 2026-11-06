package com.amazon.deecomms.calling.datachannel.capabilities.screenevents;

import com.amazon.deecomms.calling.datachannel.InCallOrientation;
import com.amazon.deecomms.calling.model.Boundary;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ReserveInCallControls {
    private String message;
    private InCallOrientation orientation;
    private List<Boundary.Point> screenPortion;
    private Status status;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String message;
        private InCallOrientation orientation;
        private List<Boundary.Point> screenPortion;
        private Status status;

        public ReserveInCallControls build() {
            return new ReserveInCallControls(this.status, this.screenPortion, this.orientation, this.message, 0);
        }

        public Builder withMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder withOrientation(InCallOrientation inCallOrientation) {
            this.orientation = inCallOrientation;
            return this;
        }

        public Builder withScreenPortion(List<Boundary.Point> list) {
            this.screenPortion = list;
            return this;
        }

        public Builder withStatus(Status status) {
            this.status = status;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Status {
        START,
        STOP,
        ERROR
    }

    private ReserveInCallControls(Status status, List<Boundary.Point> list, InCallOrientation inCallOrientation, String str) {
        this.status = status;
        this.screenPortion = list;
        this.orientation = inCallOrientation;
        this.message = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getMessage() {
        return this.message;
    }

    public InCallOrientation getOrientation() {
        return this.orientation;
    }

    public List<Boundary.Point> getScreenPortion() {
        return this.screenPortion;
    }

    public Status getStatus() {
        return this.status;
    }

    public /* synthetic */ ReserveInCallControls(Status status, List list, InCallOrientation inCallOrientation, String str, int i) {
        this(status, list, inCallOrientation, str);
    }
}

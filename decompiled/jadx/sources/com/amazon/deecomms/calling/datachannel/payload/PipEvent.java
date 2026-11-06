package com.amazon.deecomms.calling.datachannel.payload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PipEvent {
    private final String action;
    private final String callId;
    private final String position;
    private final String requestId;
    private final String visibility;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Action {
        UPDATE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Action action;
        private String callId;
        private Position position;
        private String requestId;
        private Visibility visibility;

        public PipEvent build() {
            return new PipEvent(this.requestId, this.callId, this.action, this.visibility, this.position, 0);
        }

        public Builder withAction(Action action) {
            this.action = action;
            return this;
        }

        public Builder withCallId(String str) {
            this.callId = str;
            return this;
        }

        public Builder withPosition(Position position) {
            this.position = position;
            return this;
        }

        public Builder withRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder withVisibility(Visibility visibility) {
            this.visibility = visibility;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Position {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Visibility {
        VISIBLE,
        INVISIBLE
    }

    private PipEvent(String str, String str2, Action action, Visibility visibility, Position position) {
        this.requestId = str;
        this.callId = str2;
        this.action = action.name();
        this.visibility = visibility != null ? visibility.name() : null;
        this.position = position != null ? position.name() : null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public /* synthetic */ PipEvent(String str, String str2, Action action, Visibility visibility, Position position, int i) {
        this(str, str2, action, visibility, position);
    }
}

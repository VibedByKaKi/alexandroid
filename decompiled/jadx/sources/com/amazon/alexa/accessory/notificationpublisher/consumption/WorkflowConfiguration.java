package com.amazon.alexa.accessory.notificationpublisher.consumption;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class WorkflowConfiguration {
    public static final WorkflowConfiguration DEFAULT = new Builder().build();
    private final boolean shouldSkipAnnouncement;
    private final boolean shouldSkipContent;
    private final boolean shouldSkipGesture;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private boolean shouldSkipGesture = false;
        private boolean shouldSkipContent = false;
        private boolean shouldSkipAnnouncement = false;

        public WorkflowConfiguration build() {
            return new WorkflowConfiguration(this, 0);
        }

        public Builder setShouldSkipAnnouncement(boolean z) {
            this.shouldSkipAnnouncement = z;
            return this;
        }

        public Builder setShouldSkipContent(boolean z) {
            this.shouldSkipContent = z;
            return this;
        }

        public Builder setShouldSkipGesture(boolean z) {
            this.shouldSkipGesture = z;
            return this;
        }
    }

    private WorkflowConfiguration(Builder builder) {
        this.shouldSkipGesture = builder.shouldSkipGesture;
        this.shouldSkipContent = builder.shouldSkipContent;
        this.shouldSkipAnnouncement = builder.shouldSkipAnnouncement;
    }

    public boolean shouldSkipAnnouncement() {
        return this.shouldSkipAnnouncement;
    }

    public boolean shouldSkipContent() {
        return this.shouldSkipContent;
    }

    public boolean shouldSkipGesture() {
        return this.shouldSkipGesture;
    }

    public /* synthetic */ WorkflowConfiguration(Builder builder, int i) {
        this(builder);
    }
}

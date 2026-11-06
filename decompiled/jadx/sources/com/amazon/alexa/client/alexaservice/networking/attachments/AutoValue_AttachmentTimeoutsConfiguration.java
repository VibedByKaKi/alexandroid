package com.amazon.alexa.client.alexaservice.networking.attachments;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AttachmentTimeoutsConfiguration extends AttachmentTimeoutsConfiguration {
    private final long durationLimit;
    private final long totalWriteTimeout;
    private final long writeBytesTimeout;

    public AutoValue_AttachmentTimeoutsConfiguration(long j, long j2, long j3) {
        this.totalWriteTimeout = j;
        this.writeBytesTimeout = j2;
        this.durationLimit = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttachmentTimeoutsConfiguration) {
            AttachmentTimeoutsConfiguration attachmentTimeoutsConfiguration = (AttachmentTimeoutsConfiguration) obj;
            if (this.totalWriteTimeout == attachmentTimeoutsConfiguration.getTotalWriteTimeout() && this.writeBytesTimeout == attachmentTimeoutsConfiguration.getWriteBytesTimeout() && this.durationLimit == attachmentTimeoutsConfiguration.getDurationLimit()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentTimeoutsConfiguration
    public long getDurationLimit() {
        return this.durationLimit;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentTimeoutsConfiguration
    public long getTotalWriteTimeout() {
        return this.totalWriteTimeout;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentTimeoutsConfiguration
    public long getWriteBytesTimeout() {
        return this.writeBytesTimeout;
    }

    public int hashCode() {
        long j = this.totalWriteTimeout;
        long j2 = this.writeBytesTimeout;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.durationLimit;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AttachmentTimeoutsConfiguration{totalWriteTimeout=");
        sb.append(this.totalWriteTimeout);
        sb.append(", writeBytesTimeout=");
        sb.append(this.writeBytesTimeout);
        sb.append(", durationLimit=");
        return a$$ExternalSyntheticOutline0.m(this.durationLimit, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}

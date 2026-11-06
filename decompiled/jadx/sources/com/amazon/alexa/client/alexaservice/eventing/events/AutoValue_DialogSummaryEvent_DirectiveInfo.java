package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent;
import com.amazon.alexa.client.core.messages.Header;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DialogSummaryEvent_DirectiveInfo extends DialogSummaryEvent.DirectiveInfo {
    private final Header header;
    private final long timestamp;

    public AutoValue_DialogSummaryEvent_DirectiveInfo(Header header, long j) {
        if (header == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null header");
            throw null;
        }
        this.header = header;
        this.timestamp = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DialogSummaryEvent.DirectiveInfo) {
            DialogSummaryEvent.DirectiveInfo directiveInfo = (DialogSummaryEvent.DirectiveInfo) obj;
            if (this.header.equals(directiveInfo.getHeader()) && this.timestamp == directiveInfo.getTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent.DirectiveInfo
    public Header getHeader() {
        return this.header;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent.DirectiveInfo
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = (this.header.hashCode() ^ 1000003) * 1000003;
        long j = this.timestamp;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DirectiveInfo{header=");
        sb.append(this.header);
        sb.append(", timestamp=");
        return a$$ExternalSyntheticOutline0.m(this.timestamp, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}

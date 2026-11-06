package com.amazon.alexa.mosaic.apl.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.events.OpenUrlEvent;
import com.amazon.alexa.mosaic.apl.interfaces.UrlEventCallback;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_OpenUrlEvent extends OpenUrlEvent {
    private final String flags;
    private final UrlEventCallback handleOpenUrlEventResult;
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends OpenUrlEvent.Builder {
        private String flags;
        private UrlEventCallback handleOpenUrlEventResult;
        private String url;

        @Override // com.amazon.alexa.mosaic.apl.events.OpenUrlEvent.Builder
        public OpenUrlEvent build() {
            UrlEventCallback urlEventCallback;
            String str = this.url;
            if (str != null && (urlEventCallback = this.handleOpenUrlEventResult) != null) {
                return new AutoValue_OpenUrlEvent(str, this.flags, urlEventCallback, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.url == null) {
                sb.append(" url");
            }
            if (this.handleOpenUrlEventResult == null) {
                sb.append(" handleOpenUrlEventResult");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.OpenUrlEvent.Builder
        public OpenUrlEvent.Builder flags(@Nullable String str) {
            this.flags = str;
            return this;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.OpenUrlEvent.Builder
        public OpenUrlEvent.Builder handleOpenUrlEventResult(UrlEventCallback urlEventCallback) {
            if (urlEventCallback != null) {
                this.handleOpenUrlEventResult = urlEventCallback;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null handleOpenUrlEventResult");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.OpenUrlEvent.Builder
        public OpenUrlEvent.Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null url");
            return null;
        }
    }

    private AutoValue_OpenUrlEvent(String str, @Nullable String str2, UrlEventCallback urlEventCallback) {
        this.url = str;
        this.flags = str2;
        this.handleOpenUrlEventResult = urlEventCallback;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpenUrlEvent) {
            OpenUrlEvent openUrlEvent = (OpenUrlEvent) obj;
            if (this.url.equals(openUrlEvent.url()) && ((str = this.flags) != null ? str.equals(openUrlEvent.flags()) : openUrlEvent.flags() == null) && this.handleOpenUrlEventResult.equals(openUrlEvent.handleOpenUrlEventResult())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.OpenUrlEvent
    @Nullable
    public String flags() {
        return this.flags;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.OpenUrlEvent
    public UrlEventCallback handleOpenUrlEventResult() {
        return this.handleOpenUrlEventResult;
    }

    public int hashCode() {
        int hashCode = (this.url.hashCode() ^ 1000003) * 1000003;
        String str = this.flags;
        return this.handleOpenUrlEventResult.hashCode() ^ ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public String toString() {
        return "OpenUrlEvent{url=" + this.url + ", flags=" + this.flags + ", handleOpenUrlEventResult=" + this.handleOpenUrlEventResult + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.OpenUrlEvent
    public String url() {
        return this.url;
    }

    public /* synthetic */ AutoValue_OpenUrlEvent(String str, String str2, UrlEventCallback urlEventCallback, int i) {
        this(str, str2, urlEventCallback);
    }
}

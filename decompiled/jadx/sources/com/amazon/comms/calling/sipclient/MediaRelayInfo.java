package com.amazon.comms.calling.sipclient;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MediaRelayInfo {

    @Nonnull
    private final TurnEndPointInfo callee;

    @Nonnull
    private final TurnEndPointInfo caller;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaRelayInfoBuilder {
        private TurnEndPointInfo callee;
        private TurnEndPointInfo caller;

        public MediaRelayInfo build() {
            return new MediaRelayInfo(this.caller, this.callee);
        }

        public MediaRelayInfoBuilder callee(@Nonnull TurnEndPointInfo turnEndPointInfo) {
            if (turnEndPointInfo != null) {
                this.callee = turnEndPointInfo;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("callee is marked non-null but is null");
            return null;
        }

        public MediaRelayInfoBuilder caller(@Nonnull TurnEndPointInfo turnEndPointInfo) {
            if (turnEndPointInfo != null) {
                this.caller = turnEndPointInfo;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("caller is marked non-null but is null");
            return null;
        }

        public String toString() {
            return "MediaRelayInfo.MediaRelayInfoBuilder(caller=" + this.caller + ", callee=" + this.callee + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public MediaRelayInfo(@Nonnull TurnEndPointInfo turnEndPointInfo, @Nonnull TurnEndPointInfo turnEndPointInfo2) {
        if (turnEndPointInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("caller is marked non-null but is null");
            throw null;
        }
        if (turnEndPointInfo2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("callee is marked non-null but is null");
            throw null;
        }
        this.caller = turnEndPointInfo;
        this.callee = turnEndPointInfo2;
    }

    public static MediaRelayInfoBuilder builder() {
        return new MediaRelayInfoBuilder();
    }

    @Nonnull
    public TurnEndPointInfo getCallee() {
        return this.callee;
    }

    @Nonnull
    public TurnEndPointInfo getCaller() {
        return this.caller;
    }
}

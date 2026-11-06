package com.amazon.comms.calling.sipclient;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SipClientMetrics extends CallQualityMetrics {
    CallSetup callSetup;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CallSetup {
        CalleeSetupMetrics callee;
        CallerSetupMetrics caller;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class CallSetupBuilder {
            private CalleeSetupMetrics callee;
            private CallerSetupMetrics caller;

            public CallSetup build() {
                return new CallSetup(this.caller, this.callee);
            }

            public CallSetupBuilder callee(CalleeSetupMetrics calleeSetupMetrics) {
                this.callee = calleeSetupMetrics;
                return this;
            }

            public CallSetupBuilder caller(CallerSetupMetrics callerSetupMetrics) {
                this.caller = callerSetupMetrics;
                return this;
            }

            public String toString() {
                return "SipClientMetrics.CallSetup.CallSetupBuilder(caller=" + this.caller + ", callee=" + this.callee + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        public CallSetup(CallerSetupMetrics callerSetupMetrics, CalleeSetupMetrics calleeSetupMetrics) {
            this.caller = callerSetupMetrics;
            this.callee = calleeSetupMetrics;
        }

        public static CallSetupBuilder builder() {
            return new CallSetupBuilder();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CalleeSetupMetrics {
        int acceptToMediaMsec;
        int dropInInviteToMediaMsec;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class CalleeSetupMetricsBuilder {
            private int acceptToMediaMsec;
            private int dropInInviteToMediaMsec;

            public CalleeSetupMetricsBuilder acceptToMediaMsec(int i) {
                this.acceptToMediaMsec = i;
                return this;
            }

            public CalleeSetupMetrics build() {
                return new CalleeSetupMetrics(this.acceptToMediaMsec, this.dropInInviteToMediaMsec);
            }

            public CalleeSetupMetricsBuilder dropInInviteToMediaMsec(int i) {
                this.dropInInviteToMediaMsec = i;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SipClientMetrics.CalleeSetupMetrics.CalleeSetupMetricsBuilder(acceptToMediaMsec=");
                sb.append(this.acceptToMediaMsec);
                sb.append(", dropInInviteToMediaMsec=");
                return a$$ExternalSyntheticOutline0.m(sb, this.dropInInviteToMediaMsec, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        public CalleeSetupMetrics(int i, int i2) {
            this.acceptToMediaMsec = i;
            this.dropInInviteToMediaMsec = i2;
        }

        public static CalleeSetupMetricsBuilder builder() {
            return new CalleeSetupMetricsBuilder();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CallerSetupMetrics {
        int dropInDirectiveToMediaMsec;
        int dropInUserActionToMediaMsec;
        int userActionToRingingMsec;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class CallerSetupMetricsBuilder {
            private int dropInDirectiveToMediaMsec;
            private int dropInUserActionToMediaMsec;
            private int userActionToRingingMsec;

            public CallerSetupMetrics build() {
                return new CallerSetupMetrics(this.userActionToRingingMsec, this.dropInUserActionToMediaMsec, this.dropInDirectiveToMediaMsec);
            }

            public CallerSetupMetricsBuilder dropInDirectiveToMediaMsec(int i) {
                this.dropInDirectiveToMediaMsec = i;
                return this;
            }

            public CallerSetupMetricsBuilder dropInUserActionToMediaMsec(int i) {
                this.dropInUserActionToMediaMsec = i;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SipClientMetrics.CallerSetupMetrics.CallerSetupMetricsBuilder(userActionToRingingMsec=");
                sb.append(this.userActionToRingingMsec);
                sb.append(", dropInUserActionToMediaMsec=");
                sb.append(this.dropInUserActionToMediaMsec);
                sb.append(", dropInDirectiveToMediaMsec=");
                return a$$ExternalSyntheticOutline0.m(sb, this.dropInDirectiveToMediaMsec, MarkdownConstants.RIGHT_PARENTHESIS);
            }

            public CallerSetupMetricsBuilder userActionToRingingMsec(int i) {
                this.userActionToRingingMsec = i;
                return this;
            }
        }

        public CallerSetupMetrics(int i, int i2, int i3) {
            this.userActionToRingingMsec = i;
            this.dropInUserActionToMediaMsec = i2;
            this.dropInDirectiveToMediaMsec = i3;
        }

        public static CallerSetupMetricsBuilder builder() {
            return new CallerSetupMetricsBuilder();
        }
    }

    public SipClientMetrics(CallQualityMetrics callQualityMetrics, CallSetup callSetup) {
        this.audio = callQualityMetrics.audio;
        this.video = callQualityMetrics.video;
        this.codecData = callQualityMetrics.codecData;
        this.callSetup = callSetup;
    }
}

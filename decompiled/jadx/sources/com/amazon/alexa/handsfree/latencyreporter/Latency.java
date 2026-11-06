package com.amazon.alexa.handsfree.latencyreporter;

import com.amazon.alexa.client.annotations.NonNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PARTNER_WAKE_WORD_DETECTION_LATENCY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Latency {
    private static final /* synthetic */ Latency[] $VALUES;
    public static final Latency ALEXA_SERVICE_VOICE_CHROME_LATENCY_API;
    public static final Latency ALEXA_SERVICE_VOICE_CHROME_LATENCY_PRYON;
    public static final Latency ALEXA_SERVICE_VOICE_CHROME_LATENCY_UI;
    public static final Latency ALEXA_SERVICE_WAKE_WORD_DETECTION_LATENCY;
    public static final Latency HANDS_FREE_QS_TILE_SYNC_INCOMPLETE_SETUP_LATENCY;
    public static final Latency HANDS_FREE_QS_TILE_SYNC_LATENCY;
    public static final Latency OVERALL_VOICE_CHROME_LATENCY;
    public static final Latency PARTNER_VOICE_CHROME_LATENCY;
    public static final Latency PARTNER_WAKE_WORD_DETECTION_LATENCY;
    public static final Latency PARTNER_WAKE_WORD_DETECTION_LATENCY_ANY;
    public static final Latency PARTNER_WAKE_WORD_FIRST_STAGE_LATENCY;
    public static final Latency PARTNER_WAKE_WORD_SECOND_STAGE_LATENCY;
    private final String mMetricName;
    private final long mTimeout;
    private final TimestampReceiveOrder mTimestampReceiveOrder;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LatencyTimeout {
        NO_TIMEOUT(-1),
        ONE_MINUTE(60000),
        ONE_HOUR(3600000),
        ONE_DAY(86400000);

        private final long mValue;

        LatencyTimeout(long j) {
            this.mValue = j;
        }

        public long getValue() {
            return this.mValue;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TimestampReceiveOrder {
        START_BEFORE_END,
        END_BEFORE_START,
        ANY
    }

    private static /* synthetic */ Latency[] $values() {
        return new Latency[]{PARTNER_WAKE_WORD_DETECTION_LATENCY, PARTNER_WAKE_WORD_DETECTION_LATENCY_ANY, PARTNER_WAKE_WORD_FIRST_STAGE_LATENCY, PARTNER_WAKE_WORD_SECOND_STAGE_LATENCY, ALEXA_SERVICE_WAKE_WORD_DETECTION_LATENCY, PARTNER_VOICE_CHROME_LATENCY, ALEXA_SERVICE_VOICE_CHROME_LATENCY_API, ALEXA_SERVICE_VOICE_CHROME_LATENCY_PRYON, ALEXA_SERVICE_VOICE_CHROME_LATENCY_UI, OVERALL_VOICE_CHROME_LATENCY, HANDS_FREE_QS_TILE_SYNC_LATENCY, HANDS_FREE_QS_TILE_SYNC_INCOMPLETE_SETUP_LATENCY};
    }

    static {
        LatencyTimeout latencyTimeout = LatencyTimeout.ONE_MINUTE;
        long value = latencyTimeout.getValue();
        TimestampReceiveOrder timestampReceiveOrder = TimestampReceiveOrder.END_BEFORE_START;
        PARTNER_WAKE_WORD_DETECTION_LATENCY = new Latency("PARTNER_WAKE_WORD_DETECTION_LATENCY", 0, "PartnerWakeWordDetectionLatency", value, timestampReceiveOrder);
        long value2 = latencyTimeout.getValue();
        TimestampReceiveOrder timestampReceiveOrder2 = TimestampReceiveOrder.ANY;
        PARTNER_WAKE_WORD_DETECTION_LATENCY_ANY = new Latency("PARTNER_WAKE_WORD_DETECTION_LATENCY_ANY", 1, "PartnerWakeWordDetectionLatency", value2, timestampReceiveOrder2);
        PARTNER_WAKE_WORD_FIRST_STAGE_LATENCY = new Latency("PARTNER_WAKE_WORD_FIRST_STAGE_LATENCY", 2, "PartnerWakeWordFirstStageLatency", latencyTimeout.getValue(), timestampReceiveOrder2);
        PARTNER_WAKE_WORD_SECOND_STAGE_LATENCY = new Latency("PARTNER_WAKE_WORD_SECOND_STAGE_LATENCY", 3, "PartnerWakeWordSecondStageLatency", latencyTimeout.getValue(), timestampReceiveOrder2);
        long value3 = latencyTimeout.getValue();
        TimestampReceiveOrder timestampReceiveOrder3 = TimestampReceiveOrder.START_BEFORE_END;
        ALEXA_SERVICE_WAKE_WORD_DETECTION_LATENCY = new Latency("ALEXA_SERVICE_WAKE_WORD_DETECTION_LATENCY", 4, "AlexaServiceWakeWordLatency", value3, timestampReceiveOrder3);
        PARTNER_VOICE_CHROME_LATENCY = new Latency("PARTNER_VOICE_CHROME_LATENCY", 5, "VoiceChromeLatency:Partner", latencyTimeout.getValue(), timestampReceiveOrder);
        ALEXA_SERVICE_VOICE_CHROME_LATENCY_API = new Latency("ALEXA_SERVICE_VOICE_CHROME_LATENCY_API", 6, "VoiceChromeLatency:AlexaService:Api", latencyTimeout.getValue(), timestampReceiveOrder3);
        ALEXA_SERVICE_VOICE_CHROME_LATENCY_PRYON = new Latency("ALEXA_SERVICE_VOICE_CHROME_LATENCY_PRYON", 7, "VoiceChromeLatency:AlexaService:Pryon", latencyTimeout.getValue(), timestampReceiveOrder3);
        ALEXA_SERVICE_VOICE_CHROME_LATENCY_UI = new Latency("ALEXA_SERVICE_VOICE_CHROME_LATENCY_UI", 8, "VoiceChromeLatency:AlexaService:UI", latencyTimeout.getValue(), timestampReceiveOrder3);
        OVERALL_VOICE_CHROME_LATENCY = new Latency("OVERALL_VOICE_CHROME_LATENCY", 9, "VoiceChromeLatency:Partner:UI", latencyTimeout.getValue(), timestampReceiveOrder3);
        HANDS_FREE_QS_TILE_SYNC_LATENCY = new Latency("HANDS_FREE_QS_TILE_SYNC_LATENCY", 10, "QSSyncLatency:SetupComplete", latencyTimeout.getValue(), timestampReceiveOrder3);
        HANDS_FREE_QS_TILE_SYNC_INCOMPLETE_SETUP_LATENCY = new Latency("HANDS_FREE_QS_TILE_SYNC_INCOMPLETE_SETUP_LATENCY", 11, "QSSyncLatency:SetupNotComplete", latencyTimeout.getValue(), timestampReceiveOrder3);
        $VALUES = $values();
    }

    private Latency(@NonNull String str, int i, @NonNull String str2, long j, TimestampReceiveOrder timestampReceiveOrder) {
        this.mMetricName = str2;
        this.mTimeout = j;
        this.mTimestampReceiveOrder = timestampReceiveOrder;
    }

    public static Latency valueOf(String str) {
        return (Latency) Enum.valueOf(Latency.class, str);
    }

    public static Latency[] values() {
        return (Latency[]) $VALUES.clone();
    }

    public String getMetricName() {
        return this.mMetricName;
    }

    public long getTimeout() {
        return this.mTimeout;
    }

    public TimestampReceiveOrder getTimestampReceiveOrder() {
        return this.mTimestampReceiveOrder;
    }

    public boolean isTimeoutSet() {
        return this.mTimeout != LatencyTimeout.NO_TIMEOUT.getValue();
    }
}

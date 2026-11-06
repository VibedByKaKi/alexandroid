package com.amazon.alexa.accessory.speechapi.voicesdk.metrics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/metrics/MetricsConstants;", "", "<init>", "()V", "COMPONENT_NAME", "", "UNKNOWN_DEVICE_TYPE", "VoxAlexaConnection", "AmbientSound", "ReportState", "AmbientContext", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MetricsConstants {

    @NotNull
    public static final String COMPONENT_NAME = "alexa_accessories";

    @NotNull
    public static final MetricsConstants INSTANCE = new MetricsConstants();

    @NotNull
    public static final String UNKNOWN_DEVICE_TYPE = "UNKNOWN";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/metrics/MetricsConstants$AmbientContext;", "", "<init>", "()V", "VOX_CAPABILITY_INITIALIZATION", "", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmbientContext {

        @NotNull
        public static final AmbientContext INSTANCE = new AmbientContext();

        @NotNull
        public static final String VOX_CAPABILITY_INITIALIZATION = "VoxAmbientContextCapabilityInitialization";

        private AmbientContext() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/metrics/MetricsConstants$AmbientSound;", "", "<init>", "()V", "VOX_AMBIENT_SOUND_PROCESSING_DIRECTIVE", "", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmbientSound {

        @NotNull
        public static final AmbientSound INSTANCE = new AmbientSound();

        @NotNull
        public static final String VOX_AMBIENT_SOUND_PROCESSING_DIRECTIVE = "VoxAmbientSoundProcessing";

        private AmbientSound() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/metrics/MetricsConstants$ReportState;", "", "<init>", "()V", "REPORT_STATE_CAPABILITY_INITIALIZATION", "", "REPORT_STATE_DIRECTIVE", "REPORT_STATE_DIRECTIVE_PROCESSING", "REPORT_STATE_GENERATOR", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReportState {

        @NotNull
        public static final ReportState INSTANCE = new ReportState();

        @NotNull
        public static final String REPORT_STATE_CAPABILITY_INITIALIZATION = "ReportAccessoryStateCapabilityInitialization";

        @NotNull
        public static final String REPORT_STATE_DIRECTIVE = "ReportAccessoryStateDirective";

        @NotNull
        public static final String REPORT_STATE_DIRECTIVE_PROCESSING = "ReportAccessoryStateDirectiveProcessing";

        @NotNull
        public static final String REPORT_STATE_GENERATOR = "ReportAccessoryStateGenerator";

        private ReportState() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/metrics/MetricsConstants$VoxAlexaConnection;", "", "<init>", "()V", "VOX_ALEXA_CONNECTION_FAILED_REASON", "", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VoxAlexaConnection {

        @NotNull
        public static final VoxAlexaConnection INSTANCE = new VoxAlexaConnection();

        @NotNull
        public static final String VOX_ALEXA_CONNECTION_FAILED_REASON = "VoxAlexaConnectionFailedReason";

        private VoxAlexaConnection() {
        }
    }

    private MetricsConstants() {
    }
}

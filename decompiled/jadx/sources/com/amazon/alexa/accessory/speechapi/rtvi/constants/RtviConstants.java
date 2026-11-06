package com.amazon.alexa.accessory.speechapi.rtvi.constants;

import com.amazon.alexa.enrollment.utils.ActivityConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/rtvi/constants/RtviConstants;", "", "<init>", "()V", "Timeouts", "ConsumerService", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RtviConstants {

    @NotNull
    public static final RtviConstants INSTANCE = new RtviConstants();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/rtvi/constants/RtviConstants$ConsumerService;", "", "<init>", "()V", "CLASS", "", "ACTION", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConsumerService {

        @NotNull
        public static final String ACTION = "com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer";

        @NotNull
        public static final String CLASS = "com.amazon.rtvi.service.RTVICaptureControllerService";

        @NotNull
        public static final ConsumerService INSTANCE = new ConsumerService();

        private ConsumerService() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/rtvi/constants/RtviConstants$Timeouts;", "", "<init>", "()V", "CONNECTION_TIMEOUT_SECONDS", "", "CONNECT_OPERATION_TIMEOUT_SECONDS", "RETRY_DELAY_MILLIS", ActivityConstants.RETRY_COUNT, "", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Timeouts {
        public static final long CONNECTION_TIMEOUT_SECONDS = 30;
        public static final long CONNECT_OPERATION_TIMEOUT_SECONDS = 15;

        @NotNull
        public static final Timeouts INSTANCE = new Timeouts();
        public static final int RETRY_COUNT = 3;
        public static final long RETRY_DELAY_MILLIS = 1000;

        private Timeouts() {
        }
    }

    private RtviConstants() {
    }
}

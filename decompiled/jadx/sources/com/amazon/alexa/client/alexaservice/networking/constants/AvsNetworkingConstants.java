package com.amazon.alexa.client.alexaservice.networking.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AvsNetworkingConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Downchannel {
        public static final long DOWNCHANNEL_READ_TIMOUT_HOURS = 1;
        public static final long INITIAL_PING_DELAY_IN_SECONDS = 10;
        public static final long PING_PERIOD_IN_SECONDS = 300;

        private Downchannel() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class HttpStatusCodes {
        public static final int ACCEPTED = 202;
        public static final int BAD_REQUEST = 400;
        public static final int GATEWAY_TIMEOUT = 504;
        public static final int NO_CONTENT = 204;
        public static final int OK = 200;
        public static final int REQUEST_TIMEOUT = 408;
        public static final int SERVER_ERROR = 500;

        private HttpStatusCodes() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Request {
        public static final long AVS_NETWORK_WRITE_TIMEOUT_SECONDS = 15;
        public static final long DEFAULT_READ_TIMEOUT = 10;
        public static final long DEFAULT_TOTAL_WRITE_DEADLINE_SECONDS = 50;
        public static final long DEFAULT_WRITE_BYTES_TIMEOUT_MILLISECONDS = 3000;
        public static final long EXTENDED_READ_TIMEOUT = 65;
        public static final long FIRST_TURN_WRITE_DEADLINE_SECONDS = 30;
        public static final long MAX_UTTERANCE_DURATION_SECONDS = 45;
        public static final long RECOGNIZE_WRITE_BYTES_TIMEOUT_MILLISECONDS = 16000;
        public static final long SEND_MESSAGE_TIMEOUT_SECONDS = 10;

        private Request() {
        }
    }
}

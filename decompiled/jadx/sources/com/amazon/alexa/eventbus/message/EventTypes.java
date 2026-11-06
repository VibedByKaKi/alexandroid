package com.amazon.alexa.eventbus.message;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressWarnings({"MS_SHOULD_BE_FINAL"})
@Deprecated
/* loaded from: classes17.dex */
public final class EventTypes {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeeApp extends Topic {
        public static final String USER_LOGGED_IN;
        public static final String USER_LOGGED_OUT;

        static {
            Topic.topic = "deeapp";
            USER_LOGGED_IN = Topic.concatenate("userLoggedIn");
            USER_LOGGED_OUT = Topic.concatenate("userLoggedOut");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FFS extends Topic {
        static {
            Topic.topic = "ffs";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TComm extends Topic {
        public static final String ALL;
        public static final String CONNECT;
        public static final String DISCONNECT;
        public static final String MESSAGE;

        static {
            Topic.topic = "tcomm";
            ALL = Topic.concatenate("*");
            CONNECT = Topic.concatenate(MissingTokenPull.TRIGGER_CONNECT);
            DISCONNECT = Topic.concatenate("disconnect");
            MESSAGE = Topic.concatenate("message");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Topic {
        public static String topic;

        public static String concatenate(String str) {
            return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(), topic, "::", str);
        }
    }
}

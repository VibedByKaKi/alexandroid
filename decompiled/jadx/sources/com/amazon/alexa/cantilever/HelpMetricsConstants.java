package com.amazon.alexa.cantilever;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class HelpMetricsConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ComponentName {
        public static final String CANTILEVER = "Cantilever";
        public static final String CANTILEVER_SUB = "Cantilever_Page";

        private ComponentName() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EventName {
        public static final List<String> JS_EVENTS = Collections.unmodifiableList(Arrays.asList("DOMContentLoaded", "aui-ready", "load"));
        public static final String JS_EVENT_PREFIX = "help.load.js.";
        public static final String LOAD_ATTEMPT = "help.load.attempt";
        public static final String LOAD_CANCEL = "help.load.cancel";
        public static final String LOAD_ERROR_PREFIX = "help.load.error.";
        public static final String LOAD_ERROR_PREFIX_HTTP = "help.load.error.http.";
        public static final String LOAD_ERROR_PREFIX_OTHER = "help.load.error.other";
        public static final String LOAD_SIGNIN = "help.load.signin";
        public static final String LOAD_SUCCESS = "help.load.success";

        private EventName() {
        }
    }

    private HelpMetricsConstants() {
    }
}

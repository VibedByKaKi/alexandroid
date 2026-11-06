package com.amazon.dee.app.ui.web;

import androidx.annotation.VisibleForTesting;
import com.amazon.dee.app.core.BuildConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class WebConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class ExternalUIConstants {
        public static final String BRIDGE_ACTION_KEY = "BRIDGE_ACTION_KEY";
        public static final String CLOSE_ON_EXTERNAL_HANDOFF = "CLOSE_ON_EXTERNAL_HANDOFF";
        public static final String CONTINUE_ON_NON_FATAL_ERRORS = "CONTINUE_ON_NON_FATAL_ERRORS";
        public static final String EXTERNAL_HANDOFF_OCCURRED = "EXTERNAL_HANDOFF_OCCURRED";
        public static final String HOST_ALLOWLIST_KEY = "HOST_ALLOWLIST_KEY";
        public static final String IS_DOM_STORAGE_ENABLED = "IS_DOM_STORAGE_ENABLED";
        public static final String OPTION_CLOSE_ON_EXTERNAL_HANDOFF = "closeOnExternalHandoff";
        public static final String RESULT_EXTERNAL_HANDOFF_OCCURRED = "externalHandoffOccurred";
        public static final String URL_REGEX_KEY = "URL_REGEX_KEY";
        public static final String WEBVIEW_TITLE_ID_KEY = "WEBVIEW_TITLE_ID_KEY";
        public static final String WEBVIEW_USE_WEBSITE_HEADER_VIEW = "WEBVIEW_USE_WEBSITE_HEADER_VIEW";

        private ExternalUIConstants() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class ExternalURL {
        public static final String BLUEPRINTS_URL = "https://blueprints.amazon.com/";

        private ExternalURL() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class URLRegex {

        @VisibleForTesting
        static final String BLUEPRINTS_PRE_PROD_REGEX = "^https://(preprod-blueprints-(us|ca|mx|uk|de|in|fr|it|es|au|jp).aka.amazon.com|preprod-alexa-blueprints.*.proxy.amazon.com)/(.*)";

        @VisibleForTesting
        static final String BLUEPRINTS_PROD_REGEX = "^https://blueprints.amazon.(com|ca|com.mx|co.uk|de|in|fr|it|es|com.au|co.jp)/(.*)";
        public static final String BLUEPRINTS_REGEX;

        static {
            BLUEPRINTS_REGEX = BuildConfig.IS_PROD_ENVIRONMENT ? BLUEPRINTS_PROD_REGEX : BLUEPRINTS_PRE_PROD_REGEX;
        }

        private URLRegex() {
        }
    }

    private WebConstants() {
    }
}

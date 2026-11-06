package expo.modules.apploader;

import android.content.Context;
import expo.modules.core.interfaces.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface HeadlessAppLoader {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Params {
        private final String appScopeKey;
        private final String appUrl;

        public Params(String str, String str2) {
            this.appScopeKey = str;
            this.appUrl = str2;
        }

        public String getAppScopeKey() {
            return this.appScopeKey;
        }

        public String getAppUrl() {
            return this.appUrl;
        }
    }

    boolean invalidateApp(String str);

    boolean isRunning(String str);

    void loadApp(Context context, Params params, Runnable runnable, Consumer<Boolean> consumer) throws AppConfigurationError;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AppConfigurationError extends Exception {
        public AppConfigurationError(String str) {
            super(str);
        }

        public AppConfigurationError(String str, Exception exc) {
            super(str, exc);
        }
    }
}

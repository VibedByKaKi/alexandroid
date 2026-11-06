package androidx.webkit;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WebViewMediaIntegrityApiStatusConfig {
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_DISABLED = 0;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED = 2;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED_WITHOUT_APP_IDENTITY = 1;
    private final int mDefaultStatus;
    private final Map<String, Integer> mOverrideRules;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private final int mDefaultStatus;
        private Map<String, Integer> mOverrideRules = new HashMap();

        public Builder(int i) {
            this.mDefaultStatus = i;
        }

        public Builder addOverrideRule(String str, int i) {
            this.mOverrideRules.put(str, Integer.valueOf(i));
            return this;
        }

        public WebViewMediaIntegrityApiStatusConfig build() {
            return new WebViewMediaIntegrityApiStatusConfig(this);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setOverrideRules(Map<String, Integer> map) {
            this.mOverrideRules = map;
            return this;
        }
    }

    public WebViewMediaIntegrityApiStatusConfig(Builder builder) {
        this.mDefaultStatus = builder.mDefaultStatus;
        this.mOverrideRules = builder.mOverrideRules;
    }

    public int getDefaultStatus() {
        return this.mDefaultStatus;
    }

    public Map<String, Integer> getOverrideRules() {
        return this.mOverrideRules;
    }
}

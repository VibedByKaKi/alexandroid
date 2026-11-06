package com.amazon.alexa.api;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.AlexaUriValidator;
import java.util.Arrays;
import java.util.Objects;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaBaseURLs {
    static final URLsKeys KEY_AVS_URL = new URLsKeys(URLsKeysEnum.AVS);
    private Uri avsURL;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class URLsKeys implements Bundles.Key {
        private final URLsKeysEnum enumVal;

        public URLsKeys(URLsKeysEnum uRLsKeysEnum) {
            this.enumVal = uRLsKeysEnum;
        }

        @Override // com.amazon.alexa.api.Bundles.Key
        public String name() {
            return this.enumVal.getName();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum URLsKeysEnum {
        AVS("avs");

        private String name;

        URLsKeysEnum(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public AlexaBaseURLs(@Nullable Bundle bundle) {
        this.avsURL = getUri(bundle, KEY_AVS_URL);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder getBuilder(@NonNull AlexaBaseURLs alexaBaseURLs) {
        return builder().setAVSURL(alexaBaseURLs.getAVSURL());
    }

    private Uri getUri(@Nullable Bundle bundle, Bundles.Key key) {
        if (bundle != null) {
            return (Uri) Bundles.getOptionalParcelable(bundle, key, Uri.class);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlexaBaseURLs) {
            return Objects.equals(getAVSURL(), ((AlexaBaseURLs) obj).getAVSURL());
        }
        return false;
    }

    @Nullable
    public Uri getAVSURL() {
        return this.avsURL;
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_AVS_URL.name(), this.avsURL);
        return bundle;
    }

    public int hashCode() {
        return Objects.hash(getAVSURL());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Uri avsURL;

        private void validateUri(Uri uri) {
            Uri uri2 = this.avsURL;
            if (uri2 == null) {
                return;
            }
            boolean hasValidScheme = AlexaUriValidator.hasValidScheme(uri2);
            Uri uri3 = this.avsURL;
            if (!hasValidScheme) {
                OnnxMap$$ExternalSyntheticBUOutline0.m$1("Invalid scheme: ", uri3.getScheme(), ". Must be: https");
            } else {
                if (AlexaUriValidator.hasValidHost(uri3)) {
                    return;
                }
                XML$$ExternalSyntheticBUOutline0.m("Invalid host: ", this.avsURL.getHost(), ". Must end with one of: ", Arrays.toString(AlexaUriValidator.SUPPORTED_DOMAINS));
            }
        }

        public AlexaBaseURLs build() {
            validateUri(this.avsURL);
            return new AlexaBaseURLs(this);
        }

        public Builder setAVSURL(String str) {
            this.avsURL = Uri.parse(str);
            return this;
        }

        private Builder() {
        }

        public Builder setAVSURL(Uri uri) {
            this.avsURL = uri;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class URLsBundleAdapter implements BundleAdapter<AlexaBaseURLs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public AlexaBaseURLs createFromBundle(Bundle bundle) {
            return new AlexaBaseURLs(bundle);
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AlexaBaseURLs alexaBaseURLs) {
            return alexaBaseURLs.getBundle();
        }
    }

    private AlexaBaseURLs(Builder builder) {
        this.avsURL = builder.avsURL;
    }
}

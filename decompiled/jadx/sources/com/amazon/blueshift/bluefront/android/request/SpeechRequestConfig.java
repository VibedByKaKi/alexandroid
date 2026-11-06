package com.amazon.blueshift.bluefront.android.request;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeechRequestConfig {
    private final String mLocale;
    private final String mProfile;
    private final String mRequestId;
    private final SpeechRequestParameters<?, ?> mRequestParameters;

    public SpeechRequestConfig(@Nullable String str, SpeechRequestParameters<?, ?> speechRequestParameters, String str2, @Nullable String str3) {
        Preconditions.checkNotNull(speechRequestParameters, "requestParameters cannot be null");
        Preconditions.checkArgument(!Strings.isNullOrEmpty(str2), "locale cannot be null or empty");
        this.mRequestId = str;
        this.mRequestParameters = speechRequestParameters;
        this.mLocale = str2;
        this.mProfile = str3;
    }

    public String getLocale() {
        return this.mLocale;
    }

    public String getProfile() {
        return this.mProfile;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public SpeechRequestParameters<?, ?> getRequestParameters() {
        return this.mRequestParameters;
    }
}

package com.amazon.alexa.accessory.notificationpublisher.servicerequest;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class GetFocusFilterTemplatesFromS3RequestBody {
    private final String osType;
    private final String templateType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String osType;
        private String templateType;

        public GetFocusFilterTemplatesFromS3RequestBody build() {
            Preconditions.checkArgument(!Strings.isNullOrEmpty(this.osType), "The provided osType was null or empty");
            Preconditions.checkArgument(!Strings.isNullOrEmpty(this.templateType), "The provided templateType was null or empty");
            return new GetFocusFilterTemplatesFromS3RequestBody(this.osType, this.templateType, 0);
        }

        public Builder setOSType(String str) {
            this.osType = str;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.templateType = str;
            return this;
        }
    }

    private GetFocusFilterTemplatesFromS3RequestBody(String str, String str2) {
        this.osType = str;
        this.templateType = str2;
    }

    public String getOsType() {
        return this.osType;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public /* synthetic */ GetFocusFilterTemplatesFromS3RequestBody(String str, String str2, int i) {
        this(str, str2);
    }
}

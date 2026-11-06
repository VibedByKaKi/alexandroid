package com.amazon.alexa.notification.api.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class Deeplink {

    @NonNull
    private final Type type;

    @NonNull
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DeeplinkBuilder {
        private Type type;
        private String url;

        public Deeplink build() {
            return new Deeplink(this.type, this.url, 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Deeplink.DeeplinkBuilder(type=");
            sb.append(this.type);
            sb.append(", url=");
            return a$$ExternalSyntheticOutline0.m(sb, this.url, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public DeeplinkBuilder type(@NonNull Type type) {
            if (type != null) {
                this.type = type;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("type is marked non-null but is null");
            return null;
        }

        public DeeplinkBuilder url(@NonNull String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("url is marked non-null but is null");
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        alexaUrl,
        deepLinkUrl,
        webUrl
    }

    private Deeplink(@NonNull Type type, @NonNull String str) {
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("type is marked non-null but is null");
            throw null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("url is marked non-null but is null");
            throw null;
        }
        this.type = type;
        this.url = str;
    }

    public static DeeplinkBuilder builder() {
        return new DeeplinkBuilder();
    }

    @NonNull
    public Type getType() {
        return this.type;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public /* synthetic */ Deeplink(Type type, String str, int i) {
        this(type, str);
    }
}

package com.amazon.alexa.accessory.notifications;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notifications.LocalNotification;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class AutoValue_LocalNotification extends LocalNotification {
    private final String deepLink;
    private final String text;
    private final String title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends LocalNotification.Builder {
        private String deepLink;
        private String text;
        private String title;

        @Override // com.amazon.alexa.accessory.notifications.LocalNotification.Builder
        public LocalNotification build() {
            String str;
            String str2;
            String str3 = this.title;
            if (str3 != null && (str = this.text) != null && (str2 = this.deepLink) != null) {
                return new AutoValue_LocalNotification(str3, str, str2, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.title == null) {
                sb.append(" title");
            }
            if (this.text == null) {
                sb.append(" text");
            }
            if (this.deepLink == null) {
                sb.append(" deepLink");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessory.notifications.LocalNotification.Builder
        public LocalNotification.Builder setDeepLink(String str) {
            if (str != null) {
                this.deepLink = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deepLink");
            return null;
        }

        @Override // com.amazon.alexa.accessory.notifications.LocalNotification.Builder
        public LocalNotification.Builder setText(String str) {
            if (str != null) {
                this.text = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null text");
            return null;
        }

        @Override // com.amazon.alexa.accessory.notifications.LocalNotification.Builder
        public LocalNotification.Builder setTitle(String str) {
            if (str != null) {
                this.title = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null title");
            return null;
        }
    }

    private AutoValue_LocalNotification(String str, String str2, String str3) {
        this.title = str;
        this.text = str2;
        this.deepLink = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalNotification) {
            LocalNotification localNotification = (LocalNotification) obj;
            if (this.title.equals(localNotification.getTitle()) && this.text.equals(localNotification.getText()) && this.deepLink.equals(localNotification.getDeepLink())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.notifications.LocalNotification
    public String getDeepLink() {
        return this.deepLink;
    }

    @Override // com.amazon.alexa.accessory.notifications.LocalNotification
    public String getText() {
        return this.text;
    }

    @Override // com.amazon.alexa.accessory.notifications.LocalNotification
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.deepLink.hashCode() ^ ((((this.title.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocalNotification{title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", deepLink=");
        return a$$ExternalSyntheticOutline0.m(sb, this.deepLink, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_LocalNotification(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }
}

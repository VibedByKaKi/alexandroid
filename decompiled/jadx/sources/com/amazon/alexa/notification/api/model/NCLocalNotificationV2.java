package com.amazon.alexa.notification.api.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.UUID;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class NCLocalNotificationV2 {
    private final Deeplink deeplink;
    private long deletionTTL;
    private long expirationTTL;
    private final String imageUrl;
    private final boolean isPersonal;
    private final String senderId;

    @NonNull
    private final String text;

    @NonNull
    private final String title;

    @NonNull
    private final String uuid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NCLocalNotificationV2Builder {
        private Deeplink deeplink;
        private long deletionTTL;
        private long expirationTTL;
        private String imageUrl;
        private boolean isPersonal;
        private String senderId;
        private String text;
        private String title;
        private String uuid;

        public NCLocalNotificationV2 build() {
            return new NCLocalNotificationV2(this.uuid, this.title, this.text, this.senderId, this.imageUrl, this.isPersonal, this.deeplink, this.expirationTTL, this.deletionTTL, 0);
        }

        public NCLocalNotificationV2Builder deeplink(Deeplink deeplink) {
            this.deeplink = deeplink;
            return this;
        }

        public NCLocalNotificationV2Builder deletionTTL(long j) {
            this.deletionTTL = j;
            return this;
        }

        public NCLocalNotificationV2Builder expirationTTL(long j) {
            this.expirationTTL = j;
            return this;
        }

        public NCLocalNotificationV2Builder imageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public NCLocalNotificationV2Builder isPersonal(boolean z) {
            this.isPersonal = z;
            return this;
        }

        public NCLocalNotificationV2Builder senderId(String str) {
            this.senderId = str;
            return this;
        }

        public NCLocalNotificationV2Builder text(@NonNull String str) {
            if (str != null) {
                this.text = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("text is marked non-null but is null");
            return null;
        }

        public NCLocalNotificationV2Builder title(@NonNull String str) {
            if (str != null) {
                this.title = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("title is marked non-null but is null");
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NCLocalNotificationV2.NCLocalNotificationV2Builder(uuid=");
            sb.append(this.uuid);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", senderId=");
            sb.append(this.senderId);
            sb.append(", imageUrl=");
            sb.append(this.imageUrl);
            sb.append(", isPersonal=");
            sb.append(this.isPersonal);
            sb.append(", deeplink=");
            sb.append(this.deeplink);
            sb.append(", expirationTTL=");
            sb.append(this.expirationTTL);
            sb.append(", deletionTTL=");
            return a$$ExternalSyntheticOutline0.m(this.deletionTTL, MarkdownConstants.RIGHT_PARENTHESIS, sb);
        }

        public NCLocalNotificationV2Builder uuid(@NonNull String str) {
            if (str != null) {
                this.uuid = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("uuid is marked non-null but is null");
            return null;
        }
    }

    public NCLocalNotificationV2(@NonNull UUID uuid, @NonNull String str, @NonNull String str2, String str3, String str4, boolean z, Deeplink deeplink, long j, long j2) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("uuid is marked non-null but is null");
            throw null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("title is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("text is marked non-null but is null");
            throw null;
        }
        this.uuid = uuid.toString();
        this.title = str;
        this.text = str2;
        this.senderId = str3;
        this.imageUrl = str4;
        this.isPersonal = z;
        this.deeplink = deeplink;
        this.expirationTTL = j;
        this.deletionTTL = j2;
    }

    public static NCLocalNotificationV2Builder builder() {
        return new NCLocalNotificationV2Builder();
    }

    public Deeplink getDeeplink() {
        return this.deeplink;
    }

    public long getDeletionTTL() {
        return this.deletionTTL;
    }

    public long getExpirationTTL() {
        return this.expirationTTL;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSenderId() {
        return this.senderId;
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    @NonNull
    public String getTitle() {
        return this.title;
    }

    @NonNull
    public String getUuid() {
        return this.uuid;
    }

    public boolean isPersonal() {
        return this.isPersonal;
    }

    private NCLocalNotificationV2(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4, String str5, boolean z, Deeplink deeplink, long j, long j2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("uuid is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("title is marked non-null but is null");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("text is marked non-null but is null");
            throw null;
        }
        this.uuid = str;
        this.title = str2;
        this.text = str3;
        this.senderId = str4;
        this.imageUrl = str5;
        this.isPersonal = z;
        this.deeplink = deeplink;
        this.expirationTTL = j;
        this.deletionTTL = j2;
    }

    public /* synthetic */ NCLocalNotificationV2(String str, String str2, String str3, String str4, String str5, boolean z, Deeplink deeplink, long j, long j2, int i) {
        this(str, str2, str3, str4, str5, z, deeplink, j, j2);
    }
}

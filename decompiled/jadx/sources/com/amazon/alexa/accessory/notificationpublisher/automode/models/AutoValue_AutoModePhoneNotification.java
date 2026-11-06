package com.amazon.alexa.accessory.notificationpublisher.automode.models;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class AutoValue_AutoModePhoneNotification extends AutoModePhoneNotification {
    private final String applicationName;

    @Nullable
    private final String contactName;
    private final Date timestamp;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AutoModePhoneNotification.Builder {
        private String applicationName;
        private String contactName;
        private Date timestamp;

        @Override // com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification.Builder
        public AutoModePhoneNotification build() {
            Date date;
            String str = this.applicationName;
            if (str != null && (date = this.timestamp) != null) {
                return new AutoValue_AutoModePhoneNotification(str, this.contactName, date, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.applicationName == null) {
                sb.append(" applicationName");
            }
            if (this.timestamp == null) {
                sb.append(" timestamp");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification.Builder
        public AutoModePhoneNotification.Builder setApplicationName(String str) {
            if (str != null) {
                this.applicationName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null applicationName");
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification.Builder
        public AutoModePhoneNotification.Builder setContactName(String str) {
            this.contactName = str;
            return this;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification.Builder
        public AutoModePhoneNotification.Builder setTimestamp(Date date) {
            if (date != null) {
                this.timestamp = date;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null timestamp");
            return null;
        }
    }

    private AutoValue_AutoModePhoneNotification(String str, @Nullable String str2, Date date) {
        this.applicationName = str;
        this.contactName = str2;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoModePhoneNotification) {
            AutoModePhoneNotification autoModePhoneNotification = (AutoModePhoneNotification) obj;
            if (this.applicationName.equals(autoModePhoneNotification.getApplicationName()) && ((str = this.contactName) != null ? str.equals(autoModePhoneNotification.getContactName()) : autoModePhoneNotification.getContactName() == null) && this.timestamp.equals(autoModePhoneNotification.getTimestamp())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification
    public String getApplicationName() {
        return this.applicationName;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification
    @Nullable
    public String getContactName() {
        return this.contactName;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoModePhoneNotification
    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = (this.applicationName.hashCode() ^ 1000003) * 1000003;
        String str = this.contactName;
        return this.timestamp.hashCode() ^ ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public String toString() {
        return "AutoModePhoneNotification{applicationName=" + this.applicationName + ", contactName=" + this.contactName + ", timestamp=" + this.timestamp + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_AutoModePhoneNotification(String str, String str2, Date date, int i) {
        this(str, str2, date);
    }
}

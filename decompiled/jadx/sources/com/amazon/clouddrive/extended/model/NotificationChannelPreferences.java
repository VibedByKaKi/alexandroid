package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NotificationChannelPreferences implements Comparable<NotificationChannelPreferences> {
    private Boolean contentAdded;
    private Boolean memberJoined;

    @Override // java.lang.Comparable
    public int compareTo(NotificationChannelPreferences notificationChannelPreferences) {
        if (notificationChannelPreferences == null) {
            return -1;
        }
        if (notificationChannelPreferences == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(isContentAdded(), notificationChannelPreferences.isContentAdded());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(isMemberJoined(), notificationChannelPreferences.isMemberJoined());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationChannelPreferences)) {
            return false;
        }
        NotificationChannelPreferences notificationChannelPreferences = (NotificationChannelPreferences) obj;
        Boolean bool = this.contentAdded;
        Boolean bool2 = notificationChannelPreferences.contentAdded;
        if (bool == null ? bool2 == null : bool.equals(bool2)) {
            Boolean bool3 = this.memberJoined;
            Boolean bool4 = notificationChannelPreferences.memberJoined;
            if (bool3 == null ? bool4 == null : bool3.equals(bool4)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.contentAdded;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.memberJoined;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public Boolean isContentAdded() {
        return this.contentAdded;
    }

    public Boolean isMemberJoined() {
        return this.memberJoined;
    }

    public void setContentAdded(Boolean bool) {
        this.contentAdded = bool;
    }

    public void setMemberJoined(Boolean bool) {
        this.memberJoined = bool;
    }

    public String toString() {
        return "NotificationChannelPreferences{contentAdded=" + this.contentAdded + ", memberJoined=" + this.memberJoined + AbstractJsonLexerKt.END_OBJ;
    }

    public NotificationChannelPreferences withContentAdded(Boolean bool) {
        setContentAdded(bool);
        return this;
    }

    public NotificationChannelPreferences withMemberJoined(Boolean bool) {
        setMemberJoined(bool);
        return this;
    }
}

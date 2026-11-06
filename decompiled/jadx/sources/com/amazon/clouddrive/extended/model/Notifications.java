package com.amazon.clouddrive.extended.model;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Notifications {
    private NotificationChannelPreferences email;
    private Boolean muted;
    private NotificationChannelPreferences push;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notifications)) {
            return false;
        }
        Notifications notifications = (Notifications) obj;
        Boolean bool = this.muted;
        Boolean bool2 = notifications.muted;
        if (bool == null ? bool2 == null : bool.equals(bool2)) {
            if (getEmail() == null ? notifications.getEmail() == null : getEmail().equals(notifications.getEmail())) {
                if (getPush() == null ? notifications.getPush() == null : getPush().equals(notifications.getPush())) {
                    return true;
                }
            }
        }
        return false;
    }

    public NotificationChannelPreferences getEmail() {
        return this.email;
    }

    public NotificationChannelPreferences getPush() {
        return this.push;
    }

    public int hashCode() {
        Boolean bool = this.muted;
        return ((((bool != null ? bool.hashCode() : 0) * 31) + (getEmail() != null ? getEmail().hashCode() : 0)) * 31) + (getPush() != null ? getPush().hashCode() : 0);
    }

    public Boolean isMuted() {
        return this.muted;
    }

    public void setEmail(NotificationChannelPreferences notificationChannelPreferences) {
        this.email = notificationChannelPreferences;
    }

    public void setMuted(Boolean bool) {
        this.muted = bool;
    }

    public void setPush(NotificationChannelPreferences notificationChannelPreferences) {
        this.push = notificationChannelPreferences;
    }

    public String toString() {
        return "Notifications{muted=" + this.muted + ", email=" + this.email + ", push=" + this.push + AbstractJsonLexerKt.END_OBJ;
    }

    public Notifications withEmail(NotificationChannelPreferences notificationChannelPreferences) {
        setEmail(notificationChannelPreferences);
        return this;
    }

    public Notifications withMuted(Boolean bool) {
        setMuted(bool);
        return this;
    }

    public Notifications withPush(NotificationChannelPreferences notificationChannelPreferences) {
        setPush(notificationChannelPreferences);
        return this;
    }
}

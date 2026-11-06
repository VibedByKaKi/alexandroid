package com.amazon.alexa.mobilytics.timeline;

import android.os.SystemClock;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class TimelineMessage {
    public String abortReason;
    public int action;
    public MobilyticsEvent associatedEvent;
    public long currentTimeMillis;
    public long elapsedRealtime;
    public String name;
    public String namespace;
    public String ownerIdentifier;

    public TimelineMessage(int i, String str, String str2, String str3, String str4) {
        this.action = i;
        this.name = str;
        this.namespace = str2;
        this.currentTimeMillis = System.currentTimeMillis();
        this.elapsedRealtime = SystemClock.elapsedRealtime();
        this.abortReason = str3;
        this.ownerIdentifier = str4;
    }

    public TimelineMessage(int i, String str, String str2) {
        this.action = i;
        this.name = str;
        this.namespace = str2;
        this.currentTimeMillis = System.currentTimeMillis();
        this.elapsedRealtime = SystemClock.elapsedRealtime();
    }

    public TimelineMessage(int i, String str, String str2, MobilyticsEvent mobilyticsEvent) {
        this(i, str, str2);
        this.associatedEvent = mobilyticsEvent;
        this.ownerIdentifier = mobilyticsEvent.getOwnerIdentifier();
    }

    public TimelineMessage(int i, String str, String str2, String str3) {
        this(i, str, str2);
        this.abortReason = str3;
    }

    public TimelineMessage() {
    }
}

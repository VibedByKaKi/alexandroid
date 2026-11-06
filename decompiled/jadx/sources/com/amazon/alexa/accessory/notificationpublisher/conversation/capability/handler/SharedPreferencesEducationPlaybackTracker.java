package com.amazon.alexa.accessory.notificationpublisher.conversation.capability.handler;

import android.content.SharedPreferences;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/handler/SharedPreferencesEducationPlaybackTracker;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/handler/EducationPlaybackTracker;", "prefs", "Landroid/content/SharedPreferences;", "key", "", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "playCount", "", "getPlayCount", "()I", "recordPlayed", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SharedPreferencesEducationPlaybackTracker implements EducationPlaybackTracker {

    @NotNull
    private final String key;

    @NotNull
    private final SharedPreferences prefs;

    public SharedPreferencesEducationPlaybackTracker(@NotNull SharedPreferences sharedPreferences, @NotNull String str) {
        sharedPreferences.getClass();
        str.getClass();
        this.prefs = sharedPreferences;
        this.key = str;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.capability.handler.EducationPlaybackTracker
    public int getPlayCount() {
        return this.prefs.getInt(this.key, 0);
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.capability.handler.EducationPlaybackTracker
    public void recordPlayed() {
        this.prefs.edit().putInt(this.key, getPlayCount() + 1).apply();
    }
}

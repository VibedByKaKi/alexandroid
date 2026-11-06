package com.amazon.alexa.ra.core.ui;

import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/ExternalEventSenderApi;", "", "sendActivityBackgroundBroadcast", "", "sendActivityForegroundedBroadcast", "sendOpenNowPlayingBroadcast", "sendOpenPersonalityStylesBroadcast", "", "sendRaExperienceReadyBroadcast", "sendNotificationBroadcast", "title", "", "text", "conversationId", "sendVoiceInteractionStartBroadcast", "sendVoiceInteractionFinishBroadcast", "sendRouteFromChatBroadcast", "intent", "Landroid/content/Intent;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ExternalEventSenderApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean sendOpenPersonalityStylesBroadcast(@NotNull ExternalEventSenderApi externalEventSenderApi) {
            return ExternalEventSenderApi.super.sendOpenPersonalityStylesBroadcast();
        }
    }

    void sendActivityBackgroundBroadcast();

    void sendActivityForegroundedBroadcast();

    void sendNotificationBroadcast(@NotNull String title, @NotNull String text, @NotNull String conversationId);

    void sendOpenNowPlayingBroadcast();

    default boolean sendOpenPersonalityStylesBroadcast() {
        return false;
    }

    void sendRaExperienceReadyBroadcast();

    void sendRouteFromChatBroadcast(@NotNull Intent intent);

    void sendVoiceInteractionFinishBroadcast();

    void sendVoiceInteractionStartBroadcast();
}

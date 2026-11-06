package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.playing;

import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/ConversationTtsDownloadRouter;", "", "<init>", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/ConversationTtsDownloadListener;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "notify", "requestId", "", "success", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationTtsDownloadRouter {

    @NotNull
    public static final ConversationTtsDownloadRouter INSTANCE = new ConversationTtsDownloadRouter();

    @Nullable
    private static volatile ConversationTtsDownloadListener listener;

    private ConversationTtsDownloadRouter() {
    }

    @JvmStatic
    public static final void notify(@NotNull String requestId, boolean success) {
        requestId.getClass();
        ConversationTtsDownloadListener conversationTtsDownloadListener = listener;
        if (conversationTtsDownloadListener != null) {
            conversationTtsDownloadListener.onConversationTtsDownloaded(requestId, success);
        }
    }

    @JvmStatic
    public static final void register(@Nullable ConversationTtsDownloadListener listener2) {
        listener = listener2;
    }
}

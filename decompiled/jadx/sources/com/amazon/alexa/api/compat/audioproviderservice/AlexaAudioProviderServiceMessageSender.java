package com.amazon.alexa.api.compat.audioproviderservice;

import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.api.compat.resultcallback.ResultCallbacks;
import com.amazon.alexa.api.compat.resultcallback.ResultCallbacksAdapter;
import com.amazon.alexa.api.messages.MessageReceiversManager;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010 \u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/amazon/alexa/api/compat/audioproviderservice/AlexaAudioProviderServiceMessageSender;", "", "binder", "Landroid/os/IBinder;", "messageReceiversManager", "Lcom/amazon/alexa/api/messages/MessageReceiversManager;", "<init>", "(Landroid/os/IBinder;Lcom/amazon/alexa/api/messages/MessageReceiversManager;)V", "messageSender", "Lcom/amazon/alexa/api/AlexaAudioProviderServiceMessageSender;", "getMessageSender$AlexaMobileAndroidVoiceSDKApiCompat_release", "()Lcom/amazon/alexa/api/AlexaAudioProviderServiceMessageSender;", "setMessageSender$AlexaMobileAndroidVoiceSDKApiCompat_release", "(Lcom/amazon/alexa/api/AlexaAudioProviderServiceMessageSender;)V", "setWakeWordConfidenceThreshold", "", "client", "Lcom/amazon/alexa/api/ExtendedClient;", "threshold", "", "resultCallbacks", "Lcom/amazon/alexa/api/compat/resultcallback/ResultCallbacks;", "setLocale", "locale", "", "setWakeWordRecognitionEnabled", "enabled", "", "isWakeWordRecognitionEnabled", "getLocale", "getSupportedLocales", "", "release", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaAudioProviderServiceMessageSender {

    @NotNull
    private final IBinder binder;

    @NotNull
    private final MessageReceiversManager messageReceiversManager;

    @NotNull
    private com.amazon.alexa.api.AlexaAudioProviderServiceMessageSender messageSender;

    public AlexaAudioProviderServiceMessageSender(@NotNull IBinder iBinder, @NotNull MessageReceiversManager messageReceiversManager) {
        iBinder.getClass();
        messageReceiversManager.getClass();
        this.binder = iBinder;
        this.messageReceiversManager = messageReceiversManager;
        this.messageSender = new com.amazon.alexa.api.AlexaAudioProviderServiceMessageSender(iBinder, messageReceiversManager);
    }

    @NotNull
    public final String getLocale(@NotNull ExtendedClient client) throws RemoteException {
        client.getClass();
        String locale = this.messageSender.getLocale(client);
        locale.getClass();
        return locale;
    }

    @NotNull
    /* renamed from: getMessageSender$AlexaMobileAndroidVoiceSDKApiCompat_release, reason: from getter */
    public final com.amazon.alexa.api.AlexaAudioProviderServiceMessageSender getMessageSender() {
        return this.messageSender;
    }

    @NotNull
    public final List<String> getSupportedLocales(@NotNull ExtendedClient client) throws RemoteException {
        client.getClass();
        List<String> supportedLocales = this.messageSender.getSupportedLocales(client);
        supportedLocales.getClass();
        return supportedLocales;
    }

    public final boolean isWakeWordRecognitionEnabled(@NotNull ExtendedClient client) throws RemoteException {
        client.getClass();
        return this.messageSender.isWakeWordRecognitionEnabled(client);
    }

    public final void release() {
        this.messageSender.release();
    }

    public final void setLocale(@NotNull ExtendedClient client, @NotNull String locale, @NotNull ResultCallbacks resultCallbacks) throws RemoteException {
        client.getClass();
        locale.getClass();
        resultCallbacks.getClass();
        this.messageSender.setLocale(client, locale, new ResultCallbacksAdapter(resultCallbacks));
    }

    public final /* synthetic */ void setMessageSender$AlexaMobileAndroidVoiceSDKApiCompat_release(com.amazon.alexa.api.AlexaAudioProviderServiceMessageSender alexaAudioProviderServiceMessageSender) {
        alexaAudioProviderServiceMessageSender.getClass();
        this.messageSender = alexaAudioProviderServiceMessageSender;
    }

    public final void setWakeWordConfidenceThreshold(@NotNull ExtendedClient client, int threshold, @NotNull ResultCallbacks resultCallbacks) throws RemoteException {
        client.getClass();
        resultCallbacks.getClass();
        this.messageSender.setWakeWordConfidenceThreshold(client, threshold, new ResultCallbacksAdapter(resultCallbacks));
    }

    public final void setWakeWordRecognitionEnabled(@NotNull ExtendedClient client, boolean enabled, @NotNull ResultCallbacks resultCallbacks) throws RemoteException {
        client.getClass();
        resultCallbacks.getClass();
        this.messageSender.setWakeWordRecognitionEnabled(client, enabled, new ResultCallbacksAdapter(resultCallbacks));
    }
}

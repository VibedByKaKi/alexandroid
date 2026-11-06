package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaArtifactDownloadListener;
import com.amazon.alexa.api.ArtifactDownloadListenerFailure;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ClientListenerContainer;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener;
import com.amazon.alexa.wakeword.davs.ArtifactModel;
import java.util.Iterator;
import java.util.Locale;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class WakeWordArtifactDownload implements ArtifactDownloadResultListener {
    private static final String TAG = "WakeWordArtifactDownload";
    private final ClientListenerContainer<AlexaArtifactDownloadListener> alexaArtifactDownloadListeners;

    public WakeWordArtifactDownload() {
        this.alexaArtifactDownloadListeners = new ClientListenerContainer<>();
    }

    private void onAlreadyUpToDate(ArtifactModel artifactModel) {
        synchronized (this.alexaArtifactDownloadListeners) {
            try {
                Iterator<AlexaArtifactDownloadListener> it2 = this.alexaArtifactDownloadListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onArtifactAlreadyUpToDate(Locale.forLanguageTag(artifactModel.getLocale()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void onFailure(ArtifactDownloadListenerFailure artifactDownloadListenerFailure) {
        synchronized (this.alexaArtifactDownloadListeners) {
            try {
                Iterator<AlexaArtifactDownloadListener> it2 = this.alexaArtifactDownloadListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onArtifactDownloadFailure(artifactDownloadListenerFailure);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void onSuccess(ArtifactModel artifactModel) {
        synchronized (this.alexaArtifactDownloadListeners) {
            try {
                Iterator<AlexaArtifactDownloadListener> it2 = this.alexaArtifactDownloadListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().onArtifactDownloadSuccess(Locale.forLanguageTag(artifactModel.getLocale()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void deregisterAlexaArtifactDownloadListener(AlexaArtifactDownloadListener alexaArtifactDownloadListener) {
        ExtendedClient remove = this.alexaArtifactDownloadListeners.remove(alexaArtifactDownloadListener);
        if (remove != null) {
            remove.getId();
        }
    }

    @Subscribe
    public void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        this.alexaArtifactDownloadListeners.removeAllClientListeners(clientDisconnectedEvent.getClient());
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactAlreadyUpToDate(long j, ArtifactModel artifactModel) {
        onAlreadyUpToDate(artifactModel);
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactDownloadFailure(long j, String str, Exception exc, String str2) {
        onFailure(ArtifactDownloadListenerFailure.DOWNLOAD);
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactDownloadInterrupted(long j) {
        onFailure(ArtifactDownloadListenerFailure.INTERRUPTION);
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactDownloadSuccess(long j, ArtifactModel artifactModel) {
        onSuccess(artifactModel);
    }

    public void registerAlexaArtifactDownloadListener(ExtendedClient extendedClient, AlexaArtifactDownloadListener alexaArtifactDownloadListener) {
        extendedClient.getId();
        this.alexaArtifactDownloadListeners.addListenerForClient(extendedClient, alexaArtifactDownloadListener);
    }

    @VisibleForTesting
    public WakeWordArtifactDownload(@NonNull ClientListenerContainer<AlexaArtifactDownloadListener> clientListenerContainer) {
        this.alexaArtifactDownloadListeners = clientListenerContainer;
    }
}

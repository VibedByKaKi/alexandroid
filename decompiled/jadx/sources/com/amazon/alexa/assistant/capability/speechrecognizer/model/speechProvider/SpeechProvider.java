package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 '2\u00020\u0001:\u0001'J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020!H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProvider;", "", PermissionsResponse.SCOPE_KEY, "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderScope;", "getScope", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderScope;", "wakeWordListener", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/WakeWordListener;", "getWakeWordListener", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/WakeWordListener;", "setWakeWordListener", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/WakeWordListener;)V", "volumeListener", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/VolumeListener;", "getVolumeListener", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/VolumeListener;", "setVolumeListener", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/VolumeListener;)V", "signalListener", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignalListener;", "getSignalListener", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignalListener;", "setSignalListener", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignalListener;)V", "dialogLifecycleListener", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/DialogLifecycleListener;", "getDialogLifecycleListener", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/DialogLifecycleListener;", "playbackLifecycleListener", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/PlaybackLifecycleListener;", "getPlaybackLifecycleListener", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/PlaybackLifecycleListener;", "start", "", "stop", "startCapture", "target", "Ljava/io/OutputStream;", "stopCapture", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SpeechProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProvider$Companion;", "", "<init>", "()V", "getIdentifier", "", "provider", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProvider;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final String getIdentifier(@NotNull SpeechProvider provider) {
            provider.getClass();
            return TableInfo$$ExternalSyntheticOutline0.m(System.identityHashCode(provider), provider.getClass().getName(), "@");
        }
    }

    @Nullable
    DialogLifecycleListener getDialogLifecycleListener();

    @Nullable
    PlaybackLifecycleListener getPlaybackLifecycleListener();

    @NotNull
    SpeechProviderScope getScope();

    @Nullable
    SpeechProviderSignalListener getSignalListener();

    @Nullable
    VolumeListener getVolumeListener();

    @Nullable
    WakeWordListener getWakeWordListener();

    void setSignalListener(@Nullable SpeechProviderSignalListener speechProviderSignalListener);

    void setVolumeListener(@Nullable VolumeListener volumeListener);

    void setWakeWordListener(@Nullable WakeWordListener wakeWordListener);

    void start();

    void startCapture(@NotNull OutputStream target) throws Exception;

    void stop();

    void stopCapture();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static DialogLifecycleListener getDialogLifecycleListener(@NotNull SpeechProvider speechProvider) {
            return null;
        }

        @Nullable
        public static PlaybackLifecycleListener getPlaybackLifecycleListener(@NotNull SpeechProvider speechProvider) {
            return null;
        }

        @NotNull
        public static SpeechProviderScope getScope(@NotNull SpeechProvider speechProvider) {
            return SpeechProviderScope.DEFAULT;
        }

        public static void start(@NotNull SpeechProvider speechProvider) {
        }

        public static void stop(@NotNull SpeechProvider speechProvider) {
        }

        public static void stopCapture(@NotNull SpeechProvider speechProvider) {
        }
    }
}

package com.amazon.alexa.wakeword.pryon;

import com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/wakeword/pryon/WakeWordDownloadManager;", "", "downloadWakeWordModelAsync", "", "userParams", "Lcom/amazon/alexa/wakeword/pryon/WakeWordModelUserParams;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/wakeword/davs/ArtifactDownloadResultListener;", "initUpdatesCycle", "release", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface WakeWordDownloadManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void downloadWakeWordModelAsync(@NotNull WakeWordDownloadManager wakeWordDownloadManager, @NotNull WakeWordModelUserParams wakeWordModelUserParams) {
            wakeWordModelUserParams.getClass();
            wakeWordDownloadManager.downloadWakeWordModelAsync(wakeWordModelUserParams, null);
        }

        public static /* synthetic */ void downloadWakeWordModelAsync$default(WakeWordDownloadManager wakeWordDownloadManager, WakeWordModelUserParams wakeWordModelUserParams, ArtifactDownloadResultListener artifactDownloadResultListener, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: downloadWakeWordModelAsync");
                return;
            }
            if ((i & 2) != 0) {
                artifactDownloadResultListener = null;
            }
            wakeWordDownloadManager.downloadWakeWordModelAsync(wakeWordModelUserParams, artifactDownloadResultListener);
        }
    }

    void downloadWakeWordModelAsync(@NotNull WakeWordModelUserParams userParams);

    void downloadWakeWordModelAsync(@NotNull WakeWordModelUserParams userParams, @Nullable ArtifactDownloadResultListener listener);

    void initUpdatesCycle();

    void release();
}

package com.amazon.alexa.wakeword.speakerverification.enrollment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener;
import com.amazon.alexa.wakeword.pryon.WakeWordDownloadManager;
import com.amazon.alexa.wakeword.pryon.WakeWordModelUserParams;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NullWakeWordDownloadManager implements WakeWordDownloadManager {
    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDownloadManager
    public void downloadWakeWordModelAsync(@NonNull WakeWordModelUserParams wakeWordModelUserParams, @Nullable ArtifactDownloadResultListener artifactDownloadResultListener) {
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDownloadManager
    public void initUpdatesCycle() {
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDownloadManager
    public void release() {
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDownloadManager
    public void downloadWakeWordModelAsync(@NonNull WakeWordModelUserParams wakeWordModelUserParams) {
    }
}

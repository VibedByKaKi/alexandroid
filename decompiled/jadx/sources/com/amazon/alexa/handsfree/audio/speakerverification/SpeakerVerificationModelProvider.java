package com.amazon.alexa.handsfree.audio.speakerverification;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.wakeword.davs.ArtifactModel;
import com.amazon.alexa.wakeword.speakerverification.model.ModelType;
import com.amazon.alexa.wakeword.speakerverification.model.SpeakerVerificationModelContentProviderUtility;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class SpeakerVerificationModelProvider {
    @Nullable
    public ArtifactModel getArtifactModel(@NonNull Context context) {
        return SpeakerVerificationModelContentProviderUtility.getArtifactModel(context, ModelType.CLASSIFICATION);
    }
}

package com.amazon.alexa.wakeword.speakerverification.sync;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.wakeword.davs.ArtifactManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeakerVerificationSyncArtifactManager extends ArtifactManager {
    private static final String TAG = "SpeakerVerificationSyncArtifactManager";
    private Context mContext;
    private SpeakerVerificationSyncInterface mSpeakerVerificationSync;

    public SpeakerVerificationSyncArtifactManager(Context context) {
        this(context, new SpeakerVerificationSyncInterface() { // from class: com.amazon.alexa.wakeword.speakerverification.sync.SpeakerVerificationSyncArtifactManager.1
            @Override // com.amazon.alexa.wakeword.speakerverification.sync.SpeakerVerificationSyncInterface
            public Uri getFileFromSync(String str) {
                Log.d(SpeakerVerificationSyncArtifactManager.TAG, "Sync not yet implemented");
                return null;
            }
        });
    }

    private boolean getArtifactFromSync(String str) {
        return this.mSpeakerVerificationSync.getFileFromSync(str) != null;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactManager
    public synchronized boolean hasArtifact(String str) {
        boolean z;
        Log.d(TAG, "checking for artifact: " + str);
        if (!hasLocalArtifactFile(str)) {
            z = getArtifactFromSync(str);
        }
        return z;
    }

    @VisibleForTesting
    public boolean hasLocalArtifactFile(String str) {
        return super.hasArtifact(str);
    }

    @VisibleForTesting
    public SpeakerVerificationSyncArtifactManager(Context context, SpeakerVerificationSyncInterface speakerVerificationSyncInterface) {
        super(context);
        this.mContext = context;
        this.mSpeakerVerificationSync = speakerVerificationSyncInterface;
    }
}

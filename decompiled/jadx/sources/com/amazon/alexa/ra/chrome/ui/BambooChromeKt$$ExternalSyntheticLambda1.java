package com.amazon.alexa.ra.chrome.ui;

import android.content.Context;
import android.view.Choreographer;
import androidx.compose.runtime.MutableState;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class BambooChromeKt$$ExternalSyntheticLambda1 implements Choreographer.FrameCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BambooChromeKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.$r8$classId) {
            case 0:
                BambooChromeKt.BambooChrome$lambda$11$lambda$10((AtomicBoolean) this.f$0, (MutableState) this.f$1, j);
                break;
            default:
                ((ProfileInstallerInitializer) this.f$0).lambda$create$0((Context) this.f$1, j);
                break;
        }
    }
}

package com.amazon.apl.player.tts;

import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TtsPlayer$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TtsPlayer f$0;
    public final /* synthetic */ InputStream f$1;

    public /* synthetic */ TtsPlayer$$ExternalSyntheticLambda2(TtsPlayer ttsPlayer, InputStream inputStream, int i) {
        this.$r8$classId = i;
        this.f$0 = ttsPlayer;
        this.f$1 = inputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$prepare$2(this.f$1);
                break;
            default:
                this.f$0.lambda$prepare$0(this.f$1);
                break;
        }
    }
}

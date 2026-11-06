package com.amazon.apl.player.tts;

import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TtsPlayer$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TtsPlayer f$0;
    public final /* synthetic */ URL f$1;

    public /* synthetic */ TtsPlayer$$ExternalSyntheticLambda4(TtsPlayer ttsPlayer, URL url, int i) {
        this.$r8$classId = i;
        this.f$0 = ttsPlayer;
        this.f$1 = url;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$prepare$1(this.f$1);
                break;
            default:
                this.f$0.lambda$prepare$3(this.f$1);
                break;
        }
    }
}

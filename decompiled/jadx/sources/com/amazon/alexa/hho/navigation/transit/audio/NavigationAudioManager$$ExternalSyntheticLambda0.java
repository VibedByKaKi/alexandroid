package com.amazon.alexa.hho.navigation.transit.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class NavigationAudioManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavigationAudioManager f$0;

    public /* synthetic */ NavigationAudioManager$$ExternalSyntheticLambda0(NavigationAudioManager navigationAudioManager, int i) {
        this.$r8$classId = i;
        this.f$0 = navigationAudioManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        NavigationAudioManager navigationAudioManager = this.f$0;
        switch (i) {
            case 0:
                NavigationAudioManager.onAudioFocusGained$lambda$1(navigationAudioManager);
                break;
            case 1:
                NavigationAudioManager.resume$lambda$7(navigationAudioManager);
                break;
            case 2:
                NavigationAudioManager.pause$lambda$6(navigationAudioManager);
                break;
            case 3:
                NavigationAudioManager.onAudioFocusLost$lambda$2(navigationAudioManager);
                break;
            case 4:
                navigationAudioManager.createPlayer();
                break;
            case 5:
                NavigationAudioManager.stop$lambda$5(navigationAudioManager);
                break;
            default:
                NavigationAudioManager.release$lambda$9(navigationAudioManager);
                break;
        }
    }
}

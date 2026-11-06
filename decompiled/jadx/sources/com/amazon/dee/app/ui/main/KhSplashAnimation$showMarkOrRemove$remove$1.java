package com.amazon.dee.app.ui.main;

import android.view.View;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"com/amazon/dee/app/ui/main/KhSplashAnimation$showMarkOrRemove$remove$1", "Ljava/lang/Runnable;", "done", "", "run", "", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KhSplashAnimation$showMarkOrRemove$remove$1 implements Runnable {
    final /* synthetic */ View $overlay;
    private boolean done;

    public KhSplashAnimation$showMarkOrRemove$remove$1(View view) {
        this.$overlay = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.$overlay.removeCallbacks(this);
        KhSplashAnimation khSplashAnimation = KhSplashAnimation.INSTANCE;
        View view = this.$overlay;
        view.getClass();
        khSplashAnimation.fadeOutAndRemove(view);
    }
}

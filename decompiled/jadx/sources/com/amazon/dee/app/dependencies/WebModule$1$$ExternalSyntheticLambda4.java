package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.dependencies.WebModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class WebModule$1$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebModule.AnonymousClass1 f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ WebModule$1$$ExternalSyntheticLambda4(WebModule.AnonymousClass1 anonymousClass1, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setFullScreen$0(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setYourSkillsVisible$6(this.f$1);
                break;
            case 2:
                this.f$0.lambda$setHeaderVisible$1(this.f$1);
                break;
            case 3:
                this.f$0.lambda$setNowPlaying$5(this.f$1);
                break;
            default:
                this.f$0.lambda$setHouseholdVisible$10(this.f$1);
                break;
        }
    }
}

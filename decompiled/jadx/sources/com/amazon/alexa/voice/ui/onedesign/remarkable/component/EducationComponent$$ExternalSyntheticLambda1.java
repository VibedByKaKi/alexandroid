package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class EducationComponent$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EducationComponent f$0;

    public /* synthetic */ EducationComponent$$ExternalSyntheticLambda1(EducationComponent educationComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = educationComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        EducationComponent educationComponent = this.f$0;
        switch (i) {
            case 0:
                educationComponent.lambda$hide$1();
                break;
            default:
                educationComponent.lambda$show$0();
                break;
        }
    }
}

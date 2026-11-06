package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TextComponent$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextComponent f$0;

    public /* synthetic */ TextComponent$$ExternalSyntheticLambda0(TextComponent textComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = textComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        TextComponent textComponent = this.f$0;
        switch (i) {
            case 0:
                textComponent.lambda$hideKeyboard$1();
                break;
            default:
                textComponent.lambda$showKeyboard$0();
                break;
        }
    }
}

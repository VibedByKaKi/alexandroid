package com.amazon.alexa.client.alexaservice.ui.conversations;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConversationsAuthority$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConversationsAuthority f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ConversationsAuthority$$ExternalSyntheticLambda1(ConversationsAuthority conversationsAuthority, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = conversationsAuthority;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deliverItemFragments$2(this.f$1);
                break;
            default:
                this.f$0.lambda$getFragments$4(this.f$1);
                break;
        }
    }
}

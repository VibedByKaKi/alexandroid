package androidx.activity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ComponentActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComponentActivity f$0;

    public /* synthetic */ ComponentActivity$$ExternalSyntheticLambda0(ComponentActivity componentActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ComponentActivity componentActivity = this.f$0;
        switch (i) {
            case 0:
                ComponentActivity.menuHostHelper$lambda$0(componentActivity);
                break;
            default:
                ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$0(componentActivity);
                break;
        }
    }
}

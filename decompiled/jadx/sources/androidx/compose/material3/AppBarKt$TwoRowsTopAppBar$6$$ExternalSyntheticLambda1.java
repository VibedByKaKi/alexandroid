package androidx.compose.material3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class AppBarKt$TwoRowsTopAppBar$6$$ExternalSyntheticLambda1 implements ScrolledOffset {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TopAppBarScrollBehavior f$0;

    public /* synthetic */ AppBarKt$TwoRowsTopAppBar$6$$ExternalSyntheticLambda1(TopAppBarScrollBehavior topAppBarScrollBehavior, int i) {
        this.$r8$classId = i;
        this.f$0 = topAppBarScrollBehavior;
    }

    @Override // androidx.compose.material3.ScrolledOffset
    public final float offset() {
        float invoke$lambda$3$lambda$2$lambda$1;
        float invoke$lambda$1$lambda$0;
        int i = this.$r8$classId;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f$0;
        switch (i) {
            case 0:
                invoke$lambda$3$lambda$2$lambda$1 = AppBarKt$TwoRowsTopAppBar$6.invoke$lambda$3$lambda$2$lambda$1(topAppBarScrollBehavior);
                return invoke$lambda$3$lambda$2$lambda$1;
            default:
                invoke$lambda$1$lambda$0 = AppBarKt$SingleRowTopAppBar$3.invoke$lambda$1$lambda$0(topAppBarScrollBehavior);
                return invoke$lambda$1$lambda$0;
        }
    }
}

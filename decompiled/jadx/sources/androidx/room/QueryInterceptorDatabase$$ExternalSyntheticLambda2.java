package androidx.room;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class QueryInterceptorDatabase$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ QueryInterceptorDatabase f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ QueryInterceptorDatabase$$ExternalSyntheticLambda2(QueryInterceptorDatabase queryInterceptorDatabase, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = queryInterceptorDatabase;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                QueryInterceptorDatabase.execSQL$lambda$10(this.f$0, this.f$1);
                break;
            default:
                QueryInterceptorDatabase.query$lambda$6(this.f$0, this.f$1);
                break;
        }
    }
}

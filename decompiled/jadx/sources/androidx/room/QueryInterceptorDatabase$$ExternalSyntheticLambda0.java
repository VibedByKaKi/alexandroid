package androidx.room;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class QueryInterceptorDatabase$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ QueryInterceptorDatabase f$0;

    public /* synthetic */ QueryInterceptorDatabase$$ExternalSyntheticLambda0(QueryInterceptorDatabase queryInterceptorDatabase, int i) {
        this.$r8$classId = i;
        this.f$0 = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        QueryInterceptorDatabase queryInterceptorDatabase = this.f$0;
        switch (i) {
            case 0:
                QueryInterceptorDatabase.endTransaction$lambda$4(queryInterceptorDatabase);
                break;
            case 1:
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(queryInterceptorDatabase);
                break;
            case 2:
                QueryInterceptorDatabase.beginTransaction$lambda$0(queryInterceptorDatabase);
                break;
            case 3:
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(queryInterceptorDatabase);
                break;
            case 4:
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(queryInterceptorDatabase);
                break;
            default:
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(queryInterceptorDatabase);
                break;
        }
    }
}

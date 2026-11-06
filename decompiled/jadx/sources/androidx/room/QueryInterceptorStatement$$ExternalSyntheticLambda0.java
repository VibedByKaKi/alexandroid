package androidx.room;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class QueryInterceptorStatement$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ QueryInterceptorStatement f$0;

    public /* synthetic */ QueryInterceptorStatement$$ExternalSyntheticLambda0(QueryInterceptorStatement queryInterceptorStatement, int i) {
        this.$r8$classId = i;
        this.f$0 = queryInterceptorStatement;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        QueryInterceptorStatement queryInterceptorStatement = this.f$0;
        switch (i) {
            case 0:
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(queryInterceptorStatement);
                break;
            case 1:
                QueryInterceptorStatement.executeInsert$lambda$2(queryInterceptorStatement);
                break;
            case 2:
                QueryInterceptorStatement.simpleQueryForString$lambda$4(queryInterceptorStatement);
                break;
            case 3:
                QueryInterceptorStatement.execute$lambda$0(queryInterceptorStatement);
                break;
            default:
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(queryInterceptorStatement);
                break;
        }
    }
}

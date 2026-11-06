package com.google.android.material.search;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SearchBar$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SearchBar$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((SearchBar) obj).lambda$startOnLoadAnimation$0();
                break;
            case 1:
                ((SearchViewAnimationHelper) obj).hide();
                break;
            case 2:
                ((SearchViewAnimationHelper) obj).lambda$startShowAnimationExpand$0();
                break;
            default:
                ((SearchViewAnimationHelper) obj).lambda$startShowAnimationTranslate$1();
                break;
        }
    }
}

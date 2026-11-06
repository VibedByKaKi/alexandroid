package com.google.android.material.search;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SearchView f$0;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda1(SearchView searchView, int i) {
        this.$r8$classId = i;
        this.f$0 = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SearchView searchView = this.f$0;
        switch (i) {
            case 0:
                searchView.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 1:
                searchView.show();
                break;
            case 2:
                searchView.lambda$clearFocusAndHideKeyboard$9();
                break;
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}

package com.google.android.material.search;

import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBarAnimationHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SearchBarAnimationHelper$$ExternalSyntheticLambda1 implements SearchBarAnimationHelper.OnLoadAnimationInvocation {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SearchBarAnimationHelper$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        switch (this.$r8$classId) {
            case 0:
                onLoadAnimationCallback.onAnimationStart();
                break;
            default:
                onLoadAnimationCallback.onAnimationEnd();
                break;
        }
    }
}

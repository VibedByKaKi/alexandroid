package com.amazon.photos.uploader.internal.livedata;

import androidx.lifecycle.Observer;
import com.amazon.photos.uploader.internal.livedata.QueueBlockerLiveDataProvider;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunningRequestProvider$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ RunningRequestProvider$$ExternalSyntheticLambda1(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                RunningRequestProvider.attachThrottledLiveData$lambda$1(function1, obj);
                break;
            case 1:
                GlobalBlockerLiveDataProvider.attachGlobalBlockerLiveData$lambda$1(function1, obj);
                break;
            case 2:
                QueueBlockerLiveDataProvider.attachQueueBlockerLiveData$lambda$2(function1, obj);
                break;
            case 3:
                QueueBlockerLiveDataProvider.MultiQueueLiveData._init_$lambda$0(function1, obj);
                break;
            default:
                RunningRequestProvider.attachThrottledTotalProgressLiveData$lambda$3(function1, obj);
                break;
        }
    }
}

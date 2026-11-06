package com.amazon.alexa.biloba.utils;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.paging.LivePagedList;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class LiveDataUtils {
    private static final String TAG = "LiveDataUtils";

    private LiveDataUtils() {
    }

    private static <T> T getLiveDataEqual(T t, T t2, LiveData<T>... liveDataArr) {
        for (LiveData<T> liveData : liveDataArr) {
            if (liveData != null && Objects.equals(liveData.getValue(), t)) {
                return t;
            }
        }
        return t2;
    }

    private static <T> T getLiveDataNotEqual(T t, @NonNull LiveData<T>... liveDataArr) {
        for (LiveData<T> liveData : liveDataArr) {
            if (liveData != null && !Objects.equals(liveData.getValue(), t)) {
                return liveData.getValue();
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$mergeLiveDataEqual$1(MediatorLiveData mediatorLiveData, Object obj, Object obj2, LiveData[] liveDataArr, Object obj3) {
        mediatorLiveData.setValue(getLiveDataEqual(obj, obj2, liveDataArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$mergeLiveDataNotEqual$0(MediatorLiveData mediatorLiveData, Object obj, LiveData[] liveDataArr, Object obj2) {
        mediatorLiveData.setValue(getLiveDataNotEqual(obj, liveDataArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void mergeLiveDataEqual(final T t, final T t2, @NonNull final MediatorLiveData<T> mediatorLiveData, @NonNull final LiveData<T>... liveDataArr) {
        mediatorLiveData.setValue(t2);
        for (LivePagedList livePagedList : liveDataArr) {
            mediatorLiveData.addSource(livePagedList, new Observer() { // from class: com.amazon.alexa.biloba.utils.LiveDataUtils$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LiveDataUtils.lambda$mergeLiveDataEqual$1(MediatorLiveData.this, t, t2, liveDataArr, obj);
                }
            });
        }
    }

    public static <T> void mergeLiveDataEqualTrue(@NonNull MediatorLiveData<Boolean> mediatorLiveData, @NonNull LiveData<Boolean>... liveDataArr) {
        mergeLiveDataEqual(Boolean.TRUE, Boolean.FALSE, mediatorLiveData, liveDataArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void mergeLiveDataNotEqual(final T t, @NonNull final MediatorLiveData<T> mediatorLiveData, @NonNull final LiveData<T>... liveDataArr) {
        mediatorLiveData.setValue(t);
        for (LivePagedList livePagedList : liveDataArr) {
            mediatorLiveData.addSource(livePagedList, new Observer() { // from class: com.amazon.alexa.biloba.utils.LiveDataUtils$$ExternalSyntheticLambda1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LiveDataUtils.lambda$mergeLiveDataNotEqual$0(mediatorLiveData, t, liveDataArr, obj);
                }
            });
        }
    }

    public static <T> void mergeLiveDataNotNull(@NonNull MediatorLiveData<T> mediatorLiveData, @NonNull LiveData<T>... liveDataArr) {
        mergeLiveDataNotEqual(null, mediatorLiveData, liveDataArr);
    }
}

package com.amazon.apl.android.dependencies;

import androidx.annotation.NonNull;
import com.amazon.alexa.voiceui.ra.RaInteractor$$ExternalSyntheticLambda2;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IContentRetriever<S, T> {
    public static final int DEFAULT_ERROR_CODE = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FailureCallback<S> {
        void onFailure(@NonNull S s, @NonNull String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FailureCallbackV2<S> {
        void onFailure(@NonNull S s, @NonNull String str, @NonNull int i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SuccessCallback<S, T> {
        void onSuccess(@NonNull S s, @NonNull T t);
    }

    void fetch(@NonNull S s, @NonNull SuccessCallback<S, T> successCallback, @NonNull FailureCallback<S> failureCallback);

    default void fetchV2(@NonNull S s, @NonNull SuccessCallback<S, T> successCallback, @NonNull FailureCallbackV2<S> failureCallbackV2) {
        fetch(s, successCallback, new RaInteractor$$ExternalSyntheticLambda2(failureCallbackV2, 5));
    }

    default void fetchV2(@NonNull S s, @NonNull Map<String, String> map, @NonNull SuccessCallback<S, T> successCallback, @NonNull FailureCallbackV2<S> failureCallbackV2) {
        fetchV2(s, successCallback, failureCallbackV2);
    }
}

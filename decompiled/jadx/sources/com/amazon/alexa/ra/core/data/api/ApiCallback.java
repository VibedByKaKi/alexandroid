package com.amazon.alexa.ra.core.data.api;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallbacksBundleKeys;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/data/api/ApiCallback;", "", "id", "", "getId", "()Ljava/lang/String;", ApiCallbacksBundleKeys.TIMEOUT_VALUE, "", "getTimeoutValue", "()Ljava/lang/Long;", ApiCallbacksBundleKeys.TIMEOUT_UNIT, "Ljava/util/concurrent/TimeUnit;", "getTimeoutUnit", "()Ljava/util/concurrent/TimeUnit;", "onSuccess", "", "onFailure", SendEventResultBundleKeys.FAILURE, "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ApiCallback {
    @NotNull
    String getId();

    @Nullable
    TimeUnit getTimeoutUnit();

    @Nullable
    Long getTimeoutValue();

    void onFailure(@Nullable ApiFailure failure);

    void onSuccess();
}

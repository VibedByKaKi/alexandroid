package com.amazon.alexa.biloba.view;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface BilobaViewModel {
    void create(@Nullable Bundle bundle);

    void destroy();

    LiveData<Throwable> getError();

    String getErrorViewMetricName();

    LiveData<Boolean> getIsLoading();

    void sendRequest();
}

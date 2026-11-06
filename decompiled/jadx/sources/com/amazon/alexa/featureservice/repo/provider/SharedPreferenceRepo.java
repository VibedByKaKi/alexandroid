package com.amazon.alexa.featureservice.repo.provider;

import com.amazon.alexa.featureservice.repo.model.AppStartStatus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SharedPreferenceRepo {
    AppStartStatus getAppStartStatus();

    void setAppStartStatus(long j, long j2, long j3);

    void setBugSnagCompleteTime(long j);

    void setIncompleteStartCount(long j);
}

package com.amazon.clouddrive.configuration;

import com.amazon.clouddrive.internal.BasicSourceInfo;
import com.amazon.clouddrive.model.SetupSourceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SourceInfoCache {
    void cacheSourceInfo(BasicSourceInfo basicSourceInfo);

    void clear();

    SetupSourceRequest getSetupSourceRequest();

    BasicSourceInfo getSourceInfo();

    boolean isSourceInfoCached();
}

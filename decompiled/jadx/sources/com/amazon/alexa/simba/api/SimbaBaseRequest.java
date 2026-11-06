package com.amazon.alexa.simba.api;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010%\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0012\u0010\r\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0012\u0010\u000f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u0012\u0010\u0011\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/simba/api/SimbaBaseRequest;", "", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "clientRequestId", "getClientRequestId", "isTestTraffic", "", "()Ljava/lang/Boolean;", "locale", "getLocale", "marketplaceId", "getMarketplaceId", "platform", "getPlatform", "platformVersion", "getPlatformVersion", "toMap", "", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface SimbaBaseRequest {
    @NotNull
    String getAppVersion();

    @NotNull
    String getClientRequestId();

    @NotNull
    String getLocale();

    @NotNull
    String getMarketplaceId();

    @NotNull
    String getPlatform();

    @NotNull
    String getPlatformVersion();

    @Nullable
    Boolean isTestTraffic();

    @NotNull
    Map<String, String> toMap();
}

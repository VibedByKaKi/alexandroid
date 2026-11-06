package com.amazon.dee.app.services.entitlement;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/entitlement/EntitlementCallback;", "", "onEntitled", "", "onNotEntitled", "onError", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EntitlementCallback {
    void onEntitled();

    void onError();

    void onNotEntitled();
}

package com.amazon.dee.app.services.metrics;

import com.amazon.alexa.ttcf.api.TTCFRoute;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/TTCFTrailingRoute;", "Lcom/amazon/alexa/ttcf/api/TTCFRoute;", ShortcutConstants.METRIC_NAME_KEY, "", "getMetricName", "()Ljava/lang/String;", "startTime", "", "getStartTime", "()J", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TTCFTrailingRoute extends TTCFRoute {
    @NotNull
    String getMetricName();

    long getStartTime();
}

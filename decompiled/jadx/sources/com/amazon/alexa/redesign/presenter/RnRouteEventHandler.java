package com.amazon.alexa.redesign.presenter;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.api.EventBusListener;
import com.amazon.alexa.redesign.domain.PublishEventBusMessageUseCase;
import com.amazon.alexa.redesign.utils.Constants;
import com.amazon.alexa.routing.api.RoutingService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/redesign/presenter/RnRouteEventHandler;", "Lcom/amazon/alexa/redesign/api/EventBusListener;", "routingService", "Lcom/amazon/alexa/routing/api/RoutingService;", "eventBus", "Lcom/amazon/alexa/redesign/domain/PublishEventBusMessageUseCase;", "<init>", "(Lcom/amazon/alexa/routing/api/RoutingService;Lcom/amazon/alexa/redesign/domain/PublishEventBusMessageUseCase;)V", "execute", "", "jsonObject", "Lorg/json/JSONObject;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RnRouteEventHandler implements EventBusListener {
    public static final int $stable = 8;

    @NotNull
    private final PublishEventBusMessageUseCase eventBus;

    @NotNull
    private final RoutingService routingService;

    public RnRouteEventHandler(@NotNull RoutingService routingService, @NotNull PublishEventBusMessageUseCase publishEventBusMessageUseCase) {
        routingService.getClass();
        publishEventBusMessageUseCase.getClass();
        this.routingService = routingService;
        this.eventBus = publishEventBusMessageUseCase;
    }

    @Override // com.amazon.alexa.redesign.api.EventBusListener
    public void execute(@NotNull JSONObject jsonObject) {
        jsonObject.getClass();
        try {
            RoutingService.RoutingBuilder match = this.routingService.match(jsonObject.optString("route"));
            if (match == null) {
                this.eventBus.publishEventBusMessage(Constants.EVENT_BUS_ROUTE_REQUEST_FAILED);
            } else {
                match.addToBackStack().navigate();
            }
        } catch (Exception e) {
            this.eventBus.publishEventBusMessage(Constants.EVENT_BUS_ROUTE_REQUEST_FAILED);
            Log.e("[RNRouteListener]", "Failed to route using Native routing service.", e);
        }
    }
}

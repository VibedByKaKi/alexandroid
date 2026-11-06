package com.amazon.alexa.digitalcommerce.subscriptions;

import android.content.Context;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.benefits.api.models.BenefitsObserver;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.PeekBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.RepositoryCallback;
import com.amazon.alexa.benefits.api.models.SubscribeBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.metrics.MetricsConstants;
import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.digitalcommerce.api.GetProductDetailsResponse;
import com.amazon.alexa.digitalcommerce.eventbus.IAPSubscription;
import com.amazon.alexa.digitalcommerce.notifications.SchedulePurchaseNotificationRequest;
import com.amazon.alexa.permissions.api.PermissionsService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J8\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000fH&J<\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00142\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0014\u0012\u0004\u0012\u00020\u00030\u000fH&J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\rH&J@\u0010\u001b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000fH&J\u001c\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020$H&¨\u0006%"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/subscriptions/SubscriptionsManager;", "", MetricsConstants.OperationalMetrics.GET_BENEFITS_ENTITLEMENT, "", MissingTokenPull.TRIGGER_REQUEST, "Lcom/amazon/alexa/benefits/api/models/GetBenefitsEntitlementRequest;", "responseCallback", "Lcom/amazon/alexa/benefits/api/models/RepositoryCallback;", "Lcom/amazon/alexa/benefits/api/models/GetBenefitsEntitlementResponse;", "peekBenefitsEntitlement", "Lcom/amazon/alexa/benefits/api/models/PeekBenefitsEntitlementResponse;", "getEmpOffers", "canonicalProductId", "", "successCallback", "Lkotlin/Function1;", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse;", "errorCallback", "", "getProductEntitlement", "", "subscribeBenefitsEntitlement", "Lcom/amazon/alexa/benefits/api/models/SubscribeBenefitsEntitlementRequest;", "observer", "Lcom/amazon/alexa/benefits/api/models/BenefitsObserver;", "unsubscribeBenefitsEntitlement", WebConstants.UriConstants.SUBSCRIPTION_ID, "purchaseEmpOffer", "externalProductIdentifier", "Lcom/amazon/alexa/digitalcommerce/eventbus/IAPSubscription;", "initialize", "activityContext", "Landroid/content/Context;", "service", "Lcom/amazon/alexa/permissions/api/PermissionsService;", "schedulePurchaseNotification", "Lcom/amazon/alexa/digitalcommerce/notifications/SchedulePurchaseNotificationRequest;", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SubscriptionsManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void initialize$default(SubscriptionsManager subscriptionsManager, Context context, PermissionsService permissionsService, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: initialize");
                return;
            }
            if ((i & 2) != 0) {
                permissionsService = null;
            }
            subscriptionsManager.initialize(context, permissionsService);
        }
    }

    void getBenefitsEntitlement(@NotNull GetBenefitsEntitlementRequest request, @NotNull RepositoryCallback<GetBenefitsEntitlementResponse> responseCallback);

    void getEmpOffers(@NotNull String canonicalProductId, @NotNull Function1<? super GetProductDetailsResponse, Unit> successCallback, @NotNull Function1<? super Throwable, Unit> errorCallback);

    void getProductEntitlement(@NotNull Map<String, ? extends Object> request, @NotNull Function1<? super Map<String, ? extends Object>, Unit> responseCallback);

    void initialize(@NotNull Context activityContext);

    void initialize(@NotNull Context activityContext, @Nullable PermissionsService service);

    @NotNull
    PeekBenefitsEntitlementResponse peekBenefitsEntitlement(@NotNull GetBenefitsEntitlementRequest request);

    void purchaseEmpOffer(@NotNull String canonicalProductId, @NotNull String externalProductIdentifier, @NotNull Function1<? super IAPSubscription, Unit> successCallback, @NotNull Function1<? super Throwable, Unit> errorCallback);

    void schedulePurchaseNotification(@NotNull SchedulePurchaseNotificationRequest request);

    @NotNull
    String subscribeBenefitsEntitlement(@NotNull SubscribeBenefitsEntitlementRequest request, @NotNull BenefitsObserver observer);

    void unsubscribeBenefitsEntitlement(@NotNull String subscriptionId);
}

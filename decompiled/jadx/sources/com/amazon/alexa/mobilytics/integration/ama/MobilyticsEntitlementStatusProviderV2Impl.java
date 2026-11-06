package com.amazon.alexa.mobilytics.integration.ama;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.benefits.api.BenefitsService;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.PeekMultipleBenefitsRequest;
import com.amazon.alexa.benefits.api.models.PeekMultipleBenefitsResponse;
import com.amazon.alexa.benefits.api.models.SubscribeBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.Subscription;
import com.amazon.alexa.benefits.api.models.enums.EntitlementStatus;
import com.amazon.alexa.benefits.metrics.MetricsConstants;
import com.amazon.alexa.crashreporting.api.CrashMetadata;
import com.amazon.alexa.eventbus.stub.FakeEventBus$$ExternalSyntheticLambda0;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.configuration.BenefitConstants;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.identity.message.eventBus.MobilyticsEventBusMessageType;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.alexa.sharing.sharingsdk.BenefitsEntitlementAuthority$$ExternalSyntheticLambda0;
import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class MobilyticsEntitlementStatusProviderV2Impl implements MobilyticsEntitlementStatusProviderV2 {
    private static final String BENEFITS_STATUS_KEY = "BenefitsStatus";
    private static final String ENTITLED_BENEFITS_KEY = "entitled-benefits";
    private static final String ENTITLEMENT_KEY = "entitlement_status";
    private static final String PERFORMANCE_ENTITLEMENT_MIGRATION = "ALEXA_MOBILE_PERFORMANCE_ENTITLEMENT_MIGRATION_ANDROID";
    private static final String PERFORMANCE_NAMESPACE = "ALEXA_MOBILE_PERFORMANCE";
    private static final String TAG = Log.tag((Class<?>) MobilyticsEntitlementStatusProviderV2Impl.class);
    private BenefitsService benefitsService;
    private Subscription bmclSubscription;
    private Subscription bmclSubscriptionCore;
    private Subscription bmclSubscriptionMoneypenny;
    private Subscription bmclSubscriptionMoonraker;
    private CrashMetadata crashMetadata;
    private long currentStatus;
    private String entitledBenefit;
    private volatile List<String> entitledBenefits;
    private MobilyticsEntitlementStatus entitlementStatus;
    public boolean hasBenefitsStatusCacheFeature;
    private final List<MobilyticsEntitlementStatusProviderV2.Listener> listeners;
    private PersistentStorage persistentStorage;
    private List<String> premiumBenefitLabels;
    private boolean statusCacheCleared;

    @Inject
    public MobilyticsEntitlementStatusProviderV2Impl() {
        this.currentStatus = 2L;
        this.entitledBenefit = BenefitConstants.BENEFIT_NOT_ENTITLED;
        List<String> list = Collections.EMPTY_LIST;
        this.premiumBenefitLabels = list;
        this.entitledBenefits = list;
        this.listeners = new ArrayList();
        this.hasBenefitsStatusCacheFeature = false;
        this.statusCacheCleared = false;
        try {
            ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
            if (componentRegistry != null) {
                if (componentRegistry.get(BenefitsService.class).isPresent()) {
                    this.benefitsService = (BenefitsService) componentRegistry.get(BenefitsService.class).get();
                }
                if (componentRegistry.get(CrashMetadata.class).isPresent()) {
                    this.crashMetadata = (CrashMetadata) componentRegistry.get(CrashMetadata.class).get();
                }
                if (componentRegistry.get(PersistentStorage.Factory.class).isPresent()) {
                    PersistentStorage create = ((PersistentStorage.Factory) componentRegistry.get(PersistentStorage.Factory.class).get()).create("mobilytics.benefits-status");
                    this.persistentStorage = create;
                    long j = create.getLong(BENEFITS_STATUS_KEY, 2L);
                    this.currentStatus = j;
                    this.entitlementStatus = new MobilyticsEntitlementStatusImpl(j);
                    String string = this.persistentStorage.getString(BenefitConstants.ENTITLED_BENEFIT_KEY, null);
                    if (string != null) {
                        this.entitledBenefit = string;
                    }
                    String string2 = this.persistentStorage.getString(ENTITLED_BENEFITS_KEY, null);
                    if (string2 == null || string2.isEmpty()) {
                        return;
                    }
                    this.entitledBenefits = Collections.unmodifiableList(new ArrayList(Arrays.asList(string2.split(","))));
                }
            }
        } catch (Exception e) {
            Log.e(TAG, e, "Error constructing MobilyticsEntitlementStatusProviderV2Impl", new Object[0]);
        }
    }

    private void addAsObserver() {
        if (this.benefitsService == null) {
            Log.e(TAG, "BenefitsService service is null");
            return;
        }
        BenefitsEntitlementAuthority$$ExternalSyntheticLambda0 benefitsEntitlementAuthority$$ExternalSyntheticLambda0 = new BenefitsEntitlementAuthority$$ExternalSyntheticLambda0(this, 2);
        Subscription subscription = this.bmclSubscription;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        Subscription subscription2 = this.bmclSubscriptionCore;
        if (subscription2 != null) {
            subscription2.unsubscribe();
        }
        Subscription subscription3 = this.bmclSubscriptionMoonraker;
        if (subscription3 != null) {
            subscription3.unsubscribe();
        }
        Subscription subscription4 = this.bmclSubscriptionMoneypenny;
        if (subscription4 != null) {
            subscription4.unsubscribe();
        }
        this.bmclSubscription = this.benefitsService.subscribeToBenefitsEntitlement(new SubscribeBenefitsEntitlementRequest(OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND, "alexa_premium_default"), benefitsEntitlementAuthority$$ExternalSyntheticLambda0);
        this.bmclSubscriptionCore = this.benefitsService.subscribeToBenefitsEntitlement(new SubscribeBenefitsEntitlementRequest(OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND, BenefitConstants.BENEFIT_NAME_CORE), benefitsEntitlementAuthority$$ExternalSyntheticLambda0);
        this.bmclSubscriptionMoonraker = this.benefitsService.subscribeToBenefitsEntitlement(new SubscribeBenefitsEntitlementRequest(OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND, BenefitConstants.BENEFIT_NAME_MOONRAKER), benefitsEntitlementAuthority$$ExternalSyntheticLambda0);
        this.bmclSubscriptionMoneypenny = this.benefitsService.subscribeToBenefitsEntitlement(new SubscribeBenefitsEntitlementRequest(OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND, BenefitConstants.BENEFIT_NAME_MONEYPENNY), benefitsEntitlementAuthority$$ExternalSyntheticLambda0);
    }

    private void getAndUpdateEntitlementStatus() {
        if (this.benefitsService != null) {
            processMultipleBenefitsResponse(this.benefitsService.peekMultipleBenefits(new PeekMultipleBenefitsRequest(OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND, Arrays.asList("alexa_premium_default", BenefitConstants.BENEFIT_NAME_CORE, BenefitConstants.BENEFIT_NAME_MOONRAKER, BenefitConstants.BENEFIT_NAME_MONEYPENNY))), MetricsConstants.OperationalMetrics.PEEK_MULTIPLE_BENEFITS);
        }
    }

    private synchronized void handleNewEntitlementStatus(GetBenefitsEntitlementResponse getBenefitsEntitlementResponse, String str) {
        try {
            if (getBenefitsEntitlementResponse != null) {
                EntitlementStatus entitlementStatus = getBenefitsEntitlementResponse.getEntitlementStatus();
                Log.d(TAG, "[BMCL Rearchitect] BMCL provided entitlement status - %s via %s", entitlementStatus, str);
                if (this.crashMetadata != null && shouldPopulateCrashMetadata()) {
                    this.crashMetadata.put(ENTITLEMENT_KEY, entitlementStatus.name());
                }
                if (entitlementStatus == EntitlementStatus.ENTITLED) {
                    updateStatus(0L);
                } else if (entitlementStatus == EntitlementStatus.NOT_ENTITLED) {
                    updateStatus(1L);
                }
            } else {
                Log.d(TAG, "[BMCL Rearchitect] GetBenefitsEntitlementResponse is null from %s", str);
                if (this.crashMetadata != null && shouldPopulateCrashMetadata()) {
                    this.crashMetadata.put(ENTITLEMENT_KEY, "UNKNOWN");
                }
                updateStatus(2L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAsObserver$1(GetBenefitsEntitlementResponse getBenefitsEntitlementResponse) {
        getAndUpdateEntitlementStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyListeners$0(MobilyticsEntitlementStatus mobilyticsEntitlementStatus, MobilyticsEntitlementStatusProviderV2.Listener listener) {
        try {
            listener.onEntitlementStatusChanged(mobilyticsEntitlementStatus);
        } catch (Exception e) {
            Log.e(TAG, e, "Error processing listener", new Object[0]);
        }
    }

    private void notifyListeners(MobilyticsEntitlementStatus mobilyticsEntitlementStatus) {
        Log.i(TAG, "[BMCL Rearchitect] notifyListeners MobilyticsEntitlementStatusProviderV2Impl - %d", Long.valueOf(mobilyticsEntitlementStatus.status()));
        Observable.from(this.listeners).forEach(new FakeEventBus$$ExternalSyntheticLambda0(mobilyticsEntitlementStatus, 22));
    }

    private boolean shouldPopulateCrashMetadata() {
        try {
            FeatureServiceV2 featureServiceV2 = (FeatureServiceV2) ComponentRegistry.getInstance().get(FeatureServiceV2.class).orNull();
            if (featureServiceV2 != null) {
                return "C".equals(featureServiceV2.getTreatmentAndRecordTrigger("ALEXA_MOBILE_PERFORMANCE", PERFORMANCE_ENTITLEMENT_MIGRATION, "C"));
            }
            return true;
        } catch (Exception unused) {
            Log.e(TAG, "Issue fetching PERFORMANCE_ENTITLEMENT_MIGRATION from feature service");
            return true;
        }
    }

    private synchronized void updateStatus(@NonNull long j) {
        try {
            if (j != this.currentStatus) {
                String str = TAG;
                Log.d(str, "[BMCL Rearchitect] updating status to - %d", Long.valueOf(j));
                this.currentStatus = j;
                if (this.hasBenefitsStatusCacheFeature) {
                    this.persistentStorage.edit().set(BENEFITS_STATUS_KEY, j).commit();
                    Log.i(str, "Persistent store updated to new benefits status %d", Long.valueOf(this.currentStatus));
                }
            }
            MobilyticsEntitlementStatusImpl mobilyticsEntitlementStatusImpl = new MobilyticsEntitlementStatusImpl(j);
            this.entitlementStatus = mobilyticsEntitlementStatusImpl;
            notifyListeners(mobilyticsEntitlementStatusImpl);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void addListener(@NonNull MobilyticsEntitlementStatusProviderV2.Listener listener) {
        Log.i(TAG, "[BMCL Rearchitect] addListener MobilyticsEntitlementStatusProviderV2Impl");
        this.listeners.add(listener);
    }

    public String getEntitledBenefit() {
        return this.entitledBenefit;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public List<String> getEntitledBenefits() {
        return this.entitledBenefits;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public MobilyticsEntitlementStatus getEntitlementStatus() {
        return this.entitlementStatus;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public List<String> getPremiumBenefitLabels() {
        return this.premiumBenefitLabels;
    }

    @VisibleForTesting
    public List<String> mapBenefitsArrayToPremiumBenefitLabels(List<String> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        TreeSet treeSet = new TreeSet();
        if (list.contains(BenefitConstants.BENEFIT_NAME_MOONRAKER)) {
            treeSet.add(BenefitConstants.PREMIUM_BENEFIT_LABEL_MOONRAKER);
        }
        if (list.contains(BenefitConstants.BENEFIT_NAME_MONEYPENNY)) {
            treeSet.add(BenefitConstants.PREMIUM_BENEFIT_LABEL_MONEYPENNY);
        }
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    @VisibleForTesting
    public String mapBenefitsArrayToString(List<String> list) {
        if (list == null || list.isEmpty()) {
            return BenefitConstants.BENEFIT_NOT_ENTITLED;
        }
        return list.contains(BenefitConstants.BENEFIT_NAME_CORE) ? "ALEXA_PREMIUM_CORE" : list.contains("alexa_premium_default") ? BenefitConstants.BENEFIT_ALEXA_PREMIUM_DEFAULT : BenefitConstants.BENEFIT_NOT_ENTITLED;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void onMessageReceived(MobilyticsEventBusMessageType mobilyticsEventBusMessageType) {
        if (mobilyticsEventBusMessageType == MobilyticsEventBusMessageType.BMCL_INITIALIZE) {
            String str = TAG;
            Log.i(str, "Cached benefits status is %d", Long.valueOf(this.currentStatus));
            Log.i(str, "[BMCL Rearchitect] initializing MobilyticsEntitlementStatusProviderV2Impl");
            addAsObserver();
            getAndUpdateEntitlementStatus();
            if (this.hasBenefitsStatusCacheFeature || this.statusCacheCleared) {
                return;
            }
            Log.i(str, "BMCL cache feature is not available, so clearing the cache");
            this.persistentStorage.edit().remove(BENEFITS_STATUS_KEY).remove(BenefitConstants.ENTITLED_BENEFIT_KEY).remove(ENTITLED_BENEFITS_KEY).commit();
            this.statusCacheCleared = true;
        }
    }

    @VisibleForTesting
    public synchronized void processMultipleBenefitsResponse(PeekMultipleBenefitsResponse peekMultipleBenefitsResponse, String str) {
        if (peekMultipleBenefitsResponse == null) {
            Log.d(TAG, "[BMCL Rearchitect] PeekMultipleBenefitsResponse is null from %s, using cached values", str);
            return;
        }
        List<String> entitledBenefits = peekMultipleBenefitsResponse.getEntitledBenefits();
        List<String> unmodifiableList = entitledBenefits == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(entitledBenefits));
        if (this.hasBenefitsStatusCacheFeature && !unmodifiableList.equals(this.entitledBenefits)) {
            this.persistentStorage.edit().set(ENTITLED_BENEFITS_KEY, Joiner.on(",").join(unmodifiableList)).commit();
        }
        this.entitledBenefits = unmodifiableList;
        String mapBenefitsArrayToString = mapBenefitsArrayToString(entitledBenefits);
        List<String> mapBenefitsArrayToPremiumBenefitLabels = mapBenefitsArrayToPremiumBenefitLabels(entitledBenefits);
        long j = (entitledBenefits == null || entitledBenefits.isEmpty()) ? 1L : 0L;
        String str2 = TAG;
        Log.d(str2, "[BMCL Rearchitect] Processing multiple benefits - entitled: %s, benefit: %s via %s", entitledBenefits, mapBenefitsArrayToString, str);
        if (!this.premiumBenefitLabels.equals(mapBenefitsArrayToPremiumBenefitLabels)) {
            this.premiumBenefitLabels = mapBenefitsArrayToPremiumBenefitLabels;
        }
        if (this.crashMetadata != null && shouldPopulateCrashMetadata()) {
            this.crashMetadata.put(ENTITLEMENT_KEY, j == 0 ? "ENTITLED" : BenefitConstants.BENEFIT_NOT_ENTITLED);
        }
        if (!this.entitledBenefit.equals(mapBenefitsArrayToString)) {
            this.entitledBenefit = mapBenefitsArrayToString;
            if (this.hasBenefitsStatusCacheFeature) {
                this.persistentStorage.edit().set(BenefitConstants.ENTITLED_BENEFIT_KEY, mapBenefitsArrayToString).commit();
                Log.i(str2, "Persistent store updated to new entitled benefit %s", mapBenefitsArrayToString);
            }
        }
        updateStatus(j);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void removeListener(@NonNull MobilyticsEntitlementStatusProviderV2.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void onUserChanged(@Nullable MobilyticsUser mobilyticsUser) {
    }
}

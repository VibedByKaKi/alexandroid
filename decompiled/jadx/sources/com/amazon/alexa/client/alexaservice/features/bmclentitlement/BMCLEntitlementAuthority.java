package com.amazon.alexa.client.alexaservice.features.bmclentitlement;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ComponentNameUpdateRequestEvent;
import com.amazon.alexa.client.core.device.PersistentStorage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BMCLEntitlementAuthority {

    @VisibleForTesting
    static final String BMCL_ENTITLEMENT_STATUS = "bmcl_entitlement_status";

    @VisibleForTesting
    static final String ENTITLED_BENEFIT = "entitled_benefit";

    @VisibleForTesting
    static final String PREMIUM_BENEFIT_LABELS = "premium_benefit_labels";
    private static final String TAG = "BMCLEntitlementAuthority";

    @VisibleForTesting
    static final String VISUAL_EXPERIENCE_ENTITLED = "visual_experience_entitled";
    private String entitledBenefit;
    private AlexaClientEventBus eventBus;
    private boolean isBMCLEntitled;
    private final boolean isVisualExperienceEntitled;
    private volatile List<String> premiumBenefitLabels;
    private final List<Runnable> updateListeners = new CopyOnWriteArrayList();

    @Inject
    public BMCLEntitlementAuthority(AlexaClientEventBus alexaClientEventBus, PersistentStorage persistentStorage) {
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
        this.isBMCLEntitled = persistentStorage.getBoolean(BMCL_ENTITLEMENT_STATUS, false);
        this.entitledBenefit = persistentStorage.getString("entitled_benefit", null);
        this.isVisualExperienceEntitled = persistentStorage.getBoolean("visual_experience_entitled", false);
        this.premiumBenefitLabels = parseLabels(persistentStorage.getString(PREMIUM_BENEFIT_LABELS, null));
        Objects.toString(this.premiumBenefitLabels);
    }

    private static List<String> parseLabels(String str) {
        return (str == null || str.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(Arrays.asList(str.split(","))));
    }

    public void addUpdateListener(@NonNull Runnable runnable) {
        this.updateListeners.add(runnable);
    }

    public String getEntitledBenefit() {
        return this.entitledBenefit;
    }

    @NonNull
    public List<String> getPremiumBenefitLabels() {
        return this.premiumBenefitLabels;
    }

    public boolean isBMCLEntitled() {
        return this.isBMCLEntitled;
    }

    public boolean isVisualExperienceEntitled() {
        return this.isVisualExperienceEntitled;
    }

    @Subscribe
    public void on(BMCLEntitlementUpdateEvent bMCLEntitlementUpdateEvent) {
        bMCLEntitlementUpdateEvent.isBMCLEntitled();
        bMCLEntitlementUpdateEvent.getEntitledBenefit();
        Objects.toString(bMCLEntitlementUpdateEvent.getPremiumBenefitLabels());
        this.isBMCLEntitled = bMCLEntitlementUpdateEvent.isBMCLEntitled();
        this.entitledBenefit = bMCLEntitlementUpdateEvent.getEntitledBenefit();
        if (bMCLEntitlementUpdateEvent.getPremiumBenefitLabels() != null) {
            this.premiumBenefitLabels = Collections.unmodifiableList(new ArrayList(bMCLEntitlementUpdateEvent.getPremiumBenefitLabels()));
        }
        this.eventBus.post(ComponentNameUpdateRequestEvent.create());
        Iterator<Runnable> it2 = this.updateListeners.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().run();
            } catch (RuntimeException e) {
                Log.e(TAG, "Error notifying entitlement update listener", e);
            }
        }
    }

    public void removeUpdateListener(@NonNull Runnable runnable) {
        this.updateListeners.remove(runnable);
    }
}

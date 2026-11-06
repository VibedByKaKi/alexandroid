package com.amazon.dee.app.services.shortcut;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import com.amazon.alexa.benefits.api.BenefitsService;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.PeekBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.enums.CacheState;
import com.amazon.alexa.benefits.api.models.enums.EntitlementStatus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.routing.data.RouteName;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.services.shortcut.api.DefaultShortcutsProvider;
import com.amazon.dee.app.services.shortcut.model.ShortcutAction;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultShortcuts implements DefaultShortcutsProvider {
    private static final String ACTION_LAUNCH_FROM_SHORTCUT = "com.amazon.alexa.action.WIDGET_SHORTCUT";
    private static final String BENEFIT_ALEXA_PREMIUM_DEFAULT = "alexa_premium_default";
    private static final String MAIN_ACTIVITY_CLASS = "com.amazon.dee.app.ui.main.MainActivity";
    private static final String VOICE_ACTIVITY_CLASS = "com.amazon.dee.app.ui.voice.LaunchAlexaActivity";
    private final Lazy<BenefitsService> benefitsServiceLazy;
    private final Lazy<FeatureServiceV2> featureServiceV2Lazy;
    private Resources resources;

    @Inject
    public DefaultShortcuts(Context context, Lazy<BenefitsService> lazy, Lazy<FeatureServiceV2> lazy2) {
        this.resources = context.getApplicationContext().getResources();
        this.benefitsServiceLazy = lazy;
        this.featureServiceV2Lazy = lazy2;
    }

    private boolean isAlexaPlusEntitled() {
        FeatureServiceV2 featureServiceV2 = this.featureServiceV2Lazy.get();
        if (featureServiceV2 == null || !"T1".equals(featureServiceV2.getTreatment("AlexaMobileFoundationAndroid", "ALEXA_MOBILE_DYNAMIC_APP_ICON", "C"))) {
            return false;
        }
        PeekBenefitsEntitlementResponse peekBenefitsEntitlement = this.benefitsServiceLazy.get().peekBenefitsEntitlement(new GetBenefitsEntitlementRequest("cbea4080-337a-4b7e-8e0b-ea16ec85c09a", "alexa_premium_default"));
        return (peekBenefitsEntitlement == null || peekBenefitsEntitlement.getCacheState() == CacheState.EMPTY_CACHE || peekBenefitsEntitlement.getResponse() == null || peekBenefitsEntitlement.getResponse().getEntitlementStatus() != EntitlementStatus.ENTITLED) ? false : true;
    }

    @Override // com.amazon.dee.app.services.shortcut.api.DefaultShortcutsProvider
    @SuppressLint({"WrongConstant"})
    public List<ShortcutAction> get() {
        ArrayList arrayList = new ArrayList();
        ShortcutAction shortcutAction = new ShortcutAction();
        shortcutAction.setUniqueId(ShortcutConstants.ASK_ALEXA_SHORTCUT_ID);
        shortcutAction.setShortcutName(this.resources.getString(R.string.ask_alexa));
        shortcutAction.setTargetClass("com.amazon.dee.app.ui.voice.LaunchAlexaActivity");
        shortcutAction.setIntentAction("com.amazon.alexa.action.WIDGET_SHORTCUT");
        shortcutAction.setIconResourceId(isAlexaPlusEntitled() ? R.drawable.voice_ingress_plus : R.drawable.voice_ingress);
        arrayList.add(shortcutAction);
        ShortcutAction shortcutAction2 = new ShortcutAction();
        shortcutAction2.setUniqueId("i_list");
        shortcutAction2.setShortcutName(this.resources.getString(R.string.quick_action_list));
        shortcutAction2.setTargetClass("com.amazon.dee.app.ui.main.MainActivity");
        shortcutAction2.setRouteName("v2/lists");
        shortcutAction2.setIconResourceId(R.drawable.ic_list);
        arrayList.add(shortcutAction2);
        ShortcutAction shortcutAction3 = new ShortcutAction();
        shortcutAction3.setUniqueId("i_remind");
        shortcutAction3.setShortcutName(this.resources.getString(R.string.quick_action_reminder));
        shortcutAction3.setTargetClass("com.amazon.dee.app.ui.main.MainActivity");
        shortcutAction3.setRouteName(RouteName.ELEMENTS_REMINDERS_CREATE_LANDING);
        shortcutAction3.setIconResourceId(R.drawable.ic_calendar);
        arrayList.add(shortcutAction3);
        ShortcutAction shortcutAction4 = new ShortcutAction();
        shortcutAction4.setUniqueId("i_alarm");
        shortcutAction4.setShortcutName(this.resources.getString(R.string.quick_action_alarm));
        shortcutAction4.setTargetClass("com.amazon.dee.app.ui.main.MainActivity");
        shortcutAction4.setRouteName(RouteName.ELEMENTS_ALARM_CREATE_LANDING);
        shortcutAction4.setIconResourceId(R.drawable.ic_alarm_clock);
        arrayList.add(shortcutAction4);
        ShortcutAction shortcutAction5 = new ShortcutAction();
        shortcutAction5.setUniqueId("i_announce");
        shortcutAction5.setShortcutName(this.resources.getString(R.string.quick_action_announce));
        shortcutAction5.setTargetClass("com.amazon.dee.app.ui.main.MainActivity");
        shortcutAction5.setRouteName(RouteName.COMMS_ANNOUNCEMENT);
        shortcutAction5.setIconResourceId(R.drawable.ic_announcement_dark);
        arrayList.add(shortcutAction5);
        return arrayList;
    }
}

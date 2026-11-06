package io.reactivex.rxjava3.android.schedulers;

import com.amazon.alexa.accessory.frames.greeting.BudGreetingManager;
import com.amazon.alexa.accessory.frames.personalization.PersonalizationHelper;
import com.amazon.alexa.accessory.frames.translation.service.TranslationAuthProviderImpl;
import com.amazon.alexa.presence.bleconn.service.handlers.IdentityRequestHandler;
import com.amazon.alexa.presence.service.PresenceJobService;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class AndroidSchedulers$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AndroidSchedulers$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Scheduler scheduler;
        Optional lambda$readFirstName$18;
        List buildCustomerInfoAttributes;
        String profileName;
        String authToken$lambda$0;
        byte[] lambda$getRelationshipData$0;
        Integer lambda$startMonitoringTokenFreshness$0;
        Integer lambda$scheduleIdentityRefresh$1;
        switch (this.$r8$classId) {
            case 0:
                scheduler = AndroidSchedulers.MainHolder.DEFAULT;
                return scheduler;
            case 1:
                lambda$readFirstName$18 = BudGreetingManager.lambda$readFirstName$18();
                return lambda$readFirstName$18;
            case 2:
                buildCustomerInfoAttributes = PersonalizationHelper.buildCustomerInfoAttributes();
                return buildCustomerInfoAttributes;
            case 3:
                profileName = PersonalizationHelper.getProfileName();
                return profileName;
            case 4:
                authToken$lambda$0 = TranslationAuthProviderImpl.getAuthToken$lambda$0();
                return authToken$lambda$0;
            case 5:
                lambda$getRelationshipData$0 = IdentityRequestHandler.lambda$getRelationshipData$0();
                return lambda$getRelationshipData$0;
            case 6:
                lambda$startMonitoringTokenFreshness$0 = PresenceJobService.Helper.lambda$startMonitoringTokenFreshness$0();
                return lambda$startMonitoringTokenFreshness$0;
            default:
                lambda$scheduleIdentityRefresh$1 = PresenceJobService.Helper.lambda$scheduleIdentityRefresh$1();
                return lambda$scheduleIdentityRefresh$1;
        }
    }
}

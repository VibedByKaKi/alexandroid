package org.apache.commons.lang3;

import com.amazon.alexa.accessory.frames.ota.OTAHelper;
import com.amazon.alexa.accessory.kota.InventoryUpdateBundle;
import com.amazon.alexa.accessory.protocol.Assettransfer;
import com.amazon.alexa.app.notification.actions.NotificationActionExecutionService;
import com.amazon.alexa.app.notification.actions.handlers.RemindersHandler;
import com.amazon.alexa.matter.client.coral.CoralServiceClient;
import com.amazon.alexa.notification.actions.reminders.RemindersActionHandler;
import com.amazon.alexa.notification.api.actions.model.NotificationActionList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class LocaleUtils$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ LocaleUtils$$ExternalSyntheticLambda2(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        List lambda$countriesByLanguage$0;
        Assettransfer.Asset lambda$transformInventoryUpdateBundlesToAssetList$9;
        Optional lambda$sendErrorNotification$1;
        Optional lambda$sendErrorNotification$7;
        String lambda$new$0;
        Optional lambda$sendErrorNotification$4;
        List lambda$languagesByCountry$0;
        Stream lambda$findThreadsByName$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                lambda$countriesByLanguage$0 = LocaleUtils.lambda$countriesByLanguage$0(str, (String) obj);
                return lambda$countriesByLanguage$0;
            case 1:
                lambda$transformInventoryUpdateBundlesToAssetList$9 = OTAHelper.lambda$transformInventoryUpdateBundlesToAssetList$9(str, (InventoryUpdateBundle) obj);
                return lambda$transformInventoryUpdateBundlesToAssetList$9;
            case 2:
                lambda$sendErrorNotification$1 = NotificationActionExecutionService.lambda$sendErrorNotification$1(str, (NotificationActionList) obj);
                return lambda$sendErrorNotification$1;
            case 3:
                lambda$sendErrorNotification$7 = RemindersHandler.lambda$sendErrorNotification$7(str, (NotificationActionList) obj);
                return lambda$sendErrorNotification$7;
            case 4:
                lambda$new$0 = CoralServiceClient.Operation.lambda$new$0(str, obj);
                return lambda$new$0;
            case 5:
                lambda$sendErrorNotification$4 = RemindersActionHandler.lambda$sendErrorNotification$4(str, (NotificationActionList) obj);
                return lambda$sendErrorNotification$4;
            case 6:
                lambda$languagesByCountry$0 = LocaleUtils.lambda$languagesByCountry$0(str, (String) obj);
                return lambda$languagesByCountry$0;
            default:
                lambda$findThreadsByName$0 = ThreadUtils.lambda$findThreadsByName$0(str, (ThreadGroup) obj);
                return lambda$findThreadsByName$0;
        }
    }
}

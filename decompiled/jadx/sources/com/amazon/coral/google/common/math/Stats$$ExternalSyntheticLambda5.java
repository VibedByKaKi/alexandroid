package com.amazon.coral.google.common.math;

import android.content.ComponentName;
import com.amazon.alexa.navigation.menu.viewcontroller.SmartHomeNavigationViewController;
import com.amazon.alexa.notification.api.actions.model.NotificationActionList;
import com.amazon.alexa.notification.api.actions.registry.DefaultNotificationActionsRegistry;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.mcp.McpPolymorphismHelper;
import com.amazon.coral.model.reflect.DetectedModelIndex;
import com.amazon.dee.app.framework.startup.implementation.PackageInitializationManager;
import com.dee.app.contacts.api.preference.GetPreferenceForOwnerApi;
import com.dee.app.contacts.common.models.server.PreferenceForOwner;
import com.dee.app.contacts.interfaces.models.data.preference.contactownerpreference.Preference;
import com.dee.app.sync.api.sync.ContactsUpSyncApi;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Stats$$ExternalSyntheticLambda5 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Stats$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Void lambda$checkProductEligibility$1;
        String actionListId;
        NotificationActionList lambda$constructRegistry$1;
        List lambda$buildChildrenIndex$0;
        Stream lambda$detectModelIndexes$0;
        Object lambda$runStartupTasks$2;
        Object lambda$runStartupTasks$4;
        Object lambda$runStartupTasks$5;
        Preference lambda$buildContactPreferenceListForOwner$2;
        Boolean lambda$performBatchUpdateContacts$15;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        Double lambda$onSecondary$71;
        TonalPalette tonalPalette3;
        Double lambda$secondary$68;
        TonalPalette tonalPalette4;
        Double lambda$surfaceContainerLowest$22;
        TonalPalette tonalPalette5;
        Double lambda$outline$43;
        TonalPalette tonalPalette6;
        TonalPalette tonalPalette7;
        Double lambda$surfaceTint$51;
        TonalPalette tonalPalette8;
        Double lambda$onSecondaryFixed$124;
        TonalPalette tonalPalette9;
        switch (this.$r8$classId) {
            case 0:
                return ((StatsAccumulator) obj).snapshot();
            case 1:
                lambda$checkProductEligibility$1 = SmartHomeNavigationViewController.lambda$checkProductEligibility$1((Throwable) obj);
                return lambda$checkProductEligibility$1;
            case 2:
                actionListId = ((NotificationActionList) obj).getActionListId();
                return actionListId;
            case 3:
                lambda$constructRegistry$1 = DefaultNotificationActionsRegistry.lambda$constructRegistry$1((NotificationActionList) obj);
                return lambda$constructRegistry$1;
            case 4:
                lambda$buildChildrenIndex$0 = McpPolymorphismHelper.lambda$buildChildrenIndex$0((Model.Id) obj);
                return lambda$buildChildrenIndex$0;
            case 5:
                lambda$detectModelIndexes$0 = DetectedModelIndex.lambda$detectModelIndexes$0((URL) obj);
                return lambda$detectModelIndexes$0;
            case 6:
                return ((String) obj).trim();
            case 7:
                lambda$runStartupTasks$2 = PackageInitializationManager.lambda$runStartupTasks$2(obj);
                return lambda$runStartupTasks$2;
            case 8:
                lambda$runStartupTasks$4 = PackageInitializationManager.lambda$runStartupTasks$4(obj);
                return lambda$runStartupTasks$4;
            case 9:
                lambda$runStartupTasks$5 = PackageInitializationManager.lambda$runStartupTasks$5(obj);
                return lambda$runStartupTasks$5;
            case 10:
                return ((ComponentName) obj).getClassName();
            case 11:
                return Short.valueOf(((Long) obj).shortValue());
            case 12:
                lambda$buildContactPreferenceListForOwner$2 = GetPreferenceForOwnerApi.lambda$buildContactPreferenceListForOwner$2((PreferenceForOwner) obj);
                return lambda$buildContactPreferenceListForOwner$2;
            case 13:
                lambda$performBatchUpdateContacts$15 = ContactsUpSyncApi.lambda$performBatchUpdateContacts$15(obj);
                return lambda$performBatchUpdateContacts$15;
            case 14:
                return ((AnnotatedMethod) obj).getFullName();
            case 15:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            case 16:
                tonalPalette2 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette2;
            case 17:
                lambda$onSecondary$71 = MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
                return lambda$onSecondary$71;
            case 18:
                tonalPalette3 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette3;
            case 19:
                lambda$secondary$68 = MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
                return lambda$secondary$68;
            case 20:
                tonalPalette4 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette4;
            case 21:
                lambda$surfaceContainerLowest$22 = MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
                return lambda$surfaceContainerLowest$22;
            case 22:
                tonalPalette5 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette5;
            case 23:
                lambda$outline$43 = MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
                return lambda$outline$43;
            case 24:
                tonalPalette6 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette6;
            case 25:
                tonalPalette7 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette7;
            case 26:
                lambda$surfaceTint$51 = MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
                return lambda$surfaceTint$51;
            case 27:
                tonalPalette8 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette8;
            case 28:
                lambda$onSecondaryFixed$124 = MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
                return lambda$onSecondaryFixed$124;
            default:
                tonalPalette9 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette9;
        }
    }
}

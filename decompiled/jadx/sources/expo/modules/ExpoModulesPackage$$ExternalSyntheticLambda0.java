package expo.modules;

import com.facebook.react.common.ClearableSynchronizedPool;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxAccessor;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsForTests;
import com.facebook.react.uimanager.ReactStylesDiffMapHelperKt;
import com.facebook.react.uimanager.ReactYogaConfigProvider;
import com.facebook.react.uimanager.YogaNodePool;
import com.facebook.yoga.YogaConfig;
import com.swmansion.gesturehandler.RNGestureHandlerPackage;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import expo.modules.kotlin.ExpoModulesHelper;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.jni.JavaScriptFunction;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ExpoModulesPackage$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ExpoModulesPackage$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List packageList_delegate$lambda$1;
        ReactNativeFeatureFlagsCxxAccessor accessorProvider$lambda$0;
        ReactNativeFeatureFlagsAccessor up$lambda$0;
        Field backingMapField_delegate$lambda$1;
        YogaConfig yogaConfig_delegate$lambda$1;
        ClearableSynchronizedPool pool_delegate$lambda$0;
        Map viewManagers_delegate$lambda$2;
        Object computeDummyLayout$lambda$7;
        Object requireReactContext$lambda$8;
        Object onHostResume$lambda$10;
        CoroutineScope applicationCoroutineScope_delegate$lambda$6;
        ModulesProvider modulesProvider_delegate$lambda$0;
        KType invoke$lambda$1;
        Map emptyMap;
        SerialDescriptor descriptor$lambda$5$lambda$0;
        SerialDescriptor descriptor$lambda$5$lambda$1;
        SerialDescriptor descriptor$lambda$5$lambda$2;
        SerialDescriptor descriptor$lambda$5$lambda$3;
        SerialDescriptor descriptor$lambda$5$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                packageList_delegate$lambda$1 = ExpoModulesPackage.packageList_delegate$lambda$1();
                return packageList_delegate$lambda$1;
            case 1:
                accessorProvider$lambda$0 = ReactNativeFeatureFlags.accessorProvider$lambda$0();
                return accessorProvider$lambda$0;
            case 2:
                up$lambda$0 = ReactNativeFeatureFlagsForTests.setUp$lambda$0();
                return up$lambda$0;
            case 3:
                backingMapField_delegate$lambda$1 = ReactStylesDiffMapHelperKt.backingMapField_delegate$lambda$1();
                return backingMapField_delegate$lambda$1;
            case 4:
                yogaConfig_delegate$lambda$1 = ReactYogaConfigProvider.yogaConfig_delegate$lambda$1();
                return yogaConfig_delegate$lambda$1;
            case 5:
                pool_delegate$lambda$0 = YogaNodePool.pool_delegate$lambda$0();
                return pool_delegate$lambda$0;
            case 6:
                viewManagers_delegate$lambda$2 = RNGestureHandlerPackage.viewManagers_delegate$lambda$2();
                return viewManagers_delegate$lambda$2;
            case 7:
                computeDummyLayout$lambda$7 = ScreenDummyLayoutHelper.computeDummyLayout$lambda$7();
                return computeDummyLayout$lambda$7;
            case 8:
                requireReactContext$lambda$8 = ScreenDummyLayoutHelper.requireReactContext$lambda$8();
                return requireReactContext$lambda$8;
            case 9:
                onHostResume$lambda$10 = ScreenDummyLayoutHelper.onHostResume$lambda$10();
                return onHostResume$lambda$10;
            case 10:
                applicationCoroutineScope_delegate$lambda$6 = ReactActivityDelegateWrapper.applicationCoroutineScope_delegate$lambda$6();
                return applicationCoroutineScope_delegate$lambda$6;
            case 11:
                modulesProvider_delegate$lambda$0 = ExpoModulesHelper.modulesProvider_delegate$lambda$0();
                return modulesProvider_delegate$lambda$0;
            case 12:
                invoke$lambda$1 = JavaScriptFunction.invoke$lambda$1();
                return invoke$lambda$1;
            case 13:
                emptyMap = MapsKt.emptyMap();
                return emptyMap;
            case 14:
                descriptor$lambda$5$lambda$0 = JsonElementSerializer.descriptor$lambda$5$lambda$0();
                return descriptor$lambda$5$lambda$0;
            case 15:
                descriptor$lambda$5$lambda$1 = JsonElementSerializer.descriptor$lambda$5$lambda$1();
                return descriptor$lambda$5$lambda$1;
            case 16:
                descriptor$lambda$5$lambda$2 = JsonElementSerializer.descriptor$lambda$5$lambda$2();
                return descriptor$lambda$5$lambda$2;
            case 17:
                descriptor$lambda$5$lambda$3 = JsonElementSerializer.descriptor$lambda$5$lambda$3();
                return descriptor$lambda$5$lambda$3;
            default:
                descriptor$lambda$5$lambda$4 = JsonElementSerializer.descriptor$lambda$5$lambda$4();
                return descriptor$lambda$5$lambda$4;
        }
    }
}

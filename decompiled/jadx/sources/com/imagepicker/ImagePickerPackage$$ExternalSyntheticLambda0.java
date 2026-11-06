package com.imagepicker;

import com.amazon.alexa.elements.turbomodules.permissionservice.PermissionServicePackage;
import com.amazon.alexa.elements.turbomodules.pinghandler.PingHandlerPackage;
import com.amazon.alexa.elements.turbomodules.pmi.PMIPackage;
import com.amazon.alexa.elements.turbomodules.reactnativedocumentpicker.RNDocumentPickerPackage;
import com.amazon.alexa.elements.turbomodules.rtcsc.ElementsRtcscPackage;
import com.amazon.alexa.elements.turbomodules.storage.ElementsStoragePackage;
import com.amazon.alexa.elements.turbomodules.subscriptions.SubscriptionsManagerPackage;
import com.amazon.alexa.elements.turbomodules.systembar.SystemBarPackage;
import com.amazon.alexa.elements.turbomodules.systeminfo.SystemInfoPackage;
import com.amazon.alexa.elements.turbomodules.systrace.ElementsSystracePackage;
import com.amazon.alexa.elements.turbomodules.voicesettingsbridge.VoiceSettingsBridgePackage;
import com.amazon.alexa.ra.android.smartfragment.crypto.SandboxCryptoPackage;
import com.amazon.dee.app.elements.SMSMessagingPackage;
import com.amazon.leapfrogmapgl.NativeMapboxPackage;
import com.amazon.smrf.runtime.VisualContextPackage;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.reactcommunity.rndatetimepicker.RNDateTimePickerPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.swmansion.gesturehandler.RNGestureHandlerPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import java.util.Map;
import kotlin.collections.MapsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ImagePickerPackage$$ExternalSyntheticLambda0 implements ReactModuleInfoProvider {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ImagePickerPackage$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        Map lambda$getReactModuleInfoProvider$0;
        Map lambda$getReactModuleInfoProvider$02;
        Map lambda$getReactModuleInfoProvider$03;
        Map lambda$getReactModuleInfoProvider$04;
        Map lambda$getReactModuleInfoProvider$05;
        Map lambda$getReactModuleInfoProvider$06;
        Map lambda$getReactModuleInfoProvider$07;
        Map lambda$getReactModuleInfoProvider$08;
        Map lambda$getReactModuleInfoProvider$09;
        Map lambda$getReactModuleInfoProvider$010;
        Map lambda$getReactModuleInfoProvider$011;
        Map lambda$getReactModuleInfoProvider$012;
        Map reactModuleInfoProvider$lambda$0;
        Map lambda$getReactModuleInfoProvider$1;
        Map reactModuleInfoProvider$lambda$02;
        Map lambda$getReactModuleInfoProvider$013;
        Map emptyMap;
        Map lambda$getReactModuleInfoProvider$014;
        Map lambda$getReactModuleInfoProvider$015;
        Map reactModuleInfoProvider$lambda$03;
        Map reactModuleInfoProvider$lambda$3;
        Map reactModuleInfoProvider$lambda$04;
        switch (this.$r8$classId) {
            case 0:
                lambda$getReactModuleInfoProvider$0 = ImagePickerPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$0;
            case 1:
                lambda$getReactModuleInfoProvider$02 = PermissionServicePackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$02;
            case 2:
                lambda$getReactModuleInfoProvider$03 = PingHandlerPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$03;
            case 3:
                lambda$getReactModuleInfoProvider$04 = PMIPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$04;
            case 4:
                lambda$getReactModuleInfoProvider$05 = RNDocumentPickerPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$05;
            case 5:
                lambda$getReactModuleInfoProvider$06 = ElementsRtcscPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$06;
            case 6:
                lambda$getReactModuleInfoProvider$07 = ElementsStoragePackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$07;
            case 7:
                lambda$getReactModuleInfoProvider$08 = SubscriptionsManagerPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$08;
            case 8:
                lambda$getReactModuleInfoProvider$09 = SystemBarPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$09;
            case 9:
                lambda$getReactModuleInfoProvider$010 = SystemInfoPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$010;
            case 10:
                lambda$getReactModuleInfoProvider$011 = ElementsSystracePackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$011;
            case 11:
                lambda$getReactModuleInfoProvider$012 = VoiceSettingsBridgePackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$012;
            case 12:
                reactModuleInfoProvider$lambda$0 = SandboxCryptoPackage.getReactModuleInfoProvider$lambda$0();
                return reactModuleInfoProvider$lambda$0;
            case 13:
                lambda$getReactModuleInfoProvider$1 = SMSMessagingPackage.lambda$getReactModuleInfoProvider$1();
                return lambda$getReactModuleInfoProvider$1;
            case 14:
                reactModuleInfoProvider$lambda$02 = NativeMapboxPackage.getReactModuleInfoProvider$lambda$0();
                return reactModuleInfoProvider$lambda$02;
            case 15:
                lambda$getReactModuleInfoProvider$013 = VisualContextPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$013;
            case 16:
                emptyMap = MapsKt.emptyMap();
                return emptyMap;
            case 17:
                lambda$getReactModuleInfoProvider$014 = RNDateTimePickerPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$014;
            case 18:
                lambda$getReactModuleInfoProvider$015 = RNCWebViewPackage.lambda$getReactModuleInfoProvider$0();
                return lambda$getReactModuleInfoProvider$015;
            case 19:
                reactModuleInfoProvider$lambda$03 = com.reactnativedocumentpicker.RNDocumentPickerPackage.getReactModuleInfoProvider$lambda$0();
                return reactModuleInfoProvider$lambda$03;
            case 20:
                reactModuleInfoProvider$lambda$3 = RNGestureHandlerPackage.getReactModuleInfoProvider$lambda$3();
                return reactModuleInfoProvider$lambda$3;
            default:
                reactModuleInfoProvider$lambda$04 = RNScreensPackage.getReactModuleInfoProvider$lambda$0();
                return reactModuleInfoProvider$lambda$04;
        }
    }
}

package com.amazon.alexa.elements.turbomodules.abasettingsbridge;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "AbaSettingsBridgeModule")
/* loaded from: classes17.dex */
public class AbaSettingsBridgeModule extends NativeAbaSettingsBridgeSpec {
    public static final String NAME = "AbaSettingsBridgeModule";
    private final AbaSettingsBridgeAPI abaSettingsBridgeAPI;

    public AbaSettingsBridgeModule(ReactApplicationContext reactApplicationContext, AbaSettingsBridgeAPI abaSettingsBridgeAPI) {
        super(reactApplicationContext);
        this.abaSettingsBridgeAPI = abaSettingsBridgeAPI;
        abaSettingsBridgeAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void accessoryScannerObserveOnBleAccessoryFoundNearby(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.accessoryScannerObserveOnBleAccessoryFoundNearby(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void accessoryScannerObserveOnConnectedAccessoryFound(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.accessoryScannerObserveOnConnectedAccessoryFound(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void accessoryScannerObserveOnConnectedAccessoryLost(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.accessoryScannerObserveOnConnectedAccessoryLost(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void accessorySupplierLink(ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.accessorySupplierLink(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void accessorySupplierUnlink(ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.accessorySupplierUnlink(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void ancsRepositoryQueryAncsAuthorization(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.ancsRepositoryQueryAncsAuthorization(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void ancsRepositoryQueryAncsValidation(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.ancsRepositoryQueryAncsValidation(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void areNotificationsEnabled(Promise promise) {
        this.abaSettingsBridgeAPI.areNotificationsEnabled(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void assetTransferRepositoryGetAssetInfo(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.assetTransferRepositoryGetAssetInfo(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void assetTransferRepositoryQueryAssetAvailable(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.assetTransferRepositoryQueryAssetAvailable(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void assetTransferRepositoryQueryNotifyAssetTransferSession(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.assetTransferRepositoryQueryNotifyAssetTransferSession(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void assetTransferRepositoryQueryStartAssetTransferSession(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.assetTransferRepositoryQueryStartAssetTransferSession(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void assetTransferRepositoryQueryTransferState(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.assetTransferRepositoryQueryTransferState(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void assetTransferRepositoryRemoveAssets(String str, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.assetTransferRepositoryRemoveAssets(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void awaitUntilAccessoryStateBooleanEnabled(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.awaitUntilAccessoryStateBooleanEnabled(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void awaitUntilAccessoryStateBooleanIsTrue(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.awaitUntilAccessoryStateBooleanIsTrue(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void awaitUntilDiscoverableOverBluetoothClassic(String str, Promise promise) {
        this.abaSettingsBridgeAPI.awaitUntilDiscoverableOverBluetoothClassic(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cameraRepositoryGetAllCameraConfigurations(String str, Promise promise) {
        this.abaSettingsBridgeAPI.cameraRepositoryGetAllCameraConfigurations(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cameraRepositoryGetAllCameraSettings(String str, Promise promise) {
        this.abaSettingsBridgeAPI.cameraRepositoryGetAllCameraSettings(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cameraRepositoryGetCameraConfiguration(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.cameraRepositoryGetCameraConfiguration(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cameraRepositoryGetCameraSettings(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.cameraRepositoryGetCameraSettings(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cameraRepositorySetCameraSettings(String str, ReadableArray readableArray, Promise promise) {
        this.abaSettingsBridgeAPI.cameraRepositorySetCameraSettings(str, readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cancelLocalNotification(double d, Promise promise) {
        this.abaSettingsBridgeAPI.cancelLocalNotification(d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void clearAudioDelay(Promise promise) {
        this.abaSettingsBridgeAPI.clearAudioDelay(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void clearFocusFilterSettings(Promise promise) {
        this.abaSettingsBridgeAPI.clearFocusFilterSettings(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void clearVipFilterSettings(String str, Promise promise) {
        this.abaSettingsBridgeAPI.clearVipFilterSettings(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cloudPairingRepositoryGetAttributes(String str, Promise promise) {
        this.abaSettingsBridgeAPI.cloudPairingRepositoryGetAttributes(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cloudPairingRepositoryGetPairingStatus(String str, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.cloudPairingRepositoryGetPairingStatus(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cloudPairingRepositoryRemoveKeys(String str, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.cloudPairingRepositoryRemoveKeys(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void cloudPairingRepositorySetKeys(String str, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.cloudPairingRepositorySetKeys(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void completeSetup(String str, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.completeSetup(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void connectBle(String str, Promise promise) {
        this.abaSettingsBridgeAPI.connectBle(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void createNCNotification(String str, String str2, String str3, String str4, String str5, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.createNCNotification(str, str2, str3, str4, str5, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void createSession(String str, Promise promise) {
        this.abaSettingsBridgeAPI.createSession(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deregisterDevice(String str, Promise promise) {
        this.abaSettingsBridgeAPI.deregisterDevice(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceRepositoryQueryConfiguration(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.deviceRepositoryQueryConfiguration(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceRepositoryQueryDeviceFeatures(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.deviceRepositoryQueryDeviceFeatures(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceRepositoryQueryInformationSet(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.deviceRepositoryQueryInformationSet(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceRepositoryRequestCompleteSetup(String str, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.deviceRepositoryRequestCompleteSetup(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceRepositoryRequestOverrideAssistant(String str, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.deviceRepositoryRequestOverrideAssistant(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceRepositoryRequestStartSetup(String str, Promise promise) {
        this.abaSettingsBridgeAPI.deviceRepositoryRequestStartSetup(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceSupplierGetDeviceGroup(String str, Promise promise) {
        this.abaSettingsBridgeAPI.deviceSupplierGetDeviceGroup(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceSupplierGetDeviceGroupCondition(String str, Promise promise) {
        this.abaSettingsBridgeAPI.deviceSupplierGetDeviceGroupCondition(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceSupplierHasDeviceGroup(String str, Promise promise) {
        this.abaSettingsBridgeAPI.deviceSupplierHasDeviceGroup(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceSupplierQueryDeviceGroups(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.deviceSupplierQueryDeviceGroups(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void deviceSupplierRemoveDeviceGroup(double d, Promise promise) {
        this.abaSettingsBridgeAPI.deviceSupplierRemoveDeviceGroup(d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void disconnectBle(String str, Promise promise) {
        this.abaSettingsBridgeAPI.disconnectBle(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void disposeRxRN(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.disposeRxRN(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void doAssistantOverride(String str, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.doAssistantOverride(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void doesDeviceSupportAutoPairing(Promise promise) {
        this.abaSettingsBridgeAPI.doesDeviceSupportAutoPairing(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void factoryResetDevice(String str, Promise promise) {
        this.abaSettingsBridgeAPI.factoryResetDevice(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void fasCardsAreReady(Promise promise) {
        this.abaSettingsBridgeAPI.fasCardsAreReady(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void finishSetupModuleOnBlacklisted(ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.finishSetupModuleOnBlacklisted(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void finishSetupModuleOnContinue(ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.finishSetupModuleOnContinue(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void finishSetupModuleOnDismiss(ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.finishSetupModuleOnDismiss(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void firmwareRepositoryQueryInformationSet(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.firmwareRepositoryQueryInformationSet(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void firmwareRepositoryQueryInventoryUpdateBundleSet(ReadableMap readableMap, String str, boolean z) {
        this.abaSettingsBridgeAPI.firmwareRepositoryQueryInventoryUpdateBundleSet(readableMap, str, z);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void firmwareRepositoryQueryUpdateStatus(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.firmwareRepositoryQueryUpdateStatus(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void focusFilterInfoSupplierQueryFocusFilterSettings(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.focusFilterInfoSupplierQueryFocusFilterSettings(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getAccessories(Promise promise) {
        this.abaSettingsBridgeAPI.getAccessories(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getAccessoryStateBoolean(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.getAccessoryStateBoolean(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getAccessoryStateInteger(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.getAccessoryStateInteger(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getAccountIdForIdentifier(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getAccountIdForIdentifier(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getAudioDelay(Promise promise) {
        this.abaSettingsBridgeAPI.getAudioDelay(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getBTInformation(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getBTInformation(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getBehaviorConfigurationSet(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getBehaviorConfigurationSet(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getDeviceInformationV2(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getDeviceInformationV2(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getFirmwareInformation(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getFirmwareInformation(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getFirmwareUpdateInfo(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getFirmwareUpdateInfo(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getFocusFilterSettings(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getFocusFilterSettings(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getIdentifierForAccountId(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getIdentifierForAccountId(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "AbaSettingsBridgeModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getNeedsSetup(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getNeedsSetup(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getRegisteredClusterDeviceSerialNumber(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getRegisteredClusterDeviceSerialNumber(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getRegisteredName(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getRegisteredName(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getSession(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getSession(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getUserDeviceName(String str, Promise promise) {
        this.abaSettingsBridgeAPI.getUserDeviceName(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void getVipFilterSettings(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.getVipFilterSettings(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void hasAncsAuthorization(String str, Promise promise) {
        this.abaSettingsBridgeAPI.hasAncsAuthorization(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void hasNotificationPermission(Promise promise) {
        this.abaSettingsBridgeAPI.hasNotificationPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void initiateFirmwareTransfer(String str, Promise promise) {
        this.abaSettingsBridgeAPI.initiateFirmwareTransfer(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void initiateMapConnection(String str, Promise promise) {
        this.abaSettingsBridgeAPI.initiateMapConnection(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void inputRepositoryQueryConfiguration(ReadableMap readableMap, String str, double d) {
        this.abaSettingsBridgeAPI.inputRepositoryQueryConfiguration(readableMap, str, d);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void inputRepositoryResetConfiguration(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.inputRepositoryResetConfiguration(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void inputRepositorySetConfiguration(String str, double d, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.inputRepositorySetConfiguration(str, d, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void instrumentationRepositoryIssueRemoteReset(String str, Promise promise) {
        this.abaSettingsBridgeAPI.instrumentationRepositoryIssueRemoteReset(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void isAccessoryConnected(String str, Promise promise) {
        this.abaSettingsBridgeAPI.isAccessoryConnected(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void isAlexaUnavailableDueToUnsupportedMarketPlaceOnFireTablets(Promise promise) {
        this.abaSettingsBridgeAPI.isAlexaUnavailableDueToUnsupportedMarketPlaceOnFireTablets(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void isCompanionDevice(String str, Promise promise) {
        this.abaSettingsBridgeAPI.isCompanionDevice(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void isConnected(String str, Promise promise) {
        this.abaSettingsBridgeAPI.isConnected(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void isDiscoverableOverBluetoothClassic(String str, Promise promise) {
        this.abaSettingsBridgeAPI.isDiscoverableOverBluetoothClassic(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void keyExchangeRepositoryQueryKeyTransitionState(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.keyExchangeRepositoryQueryKeyTransitionState(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void launchCustomIntent(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.launchCustomIntent(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void needsAssistantOverride(String str, Promise promise) {
        this.abaSettingsBridgeAPI.needsAssistantOverride(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void openAppSettings(Promise promise) {
        this.abaSettingsBridgeAPI.openAppSettings(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void prepareForAccessorySession(ReadableMap readableMap, String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.prepareForAccessorySession(readableMap, str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void putFocusFilterSettings(String str, String str2, String str3, Promise promise) {
        this.abaSettingsBridgeAPI.putFocusFilterSettings(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void putVipFilterSettings(String str, String str2, String str3, Promise promise) {
        this.abaSettingsBridgeAPI.putVipFilterSettings(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void queryAccessoryState(String str, double d, Promise promise) {
        this.abaSettingsBridgeAPI.queryAccessoryState(str, d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void queryDeviceInformationV2(String str, Promise promise) {
        this.abaSettingsBridgeAPI.queryDeviceInformationV2(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void queryTransportFeatures(String str, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.queryTransportFeatures(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void queryTransportVersionNumber(String str, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.queryTransportVersionNumber(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void registerAccessory(ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.registerAccessory(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void registerIAPAccessory(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.registerIAPAccessory(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void registrationSupplierModuleGetDeviceRegistration(String str, Promise promise) {
        this.abaSettingsBridgeAPI.registrationSupplierModuleGetDeviceRegistration(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void registrationSupplierModuleQueryDeviceRegistrations(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.registrationSupplierModuleQueryDeviceRegistrations(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void releaseSession(String str, Promise promise) {
        this.abaSettingsBridgeAPI.releaseSession(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void removeDevice(String str, Promise promise) {
        this.abaSettingsBridgeAPI.removeDevice(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void removeFocusFilterSettings(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.removeFocusFilterSettings(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void removeVipFilterSettings(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.removeVipFilterSettings(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void requestBluetoothPermissions(Promise promise) {
        this.abaSettingsBridgeAPI.requestBluetoothPermissions(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void requestCompanionDevice(String str, Promise promise) {
        this.abaSettingsBridgeAPI.requestCompanionDevice(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void requestIgnoreBatteryOptimizations(Promise promise) {
        this.abaSettingsBridgeAPI.requestIgnoreBatteryOptimizations(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void requestTransportUpgrade(String str, Promise promise) {
        this.abaSettingsBridgeAPI.requestTransportUpgrade(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void requestUpdateDeviceInformation(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.requestUpdateDeviceInformation(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void scanForDevices(Promise promise) {
        this.abaSettingsBridgeAPI.scanForDevices(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sendLogs(String str, Promise promise) {
        this.abaSettingsBridgeAPI.sendLogs(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierConnectSession(ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.sessionSupplierConnectSession(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierGetSessionIdentifiers(Promise promise) {
        this.abaSettingsBridgeAPI.sessionSupplierGetSessionIdentifiers(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierHasSession(String str, Promise promise) {
        this.abaSettingsBridgeAPI.sessionSupplierHasSession(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierHasSessions(Promise promise) {
        this.abaSettingsBridgeAPI.sessionSupplierHasSessions(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierQuerySessionConnected(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.sessionSupplierQuerySessionConnected(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierQuerySessionCreated(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.sessionSupplierQuerySessionCreated(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierQuerySessionDisconnected(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.sessionSupplierQuerySessionDisconnected(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierQuerySessionFailed(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.sessionSupplierQuerySessionFailed(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierQuerySessionReleased(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.sessionSupplierQuerySessionReleased(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierQuerySessionTransportChanged(ReadableMap readableMap) {
        this.abaSettingsBridgeAPI.sessionSupplierQuerySessionTransportChanged(readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void sessionSupplierReleaseSession(String str, Promise promise) {
        this.abaSettingsBridgeAPI.sessionSupplierReleaseSession(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void setAccessoryStateBoolean(String str, double d, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.setAccessoryStateBoolean(str, d, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void setAccessoryStateInteger(String str, double d, double d2, Promise promise) {
        this.abaSettingsBridgeAPI.setAccessoryStateInteger(str, d, d2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void setAudioDelay(double d, Promise promise) {
        this.abaSettingsBridgeAPI.setAudioDelay(d, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void setBehaviorConfiguration(String str, double d, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.setBehaviorConfiguration(str, d, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void shouldRequestEnableBluetooth(Promise promise) {
        this.abaSettingsBridgeAPI.shouldRequestEnableBluetooth(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void shouldRequestIgnoreBatteryOptimizations(Promise promise) {
        this.abaSettingsBridgeAPI.shouldRequestIgnoreBatteryOptimizations(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void shouldSupportVipFilter(String str, boolean z, Promise promise) {
        this.abaSettingsBridgeAPI.shouldSupportVipFilter(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void shouldTransportUpgrade(String str, Promise promise) {
        this.abaSettingsBridgeAPI.shouldTransportUpgrade(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void showLocalNotification(double d, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.showLocalNotification(d, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void showNotificationAccess(Promise promise) {
        this.abaSettingsBridgeAPI.showNotificationAccess(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void startConnectionEvents(Promise promise) {
        this.abaSettingsBridgeAPI.startConnectionEvents(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void startSetup(String str, Promise promise) {
        this.abaSettingsBridgeAPI.startSetup(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void stateRepositoryQuery(ReadableMap readableMap, String str, double d) {
        this.abaSettingsBridgeAPI.stateRepositoryQuery(readableMap, str, d);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void stateRepositorySet(String str, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.stateRepositorySet(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void stopConnectionEvents(Promise promise) {
        this.abaSettingsBridgeAPI.stopConnectionEvents(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void stopScan(Promise promise) {
        this.abaSettingsBridgeAPI.stopScan(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositoryConnectUser(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.systemRepositoryConnectUser(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositoryDisconnectUser(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.systemRepositoryDisconnectUser(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositoryQueryI18NConfig(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.systemRepositoryQueryI18NConfig(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositoryQueryLocales(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.systemRepositoryQueryLocales(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositoryQueryUsers(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.systemRepositoryQueryUsers(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositoryQueryWakewords(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.systemRepositoryQueryWakewords(readableMap, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositorySetLocale(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.systemRepositorySetLocale(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositorySetLocaleAsync(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.systemRepositorySetLocaleAsync(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositorySetWakewords(String str, ReadableArray readableArray, Promise promise) {
        this.abaSettingsBridgeAPI.systemRepositorySetWakewords(str, readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void systemRepositoryUnpairUser(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.systemRepositoryUnpairUser(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void transportRepositoryRequestUpgrade(String str, Promise promise) {
        this.abaSettingsBridgeAPI.transportRepositoryRequestUpgrade(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void transportRepositoryShouldUpgrade(String str, Promise promise) {
        this.abaSettingsBridgeAPI.transportRepositoryShouldUpgrade(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void unmatchedLocaleNotifierMarkLocaleNotified(String str, String str2, Promise promise) {
        this.abaSettingsBridgeAPI.unmatchedLocaleNotifierMarkLocaleNotified(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void wifiConfigRepositoryForgetWiFiNetwork(String str, ReadableMap readableMap, Promise promise) {
        this.abaSettingsBridgeAPI.wifiConfigRepositoryForgetWiFiNetwork(str, readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void wifiConfigRepositoryGetSavedWiFiNetworks(String str, Promise promise) {
        this.abaSettingsBridgeAPI.wifiConfigRepositoryGetSavedWiFiNetworks(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeAbaSettingsBridgeSpec
    @ReactMethod
    public void wifiConfigRepositoryQueryWiFiNetworkConnectionChanges(ReadableMap readableMap, String str) {
        this.abaSettingsBridgeAPI.wifiConfigRepositoryQueryWiFiNetworkConnectionChanges(readableMap, str);
    }
}

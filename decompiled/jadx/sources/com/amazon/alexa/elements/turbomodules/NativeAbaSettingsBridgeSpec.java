package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeAbaSettingsBridgeSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AbaSettingsBridgeModule";

    public NativeAbaSettingsBridgeSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void accessoryScannerObserveOnBleAccessoryFoundNearby(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void accessoryScannerObserveOnConnectedAccessoryFound(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void accessoryScannerObserveOnConnectedAccessoryLost(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void accessorySupplierLink(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void accessorySupplierUnlink(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void ancsRepositoryQueryAncsAuthorization(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void ancsRepositoryQueryAncsValidation(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void areNotificationsEnabled(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void assetTransferRepositoryGetAssetInfo(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void assetTransferRepositoryQueryAssetAvailable(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void assetTransferRepositoryQueryNotifyAssetTransferSession(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void assetTransferRepositoryQueryStartAssetTransferSession(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void assetTransferRepositoryQueryTransferState(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void assetTransferRepositoryRemoveAssets(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void awaitUntilAccessoryStateBooleanEnabled(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void awaitUntilAccessoryStateBooleanIsTrue(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void awaitUntilDiscoverableOverBluetoothClassic(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cameraRepositoryGetAllCameraConfigurations(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cameraRepositoryGetAllCameraSettings(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cameraRepositoryGetCameraConfiguration(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cameraRepositoryGetCameraSettings(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cameraRepositorySetCameraSettings(String str, ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cancelLocalNotification(double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void clearAudioDelay(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void clearFocusFilterSettings(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void clearVipFilterSettings(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cloudPairingRepositoryGetAttributes(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cloudPairingRepositoryGetPairingStatus(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cloudPairingRepositoryRemoveKeys(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void cloudPairingRepositorySetKeys(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void completeSetup(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void connectBle(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void createNCNotification(String str, String str2, String str3, String str4, String str5, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void createSession(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deregisterDevice(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceRepositoryQueryConfiguration(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceRepositoryQueryDeviceFeatures(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceRepositoryQueryInformationSet(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceRepositoryRequestCompleteSetup(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceRepositoryRequestOverrideAssistant(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceRepositoryRequestStartSetup(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceSupplierGetDeviceGroup(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceSupplierGetDeviceGroupCondition(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceSupplierHasDeviceGroup(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceSupplierQueryDeviceGroups(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void deviceSupplierRemoveDeviceGroup(double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void disconnectBle(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void disposeRxRN(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void doAssistantOverride(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void doesDeviceSupportAutoPairing(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void factoryResetDevice(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void fasCardsAreReady(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void finishSetupModuleOnBlacklisted(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void finishSetupModuleOnContinue(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void finishSetupModuleOnDismiss(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void firmwareRepositoryQueryInformationSet(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void firmwareRepositoryQueryInventoryUpdateBundleSet(ReadableMap readableMap, String str, boolean z);

    @DoNotStrip
    @ReactMethod
    public abstract void firmwareRepositoryQueryUpdateStatus(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void focusFilterInfoSupplierQueryFocusFilterSettings(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void getAccessories(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAccessoryStateBoolean(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAccessoryStateInteger(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAccountIdForIdentifier(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAudioDelay(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getBTInformation(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getBehaviorConfigurationSet(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getDeviceInformationV2(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getFirmwareInformation(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getFirmwareUpdateInfo(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getFocusFilterSettings(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getIdentifierForAccountId(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "AbaSettingsBridgeModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getNeedsSetup(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getRegisteredClusterDeviceSerialNumber(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getRegisteredName(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getSession(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getUserDeviceName(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getVipFilterSettings(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void hasAncsAuthorization(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void hasNotificationPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void initiateFirmwareTransfer(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void initiateMapConnection(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void inputRepositoryQueryConfiguration(ReadableMap readableMap, String str, double d);

    @DoNotStrip
    @ReactMethod
    public abstract void inputRepositoryResetConfiguration(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void inputRepositorySetConfiguration(String str, double d, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void instrumentationRepositoryIssueRemoteReset(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void isAccessoryConnected(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void isAlexaUnavailableDueToUnsupportedMarketPlaceOnFireTablets(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void isCompanionDevice(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void isConnected(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void isDiscoverableOverBluetoothClassic(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void keyExchangeRepositoryQueryKeyTransitionState(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void launchCustomIntent(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void needsAssistantOverride(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void openAppSettings(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void prepareForAccessorySession(ReadableMap readableMap, String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void putFocusFilterSettings(String str, String str2, String str3, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void putVipFilterSettings(String str, String str2, String str3, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void queryAccessoryState(String str, double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void queryDeviceInformationV2(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void queryTransportFeatures(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void queryTransportVersionNumber(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void registerAccessory(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void registerIAPAccessory(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void registrationSupplierModuleGetDeviceRegistration(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void registrationSupplierModuleQueryDeviceRegistrations(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void releaseSession(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeDevice(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeFocusFilterSettings(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeVipFilterSettings(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestBluetoothPermissions(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestCompanionDevice(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestIgnoreBatteryOptimizations(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestTransportUpgrade(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestUpdateDeviceInformation(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void scanForDevices(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void sendLogs(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierConnectSession(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierGetSessionIdentifiers(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierHasSession(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierHasSessions(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierQuerySessionConnected(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierQuerySessionCreated(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierQuerySessionDisconnected(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierQuerySessionFailed(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierQuerySessionReleased(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierQuerySessionTransportChanged(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void sessionSupplierReleaseSession(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setAccessoryStateBoolean(String str, double d, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setAccessoryStateInteger(String str, double d, double d2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setAudioDelay(double d, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setBehaviorConfiguration(String str, double d, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void shouldRequestEnableBluetooth(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void shouldRequestIgnoreBatteryOptimizations(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void shouldSupportVipFilter(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void shouldTransportUpgrade(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void showLocalNotification(double d, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void showNotificationAccess(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void startConnectionEvents(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void startSetup(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void stateRepositoryQuery(ReadableMap readableMap, String str, double d);

    @DoNotStrip
    @ReactMethod
    public abstract void stateRepositorySet(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void stopConnectionEvents(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void stopScan(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositoryConnectUser(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositoryDisconnectUser(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositoryQueryI18NConfig(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositoryQueryLocales(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositoryQueryUsers(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositoryQueryWakewords(ReadableMap readableMap, String str);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositorySetLocale(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositorySetLocaleAsync(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositorySetWakewords(String str, ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void systemRepositoryUnpairUser(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void transportRepositoryRequestUpgrade(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void transportRepositoryShouldUpgrade(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void unmatchedLocaleNotifierMarkLocaleNotified(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void wifiConfigRepositoryForgetWiFiNetwork(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void wifiConfigRepositoryGetSavedWiFiNetworks(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void wifiConfigRepositoryQueryWiFiNetworkConnectionChanges(ReadableMap readableMap, String str);
}

package com.amazon.alexa.elements.turbomodules.abasettingsbridge;

import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.liveviewcontroller.LiveViewControllerAPI;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AbaSettingsBridgeAPI {
    void accessoryScannerObserveOnBleAccessoryFoundNearby(ReadableMap readableMap);

    void accessoryScannerObserveOnConnectedAccessoryFound(ReadableMap readableMap);

    void accessoryScannerObserveOnConnectedAccessoryLost(ReadableMap readableMap);

    void accessorySupplierLink(ReadableMap readableMap, Promise promise);

    void accessorySupplierUnlink(ReadableMap readableMap, Promise promise);

    void ancsRepositoryQueryAncsAuthorization(ReadableMap readableMap, String str);

    void ancsRepositoryQueryAncsValidation(ReadableMap readableMap, String str);

    void areNotificationsEnabled(Promise promise);

    void assetTransferRepositoryGetAssetInfo(String str, double d, Promise promise);

    void assetTransferRepositoryQueryAssetAvailable(ReadableMap readableMap, String str);

    void assetTransferRepositoryQueryNotifyAssetTransferSession(ReadableMap readableMap, String str);

    void assetTransferRepositoryQueryStartAssetTransferSession(ReadableMap readableMap, String str);

    void assetTransferRepositoryQueryTransferState(ReadableMap readableMap, String str);

    void assetTransferRepositoryRemoveAssets(String str, ReadableMap readableMap, Promise promise);

    void awaitUntilAccessoryStateBooleanEnabled(String str, double d, Promise promise);

    void awaitUntilAccessoryStateBooleanIsTrue(String str, double d, Promise promise);

    void awaitUntilDiscoverableOverBluetoothClassic(String str, Promise promise);

    void cameraRepositoryGetAllCameraConfigurations(String str, Promise promise);

    void cameraRepositoryGetAllCameraSettings(String str, Promise promise);

    void cameraRepositoryGetCameraConfiguration(String str, double d, Promise promise);

    void cameraRepositoryGetCameraSettings(String str, double d, Promise promise);

    void cameraRepositorySetCameraSettings(String str, ReadableArray readableArray, Promise promise);

    void cancelLocalNotification(double d, Promise promise);

    void clearAudioDelay(Promise promise);

    void clearFocusFilterSettings(Promise promise);

    void clearVipFilterSettings(String str, Promise promise);

    void cloudPairingRepositoryGetAttributes(String str, Promise promise);

    void cloudPairingRepositoryGetPairingStatus(String str, ReadableMap readableMap, Promise promise);

    void cloudPairingRepositoryRemoveKeys(String str, ReadableMap readableMap, Promise promise);

    void cloudPairingRepositorySetKeys(String str, ReadableMap readableMap, Promise promise);

    void completeSetup(String str, boolean z, Promise promise);

    void connectBle(String str, Promise promise);

    void createNCNotification(String str, String str2, String str3, String str4, String str5, boolean z, Promise promise);

    void createSession(String str, Promise promise);

    void deregisterDevice(String str, Promise promise);

    void deviceRepositoryQueryConfiguration(ReadableMap readableMap, String str);

    void deviceRepositoryQueryDeviceFeatures(ReadableMap readableMap, String str);

    void deviceRepositoryQueryInformationSet(ReadableMap readableMap, String str);

    void deviceRepositoryRequestCompleteSetup(String str, boolean z, Promise promise);

    void deviceRepositoryRequestOverrideAssistant(String str, boolean z, Promise promise);

    void deviceRepositoryRequestStartSetup(String str, Promise promise);

    void deviceSupplierGetDeviceGroup(String str, Promise promise);

    void deviceSupplierGetDeviceGroupCondition(String str, Promise promise);

    void deviceSupplierHasDeviceGroup(String str, Promise promise);

    void deviceSupplierQueryDeviceGroups(ReadableMap readableMap);

    void deviceSupplierRemoveDeviceGroup(double d, Promise promise);

    void disconnectBle(String str, Promise promise);

    void disposeRxRN(ReadableMap readableMap);

    void doAssistantOverride(String str, boolean z, Promise promise);

    void doesDeviceSupportAutoPairing(Promise promise);

    default void factoryResetDevice(String str, Promise promise) {
        promise.reject(LiveViewControllerAPI.E_NOT_IMPLEMENTED, "factoryResetDevice is not implemented on this platform");
    }

    void fasCardsAreReady(Promise promise);

    void finishSetupModuleOnBlacklisted(ReadableMap readableMap, Promise promise);

    void finishSetupModuleOnContinue(ReadableMap readableMap, Promise promise);

    void finishSetupModuleOnDismiss(ReadableMap readableMap, Promise promise);

    void firmwareRepositoryQueryInformationSet(ReadableMap readableMap, String str);

    void firmwareRepositoryQueryInventoryUpdateBundleSet(ReadableMap readableMap, String str, boolean z);

    void firmwareRepositoryQueryUpdateStatus(ReadableMap readableMap, String str);

    void focusFilterInfoSupplierQueryFocusFilterSettings(ReadableMap readableMap, String str);

    void getAccessories(Promise promise);

    void getAccessoryStateBoolean(String str, double d, Promise promise);

    void getAccessoryStateInteger(String str, double d, Promise promise);

    void getAccountIdForIdentifier(String str, Promise promise);

    void getAudioDelay(Promise promise);

    void getBTInformation(String str, Promise promise);

    void getBehaviorConfigurationSet(String str, Promise promise);

    void getDeviceInformationV2(String str, Promise promise);

    void getFirmwareInformation(String str, Promise promise);

    void getFirmwareUpdateInfo(String str, Promise promise);

    void getFocusFilterSettings(String str, Promise promise);

    void getIdentifierForAccountId(String str, Promise promise);

    void getNeedsSetup(String str, Promise promise);

    void getRegisteredClusterDeviceSerialNumber(String str, Promise promise);

    void getRegisteredName(String str, Promise promise);

    void getSession(String str, Promise promise);

    void getUserDeviceName(String str, Promise promise);

    void getVipFilterSettings(String str, String str2, Promise promise);

    void hasAncsAuthorization(String str, Promise promise);

    void hasNotificationPermission(Promise promise);

    void initiateFirmwareTransfer(String str, Promise promise);

    void initiateMapConnection(String str, Promise promise);

    void inputRepositoryQueryConfiguration(ReadableMap readableMap, String str, double d);

    void inputRepositoryResetConfiguration(String str, double d, Promise promise);

    void inputRepositorySetConfiguration(String str, double d, ReadableMap readableMap, Promise promise);

    void instrumentationRepositoryIssueRemoteReset(String str, Promise promise);

    void isAccessoryConnected(String str, Promise promise);

    void isAlexaUnavailableDueToUnsupportedMarketPlaceOnFireTablets(Promise promise);

    void isCompanionDevice(String str, Promise promise);

    void isConnected(String str, Promise promise);

    void isDiscoverableOverBluetoothClassic(String str, Promise promise);

    void keyExchangeRepositoryQueryKeyTransitionState(ReadableMap readableMap, String str);

    void launchCustomIntent(String str, String str2, Promise promise);

    void needsAssistantOverride(String str, Promise promise);

    void openAppSettings(Promise promise);

    void prepareForAccessorySession(ReadableMap readableMap, String str, String str2, Promise promise);

    void putFocusFilterSettings(String str, String str2, String str3, Promise promise);

    void putVipFilterSettings(String str, String str2, String str3, Promise promise);

    void queryAccessoryState(String str, double d, Promise promise);

    void queryDeviceInformationV2(String str, Promise promise);

    void queryTransportFeatures(String str, boolean z, Promise promise);

    void queryTransportVersionNumber(String str, boolean z, Promise promise);

    void registerAccessory(ReadableMap readableMap, Promise promise);

    void registerIAPAccessory(String str, String str2, Promise promise);

    void registrationSupplierModuleGetDeviceRegistration(String str, Promise promise);

    void registrationSupplierModuleQueryDeviceRegistrations(ReadableMap readableMap);

    void releaseSession(String str, Promise promise);

    void removeDevice(String str, Promise promise);

    void removeFocusFilterSettings(String str, String str2, Promise promise);

    void removeVipFilterSettings(String str, String str2, Promise promise);

    void requestBluetoothPermissions(Promise promise);

    void requestCompanionDevice(String str, Promise promise);

    void requestIgnoreBatteryOptimizations(Promise promise);

    void requestTransportUpgrade(String str, Promise promise);

    void requestUpdateDeviceInformation(String str, String str2, Promise promise);

    void scanForDevices(Promise promise);

    void sendLogs(String str, Promise promise);

    void sessionSupplierConnectSession(ReadableMap readableMap, Promise promise);

    void sessionSupplierGetSessionIdentifiers(Promise promise);

    void sessionSupplierHasSession(String str, Promise promise);

    void sessionSupplierHasSessions(Promise promise);

    void sessionSupplierQuerySessionConnected(ReadableMap readableMap);

    void sessionSupplierQuerySessionCreated(ReadableMap readableMap);

    void sessionSupplierQuerySessionDisconnected(ReadableMap readableMap);

    void sessionSupplierQuerySessionFailed(ReadableMap readableMap);

    void sessionSupplierQuerySessionReleased(ReadableMap readableMap);

    void sessionSupplierQuerySessionTransportChanged(ReadableMap readableMap);

    void sessionSupplierReleaseSession(String str, Promise promise);

    void setAccessoryStateBoolean(String str, double d, boolean z, Promise promise);

    void setAccessoryStateInteger(String str, double d, double d2, Promise promise);

    void setAudioDelay(double d, Promise promise);

    void setBehaviorConfiguration(String str, double d, ReadableMap readableMap, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void shouldRequestEnableBluetooth(Promise promise);

    void shouldRequestIgnoreBatteryOptimizations(Promise promise);

    void shouldSupportVipFilter(String str, boolean z, Promise promise);

    void shouldTransportUpgrade(String str, Promise promise);

    void showLocalNotification(double d, ReadableMap readableMap, Promise promise);

    void showNotificationAccess(Promise promise);

    void startConnectionEvents(Promise promise);

    void startSetup(String str, Promise promise);

    void stateRepositoryQuery(ReadableMap readableMap, String str, double d);

    void stateRepositorySet(String str, ReadableMap readableMap, Promise promise);

    void stopConnectionEvents(Promise promise);

    void stopScan(Promise promise);

    void systemRepositoryConnectUser(String str, String str2, Promise promise);

    void systemRepositoryDisconnectUser(String str, String str2, Promise promise);

    void systemRepositoryQueryI18NConfig(ReadableMap readableMap, String str);

    void systemRepositoryQueryLocales(ReadableMap readableMap, String str);

    void systemRepositoryQueryUsers(ReadableMap readableMap, String str);

    void systemRepositoryQueryWakewords(ReadableMap readableMap, String str);

    void systemRepositorySetLocale(String str, String str2, Promise promise);

    void systemRepositorySetLocaleAsync(String str, String str2, Promise promise);

    void systemRepositorySetWakewords(String str, ReadableArray readableArray, Promise promise);

    void systemRepositoryUnpairUser(String str, String str2, Promise promise);

    void transportRepositoryRequestUpgrade(String str, Promise promise);

    void transportRepositoryShouldUpgrade(String str, Promise promise);

    void unmatchedLocaleNotifierMarkLocaleNotified(String str, String str2, Promise promise);

    void wifiConfigRepositoryForgetWiFiNetwork(String str, ReadableMap readableMap, Promise promise);

    void wifiConfigRepositoryGetSavedWiFiNetworks(String str, Promise promise);

    void wifiConfigRepositoryQueryWiFiNetworkConnectionChanges(ReadableMap readableMap, String str);
}

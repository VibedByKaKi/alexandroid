package chip.platform;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AndroidChipPlatform {
    private BleManager mBleManager = null;
    private NfcCommissioningManager mNfcCommissioningManager = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ServiceResolveListener {
        void onServiceResolve(String str, String str2);
    }

    public AndroidChipPlatform(BleManager bleManager, NfcCommissioningManager nfcCommissioningManager, KeyValueStoreManager keyValueStoreManager, ConfigurationManager configurationManager, ServiceResolver serviceResolver, ServiceBrowser serviceBrowser, ChipMdnsCallback chipMdnsCallback, DiagnosticDataProvider diagnosticDataProvider) {
        setBLEManager(bleManager);
        setNFCCommissioningManager(nfcCommissioningManager);
        setKeyValueStoreManager(keyValueStoreManager);
        setConfigurationManager(configurationManager);
        setDnssdDelegates(serviceResolver, serviceBrowser, chipMdnsCallback);
        setDiagnosticDataProviderManager(diagnosticDataProvider);
        initChipStack();
    }

    private native void initChipStack();

    private native void nativeSetBLEManager(BleManager bleManager);

    private native void nativeSetDnssdDelegates(ServiceResolver serviceResolver, ServiceBrowser serviceBrowser, ChipMdnsCallback chipMdnsCallback);

    private native void nativeSetNFCCommissioningManager(NfcCommissioningManager nfcCommissioningManager);

    private void setBLEManager(BleManager bleManager) {
        if (bleManager != null) {
            this.mBleManager = bleManager;
            bleManager.setAndroidChipPlatform(this);
            nativeSetBLEManager(bleManager);
        }
    }

    private native void setConfigurationManager(ConfigurationManager configurationManager);

    private native void setDiagnosticDataProviderManager(DiagnosticDataProvider diagnosticDataProvider);

    private void setDnssdDelegates(ServiceResolver serviceResolver, ServiceBrowser serviceBrowser, ChipMdnsCallback chipMdnsCallback) {
        if (serviceResolver != null) {
            nativeSetDnssdDelegates(serviceResolver, serviceBrowser, chipMdnsCallback);
        }
    }

    private native void setKeyValueStoreManager(KeyValueStoreManager keyValueStoreManager);

    private void setNFCCommissioningManager(NfcCommissioningManager nfcCommissioningManager) {
        if (nfcCommissioningManager != null) {
            this.mNfcCommissioningManager = nfcCommissioningManager;
            nfcCommissioningManager.setAndroidChipPlatform(this);
            nativeSetNFCCommissioningManager(nfcCommissioningManager);
        }
    }

    public final BleManager getBLEManager() {
        return this.mBleManager;
    }

    public final NfcCommissioningManager getNFCCommissioningManager() {
        return this.mNfcCommissioningManager;
    }

    public final native void handleConnectionError(int i);

    public final native void handleIndicationReceived(int i, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public final native void handleSubscribeComplete(int i, byte[] bArr, byte[] bArr2, boolean z);

    public final native void handleUnsubscribeComplete(int i, byte[] bArr, byte[] bArr2, boolean z);

    public final native void handleWriteConfirmation(int i, byte[] bArr, byte[] bArr2, boolean z);

    public final native void onNfcTagError();

    public final native void onNfcTagResponse(byte[] bArr);

    public final native void setServiceResolveListener(ServiceResolveListener serviceResolveListener);

    public final native boolean updateCommissionableDataProviderData(String str, String str2, int i, long j, int i2);
}

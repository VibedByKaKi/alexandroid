package chip.devicecontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
class ICDCheckInDelegateWrapper {
    private ICDCheckInDelegate delegate;

    public ICDCheckInDelegateWrapper(ICDCheckInDelegate iCDCheckInDelegate) {
        this.delegate = iCDCheckInDelegate;
    }

    private void onCheckInComplete(long j, long j2, long j3, long j4, long j5, byte[] bArr, byte[] bArr2) {
        this.delegate.onCheckInComplete(new ICDClientInfo(j, j2, j3, j4, j5, bArr, bArr2));
    }

    private void onKeyRefreshDone(long j) {
        this.delegate.onKeyRefreshDone(j);
    }

    private byte[] onKeyRefreshNeeded(long j, long j2, long j3, long j4, long j5, byte[] bArr, byte[] bArr2) {
        return this.delegate.onKeyRefreshNeeded(new ICDClientInfo(j, j2, j3, j4, j5, bArr, bArr2));
    }
}

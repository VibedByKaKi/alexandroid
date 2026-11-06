package com.amazon.alexa.accessory.davs;

import com.amazon.alexa.accessory.registration.deviceaccount.DiskDeviceAccountStore;
import com.amazon.alexa.accessory.registration.deviceaccount.FileSystemDeviceAccountSupplier;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.persistence.DiskCloudPairingRecordStore;
import com.amazon.alexa.accessorykit.nearmiss.MlisHttpClient;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultDavsClient$$ExternalSyntheticLambda15 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DefaultDavsClient$$ExternalSyntheticLambda15(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$getDavsManifest$16;
        MaybeSource lambda$getDeviceAccount$1;
        ObservableSource lambda$queryMatchingDeviceAccount$21;
        MaybeSource lambda$getCloudPairingRecord$0;
        CompletableSource lambda$completeUpload$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$getDavsManifest$16 = DefaultDavsClient.lambda$getDavsManifest$16(this.f$0, this.f$1, (String) obj);
                return lambda$getDavsManifest$16;
            case 1:
                lambda$getDeviceAccount$1 = DiskDeviceAccountStore.lambda$getDeviceAccount$1(this.f$0, this.f$1, (Set) obj);
                return lambda$getDeviceAccount$1;
            case 2:
                lambda$queryMatchingDeviceAccount$21 = FileSystemDeviceAccountSupplier.lambda$queryMatchingDeviceAccount$21(this.f$0, this.f$1, (Set) obj);
                return lambda$queryMatchingDeviceAccount$21;
            case 3:
                lambda$getCloudPairingRecord$0 = DiskCloudPairingRecordStore.lambda$getCloudPairingRecord$0(this.f$0, this.f$1, (Set) obj);
                return lambda$getCloudPairingRecord$0;
            default:
                lambda$completeUpload$2 = MlisHttpClient.lambda$completeUpload$2(this.f$0, this.f$1, (String) obj);
                return lambda$completeUpload$2;
        }
    }
}

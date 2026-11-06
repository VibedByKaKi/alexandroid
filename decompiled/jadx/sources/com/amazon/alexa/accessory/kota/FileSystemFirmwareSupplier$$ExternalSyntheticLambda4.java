package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.accessory.repositories.firmware.FirmwareContract;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FileSystemFirmwareSupplier$$ExternalSyntheticLambda4 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PackageCandidateIdentifier f$0;

    public /* synthetic */ FileSystemFirmwareSupplier$$ExternalSyntheticLambda4(PackageCandidateIdentifier packageCandidateIdentifier, int i) {
        this.$r8$classId = i;
        this.f$0 = packageCandidateIdentifier;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getExistingPackageForCriteria$7;
        boolean lambda$queryPackage$4;
        int i = this.$r8$classId;
        PackageCandidateIdentifier packageCandidateIdentifier = this.f$0;
        FirmwareContract.Package r2 = (FirmwareContract.Package) obj;
        switch (i) {
            case 0:
                lambda$getExistingPackageForCriteria$7 = FileSystemFirmwareSupplier.lambda$getExistingPackageForCriteria$7(packageCandidateIdentifier, r2);
                return lambda$getExistingPackageForCriteria$7;
            default:
                lambda$queryPackage$4 = FileSystemFirmwareSupplier.lambda$queryPackage$4(packageCandidateIdentifier, r2);
                return lambda$queryPackage$4;
        }
    }
}

package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.accessory.davs.DeviceArtifactContract;
import com.amazon.alexa.accessory.io.Sink;
import com.amazon.alexa.accessory.repositories.firmware.FirmwareComponentSupplier;
import com.amazon.alexa.accessory.repositories.firmware.FirmwareContract;
import com.amazon.alexa.accessory.repositories.firmware.FirmwareMetadata;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface FirmwareSupplier {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StreamablePackage {
        void cancel();

        FirmwareContract.Package complete() throws IOException;

        Sink sink() throws IOException;
    }

    Single<FirmwareMetadata> getMetadata(FirmwareContract.Package r1);

    Maybe<FirmwareContract.Package> getPackage(PackageIdentifier packageIdentifier);

    Single<StreamablePackage> getStreamablePackage(PackageIdentifier packageIdentifier);

    Single<StreamablePackage> getStreamablePackage(PackageIdentifier packageIdentifier, boolean z);

    Single<FirmwareComponentSupplier> queryComponent(FirmwareContract.Component component);

    Single<FirmwareComponentSupplier> queryDAVSArtifact(DeviceArtifactContract.ArtifactPackage artifactPackage);

    Observable<FirmwareContract.Package> queryPackage(PackageCandidateIdentifier packageCandidateIdentifier);
}

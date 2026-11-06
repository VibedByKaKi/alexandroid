package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.amazon.whisperjoin.common.sharedtypes.error.WJErrorFactory;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.TrustProviderInitializationFailedException;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.error.DSSClientError;
import com.amazon.whisperjoin.provisionerSDK.radios.error.ProvisionerCommandError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TrustProviderInitializationExceptionWJErrorMapper implements WJErrorMapper<TrustProviderInitializationFailedException> {
    private final WJErrorMapper<DSSClientError> mDSSClientErrorWJErrorMapper;
    private final WJErrorMapper<ProvisionerCommandError> mProvisionerCommandErrorWJErrorMapper;

    public TrustProviderInitializationExceptionWJErrorMapper(WJErrorMapper<ProvisionerCommandError> wJErrorMapper, WJErrorMapper<DSSClientError> wJErrorMapper2) {
        this.mProvisionerCommandErrorWJErrorMapper = wJErrorMapper;
        this.mDSSClientErrorWJErrorMapper = wJErrorMapper2;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WJErrorMapper
    public WJError map(TrustProviderInitializationFailedException trustProviderInitializationFailedException) {
        Throwable rootCause = WJErrorUtils.getRootCause(trustProviderInitializationFailedException.getCause());
        return rootCause instanceof ProvisionerCommandError ? this.mProvisionerCommandErrorWJErrorMapper.map((ProvisionerCommandError) rootCause) : rootCause instanceof DSSClientError ? this.mDSSClientErrorWJErrorMapper.map((DSSClientError) rootCause) : WJErrorFactory.Connection.unableToEstablishSecureChannel();
    }
}

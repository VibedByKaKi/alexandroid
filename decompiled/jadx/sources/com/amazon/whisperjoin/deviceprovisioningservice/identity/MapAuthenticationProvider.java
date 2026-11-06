package com.amazon.whisperjoin.deviceprovisioningservice.identity;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.AuthenticationMethod;
import com.amazon.identity.auth.device.api.AuthenticationMethodFactory;
import com.amazon.identity.auth.device.api.AuthenticationType;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.MAPCallbackErrorException;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.registration.CBLRegistrationRequest;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.service.CBLGenerationConfiguration;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface MapAuthenticationProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultMapAuthAccountProvider implements MapAuthenticationProvider {
        private static final String TAG = "MapAuthenticationProvider";
        private MAPAccountManager mAccountManager;
        private AuthenticationMethodFactory mAuthenticationFactory;

        public DefaultMapAuthAccountProvider(Context context) {
            this.mAccountManager = new MAPAccountManager(context);
            this.mAuthenticationFactory = new AuthenticationMethodFactory(context, getAccount());
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider
        public Single<CBLRegistrationRequest> generatePreAuthLinkCode() {
            return Single.create(new SingleOnSubscribe<CBLRegistrationRequest>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider.DefaultMapAuthAccountProvider.1
                @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
                public void subscribe(@NonNull final SingleEmitter<CBLRegistrationRequest> singleEmitter) throws Exception {
                    WJLog.d(DefaultMapAuthAccountProvider.TAG, "Getting Auth Code only customerId " + Thread.currentThread().toString());
                    DefaultMapAuthAccountProvider.this.mAccountManager.generatePreAuthorizedLinkCode(ParcelCompat$$ExternalSyntheticOutline0.m("com.amazon.dcp.sso.property.account.acctId", DefaultMapAuthAccountProvider.this.mAccountManager.getAccount()), new Callback() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider.DefaultMapAuthAccountProvider.1.1
                        @Override // com.amazon.identity.auth.device.api.Callback
                        public void onError(Bundle bundle) {
                            singleEmitter.onError(new MAPCallbackErrorException(bundle));
                        }

                        @Override // com.amazon.identity.auth.device.api.Callback
                        public void onSuccess(Bundle bundle) {
                            singleEmitter.onSuccess(new CBLRegistrationRequest(bundle.getString(MAPAccountManager.KEY_PRE_AUTHORIZED_LINK_CODE), bundle.getLong(MAPAccountManager.KEY_LINK_CODE_TIME_TO_LIVE)));
                        }
                    });
                }
            }).subscribeOn(Schedulers.io());
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider
        public Single<CBLRegistrationRequest> generatePreAuthLinkCodeWithPid(final CBLGenerationConfiguration cBLGenerationConfiguration) {
            return Single.create(new SingleOnSubscribe<CBLRegistrationRequest>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider.DefaultMapAuthAccountProvider.2
                @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
                public void subscribe(@NonNull final SingleEmitter<CBLRegistrationRequest> singleEmitter) throws Exception {
                    WJLog.d(DefaultMapAuthAccountProvider.TAG, "Getting Auth Code with profileId " + Thread.currentThread().toString());
                    String customerID = cBLGenerationConfiguration.getCustomerID();
                    String profileID = cBLGenerationConfiguration.getProfileID();
                    Bundle bundle = new Bundle();
                    bundle.putString("com.amazon.dcp.sso.property.account.acctId", customerID);
                    bundle.putString(MAPAccountManager.KEY_ACTOR_ID_FOR_PREAUTHORIZED_LINK_CODE, profileID);
                    DefaultMapAuthAccountProvider.this.mAccountManager.generatePreAuthorizedLinkCode(bundle, new Callback() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider.DefaultMapAuthAccountProvider.2.1
                        @Override // com.amazon.identity.auth.device.api.Callback
                        public void onError(Bundle bundle2) {
                            singleEmitter.onError(new MAPCallbackErrorException(bundle2));
                        }

                        @Override // com.amazon.identity.auth.device.api.Callback
                        public void onSuccess(Bundle bundle2) {
                            singleEmitter.onSuccess(new CBLRegistrationRequest(bundle2.getString(MAPAccountManager.KEY_PRE_AUTHORIZED_LINK_CODE), bundle2.getLong(MAPAccountManager.KEY_LINK_CODE_TIME_TO_LIVE)));
                        }
                    });
                }
            }).subscribeOn(Schedulers.io());
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider
        public String getAccount() {
            return this.mAccountManager.getAccount();
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider
        public AuthenticationMethod getOAuthToken() {
            return this.mAuthenticationFactory.newAuthenticationMethod(AuthenticationType.OAuth);
        }
    }

    Single<CBLRegistrationRequest> generatePreAuthLinkCode();

    Single<CBLRegistrationRequest> generatePreAuthLinkCodeWithPid(CBLGenerationConfiguration cBLGenerationConfiguration);

    String getAccount();

    AuthenticationMethod getOAuthToken();
}

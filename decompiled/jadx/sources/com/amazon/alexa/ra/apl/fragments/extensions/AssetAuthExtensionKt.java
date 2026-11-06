package com.amazon.alexa.ra.apl.fragments.extensions;

import com.amazon.alexa.mobile.assistant.capabilities.application.FireOsNavigationDirectiveListener;
import com.amazon.alexa.ra.apl.fragments.data.APLFragmentData;
import com.dee.app.contacts.common.constants.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\f\u001a\u00020\u000b*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\u0011"}, d2 = {FireOsNavigationDirectiveListener.SUPPORTED_IDENTIFIER_TYPE, "", Constants.LOG_TAG, "VERSION", "AUTHORITIES", "VERSION_1_0", AssetAuthExtensionKt.AMAZON_ANY, "TYPE_KEY", "HOST_KEY", "FragmentToAuthExtensionMapping", "", "Lcom/amazon/alexa/ra/apl/fragments/extensions/AssetAuthExtension;", "authExtension", "Lcom/amazon/alexa/ra/apl/fragments/extensions/FragmentToAuthExtensionMapping;", "fragment", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "authToken", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AssetAuthExtensionKt {

    @NotNull
    private static final String AMAZON_ANY = "AMAZON_ANY";

    @NotNull
    private static final String AUTHORITIES = "authorities";

    @NotNull
    private static final String HOST_KEY = "host";

    @NotNull
    private static final String TAG = "AssetAuthExtension";

    @NotNull
    private static final String TYPE_KEY = "type";

    @NotNull
    private static final String URI = "aplext:assetauthentication:10";

    @NotNull
    private static final String VERSION = "version";

    @NotNull
    private static final String VERSION_1_0 = "1.0";

    @NotNull
    public static final AssetAuthExtension authExtension(@NotNull Map<String, AssetAuthExtension> map, @NotNull APLFragmentData aPLFragmentData, @NotNull String str) {
        map.getClass();
        aPLFragmentData.getClass();
        str.getClass();
        AssetAuthExtension assetAuthExtension = map.get(aPLFragmentData.getUri());
        APLFragmentData fragment = assetAuthExtension != null ? assetAuthExtension.getFragment() : null;
        List<Map<String, String>> authorities = fragment != null ? fragment.getAuthorities() : null;
        if ((authorities == null || authorities.isEmpty()) && fragment != null) {
            fragment.setAuthorities(aPLFragmentData.getAuthorities());
        }
        AssetAuthExtension assetAuthExtension2 = map.get(aPLFragmentData.getUri());
        if (assetAuthExtension2 != null) {
            return assetAuthExtension2;
        }
        AssetAuthExtension assetAuthExtension3 = new AssetAuthExtension(aPLFragmentData, str);
        map.put(aPLFragmentData.getUri(), assetAuthExtension3);
        return assetAuthExtension3;
    }
}

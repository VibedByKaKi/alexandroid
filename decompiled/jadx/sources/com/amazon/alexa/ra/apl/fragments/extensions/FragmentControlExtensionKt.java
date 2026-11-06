package com.amazon.alexa.ra.apl.fragments.extensions;

import com.amazon.alexa.mobile.assistant.capabilities.application.FireOsNavigationDirectiveListener;
import com.amazon.alexa.mosaic.apl.actions.InvokeExtensionAction;
import com.amazon.deecomms.common.Constants;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {FireOsNavigationDirectiveListener.SUPPORTED_IDENTIFIER_TYPE, "", Constants.LOG_TAG, "ARGUMENTS", "OPERATION", "NAME", "NAMESPACE", "INVOKE_OPERATION", "TEXT_MESSAGE", "EXPAND", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "ON_PRESS", "VERSION", "ALLOW_EXPAND", "VERSION_1_0", "FRAGMENT_PRESS_ACTION", "Lcom/amazon/alexa/mosaic/apl/actions/InvokeExtensionAction;", "getFRAGMENT_PRESS_ACTION", "()Lcom/amazon/alexa/mosaic/apl/actions/InvokeExtensionAction;", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FragmentControlExtensionKt {

    @NotNull
    private static final String ALLOW_EXPAND = "allowExpand";

    @NotNull
    private static final String ARGUMENTS = "arguments";

    @NotNull
    private static final String EXPAND = "Expand";

    @NotNull
    private static final InvokeExtensionAction FRAGMENT_PRESS_ACTION;

    @NotNull
    private static final String INVOKE_OPERATION = "InvokeOperation";

    @NotNull
    private static final String NAME = "name";

    @NotNull
    private static final String NAMESPACE = "namespace";

    @NotNull
    private static final String ON_PRESS = "OnPress";

    @NotNull
    private static final String OPERATION = "operation";

    @NotNull
    private static final String TAG = "FragmentControlExtension";

    @NotNull
    private static final String TEXT = "text";

    @NotNull
    private static final String TEXT_MESSAGE = "TextMessage";

    @NotNull
    private static final String URI = "alexaext:fragmentcontrol:10";

    @NotNull
    private static final String VERSION = "version";

    @NotNull
    private static final String VERSION_1_0 = "1.0";

    static {
        InvokeExtensionAction build = InvokeExtensionAction.builder().uri(URI).fastMode(false).data(null).name(ON_PRESS).build();
        build.getClass();
        FRAGMENT_PRESS_ACTION = build;
    }

    @NotNull
    public static final InvokeExtensionAction getFRAGMENT_PRESS_ACTION() {
        return FRAGMENT_PRESS_ACTION;
    }
}

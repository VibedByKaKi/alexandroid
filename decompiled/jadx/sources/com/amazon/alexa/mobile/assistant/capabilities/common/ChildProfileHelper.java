package com.amazon.alexa.mobile.assistant.capabilities.common;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/common/ChildProfileHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isCurrentAccountChild", "", "startSearch", "searchString", "", "category", "Companion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ChildProfileHelper {

    @NotNull
    private static final String ACTION_KIDS_SEARCH = "com.amazon.tahoe.action.SEARCH";

    @NotNull
    private static final String EXTRA_SEARCH_CATEGORY = "com.amazon.tahoe.child.SEARCH_CATEGORY";

    @NotNull
    private static final String EXTRA_SEARCH_QUERY = "com.amazon.tahoe.child.GCV_SEARCH_QUERY";

    @NotNull
    private static final String KIDS_PACKAGE_NAME = "com.amazon.tahoe";

    @NotNull
    private static final String SETTINGS_KEY_USER_ROLE = "USER_ROLE";

    @NotNull
    private static final String USER_ROLE_CHILD = "CHILD";

    @NotNull
    private final Context context;

    public ChildProfileHelper(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    public final boolean isCurrentAccountChild() {
        return Intrinsics.areEqual(USER_ROLE_CHILD, Settings.Secure.getString(this.context.getContentResolver(), SETTINGS_KEY_USER_ROLE));
    }

    public final boolean startSearch(@NotNull String searchString, @NotNull String category) {
        searchString.getClass();
        category.getClass();
        Intent intent = new Intent(ACTION_KIDS_SEARCH);
        intent.setPackage(KIDS_PACKAGE_NAME);
        intent.putExtra(EXTRA_SEARCH_QUERY, searchString);
        intent.putExtra(EXTRA_SEARCH_CATEGORY, category);
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.context.getPackageManager()) == null) {
            return false;
        }
        this.context.startActivity(intent);
        return true;
    }
}

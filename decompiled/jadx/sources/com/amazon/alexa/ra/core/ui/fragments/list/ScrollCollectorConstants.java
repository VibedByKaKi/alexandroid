package com.amazon.alexa.ra.core.ui.fragments.list;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/list/ScrollCollectorConstants;", "", "<init>", "()V", "RESTART_DELAY", "", "MAX_RESTARTS", "", "BACKWARD_PAGINATION_SCROLL_AMOUNT", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class ScrollCollectorConstants {
    public static final float BACKWARD_PAGINATION_SCROLL_AMOUNT = -200.0f;

    @NotNull
    public static final ScrollCollectorConstants INSTANCE = new ScrollCollectorConstants();
    public static final int MAX_RESTARTS = 3;
    public static final long RESTART_DELAY = 100;

    private ScrollCollectorConstants() {
    }
}

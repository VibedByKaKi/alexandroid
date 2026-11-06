package com.amazon.alexa.app.notification.nc.server;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NotificationsSummary {
    private final int unreadCount;

    @Nullable
    private final List<NotificationCenterItem> unreadLegalContent;

    public NotificationsSummary(int i, @Nullable List<NotificationCenterItem> list) {
        this.unreadCount = i;
        this.unreadLegalContent = list != null ? new ArrayList(list) : null;
    }

    public int getUnreadCount() {
        return this.unreadCount;
    }

    public Optional<List<NotificationCenterItem>> getUnreadLegalContent() {
        List<NotificationCenterItem> list = this.unreadLegalContent;
        return list != null ? Optional.of(Collections.unmodifiableList(list)) : Optional.empty();
    }

    public String toString() {
        return "NotificationsSummary(unreadCount=" + getUnreadCount() + ", unreadLegalContent=" + getUnreadLegalContent() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public NotificationsSummary() {
        this.unreadCount = 0;
        this.unreadLegalContent = new ArrayList();
    }
}

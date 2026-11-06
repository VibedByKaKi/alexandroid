package com.mapbox.base.common.logger;

import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J(\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\u000e"}, d2 = {"Lcom/mapbox/base/common/logger/Logger;", "", "d", "", "tag", "Lcom/mapbox/base/common/logger/model/Tag;", "msg", "Lcom/mapbox/base/common/logger/model/Message;", "tr", "", "e", "i", "v", "w", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface Logger {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void d$default(Logger logger, Tag tag, Message message, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: d");
                return;
            }
            if ((i & 1) != 0) {
                tag = null;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.d(tag, message, th);
        }

        public static /* synthetic */ void e$default(Logger logger, Tag tag, Message message, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: e");
                return;
            }
            if ((i & 1) != 0) {
                tag = null;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.e(tag, message, th);
        }

        public static /* synthetic */ void i$default(Logger logger, Tag tag, Message message, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: i");
                return;
            }
            if ((i & 1) != 0) {
                tag = null;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.i(tag, message, th);
        }

        public static /* synthetic */ void v$default(Logger logger, Tag tag, Message message, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: v");
                return;
            }
            if ((i & 1) != 0) {
                tag = null;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.v(tag, message, th);
        }

        public static /* synthetic */ void w$default(Logger logger, Tag tag, Message message, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: w");
                return;
            }
            if ((i & 1) != 0) {
                tag = null;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.w(tag, message, th);
        }
    }

    void d(@Nullable Tag tag, @NotNull Message msg, @Nullable Throwable tr);

    void e(@Nullable Tag tag, @NotNull Message msg, @Nullable Throwable tr);

    void i(@Nullable Tag tag, @NotNull Message msg, @Nullable Throwable tr);

    void v(@Nullable Tag tag, @NotNull Message msg, @Nullable Throwable tr);

    void w(@Nullable Tag tag, @NotNull Message msg, @Nullable Throwable tr);
}

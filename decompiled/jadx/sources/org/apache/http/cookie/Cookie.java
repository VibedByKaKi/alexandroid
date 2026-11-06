package org.apache.http.cookie;

import java.util.Date;
import org.apache.http.annotation.Obsolete;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Cookie {
    @Obsolete
    String getComment();

    @Obsolete
    String getCommentURL();

    String getDomain();

    Date getExpiryDate();

    String getName();

    String getPath();

    @Obsolete
    int[] getPorts();

    String getValue();

    @Obsolete
    int getVersion();

    boolean isExpired(Date date);

    boolean isPersistent();

    boolean isSecure();
}

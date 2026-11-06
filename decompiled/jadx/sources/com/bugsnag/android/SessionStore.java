package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bugsnag.android.FileStore;
import com.bugsnag.android.internal.ImmutableConfig;
import java.io.File;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SessionStore extends FileStore {
    static final Comparator<File> SESSION_COMPARATOR = new Comparator<File>() { // from class: com.bugsnag.android.SessionStore.1
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            if (file == null && file2 == null) {
                return 0;
            }
            if (file == null) {
                return 1;
            }
            if (file2 == null) {
                return -1;
            }
            return file.getName().compareTo(file2.getName());
        }
    };

    public SessionStore(@NonNull ImmutableConfig immutableConfig, @NonNull Logger logger, @Nullable FileStore.Delegate delegate) {
        super(new File(immutableConfig.getPersistenceDirectory().getValue(), "bugsnag-sessions"), immutableConfig.getMaxPersistedSessions(), SESSION_COMPARATOR, logger, delegate);
    }

    public Date getCreationDate(File file) {
        return new Date(SessionFilenameInfo.findTimestampInFilename(file));
    }

    @Override // com.bugsnag.android.FileStore
    @NonNull
    public String getFilename(Object obj) {
        return SessionFilenameInfo.defaultFilename();
    }

    public boolean isTooOld(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        return SessionFilenameInfo.findTimestampInFilename(file) < calendar.getTimeInMillis();
    }
}
